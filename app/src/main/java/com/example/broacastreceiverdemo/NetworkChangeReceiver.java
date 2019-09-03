package com.example.broacastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.widget.Toast;


public class NetworkChangeReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
    ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    if (manager != null) {
      //NetworkInfo networkInfor = manager.getActiveNetworkInfo();
      NetworkInfo networkInfo = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
      /*if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
        Network[] networks = manager.getAllNetworks();
        for (Network temp : networks) {
          NetworkCapabilities check = manager.getNetworkCapabilities(temp);
          if(check.)
        }
      }*/

      if (networkInfo != null) {
          Toast.makeText(context, "Network connected !", Toast.LENGTH_LONG).show();
      }else
        Toast.makeText(context, "Network disconnected !", Toast.LENGTH_LONG).show();
    }
  }
}
