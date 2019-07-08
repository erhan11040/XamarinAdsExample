package md521a30eb2aae1e7539708ea4e761b013e;


public class InterstitialAdListener
	extends com.google.android.gms.ads.AdListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdLoaded:()V:GetOnAdLoadedHandler\n" +
			"n_onAdOpened:()V:GetOnAdOpenedHandler\n" +
			"n_onAdClosed:()V:GetOnAdClosedHandler\n" +
			"";
		mono.android.Runtime.register ("MarcTron.Plugin.Listener.InterstitialAdListener, Plugin.MtAdmob", InterstitialAdListener.class, __md_methods);
	}


	public InterstitialAdListener ()
	{
		super ();
		if (getClass () == InterstitialAdListener.class)
			mono.android.TypeManager.Activate ("MarcTron.Plugin.Listener.InterstitialAdListener, Plugin.MtAdmob", "", this, new java.lang.Object[] {  });
	}

	public InterstitialAdListener (com.google.android.gms.ads.InterstitialAd p0)
	{
		super ();
		if (getClass () == InterstitialAdListener.class)
			mono.android.TypeManager.Activate ("MarcTron.Plugin.Listener.InterstitialAdListener, Plugin.MtAdmob", "Android.Gms.Ads.InterstitialAd, Xamarin.GooglePlayServices.Ads.Lite", this, new java.lang.Object[] { p0 });
	}


	public void onAdLoaded ()
	{
		n_onAdLoaded ();
	}

	private native void n_onAdLoaded ();


	public void onAdOpened ()
	{
		n_onAdOpened ();
	}

	private native void n_onAdOpened ();


	public void onAdClosed ()
	{
		n_onAdClosed ();
	}

	private native void n_onAdClosed ();

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
