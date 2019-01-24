package com.lambdaschool.unittestcodechallenges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.submit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String inputString   = ((EditText) findViewById(R.id.input_text)).getText().toString();
                final String reverseString = ReverseStringChallenge.reverseString(inputString);
                ((TextView)findViewById(R.id.output_text)).setText(reverseString);
            }
        });
    }
}
