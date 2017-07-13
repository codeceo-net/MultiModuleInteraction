package com.example.aninterface.delegate;

/**
 * 委托声明工厂，请在Application入口处使用以下代码先注册，其他Module才能够调用到
 * CleanDelegate.register(key, factory);
 *
 * Created by wangdan on 17/1/7.
 */

public interface IDelegateFactory {

    IDataDelegate getDataTransfer(int code);

}
