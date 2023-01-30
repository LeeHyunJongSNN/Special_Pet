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

public class UlsanActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button little;
    Button sm;
    Button s;
    Button hanbit;
    Button gulhwa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulsan);
        back=findViewById(R.id.ulsan_back_to_main);
        back.setOnClickListener(onClickListener_back);
        little=findViewById(R.id.little_vet);
        little.setOnClickListener(onClickListener_little);
        sm=findViewById(R.id.sm_vet);
        sm.setOnClickListener(onClickListener_sm);
        s=findViewById(R.id.s_vet);
        s.setOnClickListener(onClickListener_s);
        hanbit=findViewById(R.id.hanbit_vet);
        hanbit.setOnClickListener(onClickListener_hanbit);
        gulhwa=findViewById(R.id.gulhwa_vet);
        gulhwa.setOnClickListener(onClickListener_gulhwa);

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

    View.OnClickListener onClickListener_little = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetZooActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_sm = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetSmileActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_s = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetSActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_hanbit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetLightActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_gulhwa = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), VetGulhwaActivity.class);
            startActivity(intent);
        }
    };
}