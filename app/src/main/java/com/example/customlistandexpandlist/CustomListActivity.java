package com.example.customlistandexpandlist;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class CustomListActivity extends AppCompatActivity {


    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
listView=(ListView) findViewById(R.id.lv_football_clubs);


String[] Football_club= getResources().getStringArray(R.array.Football_clubs);
ArrayAdapter<String> adapter=new ArrayAdapter<>(CustomListActivity.this,R.layout.sample_list_view_football_clubs,R.id.tv_sample_list_view,Football_club);
listView.setAdapter(adapter);

    }
}
