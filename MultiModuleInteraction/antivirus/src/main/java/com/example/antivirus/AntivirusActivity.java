package com.example.antivirus;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aninterface.delegate.ModuleDelegate;
import com.example.aninterface.module.boost.BoostDelegateConsts;

public class AntivirusActivity extends Activity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antivirus);
        text=findViewById(R.id.text);

        IntentFilter filter=new IntentFilter("com.example.getdata");
        DataReceiver dataReceiver=new DataReceiver();
        registerReceiver(dataReceiver,filter);
    }

    public void getDataFromOtherModule(View view) {

        Bundle bundle;
        try {
            bundle = new Bundle();
            bundle.putString("gaolei", "beauty");
           Bundle bundle1= ModuleDelegate.getInstance().getData(BoostDelegateConsts.FACTORY, BoostDelegateConsts.DataCode.getTotalMemoryByte,bundle,AntivirusActivity.this);
            String result=bundle1.getString("result");
            text.setText(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }  public void getSyncDataFromOtherModule(View view) {

        Bundle bundle;
        try {
            bundle = new Bundle();
            //这个地方是调用Boost模块，获取异步数据
           Bundle bundle1= ModuleDelegate.getInstance().getData(BoostDelegateConsts.FACTORY, BoostDelegateConsts.DataCode.getSyncData,bundle,AntivirusActivity.this);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public class DataReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Bundle bundle=intent.getExtras();
            String data=bundle.getString("result");
            text.setText(data);
        }
    }

}
