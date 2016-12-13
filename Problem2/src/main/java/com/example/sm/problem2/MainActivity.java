package com.example.sm.problem2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MyBaseAdapter adapter;
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // need something here

        adapter = new MyBaseAdapter(this, emp_list);
        listview = (ListView) findViewById(R.id.listView1) ;
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((AdapterView.OnItemClickListener)adapter);
    }
    @Override
    public void onClick(View v){
        EditText edit_name = (EditText) findViewById(R.id.edit_name);
        EditText edit_age = (EditText) findViewById(R.id.edit_age);
        EditText edit_salary = (EditText) findViewById(R.id.edit_salary);

        Employee employee;

        switch (v.getId()){
            case R.id.btn_inc:
                // need something here
                //salary = salary + 10000;
                Payment.increase();
                break;

            case R.id.btn_dec:
                // need something here
                // salary = salary - 10000;
                Payment.decrease();
                break;

            case R.id.btn_store:
                // need something here
                // 추가 add호출
                // 추가하려는 이름이 이미 있을경우 에러


                break;

            case R.id.btn_modify:
                // need something here
                // 수정 add 호출
                // 수정하려는 이름이 리스트에 없을 경우 에러

                break;

            case R.id.btn_delete:
                // need something here
                // 삭제 delete 호출
                // 삭제하려는 이름이 리스트에 없을 경우 에러

                break;
        }
    }
}

interface Payment {
    void increase();
    void decrease();
}
