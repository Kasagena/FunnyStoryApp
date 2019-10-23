package com.example.funnystory;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class storyText extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_story_text, null);

        TextView textView = view.findViewById(R.id.textView7);
        textView.setText(getArguments().getString("text"));
        return view;
    }

}
