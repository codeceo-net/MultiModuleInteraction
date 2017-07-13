package com.example.aninterface.delegate;

import android.text.TextUtils;

/**
 * Created by wangdan on 17/1/7.
 */

public class DelegateException extends Exception {

    private static final long serialVersionUID = 8568164062910016009L;

    public static final int UNKNOW = -1;

    private int code;

    private String message;

    public DelegateException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public DelegateException(String message) {
        this(UNKNOW, message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        if (!TextUtils.isEmpty(message)) {
            return message;
        }

        return super.toString();
    }

}
