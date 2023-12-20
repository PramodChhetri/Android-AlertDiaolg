package com.example.mp_06_alertexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomDialogExampleactivity extends AppCompatActivity {

    EditText etPrincipal,etRate,etTime;
    Button btCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_exampleactivity);

        Button btnCustom = findViewById(R.id.btShowCustomDialog);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }

      public void showDialog(){
            AlertDialog.Builder builder=new AlertDialog.Builder(CustomDialogExampleactivity.this);
            builder.setTitle("Calculate Simple Intwrest");
            builder.setCancelable(true);

            LayoutInflater inflater=getLayoutInflater();
            View view=inflater.inflate(R.layout.activity_fragment_simple_interest,null);
            builder.setView(view);

            etPrincipal=view.findViewById(R.id.et1);
            etTime=view.findViewById(R.id.et2);
            etRate=view.findViewById(R.id.et3);
            tvResult=view.findViewById(R.id.tvSI);
            btCalculate=view.findViewById(R.id.btSI);

            btCalculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int Principal=Integer.parseInt(etPrincipal.getText().toString());
                    int Time=Integer.parseInt(etTime.getText().toString());
                    int Rate=Integer.parseInt(etRate.getText().toString());

                    int si=(Principal*Rate*Time)/100;
                    tvResult.setText("Simple Intrest : "+si);
                }
            });

            AlertDialog alert=builder.create();
            alert.show();


      }
}