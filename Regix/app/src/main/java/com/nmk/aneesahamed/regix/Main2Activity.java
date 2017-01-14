package com.nmk.aneesahamed.regix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView listView;
    private List<click> studentList;
    String Names[]={"Anees Ahamed","Mohamed aadhil","Najmal","jaffer","ashik","hauhuih","ghguguygu","ugwuwgsuig","jhihuh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.list1View);
        for(int i=0;i<Names.length;i++)
        {
            click cl=new click(Names[i],false);
            studentList.add(cl);
        }
        custom cs=new custom(this,studentList);
        listView.setAdapter(cs);
        //final ImageView imgs=(ImageView).findViewById(R.id.img);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {



            }
        };
    }
}
