package com.example.assignment1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    String nameSended = "";
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);
        Intent intent = getIntent();
        nameSended = intent.getStringExtra("myName");
        t = (TextView) findViewById(R.id.txtName);
        t.setText(nameSended);
    }

}
