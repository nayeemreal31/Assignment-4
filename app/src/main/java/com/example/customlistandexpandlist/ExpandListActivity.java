package com.example.customlistandexpandlist;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ExpandListActivity extends AppCompatActivity {
private ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_expand_list);

        expandableListView=(ExpandableListView) findViewById(R.id.expandableListView);


}}
