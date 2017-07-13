package com.example.multimodule.delegateimp;


import com.example.aninterface.delegate.IDataDelegate;
import com.example.aninterface.delegate.IDelegateFactory;
import com.example.aninterface.module.app.AppDelegateConsts;

/**
 * @author chaohao.zhou
 * @Description:
 * @date 2017/1/12 11:18
 * @copyright TCL-MIG
 */
public class AppDelegateFactory implements IDelegateFactory {

    @Override
    public IDataDelegate getDataTransfer(int code) {
        switch (code) {

            case AppDelegateConsts.DataCode.startActivity:
                return new StartActivity();

        }
        return null;
    }

}
