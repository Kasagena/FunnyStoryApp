package com.example.funnystory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;

public class createText extends AppCompatActivity {

//    private Button createStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_text);
//        addListenerOnButton ();
    }

    public void onButtonClick (View v) {
//        final EditText ob1 = findViewById(R.id.editText);
//        String text1 = ob1.getText().toString();
//        TextView storyText = findViewById(R.id.textStory);
//        storyText.setText(text1);

        Fragment fragment  = new storyText();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.storyfragment, fragment);


//        final EditText text2 = findViewById(R.id.editText2);
//        text2.getText().toString();
//        final EditText text3 = findViewById(R.id.editText3);
//        text3.getText().toString();
//        final EditText text4 = findViewById(R.id.editText4);
//        text4.getText().toString();
//        final EditText text5 = findViewById(R.id.editText5);
//        text5.getText().toString();
//        final EditText text6 = findViewById(R.id.editText6);
//        text6.getText().toString();
//        newStory_button = findViewById(R.id.createStory_button);
//    }

//    public void addListenerOnButton () {
//        createStory = findViewById(R.id.createStory_button);
//        createStory.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(createText.this, textStory.class);
//                        startActivity(intent);
//                    }
//                }
//        );
    }
}
