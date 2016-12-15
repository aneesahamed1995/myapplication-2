package com.nmk.aneesahamed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
 public static final String message="";
    int back;
    public  String emailtoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        emailtoast=intent.getStringExtra(message);
    }
    @Override
    public void onBackPressed() {
        back +=1;
        Toast.makeText(getApplicationContext(), "Hello    "+ emailtoast, Toast.LENGTH_SHORT).show();
        if(back>1)
        {
            this.finish();
        }
    }
}
