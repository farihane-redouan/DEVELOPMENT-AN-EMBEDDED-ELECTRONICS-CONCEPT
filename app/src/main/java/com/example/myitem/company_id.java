package com.example.myitem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class company_id extends AppCompatActivity {
private Button login_company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_id);
        this.login_company = findViewById(R.id.login_company);

        login_company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), company_actions.class);
                startActivity(a);
            }
        });
    }
}
