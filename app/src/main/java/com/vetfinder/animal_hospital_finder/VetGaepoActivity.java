package com.vetfinder.animal_hospital_finder;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VetGaepoActivity extends AppCompatActivity {

    TextView tell;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet_gaepo);

        tell=findViewById(R.id.num);
        tell.setOnClickListener(onClickListener_call);
        tell.setPaintFlags(tell.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        back=findViewById(R.id.back_to_main);
        back.setOnClickListener(onClickListener_back);

    }

    View.OnClickListener onClickListener_call = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:025737582"));
            startActivity(intent);
        }
    };

    View.OnClickListener onClickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), SeoulActivity.class);
            startActivity(intent);
        }
    };

}