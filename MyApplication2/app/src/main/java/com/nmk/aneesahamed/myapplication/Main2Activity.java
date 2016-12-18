package com.nmk.aneesahamed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {
    EditText ed;
    ImageView imgs;
    int i=90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgs=(ImageView)findViewById(R.id.img);
         ed=(EditText)findViewById(R.id.edit);
    }
public void getimage(View view)
{
   String url=ed.getText().toString();
    Picasso.Builder picassoBuilder = new Picasso.Builder(this);
    Picasso picasso = picassoBuilder.build();
    picasso.load(url).noFade().placeholder(R.drawable.default1).into(imgs);


}
    public void rotateimage(View view)
    {

        imgs.setRotation(i);
       i= i+90;
    }
    public void Next(View view)
    {
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
