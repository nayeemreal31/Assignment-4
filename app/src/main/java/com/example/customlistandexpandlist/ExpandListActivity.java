package com.example.customlistandexpandlist;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import  java.util.List;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExpandListActivity extends AppCompatActivity {


    private ExpandableListView expandableListView;
    List<String> listdataheader;
    HashMap<String,List<String >> listdatachild;

    private CustomAdapter customadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_expand_list);
        prepareListData();

        expandableListView=(ExpandableListView) findViewById(R.id.expandable_List_View);

   customadapter=new CustomAdapter(this,listdataheader,listdatachild);
   expandableListView.setAdapter(customadapter);

}
    public void prepareListData() {
        String[] headerstring = getResources().getStringArray(R.array.Football_clubs);
        String[] childstring = getResources().getStringArray(R.array.club_descriptions);

        listdataheader = new ArrayList<>();
        listdatachild = new HashMap<>();

        for (int i = 0; i < headerstring.length; i++) {
            // Add header data
            listdataheader.add(headerstring[i]);

            // Create a list for each header's children
            List<String> child = new ArrayList<>();
            child.add(childstring[i]);  // Add the description for the club

            // Map header to its children
            listdatachild.put(headerstring[i], child);
        }
    }


}
