package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElgonaRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elgona_room);
    }

    public void vizt(View view) {
        Intent i = new Intent(this, GonaInfo.class);
        startActivity(i);


    }
}
