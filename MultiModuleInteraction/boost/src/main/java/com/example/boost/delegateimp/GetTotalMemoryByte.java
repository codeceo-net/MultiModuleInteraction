package com.example.boost.delegateimp;

import android.os.Bundle;

import com.example.aninterface.delegate.DelegateException;
import com.example.aninterface.delegate.IDataDelegate;


/**
 * @author chaohao.zhou
 * @Description:
 * @date 2017/1/12 14:01
 * @copyright TCL-MIG
 */
public class GetTotalMemoryByte implements IDataDelegate {

    @Override
    public Bundle getData(Bundle args, Object... extras) throws DelegateException {
        Bundle bundle = null;
        try {
            bundle = new Bundle();
            bundle.putString("result", "这是一条获取的数据从Boost模块");
        } catch (Throwable e) {

        }
        return bundle;
    }
}
