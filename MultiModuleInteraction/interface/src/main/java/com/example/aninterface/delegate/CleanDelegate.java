package com.example.aninterface.delegate;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangdan on 17/1/7.
 */

public class CleanDelegate {

    private final Map<String, IDelegateFactory> factoryMap = new HashMap<>();

//    private final Map<String, WeakReference<IActionDelegate>> actionTransferMap = new HashMap<>();

    private static final CleanDelegate mInstance = new CleanDelegate();

    private CleanDelegate() {

    }

    public static CleanDelegate getInstance() {
        return mInstance;
    }

    public static void register(String key, IDelegateFactory factory) {
        mInstance.factoryMap.put(key, factory);
    }

    public Bundle getData(String factoryCode, int code, Bundle args, Object... extras) throws DelegateException {
        IDelegateFactory factory = factoryMap.get(factoryCode);
        if (factory != null) {
            IDataDelegate transfer = factory.getDataTransfer(code);

            if (transfer != null) {
                return transfer.getData(args, extras);
            }
        }

        throw new DelegateException("unknow data transfer");
    }


}
