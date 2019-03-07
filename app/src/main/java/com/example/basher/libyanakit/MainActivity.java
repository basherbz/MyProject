package com.example.basher.libyanakit;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.Manifest.permission.CALL_PHONE;
import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void chargeClicked (View v){
        String ussdCode = "*" + "121" + Uri.encode("#");


        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void netBalance (View v){
        String ussdCode = "*" + "222" + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
          //  startService(new Intent(this, USSDMainService.class));
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }

    }

    public void chargeCard (View v){
        setContentView(R.layout.charge_rased);
    }
    public void joinNet(View v){
        setContentView(R.layout.join_internet);
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public void charge (View v){
        EditText et = (EditText) findViewById(R.id.cardNum);
        String ussdCode = "*" + "120" + "*" + et.getText().toString() + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }
    }



    public void weekly50(View v){
        String ussdCode = "*" + "555" + "*" + "1" + "*" + "1" + "*" + "1" + "*" + "1" + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            //  startService(new Intent(this, USSDMainService.class));
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }
    }
    public void weekly200(View v) {
        String ussdCode = "*" + "555" + "*" + "1" + "*" + "1" + "*" + "2" + "*" + "1" + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            //  startService(new Intent(this, USSDMainService.class));
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }
    }
    public void weekly400(View v) {
        String ussdCode = "*" + "555" + "*" + "1" + "*" + "1" + "*" + "3" + "*" + "1" + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            //  startService(new Intent(this, USSDMainService.class));
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }
    }

    public void monthly21(View v){
        String ussdCode = "*" + "555" + "*" + "1" + "*" + "3" + "*" + "2" + "*" + "1" + Uri.encode("#");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            //  startService(new Intent(this, USSDMainService.class));
            startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
        } else {
            requestPermissions(new String[]{CALL_PHONE}, 1);
        }
    }

}