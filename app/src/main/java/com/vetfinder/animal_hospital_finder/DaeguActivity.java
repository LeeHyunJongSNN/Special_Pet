package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class DaeguActivity extends AppCompatActivity {

    private AdView mAdView;


    Button back;
    Button cg;
    Button joeun;
    Button shin;
    Button first;
    Button sun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daegu);

        back=findViewById(R.id.daegu_back_to_main);
        back.setOnClickListener(onClickListener_back);
        cg=findViewById(R.id.cg_vet);
        cg.setOnClickListener(onClickListener_cg);
        joeun=findViewById(R.id.joeun_vet);
        joeun.setOnClickListener(onClickListener_joeun);
        shin=findViewById(R.id.shin_vet);
        shin.setOnClickListener(onClickListener_shin);
        first=findViewById(R.id.first_vet);
        first.setOnClickListener(onClickListener_first);
        sun=findViewById(R.id.sun_vet);
        sun.setOnClickListener(onClickListener_sun);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    View.OnClickListener onClickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_cg = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetCgActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_joeun = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetJoeunActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_shin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetShinActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_first = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetFirstActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_sun = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetSunActivity.class);
            startActivity(intent);
        }
    };
}