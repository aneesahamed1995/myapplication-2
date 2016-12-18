package com.nmk.aneesahamed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.id.text1;

public class Main3Activity extends AppCompatActivity {
     AutoCompleteTextView text;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text= (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        final String[] color = getResources().getStringArray(R.array.colors);
        ArrayAdapter adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_dropdown_item,color);

        text.setAdapter(adapter);


    }

    public  void getvalue(View view)
    {
        value=text.getText().toString();
        //System.out.println(value);
        if(value.equals("yellow")||value.equals("Yellow"))
        {
         Intent intent = new Intent(this,Main4Activity.class);
            startActivity(intent);
            this.finish();
        }
    }


}