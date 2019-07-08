using System;
using System.Windows.Input;

using Xamarin.Forms;

namespace AdMobApp.ViewModels
{
    public class AboutViewModel : BaseViewModel
    {

        public string AdUnitId { get; set; }
        public AboutViewModel()
        {
            Title = "About";
            if (Device.RuntimePlatform == Device.iOS)
                AdUnitId = "iOS Key";
            else if (Device.RuntimePlatform == Device.Android)
                AdUnitId = "ca-app-pub-1926560585317979/2484438867";
        }

    }
}