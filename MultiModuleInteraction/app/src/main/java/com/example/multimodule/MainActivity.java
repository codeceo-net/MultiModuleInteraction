package com.example.multimodule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.boost.BoostActivity;
import com.example.antivirus.AntivirusActivity;


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
               startActivity(new Intent(MainActivity.this, BoostActivity.class));
            }
        });
        Log.d("gaolei","111");
        Log.d("gaolei","222");
        Log.d("gaolei","333");
    }

    public void skipToSubModule2(View view) {
        startActivity(new Intent(this, AntivirusActivity.class));
    }
}
