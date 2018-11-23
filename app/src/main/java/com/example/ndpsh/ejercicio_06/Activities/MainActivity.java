package com.example.ndpsh.ejercicio_06.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ndpsh.ejercicio_06.Fragments.DetailsFragment;
import com.example.ndpsh.ejercicio_06.Fragments.ListFragment;
import com.example.ndpsh.ejercicio_06.Models.Mail;
import com.example.ndpsh.ejercicio_06.R;


/**
 *  Created by Naim on 22/11/18
 */

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {

    private boolean isMultiPanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();

    }
    @Override
    public void onListClick(Mail mail) {

        if(isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
            detailsFragment.renderMail(mail);
        }else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("message", mail.getMessage());
            intent.putExtra("senderName", mail.getSenderName());
            startActivity(intent);
        }


    }
    private void setMultiPanel() {
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail) != null);
    }


}
