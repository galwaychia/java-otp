package com.odde.securetoken;

import java.time.LocalDate;

import static java.time.Month.APRIL;

public class Birthday {

    public boolean isBirthday(String mon, String day) {
        Birthday birthday = new Birthday();
        return mon.equals("4") && day.equals("9");
//        LocalDate today = LocalDate.now();
//        return today.getDayOfMonth() == 9 && today.getMonth().equals(APRIL);
    }

}