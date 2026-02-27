package de.blinkt.openvpn.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static Vector a(Context context, boolean z9) {
        Vector vector = new Vector();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            connectivityManager.getNetworkInfo(network);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
                for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                    if (((linkAddress.getAddress() instanceof Inet4Address) && !z9) || ((linkAddress.getAddress() instanceof Inet6Address) && z9)) {
                        vector.add(linkAddress.toString());
                    }
                }
            }
        }
        return vector;
    }
}
