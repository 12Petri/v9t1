package com.petestudy.v9t1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {
    private EditText titleEdit, contentEdit;

    @Override
    protected  void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_add_note);

        titleEdit = findViewById(R.id.TitleEdit);
        contentEdit = findViewById(R.id.ContentEdit);
    }

    public void addNote(View view) {
        String title = titleEdit.getText().toString();
        String content = contentEdit.getText().toString();

        Note note = new Note(title, content);
        NoteStorage.getInstance().addNote(note);

        finish();
    }

    public void switchToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}