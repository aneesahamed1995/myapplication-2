package com.nmk.aneesahamed.regix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class Main1Activity extends AppCompatActivity {
    private List<click> studentList;
    public recycler re;
String Names[]={"Anees Ahamed","Mohamed aadhil","Najmal","jaffer","ashik","hauhuih","ghguguygu","ugwuwgsuig","jhihuh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        studentList = new ArrayList<click>();
        for(int i=0;i<Names.length;i++)
        {
         click cl=new click(Names[i],false);
            studentList.add(cl);
        }

        RecyclerView recycle = (RecyclerView) findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
         re = new recycler(studentList, this);
        recycle.setAdapter(re);
        recycle.setItemAnimator(new SlideInUpAnimator(new OvershootInterpolator(1f)));
        LinearLayoutManager grid = new LinearLayoutManager(this);
        recycle.setLayoutManager(grid);


    }
    public void submit(View view)
    {
        String data = "";
        List<click> stList =re.getStudentist();
        for(int i=0;i<stList.size();i++) {
            click cli = stList.get(i);
            if(cli.isSelected()==true)
            {
            data= cli.getName().toString();
                System.out.println(data);
            }
        }

    }
}
