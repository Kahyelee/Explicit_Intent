package com.example.kahye.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt_1);

        intent = new Intent(this, NextActivity.class);
        intent.putExtra("name", "kookmin");



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create intent instance
                //해당버튼을 클릭했을 때 NextActivity를 호출하는 기능
                startActivity(intent);
                }
            }

            );
        }
    }

