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

public class ChoongchungActivity extends AppCompatActivity {

    private AdView mAdView;

    Button back;
    Button soo;
    Button choongbook;
    Button ain;
    Button any;
    Button gor;
    Button dasom;
    Button sinhwa;
    Button seogor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choongchung);

        back = findViewById(R.id.choongchung_back_to_main);
        back.setOnClickListener(onClickListener);
        soo = findViewById(R.id.soo_vet);
        soo.setOnClickListener(onClickListener);
        choongbook = findViewById(R.id.choongbook_vet);
        choongbook.setOnClickListener(onClickListener);
        ain = findViewById(R.id.ain_vet);
        ain.setOnClickListener(onClickListener);
        any = findViewById(R.id.any_vet);
        any.setOnClickListener(onClickListener);
        gor = findViewById(R.id.gor_vet);
        gor.setOnClickListener(onClickListener);
        dasom = findViewById(R.id.dasom_vet);
        dasom.setOnClickListener(onClickListener);
        sinhwa = findViewById(R.id.sinhwa_vet);
        sinhwa.setOnClickListener(onClickListener);
        seogor=findViewById(R.id.seogor_vet);
        seogor.setOnClickListener(onClickListener);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.choongchung_back_to_main) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.soo_vet){
                Intent intent = new Intent(getApplicationContext(), VetSooActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.choongbook_vet){
                Intent intent = new Intent(getApplicationContext(), VetChoongbookActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ain_vet){
                Intent intent = new Intent(getApplicationContext(), VetAinActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id. any_vet){
                Intent intent = new Intent(getApplicationContext(), VetAnyActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id. gor_vet){
                Intent intent = new Intent(getApplicationContext(), VetGorActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id. dasom_vet){
                Intent intent = new Intent(getApplicationContext(), VetDasomActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id. sinhwa_vet){
                Intent intent = new Intent(getApplicationContext(), VetShinhwaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id. seogor_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeogorActivity.class);
                startActivity(intent);
            }
        }
    };
}