using MarcTron.Plugin;
using MarcTron.Plugin.Controls;
using System;
using System.ComponentModel;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace AdMobApp.Views
{
    // Learn more about making custom code visible in the Xamarin.Forms previewer
    // by visiting https://aka.ms/xamarinforms-previewer
    [DesignTimeVisible(false)]
    public partial class AboutPage : ContentPage
    {
        public bool isLoaded { get; set; }
        public AboutPage()
        {
            InitializeComponent();

            CrossMTAdmob.Current.LoadRewardedVideo("ca-app-pub-1926560585317979/1697561687");
            var asd=CrossMTAdmob.IsSupported;
            CrossMTAdmob.Current.ShowRewardedVideo();
        }

        private void Button_Clicked(object sender, EventArgs e)
        {
            isLoaded = CrossMTAdmob.Current.IsRewardedVideoLoaded();
            if (isLoaded)
                CrossMTAdmob.Current.ShowRewardedVideo();
        }
    }
}