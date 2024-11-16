package com.example.customlistandexpandlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        Button btnCustomList = findViewById(R.id.btn_custom_list);
        Button btnExpandList = findViewById(R.id.btn_expand_list);

        // Set click listeners
        btnCustomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start CustomListActivity
                Intent intent = new Intent(MainActivity.this, CustomListActivity.class);
                startActivity(intent);
            }
        });

        btnExpandList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start CustomListActivity
                Intent intent = new Intent(MainActivity.this, ExpandListActivity.class);
                startActivity(intent);
            }
        });
    }
}
