package com.example.funnystory;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


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

//        final EditText ob1 = findViewById(R.id.editText);
//        String text1 = ob1.getText().toString();
//        final EditText ob2 = findViewById(R.id.editText2);
//        String text2 = ob2.getText().toString();
//        final EditText ob3 = findViewById(R.id.editText3);
//        String text3 = ob3.getText().toString();
//        final EditText ob4 = findViewById(R.id.editText4);
//        String text4 = ob4.getText().toString();
//        final EditText ob5 = findViewById(R.id.editText5);
//        String text5 = ob5.getText().toString();
//        final EditText ob6 = findViewById(R.id.editText6);
//        String text6 = ob6.getText().toString();
//
//        if (ob1.getText().length()*ob2.getText().length()*ob3.getText().length()*
//                ob4.getText().length()*ob5.getText().length()*ob6.getText().length() == 0) {
//            Toast.makeText(
//                    createText.this, "Заполните все поля",
//                    Toast.LENGTH_SHORT
//            ).show(); }
//        else {
        Bundle bundle = new Bundle();
        bundle.putString("text", "Hi" );
        sT.setArguments(bundle);
//            text1 + " " + text2 + " " + text3 + " " + text4 + " " + text5 + " " + text6
    }
}
