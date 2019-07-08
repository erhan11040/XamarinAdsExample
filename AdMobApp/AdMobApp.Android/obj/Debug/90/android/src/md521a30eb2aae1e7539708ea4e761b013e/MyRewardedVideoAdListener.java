package md521a30eb2aae1e7539708ea4e761b013e;


public class MyRewardedVideoAdListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.ads.reward.RewardedVideoAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRewarded:(Lcom/google/android/gms/ads/reward/RewardItem;)V:GetOnRewarded_Lcom_google_android_gms_ads_reward_RewardItem_Handler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoAdClosed:()V:GetOnRewardedVideoAdClosedHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoAdFailedToLoad:(I)V:GetOnRewardedVideoAdFailedToLoad_IHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoAdLeftApplication:()V:GetOnRewardedVideoAdLeftApplicationHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoAdLoaded:()V:GetOnRewardedVideoAdLoadedHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoAdOpened:()V:GetOnRewardedVideoAdOpenedHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"n_onRewardedVideoStarted:()V:GetOnRewardedVideoStartedHandler:Android.Gms.Ads.Reward.IRewardedVideoAdListenerInvoker, Xamarin.GooglePlayServices.Ads.Lite\n" +
			"";
		mono.android.Runtime.register ("MarcTron.Plugin.Listener.MyRewardedVideoAdListener, Plugin.MtAdmob", MyRewardedVideoAdListener.class, __md_methods);
	}


	public MyRewardedVideoAdListener ()
	{
		super ();
		if (getClass () == MyRewardedVideoAdListener.class)
			mono.android.TypeManager.Activate ("MarcTron.Plugin.Listener.MyRewardedVideoAdListener, Plugin.MtAdmob", "", this, new java.lang.Object[] {  });
	}

	public MyRewardedVideoAdListener (com.google.android.gms.ads.reward.RewardedVideoAd p0)
	{
		super ();
		if (getClass () == MyRewardedVideoAdListener.class)
			mono.android.TypeManager.Activate ("MarcTron.Plugin.Listener.MyRewardedVideoAdListener, Plugin.MtAdmob", "Android.Gms.Ads.Reward.IRewardedVideoAd, Xamarin.GooglePlayServices.Ads.Lite", this, new java.lang.Object[] { p0 });
	}


	public void onRewarded (com.google.android.gms.ads.reward.RewardItem p0)
	{
		n_onRewarded (p0);
	}

	private native void n_onRewarded (com.google.android.gms.ads.reward.RewardItem p0);


	public void onRewardedVideoAdClosed ()
	{
		n_onRewardedVideoAdClosed ();
	}

	private native void n_onRewardedVideoAdClosed ();


	public void onRewardedVideoAdFailedToLoad (int p0)
	{
		n_onRewardedVideoAdFailedToLoad (p0);
	}

	private native void n_onRewardedVideoAdFailedToLoad (int p0);


	public void onRewardedVideoAdLeftApplication ()
	{
		n_onRewardedVideoAdLeftApplication ();
	}

	private native void n_onRewardedVideoAdLeftApplication ();


	public void onRewardedVideoAdLoaded ()
	{
		n_onRewardedVideoAdLoaded ();
	}

	private native void n_onRewardedVideoAdLoaded ();


	public void onRewardedVideoAdOpened ()
	{
		n_onRewardedVideoAdOpened ();
	}

	private native void n_onRewardedVideoAdOpened ();


	public void onRewardedVideoStarted ()
	{
		n_onRewardedVideoStarted ();
	}

	private native void n_onRewardedVideoStarted ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
