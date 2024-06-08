package com.parabank.parasoft.util;

public class General {
    public static final int WAIT_TIME = 30;
    public static final String LOGIN_TITTLE = "ParaBank | Welcome | Online Banking";

    public static void waitForSeeText(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
