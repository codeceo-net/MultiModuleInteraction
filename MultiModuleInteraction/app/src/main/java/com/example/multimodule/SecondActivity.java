package com.example.multimodule;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class SecondActivity extends Activity {

    Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

}
