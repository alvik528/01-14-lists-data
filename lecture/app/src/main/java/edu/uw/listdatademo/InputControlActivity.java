package edu.uw.listdatademo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputControlActivity extends AppCompatActivity {

    private static final String TAG = "InputControl";
    private static String SEARCHING="whore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_control_layout);

        final EditText text = (EditText)findViewById(R.id.txtSearch);
        final Button button = (Button)findViewById(R.id.btnSearch);

        button.setOnClickListener(new View.OnClickListener() {
            private int count = 1;

            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button was pressed "+count+" times!");
                count++;
                String typed = text.getText().toString();
                Log.v(TAG, "You typed: "+typed);
                Intent i = new Intent(InputControlActivity.this, ListActivity.class);
                SEARCHING = typed;
                i.putExtra("SEARCHING",SEARCHING);
                startActivity(i);
            }
        });



    }
}
