package com.br.br1000apps.plugins.AdMobAdviewPlugin;

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

import com.rjfun.cordova.ad.GenericAdPlugin;

public class AdMobAdviewPlugin extends GenericAdPlugin {

  private AdView adView;

  @Override
  protected void pluginInitialize() {
    super.pluginInitialize();
    
    // TODO: any init code
  }
  
  
}