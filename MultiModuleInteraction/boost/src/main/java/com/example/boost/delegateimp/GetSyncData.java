package com.example.boost.delegateimp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.aninterface.delegate.DelegateException;
import com.example.aninterface.delegate.IDataDelegate;


/**
 * @author gaolei
 * @Description:
 * @date 2017/1/12 14:01
 * @copyright TCL-MIG
 */
public class GetSyncData implements IDataDelegate {

    @Override
    public Bundle getData(Bundle args, Object... extras) throws DelegateException {
        if (extras.length > 0 && extras[0] != null) {
            if (extras[0] instanceof Context) {
                final Context context = (Context) extras[0];
                new Thread() {
                    public void run() {

                        try {
                            new Thread() {
                                public void run() {
                                    try {
                                        //模拟耗时操作，在这个线程里可以做耗时操作，然后把数据通过广播传出去
                                        Thread.sleep(3000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putString("result", "这是一条异步获取的数据从Boost模块");
                                    Intent intent = new Intent("com.example.getdata");
                                    intent.putExtras(bundle);
                                    context.sendBroadcast(intent);
                                }
                            }.start();


                        } catch (Throwable e) {

                        }
                    }
                }.start();
            }
        }
        return null;
    }

}
