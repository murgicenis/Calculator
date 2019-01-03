package com.murgic.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_msg);

        TextView txtMessage = (TextView) findViewById(R.id.textMessage);
        txtMessage.setText(getIntent().getStringExtra("text"));
    }
}
