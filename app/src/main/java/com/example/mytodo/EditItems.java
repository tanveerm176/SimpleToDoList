package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItems extends AppCompatActivity {
    int item_pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_items);

        String item_string = getIntent().getStringExtra("edit_text");
        item_pos = getIntent().getExtras().getInt("edit_position");
        EditText item_prev_text = (EditText) findViewById(R.id.editTextName);
        item_prev_text.setText(item_string);
    }

    public void onSubmit(View v) {
        EditText item_post_text = (EditText) findViewById(R.id.editTextName);

        Intent data = new Intent();

        data.putExtra("post_edit_text", item_post_text.getText().toString());
        data.putExtra("edit_position", item_pos);

        setResult(RESULT_OK, data);
        finish();
    }
}