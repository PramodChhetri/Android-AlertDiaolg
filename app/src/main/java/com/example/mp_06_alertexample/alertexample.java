package com.example.mp_06_alertexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class alertexample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertexample);

        Button btShow = findViewById(R.id.btShow);

        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(alertexample.this);
                builder.setTitle("Confirm");
                builder.setMessage("Do you wan to exit this app?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(alertexample.this,"Ok Clicked",Toast.LENGTH_SHORT).show();
                                finish();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(alertexample.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();

                    }
                });

                builder.create().show();

            }
        });

    }
}