package com.example.funnystory;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class createText extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_text);
    }
    
    public void onButtonClick(View v) {
        LinearLayout ln = findViewById(R.id.linearLayout2);
        ln.setVisibility(View.INVISIBLE);
        storyText sT = new storyText();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_story_text, sT);
        ft.commit();
    }
}
