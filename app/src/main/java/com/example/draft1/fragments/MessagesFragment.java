package com.example.draft1.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.draft1.R;


public class MessagesFragment extends Fragment {
    EditText editText;
    Context context;
    View view;
    LinearLayout ll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        context = getContext();

        view = inflater.inflate(R.layout.fragment_messages, container, true);

        Button b = view.findViewById(R.id.buttonSend);
        b.setOnClickListener(this::sendMessage_u);

        editText = view.findViewById(R.id.message);
        ll = view.findViewById(R.id.lr);


        return view;
    }




    public void sendMessage_u(View view){
        String msg = String.valueOf(editText.getText());
        TextView tv;

        System.out.println("Message:");
        System.out.println(msg);

        tv = new TextView(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.TEXT_ALIGNMENT_VIEW_END);
        params.leftMargin = 50;
        params.topMargin  = 50;
        tv.setText(msg);
        tv.setBackgroundResource(R.drawable.messages_u);
        tv.setTextSize((float) 10);
        tv.setMinWidth(20);
        tv.setPadding(20, 20, 20, 20);
        tv.setLayoutParams(params);
        ll.addView(tv);
        sendMessage_o(view);
    }

    public void sendMessage_o(View view){
        String msg = String.valueOf(editText.getText());
        TextView tv;

        System.out.println("Message:");
        System.out.println(msg);

        tv = new TextView(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.TEXT_ALIGNMENT_VIEW_END);
        params.gravity = Gravity.RIGHT;
        params.leftMargin = 50;
        params.topMargin  = 50;
        tv.setText(msg);
        tv.setBackgroundResource(R.drawable.messages_o);
        tv.setTextSize((float) 10);
        tv.setMinWidth(20);
        tv.setPadding(20, 20, 20, 20);
        tv.setLayoutParams(params);
        ll.addView(tv);
    }


}