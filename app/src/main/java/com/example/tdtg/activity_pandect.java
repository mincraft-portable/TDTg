package com.example.tdtg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_pandect extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandect);
        Button button_start=findViewById(R.id.button_start);
        Button button_all_event=findViewById(R.id.button_all_event);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_pandect.this,activity_addevent.class);
                startActivity(intent);
            }
        });
        button_all_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_pandect.this,activity_eventlist.class);
                startActivity(intent);
            }
        });
    }
}
