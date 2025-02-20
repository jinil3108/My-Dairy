package com.example.mydairy.entry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.mydairy.R;

public class EntryDashboardActivity extends AppCompatActivity {

    private CardView[] Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_entry_dashboard);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.primary_color, this.getTheme()));
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Data Entry");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Card = new CardView[8];
        Card[0] = (CardView) findViewById(R.id.card_0);
        Card[1] = (CardView) findViewById(R.id.card_1);
        Card[2] = (CardView) findViewById(R.id.card_2);
        Card[3] = (CardView) findViewById(R.id.card_3);
        Card[4] = (CardView) findViewById(R.id.card_4);
        Card[5] = (CardView) findViewById(R.id.card_5);
        Card[6] = (CardView) findViewById(R.id.card_6);
        Card[7] = (CardView) findViewById(R.id.card_7);

        Card[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, DailyEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, DavaDaruEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, DanKhanEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, LabourEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, ROIEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, GassCharoEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, MiscellaneousEntryActivity.class);
                startActivity(intent);
            }
        });

        Card[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EntryDashboardActivity.this, DevInvActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}