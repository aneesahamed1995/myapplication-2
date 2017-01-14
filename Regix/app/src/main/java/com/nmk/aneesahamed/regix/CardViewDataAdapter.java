package com.nmk.aneesahamed.regix;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class CardViewDataAdapter extends
        RecyclerView.Adapter<CardViewDataAdapter.ViewHolder> {

    private List<Student> stList;

    public CardViewDataAdapter(List<Student> students) {
        this.stList = students;

    }


    @Override
    public CardViewDataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview, null);



        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {

        final int pos = position;

        viewHolder.Name.setText(stList.get(position).getName());


       viewHolder.chk1.setChecked(stList.get(position).present());
        viewHolder.chk2.setChecked(stList.get(position).absent());
        viewHolder.chk3.setChecked(stList.get(position).ods());




        viewHolder.chk1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;

                stList.get(pos).setpresent(cb.isChecked());
                 stList.get(pos).setabsent(false);
                stList.get(pos).setod(false);
                viewHolder.chk2.setChecked(false);
                viewHolder.chk3.setChecked(false);


            }
        });
        viewHolder.chk2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;

                stList.get(pos).setabsent(cb.isChecked());
                viewHolder.chk1.setChecked(false);
                viewHolder.chk3.setChecked(false);
                stList.get(pos).setpresent(false);
                stList.get(pos).setod(false);



            }
        });
        viewHolder.chk3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;

                stList.get(pos).setod(cb.isChecked());
                viewHolder.chk1.setChecked(false);
                viewHolder.chk2.setChecked(false);
                stList.get(pos).setpresent(false);
                stList.get(pos).setabsent(false);


            }
        });

    }


    @Override
    public int getItemCount() {
        return stList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Name;


        public CheckBox chk1;
        public CheckBox chk2;
        public CheckBox chk3;

        public Student singlestudent;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            Name = (TextView) itemLayoutView.findViewById(R.id.Name);


            chk1 = (CheckBox) itemLayoutView
                    .findViewById(R.id.check1);
            chk2 = (CheckBox) itemLayoutView
                    .findViewById(R.id.check2);
            chk3 = (CheckBox) itemLayoutView
                    .findViewById(R.id.check3);

        }

    }


    public List<Student> getStudentist() {
        return stList;
    }

}

