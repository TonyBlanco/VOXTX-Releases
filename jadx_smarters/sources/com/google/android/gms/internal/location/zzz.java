package com.google.android.gms.internal.location;

import J4.AbstractC0650i;
import J4.AbstractC0652k;
import J4.InterfaceC0646e;
import J4.InterfaceC0651j;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzz implements InterfaceC0646e {
    public final f flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.f(new zzq(this, googleApiClient));
    }

    @Override // J4.InterfaceC0646e
    public final Location getLastLocation(GoogleApiClient googleApiClient) {
        String str;
        zzaz zzazVarA = AbstractC0652k.a(googleApiClient);
        Context contextH = googleApiClient.h();
        if (Build.VERSION.SDK_INT < 30 || contextH == null) {
            str = null;
        } else {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(contextH, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        }
        try {
            return zzazVarA.zzz(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        try {
            return AbstractC0652k.a(googleApiClient).zzA();
        } catch (Exception unused) {
            return null;
        }
    }

    public final f removeLocationUpdates(GoogleApiClient googleApiClient, AbstractC0650i abstractC0650i) {
        return googleApiClient.f(new zzn(this, googleApiClient, abstractC0650i));
    }

    @Override // J4.InterfaceC0646e
    public final f removeLocationUpdates(GoogleApiClient googleApiClient, InterfaceC0651j interfaceC0651j) {
        return googleApiClient.f(new zzv(this, googleApiClient, interfaceC0651j));
    }

    public final f removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.f(new zzw(this, googleApiClient, pendingIntent));
    }

    public final f requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, AbstractC0650i abstractC0650i, Looper looper) {
        return googleApiClient.f(new zzt(this, googleApiClient, locationRequest, abstractC0650i, looper));
    }

    @Override // J4.InterfaceC0646e
    public final f requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, InterfaceC0651j interfaceC0651j) {
        r.n(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.f(new zzr(this, googleApiClient, locationRequest, interfaceC0651j));
    }

    public final f requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, InterfaceC0651j interfaceC0651j, Looper looper) {
        return googleApiClient.f(new zzs(this, googleApiClient, locationRequest, interfaceC0651j, looper));
    }

    public final f requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.f(new zzu(this, googleApiClient, locationRequest, pendingIntent));
    }

    public final f setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.f(new zzp(this, googleApiClient, location));
    }

    public final f setMockMode(GoogleApiClient googleApiClient, boolean z9) {
        return googleApiClient.f(new zzo(this, googleApiClient, z9));
    }
}
