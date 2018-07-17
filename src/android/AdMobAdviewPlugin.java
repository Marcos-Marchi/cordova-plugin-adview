package com.br.br1000apps.plugins;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.*;

import com.google.android.gms.ads.*;


public class AdMobAdviewPlugin extends Activity {

	private AdView mAdView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,
            "ca-app-pub-3940256099942544~3347511713");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
	
	
}