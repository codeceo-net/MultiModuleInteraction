package com.example.multimodule.delegateimp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.aninterface.delegate.DelegateException;
import com.example.aninterface.delegate.IDataDelegate;
import com.example.multimodule.SecondActivity;

/**
 * @author haiyang.tan
 * @Description:
 * @date 2017/1/12 16:36
 * @copyright HAWK
 */
public class StartActivity implements IDataDelegate {
    @Override
    public Bundle getData(Bundle args, Object... extras) throws DelegateException {
        try {
            if (extras != null && extras.length > 0 && extras[0] != null) {
                if (extras[0] instanceof Context) {
                    Context context = (Context) extras[0];
                    Intent intent = new Intent(context, SecondActivity.class);
                    context.startActivity(intent);
                }
            }
        } catch (Throwable e) {

        }
        return null;
    }
}
