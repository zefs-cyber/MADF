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


public class ConnectFragment extends Fragment {

    EditText server;
    EditText topic;
    EditText password;
    EditText userID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        View view = inflater.inflate(R.layout.fragment_connect, container, true);

        Button btn_connect = view.findViewById(R.id.connect);
        btn_connect.setOnClickListener(this::connect);

        Button btn_disconnect = view.findViewById(R.id.disconnect);
        btn_disconnect.setOnClickListener(this::disconnect);

        userID = view.findViewById(R.id.userID_connect);
        topic = view.findViewById(R.id.topic_connect);
        password = view.findViewById(R.id.password_connect);
        server = view.findViewById(R.id.server_connect);

        return view;
    }

    public void connect(View view){
        System.out.println("Connect:");
        System.out.println(userID.getText());
        System.out.println(topic.getText());
        System.out.println(password.getText());
        System.out.println(server.getText());
    }

    public void disconnect(View view){
        System.out.println("Disconnect:");
    }
}