package com.nmk.aneesahamed.regix;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class recycler extends RecyclerView.Adapter<recycler.ViewHolder>
{
    public String count;
    String[] name;
    click cl=new click();
    public boolean state;
    //public CheckBox check;
    private List<click> stList;
    CardView c;
    private Context context;
    public  static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v)
        {
            super(v);
            cardView=v;
        }
    }
    @Override
    public  recycler.ViewHolder  onCreateViewHolder( ViewGroup parent, int viewType)
    {
        c=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview1,parent,false);
        return new ViewHolder(c);
    }
    public recycler(List<click> students,Context context)
    {

        this.stList=students;
        this.context=context;
    }
    public void  onBindViewHolder(final ViewHolder holder, final int position)
    {
        CardView cardView = holder.cardView;
        TextView txt=(TextView)cardView.findViewById(R.id.text);
        final ImageView imgs=(ImageView)cardView.findViewById(R.id.img);
        imgs.setVisibility(View.INVISIBLE);
        //check=(CheckBox)cardView.findViewById(R.id.check);
        cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                // CheckBox c=(CheckBox)v;
                //click contact = (click) c.getTag();
                //contact.setSelected(c.isChecked());
                if(stList.get(position).isselected) {
                    stList.get(position).setSelected(false);
                    imgs.setVisibility(View.INVISIBLE);
                }
                else
                {
                    stList.get(position).setSelected(true);
                    imgs.setVisibility(View.VISIBLE);
                }



                System.out.println(position);
            }



        });




        txt.setText(stList.get(position).getName());
        //check.setChecked(stList.get(position).isSelected());


    }
    @Override
    public int getItemCount()
    {
        return stList.size();
    }
    public List<click> getStudentist() {
        return stList;
    }
}