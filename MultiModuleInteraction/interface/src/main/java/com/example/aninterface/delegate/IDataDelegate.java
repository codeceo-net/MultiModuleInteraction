package com.example.aninterface.delegate;

import android.os.Bundle;

/**
 * 规范化的数据接口传输协议，是同进程、同步操作的数据委托协议
 *
 * Created by wangdan on 17/1/7.
 */
public interface IDataDelegate {

    /**
     * 请Module之间存在数据调用关系的双发，协议Bundle的各个参数属性的Key和Type
     * Bundle是基本、序列化类型数据封装，Object...是复杂类型数据传递，也请各自协商
     *
     * @param args
     * @param extras
     * @return
     * @throws DelegateException
     */
    Bundle getData(Bundle args, Object... extras) throws DelegateException;

}
