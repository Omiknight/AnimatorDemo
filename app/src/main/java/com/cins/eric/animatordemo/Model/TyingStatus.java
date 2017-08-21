package com.cins.eric.animatordemo.Model;

/**
 * Created by Eric on 2017/8/20.
 */

public class TyingStatus {

    public static final int DEFULT = 1;

    public static final int BUY = 2;

    public static final int NOTBUG = 3;

    int status;
    public TyingStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
