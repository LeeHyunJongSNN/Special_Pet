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

public class SeoulActivity extends AppCompatActivity {

    private AdView mAdView;

    ScrollView seoulist;
    Button back;
    Button osh;
    Button hanyang;
    Button centralmedi;
    Button hana;
    Button window;
    Button bosung;
    Button nvet;
    Button reallove;
    Button banghak;
    Button leeandpark;
    Button doctors;
    Button nvetnowon;
    Button lk;
    Button forest;
    Button bookak;
    Button africa;
    Button im;
    Button happy;
    Button eoullim;
    Button hansoo;
    Button yeonseo;
    Button choi;
    Button zoozoo;
    Button goryu;
    Button acris;
    Button well;
    Button dream;
    Button daechi;
    Button cheongdam;
    Button gaepo;
    Button rafael;
    Button seoul;
    Button eco;
    Button pikaso;
    Button sejong;
    Button always;
    Button dr;
    Button sangdo;
    Button liebe;
    Button park;
    Button wooshin;
    Button miso;
    Button semyung;
    Button smileseoul;
    Button song;
    Button good;
    Button airport;
    Button yd;
    Button snoopy;
    Button sillim;
    Button seouluniv;
    Button seoulhq;
    Button hansung;
    Button global;
    Button vella;
    Button geumgang;
    Button doklip;
    Button go_gangnam;
    Button go_gangbook;
    Button go_gangdong;
    Button go_gangseo;
    Button go_dobong;
    Button go_nowon;
    Button go_seongdong;
    Button go_yangcheon;
    Button go_seocho;
    Button go_songpa;
    Button go_yongsan;
    Button go_dongdaemoon;
    Button go_seodaemoon;
    Button go_mapo;
    Button go_eunpyeong;
    Button go_yeongdeungpo;
    Button go_gwanak;
    Button go_seongbook;
    Button go_joongrang;
    Button go_jongno;
    Button go_dongjak;
    TextView gangnam;
    TextView gangbook;
    TextView gangdong;
    TextView gangseo;
    TextView dobong;
    TextView nowon;
    TextView seongdong;
    TextView yangcheon;
    TextView seocho;
    TextView songpa;
    TextView yongsan;
    TextView dongdaemoon;
    TextView seodaemoon;
    TextView mapo;
    TextView eunpyeong;
    TextView yeongdeungpo;
    TextView gwanak;
    TextView seongbook;
    TextView joongrang;
    TextView jongno;
    TextView dongjak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul);

        seoulist=findViewById(R.id.seoullist);
        back = findViewById(R.id.seoul_back_to_main);
        back.setOnClickListener(onClickListener);
        osh=findViewById(R.id.osh_vet);
        osh.setOnClickListener(onClickListener);
        hanyang=findViewById(R.id.hanyang_vet);
        hanyang.setOnClickListener(onClickListener);
        centralmedi=findViewById(R.id.centralmedi_vet);
        centralmedi.setOnClickListener(onClickListener);
        hana=findViewById(R.id.hana_vet);
        hana.setOnClickListener(onClickListener);
        window=findViewById(R.id.window_vet);
        window.setOnClickListener(onClickListener);
        bosung=findViewById(R.id.bosung_vet);
        bosung.setOnClickListener(onClickListener);
        nvet=findViewById(R.id.nvet_vet);
        nvet.setOnClickListener(onClickListener);
        reallove=findViewById(R.id.reallove_vet);
        reallove.setOnClickListener(onClickListener);
        banghak=findViewById(R.id.banghak_vet);
        banghak.setOnClickListener(onClickListener);
        leeandpark=findViewById(R.id.leeandpark_vet);
        leeandpark.setOnClickListener(onClickListener);
        doctors=findViewById(R.id.doctors_vet);
        doctors.setOnClickListener(onClickListener);
        nvetnowon=findViewById(R.id.nvetnowon_vet);
        nvetnowon.setOnClickListener(onClickListener);
        lk=findViewById(R.id.lk_vet);
        lk.setOnClickListener(onClickListener);
        forest=findViewById(R.id.forest_vet);
        forest.setOnClickListener(onClickListener);
        bookak=findViewById(R.id.bookak_vet);
        bookak.setOnClickListener(onClickListener);
        africa=findViewById(R.id.africa_vet);
        africa.setOnClickListener(onClickListener);
        im=findViewById(R.id.im_vet);
        im.setOnClickListener(onClickListener);
        happy=findViewById(R.id.happy_vet);
        happy.setOnClickListener(onClickListener);
        eoullim=findViewById(R.id.eoullim_vet);
        eoullim.setOnClickListener(onClickListener);
        hansoo=findViewById(R.id.hansoo_vet);
        hansoo.setOnClickListener(onClickListener);
        yeonseo=findViewById(R.id.yeonseo_vet);
        yeonseo.setOnClickListener(onClickListener);
        choi=findViewById(R.id.choi_vet);
        choi.setOnClickListener(onClickListener);
        zoozoo=findViewById(R.id.zoo_vet);
        zoozoo.setOnClickListener(onClickListener);
        goryu=findViewById(R.id.goryu_vet);
        goryu.setOnClickListener(onClickListener);
        acris=findViewById(R.id.acris_vet);
        acris.setOnClickListener(onClickListener);
        well=findViewById(R.id.well_vet);
        well.setOnClickListener(onClickListener);
        dream=findViewById(R.id.dream_vet);
        dream.setOnClickListener(onClickListener);
        daechi=findViewById(R.id.daechi_vet);
        daechi.setOnClickListener(onClickListener);
        cheongdam=findViewById(R.id.cheongdam_vet);
        cheongdam.setOnClickListener(onClickListener);
        gaepo=findViewById(R.id.gaepo_vet);
        gaepo.setOnClickListener(onClickListener);
        rafael=findViewById(R.id.rafael_vet);
        rafael.setOnClickListener(onClickListener);
        seoul=findViewById(R.id.seoul_vet);
        seoul.setOnClickListener(onClickListener);
        eco=findViewById(R.id.eco_vet);
        eco.setOnClickListener(onClickListener);
        pikaso=findViewById(R.id.pikaso_vet);
        pikaso.setOnClickListener(onClickListener);
        sejong=findViewById(R.id.sejong_vet);
        sejong.setOnClickListener(onClickListener);
        always=findViewById(R.id.always_vet);
        always.setOnClickListener(onClickListener);
        dr=findViewById(R.id.dr_vet);
        dr.setOnClickListener(onClickListener);
        sangdo=findViewById(R.id.sangdo_vet);
        sangdo.setOnClickListener(onClickListener);
        liebe=findViewById(R.id.liebe_vet);
        liebe.setOnClickListener(onClickListener);
        park=findViewById(R.id.park_vet);
        park.setOnClickListener(onClickListener);
        wooshin=findViewById(R.id.wooshin_vet);
        wooshin.setOnClickListener(onClickListener);
        miso=findViewById(R.id.miso_vet);
        miso.setOnClickListener(onClickListener);
        semyung=findViewById(R.id.semyung_vet);
        semyung.setOnClickListener(onClickListener);
        smileseoul=findViewById(R.id.smile_vet);
        smileseoul.setOnClickListener(onClickListener);
        song=findViewById(R.id.song_vet);
        song.setOnClickListener(onClickListener);
        good=findViewById(R.id.good_vet);
        good.setOnClickListener(onClickListener);
        airport=findViewById(R.id.airport_vet);
        airport.setOnClickListener(onClickListener);
        yd=findViewById(R.id.yd_vet);
        yd.setOnClickListener(onClickListener);
        snoopy=findViewById(R.id.snoopy_vet);
        snoopy.setOnClickListener(onClickListener);
        sillim=findViewById(R.id.sillim_vet);
        sillim.setOnClickListener(onClickListener);
        seouluniv=findViewById(R.id.seouluniv_vet);
        seouluniv.setOnClickListener(onClickListener);
        seoulhq=findViewById(R.id.seoulhq_vet);
        seoulhq.setOnClickListener(onClickListener);
        hansung=findViewById(R.id.hansung_vet);
        hansung.setOnClickListener(onClickListener);
        global=findViewById(R.id.global_vet);
        global.setOnClickListener(onClickListener);
        vella=findViewById(R.id.vella_vet);
        vella.setOnClickListener(onClickListener);
        geumgang=findViewById(R.id.geumgang_vet);
        geumgang.setOnClickListener(onClickListener);
        doklip=findViewById(R.id.doklip_vet);
        doklip.setOnClickListener(onClickListener);
        go_gangnam=findViewById(R.id.go_gangnam);
        go_gangbook=findViewById(R.id.go_gangbook);
        go_gangdong=findViewById(R.id.go_gangdong);
        go_gangseo=findViewById(R.id.go_gangseo);
        go_dobong=findViewById(R.id.go_dobong);
        go_nowon=findViewById(R.id.go_nowon);
        go_seongdong=findViewById(R.id.go_seongdong);
        go_yangcheon=findViewById(R.id.go_yangcheon);
        go_seocho=findViewById(R.id.go_seocho);
        go_songpa=findViewById(R.id.go_songpa);
        go_yongsan=findViewById(R.id.go_yongsan);
        go_dongdaemoon=findViewById(R.id.go_dongdaemoon);
        go_seodaemoon=findViewById(R.id.go_seodaemoon);
        go_mapo=findViewById(R.id.go_mapo);
        go_eunpyeong=findViewById(R.id.go_eunpyeong);
        go_yeongdeungpo=findViewById(R.id.go_yeongdeungpo);
        go_gwanak=findViewById(R.id.go_gwanak);
        go_seongbook=findViewById(R.id.go_seongbook);
        go_joongrang=findViewById(R.id.go_joongrang);
        go_jongno=findViewById(R.id.go_jongno);
        go_dongjak=findViewById(R.id.go_dongjak);
        go_gangnam.setOnClickListener(onClickListener);
        go_gangbook.setOnClickListener(onClickListener);
        go_gangdong.setOnClickListener(onClickListener);
        go_gangseo.setOnClickListener(onClickListener);
        go_dobong.setOnClickListener(onClickListener);
        go_nowon.setOnClickListener(onClickListener);
        go_seongdong.setOnClickListener(onClickListener);
        go_yangcheon.setOnClickListener(onClickListener);
        go_seocho.setOnClickListener(onClickListener);
        go_songpa.setOnClickListener(onClickListener);
        go_yongsan.setOnClickListener(onClickListener);
        go_dongdaemoon.setOnClickListener(onClickListener);
        go_seodaemoon.setOnClickListener(onClickListener);
        go_mapo.setOnClickListener(onClickListener);
        go_eunpyeong.setOnClickListener(onClickListener);
        go_yeongdeungpo.setOnClickListener(onClickListener);
        go_gwanak.setOnClickListener(onClickListener);
        go_seongbook.setOnClickListener(onClickListener);
        go_joongrang.setOnClickListener(onClickListener);
        go_jongno.setOnClickListener(onClickListener);
        go_dongjak.setOnClickListener(onClickListener);
        gangnam=findViewById(R.id.gangnam);
        gangbook=findViewById(R.id.gangbook);
        gangdong=findViewById(R.id.gangdong);
        gangseo=findViewById(R.id.gangseo);
        dobong=findViewById(R.id.dobong);
        nowon=findViewById(R.id.nowon);
        seongdong=findViewById(R.id.seongdong);
        yangcheon=findViewById(R.id.yangcheon);
        seocho=findViewById(R.id.seocho);
        songpa=findViewById(R.id.songpa);
        yongsan=findViewById(R.id.yongsan);
        dongdaemoon=findViewById(R.id.dongdaemoon);
        seodaemoon=findViewById(R.id.seodaemoon);
        mapo=findViewById(R.id.mapo);
        eunpyeong=findViewById(R.id.eunpyung);
        yeongdeungpo=findViewById(R.id.yeongdeungpo);
        gwanak=findViewById(R.id.gwanak);
        seongbook=findViewById(R.id.seongbook);
        joongrang=findViewById(R.id.joongrang);
        jongno=findViewById(R.id.jongno);
        dongjak=findViewById(R.id.dongjak);


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
            if (v.getId() == R.id.seoul_back_to_main) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.osh_vet){
                Intent intent = new Intent(getApplicationContext(), VetOshActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hanyang_vet){
                Intent intent = new Intent(getApplicationContext(), VetHanyangActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.centralmedi_vet){
                Intent intent = new Intent(getApplicationContext(), VetCentralmediActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hana_vet){
                Intent intent = new Intent(getApplicationContext(), VetHanaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.window_vet){
                Intent intent = new Intent(getApplicationContext(), VetWindowActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.bosung_vet){
                Intent intent = new Intent(getApplicationContext(), VetBosungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.reallove_vet){
                Intent intent = new Intent(getApplicationContext(), VetRealloveActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.banghak_vet){
                Intent intent = new Intent(getApplicationContext(), VetBanghakActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.leeandpark_vet){
                Intent intent = new Intent(getApplicationContext(), VetLeeandparkActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.doctors_vet){
                Intent intent = new Intent(getApplicationContext(), VetDoctorsActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.nvetnowon_vet){
                Intent intent = new Intent(getApplicationContext(), VetNvetnowonActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.nvet_vet){
                Intent intent = new Intent(getApplicationContext(), VetNvetActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.lk_vet){
                Intent intent = new Intent(getApplicationContext(), VetLkActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.forest_vet){
                Intent intent = new Intent(getApplicationContext(), VetForestActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.bookak_vet){
                Intent intent = new Intent(getApplicationContext(), VetBookakActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.africa_vet){
                Intent intent = new Intent(getApplicationContext(), VetAfricaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.im_vet){
                Intent intent = new Intent(getApplicationContext(), VetImActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.happy_vet){
                Intent intent = new Intent(getApplicationContext(), VetHappyActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.eoullim_vet){
                Intent intent = new Intent(getApplicationContext(), VetEoullimActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hansoo_vet){
                Intent intent = new Intent(getApplicationContext(), VetHansooActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.yeonseo_vet){
                Intent intent = new Intent(getApplicationContext(), VetYeonseoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.choi_vet){
                Intent intent = new Intent(getApplicationContext(), VetChoiActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.zoo_vet){
                Intent intent = new Intent(getApplicationContext(), VetZoozooActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.goryu_vet){
                Intent intent = new Intent(getApplicationContext(), VetGoryuActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.acris_vet){
                Intent intent = new Intent(getApplicationContext(), VetAcrisActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.well_vet){
                Intent intent = new Intent(getApplicationContext(), VetWellActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.daechi_vet){
                Intent intent = new Intent(getApplicationContext(), VetDaechiActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.dream_vet){
                Intent intent = new Intent(getApplicationContext(), VetDreamActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.cheongdam_vet){
                Intent intent = new Intent(getApplicationContext(), VetCheongdamActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.gaepo_vet){
                Intent intent = new Intent(getApplicationContext(), VetGaepoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.rafael_vet){
                Intent intent = new Intent(getApplicationContext(), VetRafaelActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seoul_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeoulActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.eco_vet){
                Intent intent = new Intent(getApplicationContext(), VetEcoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.pikaso_vet){
                Intent intent = new Intent(getApplicationContext(), VetPikasoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.sejong_vet){
                Intent intent = new Intent(getApplicationContext(), VetSejongActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.always_vet){
                Intent intent = new Intent(getApplicationContext(), VetAlwaysActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.dr_vet){
                Intent intent = new Intent(getApplicationContext(), VetDrActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.sangdo_vet){
                Intent intent = new Intent(getApplicationContext(), VetSangdoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.liebe_vet){
                Intent intent = new Intent(getApplicationContext(), VetLiebeActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.park_vet){
                Intent intent = new Intent(getApplicationContext(), VetParkActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.wooshin_vet){
                Intent intent = new Intent(getApplicationContext(), VetWooshinActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.miso_vet){
                Intent intent = new Intent(getApplicationContext(), VerMisoActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.semyung_vet){
                Intent intent = new Intent(getApplicationContext(), VetSemyungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.smile_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeoulsmileActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.song_vet){
                Intent intent = new Intent(getApplicationContext(), VetSongActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.good_vet){
                Intent intent = new Intent(getApplicationContext(), VetGoodActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.airport_vet){
                Intent intent = new Intent(getApplicationContext(), VetAirportActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.yd_vet){
                Intent intent = new Intent(getApplicationContext(), VetYdActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.snoopy_vet){
                Intent intent = new Intent(getApplicationContext(), VetSnoopyActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.sillim_vet){
                Intent intent = new Intent(getApplicationContext(), VetSillimActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seouluniv_vet){
                Intent intent = new Intent(getApplicationContext(),VetSeoulunivActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.seoulhq_vet){
                Intent intent = new Intent(getApplicationContext(), VetSeoulhqActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.hansung_vet){
                Intent intent = new Intent(getApplicationContext(), VetHansungActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.global_vet){
                Intent intent = new Intent(getApplicationContext(), VetGlobalActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.vella_vet){
                Intent intent = new Intent(getApplicationContext(), VetVellaActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.geumgang_vet){
                Intent intent = new Intent(getApplicationContext(), VetGeumgangActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.doklip_vet){
                Intent intent = new Intent(getApplicationContext(), VetDoklipActivity.class);
                startActivity(intent);
            }

            else if (v.getId() == R.id.go_gangnam) {
                scrollToView(gangnam,seoulist,0);
            }

            else if (v.getId() == R.id.go_seongdong) {
                scrollToView(seongdong,seoulist,0);
            }

            else if (v.getId() == R.id.go_gangbook) {
                scrollToView(gangbook,seoulist,0);
            }

            else if (v.getId() == R.id.go_gangseo) {
                scrollToView(gangseo,seoulist,0);
            }

            else if (v.getId() == R.id.go_dobong) {
                scrollToView(dobong,seoulist,0);
            }

            else if (v.getId() == R.id.go_nowon) {
                scrollToView(nowon,seoulist,0);
            }

            else if (v.getId() == R.id.go_dongjak) {
                scrollToView(dongjak,seoulist,0);
            }

            else if (v.getId() == R.id.go_yangcheon) {
                scrollToView(yangcheon,seoulist,0);
            }

            else if (v.getId() == R.id.go_dongjak) {
                scrollToView(dongjak,seoulist,0);
            }

            else if (v.getId() == R.id.go_seocho) {
                scrollToView(seocho,seoulist,0);
            }

            else if (v.getId() == R.id.go_songpa) {
                scrollToView(songpa,seoulist,0);
            }

            else if (v.getId() == R.id.go_yongsan) {
                scrollToView(yongsan,seoulist,0);
            }

            else if (v.getId() == R.id.go_dongdaemoon) {
                scrollToView(dongdaemoon,seoulist,0);
            }

            else if (v.getId() == R.id.go_jongno) {
                scrollToView(jongno,seoulist,0);
            }

            else if (v.getId() == R.id.go_gangdong) {
                scrollToView(gangdong,seoulist,0);
            }

            else if (v.getId() == R.id.go_seodaemoon) {
                scrollToView(seodaemoon,seoulist,0);
            }

            else if (v.getId() == R.id.go_mapo) {
                scrollToView(mapo,seoulist,0);
            }

            else if (v.getId() == R.id.go_eunpyeong) {
                scrollToView(eunpyeong,seoulist,0);
            }

            else if (v.getId() == R.id.go_yeongdeungpo) {
                scrollToView(yeongdeungpo,seoulist,0);
            }

            else if (v.getId() == R.id.go_gwanak) {
                scrollToView(gwanak,seoulist,0);
            }

            else if (v.getId() == R.id.go_seongbook) {
                scrollToView(seongbook,seoulist,0);
            }

            else if (v.getId() == R.id.go_joongrang) {
                scrollToView(joongrang,seoulist,0);
            }
        }
    };
}