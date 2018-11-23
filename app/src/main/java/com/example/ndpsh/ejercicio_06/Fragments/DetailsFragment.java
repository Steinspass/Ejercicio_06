package com.example.ndpsh.ejercicio_06.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ndpsh.ejercicio_06.Models.Mail;
import com.example.ndpsh.ejercicio_06.R;


public class DetailsFragment extends Fragment {

    private TextView textViewSubject;
    private TextView textViewSender;
    private TextView textViewMessage;
    private LinearLayout wrapper;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        textViewSubject = view.findViewById(R.id.textViewListSubject);
        textViewSender = view.findViewById(R.id.textViewListSenderName);
        textViewMessage = view.findViewById(R.id.textViewFragmentMessage);
        wrapper = view.findViewById(R.id.fragmentDetailsMailWrapper);

        return view;
    }

    public void renderMail(Mail mail) {
        wrapper.setVisibility(View.VISIBLE);
        textViewSubject.setText(mail.getSubject());
        textViewSender.setText(mail.getSenderName());
        textViewMessage.setText(mail.getMessage());
    }
}
