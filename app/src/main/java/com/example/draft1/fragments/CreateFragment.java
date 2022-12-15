package com.example.draft1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.draft1.R;


public class CreateFragment extends Fragment {
    EditText topic;
    EditText password;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        View view = inflater.inflate(R.layout.fragment_create, container, true);

        Button btn_connect = view.findViewById(R.id.create);
        btn_connect.setOnClickListener(this::create);

        topic = view.findViewById(R.id.topic_create);
        password = view.findViewById(R.id.password_create);

        return view;
    }

    public void create(View view){
        System.out.println("create:");
        System.out.println(topic.getText());
        System.out.println(password.getText());
    }
}