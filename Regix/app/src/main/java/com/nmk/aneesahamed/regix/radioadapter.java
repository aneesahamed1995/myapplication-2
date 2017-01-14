package com.nmk.aneesahamed.regix;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class radioadapter extends
        RecyclerView.Adapter<radioadapter.ViewHolder> {

    private List<stud> stList;

    public radioadapter(List<stud> students) {
        this.stList = students;

    }


    @Override
    public radioadapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.radio, null);



        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        final int pos = position;
         System.out.println(position);
        viewHolder.Name.setText(stList.get(pos).getName());
       // viewHolder.radio2.setChecked(stList.get(pos).abs());
     viewHolder.radio1.setChecked(stList.get(pos).pres());
        //viewHolder.radio3.setChecked(stList.get(pos).ods());


       // viewHolder.chkSelected.setChecked(stList.get(position).isSelected());



        viewHolder.radio1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //CheckBox cb = (CheckBox) v;

                stList.get(pos).present(false);



            }
        });
        viewHolder.radio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //CheckBox cb = (CheckBox) v;

                //stList.get(pos).setSelected(cb.isChecked());
                stList.get(pos).absent(false);



            }
        });
        viewHolder.radio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //CheckBox cb = (CheckBox) v;

                //stList.get(pos).setSelected(cb.isChecked());
                stList.get(pos).od(false);


            }
        });



    }


    @Override
    public int getItemCount() {
        return stList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Name;
        public RadioGroup radioGroup;
        public RadioButton radio1;
        public RadioButton radio2;
        public RadioButton radio3;


        public CheckBox chkSelected;

        public Student singlestudent;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
             radio1=(RadioButton)itemLayoutView.findViewById(R.id.present);
            radio2=(RadioButton)itemLayoutView.findViewById(R.id.absent);
            radio3=(RadioButton)itemLayoutView.findViewById(R.id.od);

             radioGroup=(RadioGroup)itemLayoutView.findViewById(R.id.radiogroup);
            Name = (TextView) itemLayoutView.findViewById(R.id.Name);




        }

    }


    public List<stud> getStudentist() {
        return stList;
    }

}

