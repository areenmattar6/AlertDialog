package com.mattar.areen.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlert=(Button)findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==btnAlert)
        {

            AlertDialog.Builder  builder = new AlertDialog.Builder(this);
            builder.setTitle("Select name");
            builder.setMessage("This is a message");
            builder.setCancelable(false);
            builder.setPositiveButton("I agree for the rules", new HandleAlertDialogListener());
            builder.setNegativeButton("No,i dont agree", new HandleAlertDialogListener());
            AlertDialog  dialog=builder.create();
            dialog.show();



        }

    }

    public  class  HandleAlertDialogListener implements DialogInterface.OnClickListener
    {

        @Override
        public void onClick(DialogInterface dialog, int which) {


            Toast.makeText(MainActivity.this,"u selected "+which ,Toast.LENGTH_LONG).show();
        }
    }
}

