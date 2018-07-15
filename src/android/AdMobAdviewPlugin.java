package br.com.br1000apps;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.ads.mediation.admob.AdMobAdapter;

import java.lang.reflect.Method;
import java.lang.NoSuchMethodException;
import java.util.ArrayList;

import org.apache.cordova.CallbackContext;

public class AdMobAdviewPlugin extends CordovaPlugin {

@Override
public boolean execute(String action, JSONArray args, CallbackContext callbackContext);

@Override
public boolean execute(String action, JSONArray args, CallbackContext callbackContext){
    try {
        if (PluginsName.HELLO_WORLD.equals(action)){
                helloWorld(args, callbackContext);
                return true;
        }
    } catch (Exception e) {
        callbackContext.error(e.getMessage());
        return false;
    }
    return false;
}

public void helloWorld(JSONArray args, CallbackContext callbackContext) throws Exception{
    callbackContext.success("Hello World");
}

}

