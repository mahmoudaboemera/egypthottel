package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElgonaRooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elgona_rooms);
    }
    public void rooms(View view) {
        Intent i = new Intent(this, AswanRoom.class);
        startActivity(i);

    }
}
