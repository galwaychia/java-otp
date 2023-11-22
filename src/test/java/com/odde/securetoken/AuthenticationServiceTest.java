package com.odde.securetoken;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

public class AuthenticationServiceTest {

//    @Test
//    public void is_valid_test() {
//        ProfileDao profileDao = Mockito.mock(ProfileDao.class);
//        RsaTokenDao rsaTokenDao = Mockito.mock(RsaTokenDao.class);
//
//        Mockito.when(profileDao.getPassword("joey")).thenReturn("9100");
//        Mockito.when(rsaTokenDao.getRandom("joey")).thenReturn("0000");
//
//        AuthenticationService target = new AuthenticationService(profileDao, rsaTokenDao);
//
//        boolean actual = target.isValid("joey", "91000000");
//
//        assertTrue(actual);
//    }

    @Test
    public void is_invalid_test() {
        ProfileDao profileDao = Mockito.mock(ProfileDao.class);
        RsaTokenDao rsaTokenDao = Mockito.mock(RsaTokenDao.class);
        AuthenticationService.LogUtil logUtil = Mockito.mock(AuthenticationService.LogUtil.class);

        Mockito.when(profileDao.getPassword("joey")).thenReturn("9100");
        Mockito.when(rsaTokenDao.getRandom("joey")).thenReturn("1111");

        AuthenticationService target = new AuthenticationService(profileDao, rsaTokenDao, logUtil);

        boolean actual = target.isValid("joey", "91000000");

        Mockito.verify(logUtil).log("not pass");
        assertTrue(actual);
    }

}
