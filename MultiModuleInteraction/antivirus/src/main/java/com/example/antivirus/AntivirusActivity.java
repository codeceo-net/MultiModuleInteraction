package com.example.antivirus;

import android.app.Activity;
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
        setContentView(R.layout.activity_submodule2);
        text=findViewById(R.id.text);
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

    }


}
