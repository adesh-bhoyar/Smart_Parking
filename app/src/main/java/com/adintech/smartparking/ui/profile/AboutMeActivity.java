package com.adintech.smartparking.ui.profile;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.adintech.smartparking.BuildConfig;
import com.adintech.smartparking.R;


public class AboutMeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.version_name);
        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String versionName = BuildConfig.VERSION_NAME;
        textView.setText(getString(R.string.text_version, versionName));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void onTAndCViewClicked(View view) {

    }
}