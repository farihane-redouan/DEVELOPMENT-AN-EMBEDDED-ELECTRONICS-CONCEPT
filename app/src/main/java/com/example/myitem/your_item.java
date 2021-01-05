package com.example.myitem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class your_item extends AppCompatActivity {
private Button skirt, bag, jeans, cap, coat, luggage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_item);
        this.bag = findViewById(R.id.bag);
        this.luggage = findViewById(R.id.luggage);

        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent your_item_id = new Intent(getApplicationContext(), com.example.myitem.your_item_id.class);
                startActivity(your_item_id);
            }
        });
        luggage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent your_item_id = new Intent(getApplicationContext(), com.example.myitem.your_item_id.class);
                startActivity(your_item_id);
            }
        });
    }
}