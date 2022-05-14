package com.example.vitaqrparamedico;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarActivityMenu(View view){
        Intent segAct=new Intent(this,activity_scanner.class);
        startActivity(segAct);
    }
}