package com.odde.securetoken;

public class AuthenticationService {

    private final ProfileDao profileDao;
    private final RsaTokenDao rsaTokenDao;
    private final LogUtil logUtil;

    static class LogUtil {
        public void log(String log) {
            System.out.println(log);
        }
    }

    public AuthenticationService(ProfileDao profileDao, RsaTokenDao rsaTokenDao, LogUtil logUtil) {
        this.profileDao = profileDao;
        this.rsaTokenDao = rsaTokenDao;
        this.logUtil = logUtil;
    }

    public boolean isValid(String account, String password) {
        // 根據 account 取得自訂密碼
        String passwordFromDao = profileDao.getPassword(account);

        // 根據 account 取得 RSA token 目前的亂數
        String randomCode = rsaTokenDao.getRandom(account);

        // 驗證傳入的 password 是否等於自訂密碼 + RSA token亂數
        String validPassword = passwordFromDao + randomCode;
        boolean isValid = password.equals(validPassword);

        if (isValid) {
            return true;
        } else {
            logUtil.log("not pass");
            return false;
        }
    }
}
