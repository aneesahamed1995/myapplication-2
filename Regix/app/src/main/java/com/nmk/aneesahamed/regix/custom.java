package com.nmk.aneesahamed.regix;

        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.List;

public class custom extends ArrayAdapter  {

    private List<click> stList;
    private Activity context;
    public custom(Activity context, List<click> students) {
        super(context, R.layout.active5, students);
        this.context = context;
        this.stList=students;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.active5, null, true);
       TextView textViewId = (TextView) listViewItem.findViewById(R.id.name);
        final ImageView imgs=(ImageView)listViewItem.findViewById(R.id.img);
        imgs.setVisibility(View.INVISIBLE);

        textViewId.setText(stList.get(position).getName());


        return listViewItem;
    }

}

