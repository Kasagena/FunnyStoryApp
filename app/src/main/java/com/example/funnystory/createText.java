package com.example.funnystory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class createText extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_text);
        addListenerOnButton();
    }



    public void addListenerOnButton () {

        Button createFragmentButton = findViewById(R.id.createStory_button);
        createFragmentButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        final EditText ob1 = findViewById(R.id.editText);
//                        String text1 = ob1.getText().toString();
//                        TextView storyText = findViewById(R.id.textStory);
//                        storyText.setText(text1);

                        storyText fragment111 = new storyText();
                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.add(R.id.fragmentEbat, fragment111);
                        ft.commit();
                    }
                }
        );
    }
}
