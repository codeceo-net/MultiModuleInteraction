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
        Bundle result = null;
        try {
            result = new Bundle();
            result.putString("result", "123");
        } catch (Throwable e) {

        }
        return result;
    }
}
