package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class BusanActivity extends AppCompatActivity {

    private AdView mAdView;

    ScrollView busanlist;
    Button back;
    Button real;
    Button seodong;
    Button goo;
    Button go;
    Button irum;
    Button dukcheon;
    Button un;
    Button ocean;
    Button samsung;
    Button hadan;
    Button hello;
    Button go_geumjung;
    Button go_dongrae;
    Button go_bukgu;
    Button go_junggu;
    Button go_yeonje;
    Button go_bunamgu;
    Button go_bugangseo;
    Button go_saha;
    TextView geumjung;
    TextView dongrae;
    TextView bukgu;
    TextView junggu;
    TextView yeonje;
    TextView bunamgu;
    TextView bugangseu;
    TextView saha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busan);

        busanlist=findViewById(R.id.busanlist);
        back=findViewById(R.id.busan_back_to_main);
        back.setOnClickListener(onClickListener);
        real=findViewById(R.id.real_vet);
        real.setOnClickListener(onClickListener);
        goo=findViewById(R.id.seodong_vet);
        goo.setOnClickListener(onClickListener);
        seodong=findViewById(R.id.goo_vet);
        seodong.setOnClickListener(onClickListener);
        go=findViewById(R.id.go_vet);
        go.setOnClickListener(onClickListener);
        irum=findViewById(R.id.irum_vet);
        irum.setOnClickListener(onClickListener);
        dukcheon=findViewById(R.id.dukcheon_vet);
        dukcheon.setOnClickListener(onClickListener);
        un=findViewById(R.id.un_vet);
        un.setOnClickListener(onClickListener);
        hello=findViewById(R.id.hello_vet);
        hello.setOnClickListener(onClickListener);
        ocean=findViewById(R.id.ocean_vet);
        ocean.setOnClickListener(onClickListener);
        samsung=findViewById(R.id.samsung_vet);
        samsung.setOnClickListener(onClickListener);
        hadan=findViewById(R.id.hadan_vet);
        hadan.setOnClickListener(onClickListener);
        go_geumjung=findViewById(R.id.go_geumjung);
        go_dongrae=findViewById(R.id.go_dongrae);
        go_bukgu=findViewById(R.id.go_bukgu);
        go_junggu=findViewById(R.id.go_junggu);
        go_yeonje=findViewById(R.id.go_yeonje);
        go_bunamgu=findViewById(R.id.go_bunamgu);
        go_bugangseo=findViewById(R.id.go_bugangseo);
        go_saha=findViewById(R.id.go_saha);
        go_geumjung.setOnClickListener(onClickListener);
        go_dongrae.setOnClickListener(onClickListener);
        go_bukgu.setOnClickListener(onClickListener);
        go_junggu.setOnClickListener(onClickListener);
        go_yeonje.setOnClickListener(onClickListener);
        go_bunamgu.setOnClickListener(onClickListener);
        go_bugangseo.setOnClickListener(onClickListener);
        go_saha.setOnClickListener(onClickListener);
        geumjung=findViewById(R.id.geumjung);
        dongrae=findViewById(R.id.dongre);
        bukgu=findViewById(R.id.bookgu);
        junggu=findViewById(R.id.junggu);
        yeonje=findViewById(R.id.yeonje);
        bunamgu=findViewById(R.id.bunamgu);
        bugangseu=findViewById(R.id.bugangseo);
        saha=findViewById(R.id.saha);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public static void scrollToView(View view, final ScrollView scrollView, int count) {
        if (view != null && view != scrollView) {
            count += view.getTop();
            scrollToView((View) view.getParent(), scrollView, count);
        } else if (scrollView != null) {
            final int finalCount = count;
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    scrollView.smoothScrollTo(0, finalCount);
                }
            }, 200);
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.busan_back_to_main) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seodong_vet) {
                Intent intent = new Intent(getApplicationContext(), VetGooseoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.real_vet) {
                Intent intent = new Intent(getApplicationContext(), VetRealActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.goo_vet) {
                Intent intent = new Intent(getApplicationContext(), VetSeodongActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.go_vet) {
                Intent intent = new Intent(getApplicationContext(), VetGoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.irum_vet) {
                Intent intent = new Intent(getApplicationContext(), VetIrumActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.dukcheon_vet) {
                Intent intent = new Intent(getApplicationContext(), VetDukcheonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.un_vet) {
                Intent intent = new Intent(getApplicationContext(), VetUnActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.ocean_vet) {
                Intent intent = new Intent(getApplicationContext(), VetOceanActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.samsung_vet) {
                Intent intent = new Intent(getApplicationContext(), VetSamsungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hadan_vet) {
                Intent intent = new Intent(getApplicationContext(), VetHadanActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hello_vet) {
                Intent intent = new Intent(getApplicationContext(), VetHelloActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.go_geumjung) {
                scrollToView(geumjung,busanlist,0);
            }

            else if (v.getId() == R.id.go_dongrae) {
                scrollToView(dongrae,busanlist,0);
            }

            else if (v.getId() == R.id.go_yeonje) {
                scrollToView(yeonje,busanlist,0);
            }

            else if (v.getId() == R.id.go_bunamgu) {
                scrollToView(bunamgu,busanlist,0);
            }

            else if (v.getId() == R.id.go_bugangseo) {
                scrollToView(bugangseu,busanlist,0);
            }

            else if (v.getId() == R.id.go_bukgu) {
                scrollToView(bukgu,busanlist,0);
            }

            else if (v.getId() == R.id.go_junggu) {
                scrollToView(junggu,busanlist,0);
            }

            else if (v.getId() == R.id.go_saha) {
                scrollToView(saha,busanlist,0);
            }
        }
    };
}