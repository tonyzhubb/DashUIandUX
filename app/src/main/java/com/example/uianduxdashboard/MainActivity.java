package com.example.uianduxdashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Dashboard icon views
    CardView wifi;
    CardView equalizer;
    CardView call;
    CardView vpn;
    CardView cart;
    CardView bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize dashboard icon views and finding them by
        // their id's
        wifi = findViewById(R.id.wifi);
        equalizer = findViewById(R.id.equal);
        call = findViewById(R.id.call);
        vpn = findViewById(R.id.vpn);
        cart = findViewById(R.id.cart);
        bluetooth = findViewById(R.id.bluetooth);

        //Handle the home wifi click
        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Wifi icon is clicked");
            }
        });

        //Handle the equalizer icon click
        equalizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Equalizer icon is clicked");
            }
        });

        //Handle the call icon click
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Call icon is clicked");
            }
        });

        //Handle the  vpn icon click
        vpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Vpn icon is clicked");
            }
        });

        //Handle the cart icon click
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Cart icon is clicked");
            }
        });

        //Handle the bluetooth icon click
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Bluetooth icon is clicked");
            }
        });
    }

    //initialize the toast message popup
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
