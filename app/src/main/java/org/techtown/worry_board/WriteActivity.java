package org.techtown.worry_board;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WriteActivity extends AppCompatActivity {

    private EditText mwriteTitleText;
    private EditText mWriteContontentsText;
    private EditText mWriteNameText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        mwriteTitleText = findViewById(R.id.write_title_text);
        mWriteContontentsText = findViewById((R.id.write_contents_text));
        mWriteNameText = findViewById(R.id.wrtie_name_text);

    }
}
