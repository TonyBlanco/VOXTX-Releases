package A3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97a;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i9) {
            return new c[i9];
        }
    }

    public c(int i9) {
        this.f97a = (i9 & 2) != 0 ? i9 | 1 : i9;
    }

    public static boolean m(ConnectivityManager connectivityManager) {
        if (k0.f39777a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return true;
        }
    }

    public c a(int i9) {
        int i10 = this.f97a;
        int i11 = i9 & i10;
        return i11 == i10 ? this : new c(i11);
    }

    public final int c(Context context) {
        if (!r()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1684a.e(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected() && m(connectivityManager)) ? (w() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0 : this.f97a & 3;
    }

    public int d(Context context) {
        int iC = c(context);
        if (f() && !g(context)) {
            iC |= 8;
        }
        if (k() && !h(context)) {
            iC |= 4;
        }
        return (!v() || t(context)) ? iC : iC | 16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f97a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f97a == ((c) obj).f97a;
    }

    public boolean f() {
        return (this.f97a & 8) != 0;
    }

    public final boolean g(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final boolean h(Context context) {
        PowerManager powerManager = (PowerManager) AbstractC1684a.e(context.getSystemService("power"));
        int i9 = k0.f39777a;
        return i9 >= 23 ? powerManager.isDeviceIdleMode() : i9 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
    }

    public int hashCode() {
        return this.f97a;
    }

    public boolean k() {
        return (this.f97a & 4) != 0;
    }

    public boolean r() {
        return (this.f97a & 1) != 0;
    }

    public final boolean t(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean v() {
        return (this.f97a & 16) != 0;
    }

    public boolean w() {
        return (this.f97a & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f97a);
    }
}
