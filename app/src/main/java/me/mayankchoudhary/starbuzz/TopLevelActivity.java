package me.mayankchoudhary.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_level_activity);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> theViewThatWasClicked, View view, int position, long id) {
                      if(position == 0) {
                          Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                          startActivity(intent);
                      }
            }
        };
        listView = findViewById(R.id.listOptions);
        listView.setOnItemClickListener(itemClickListener);
    }
}