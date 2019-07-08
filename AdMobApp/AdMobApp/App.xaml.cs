using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using AdMobApp.Services;
using AdMobApp.Views;
using MarcTron.Plugin;

namespace AdMobApp
{
    public partial class App : Application
    {
        private bool isAndroid = true;
        public App()
        {
            InitializeComponent();
            CrossMTAdmob.Current.AdsId = isAndroid ? "ca-app-pub-1926560585317979/1697561687" : "ca-app-pub-1926560585317979/1697561687";
            DependencyService.Register<MockDataStore>();
            MainPage = new MainPage();
            //MainPage = new Page1();
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
