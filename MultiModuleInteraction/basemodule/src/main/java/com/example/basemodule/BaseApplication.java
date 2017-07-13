package com.example.basemodule;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/7/10.
 */

public class BaseApplication extends Application {
    static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
    }
    public static Context getContext() {
        return mContext;
    }
}
