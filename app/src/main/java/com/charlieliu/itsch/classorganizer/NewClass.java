package com.charlieliu.itsch.classorganizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewClass extends Activity {


    private static final String TAG = "NewClass";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class);

        final EditText classNameText = findViewById(R.id.classNameText);
        final EditText classCodeText = findViewById(R.id.classCodeText);

        Button insert = findViewById(R.id.insertButton);
        Button clear = findViewById(R.id.clearButton);

        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Log.v(TAG, "Clear");
                classNameText.setText("");
                classCodeText.setText("");

            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Log.v(TAG, "Insert");
                Intent intent = new Intent(NewClass.this, ClassList.class);
                startActivity(intent);


            }
        });

    }
}
