package com.example.aninterface.delegate;

import android.os.Bundle;

/**
 * 代码块(Action)接口协议，可以触发其他Module开放的功能性接口
 *
 * Created by wangdan on 17/1/7.
 */
public interface IActionDelegate {

    /**
     *
     * @param args
     * @param callback 请Module之间根据协议，回调这4个状态做相应的业务处理
     */
    void runAction(Bundle args, IActionCallback callback, Object... extras);

    interface IActionCallback {

        void onActionPrepare();

        void onActionSuccess(Object... result);

        void onActionFailed(int code, String message);

        void onActionFinished();

    }

}
