
package com.nmk.aneesahamed.regix;

        import android.support.v7.app.AppCompatActivity;
        import java.util.ArrayList;
        import java.util.List;
        import android.os.Bundle;

        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {



    private RecyclerView RecyclerView;
    private RecyclerView.Adapter Adapter;
    private List<Student> studentList;
    String Names[]={"Anees Ahamed","Mohamed aadhil","Najmal","jaffer","ashik","hauhuih","ghguguygu","ugwuwgsuig","jhihuh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        studentList = new ArrayList<Student>();

        for (int i = 0; i < Names.length; i++) {
            Student st = new Student(Names[i], false,false,false);

            studentList.add(st);
        }


        RecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        RecyclerView.setHasFixedSize(true);
        LinearLayoutManager grid = new LinearLayoutManager(this);
        RecyclerView.setLayoutManager(grid);
        Adapter = new CardViewDataAdapter(studentList);
        RecyclerView.setAdapter(Adapter);
    }

    public void submit(View view )
    {
        String data = "";
        List<Student> stList = ((CardViewDataAdapter) Adapter)
                .getStudentist();

        for (int i = 0; i < stList.size(); i++) {
            Student singleStudent = stList.get(i);
            if (singleStudent.present() == true) {

                data =  singleStudent.getName().toString();
                System.out.println(data);
            }
            else if(singleStudent.absent()==true)
            {
                data =  singleStudent.getName().toString();
                System.out.println(data);
            }
            else if(singleStudent.ods()==true)
            {
                data =  singleStudent.getName().toString();
                System.out.println(data);
            }

        }


    }


}


