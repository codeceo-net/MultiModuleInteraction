package com.example.multimodule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.submodule.SubModuleActivity;
import com.example.submodule2.SubModule2Activity;


public class MainActivity extends Activity {

    Button skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skip=findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, SubModuleActivity.class));
            }
        });
    }

    public void skipToSubModule2(View view) {
        startActivity(new Intent(this, SubModule2Activity.class));
    }
}
