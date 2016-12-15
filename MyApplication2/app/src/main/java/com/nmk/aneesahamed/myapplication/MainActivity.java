package com.nmk.aneesahamed.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    View error=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_main);

            }
        }, 3000);

    }


        public void validate(View view)
    {
        EditText edit = (EditText) findViewById(R.id.email);
        String email = edit.getText().toString();
        if(email_validate(email))
        {
            edit.setError("Invalid email");
            error=edit;
            error.requestFocus();
        }
       else if( TextUtils.isEmpty(email))
        {
            edit.setError("It should not empty");
            error=edit;
            error.requestFocus();
        }
        else
        {
            Intent intent= new Intent(this,Main2Activity.class);
            intent.putExtra(Main2Activity.message,email);
            startActivity(intent);
            edit.setText("");
        }

    }
    public boolean email_validate(String email)
    {
        if(email.contains("@"))
        {
            return false;
        }
        return true;
    }

}
