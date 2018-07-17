package com.br.br1000apps.plugins;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.br1000apps.APP000001.R.*;
import android.os.Build;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class AdMobAdviewPlugin extends Activity {

	private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MainActivity);

        MobileAds.initialize(this,
            "ca-app-pub-3940256099942544~3347511713");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
	
	
}