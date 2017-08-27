package com.example.boost;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.aninterface.delegate.CleanDelegate;
import com.example.aninterface.delegate.DelegateException;
import com.example.aninterface.module.app.AppDelegateConsts;
import com.example.submodule.R;

public class BoostActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submodule);
    }
    public void runStaticAction(View view){

//        Intent intent=new Intent();
//        intent.setData(Uri.parse("andy://scheme_activity?type=0&buffer=这是个字符串"));
//        startActivity(intent);
        try {
            CleanDelegate.getInstance().getData(AppDelegateConsts.FACTORY, AppDelegateConsts.DataCode.startActivity,null,BoostActivity.this);
        } catch (DelegateException e) {
            e.printStackTrace();
        }
    }
}
