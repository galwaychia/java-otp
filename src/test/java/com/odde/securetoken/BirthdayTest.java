package com.odde.securetoken;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayTest {

    @Test
    public void isBirthday() {
        Birthday birthdayTest = new Birthday();
        boolean a = birthdayTest.isBirthday("4", "9");
        assertTrue(a);
    }

}