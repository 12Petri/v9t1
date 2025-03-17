package com.petestudy.v9t1;

//Pitkälti Rockets-esimerkin mukaan tehty

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAddNote(View view) {
        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);
    }

    public void switchToNoteList(View view) {
        Intent intent = new Intent(this, ListNotesActivity.class);
        startActivity(intent);
    }
}