package com.example.boost.delegateimp;


import com.example.aninterface.delegate.IDataDelegate;
import com.example.aninterface.delegate.IDelegateFactory;
import com.example.aninterface.module.boost.BoostDelegateConsts;

/**
 * @author chaohao.zhou
 * @Description:
 * @date 2017/1/12 11:18
 * @copyright TCL-MIG
 */
public class BoostDelegateFactory implements IDelegateFactory {

    @Override
    public IDataDelegate getDataTransfer(int code) {
        switch (code) {

            case BoostDelegateConsts.DataCode.getTotalMemoryByte:
                return new GetTotalMemoryByte();

        }
        return null;
    }

}
