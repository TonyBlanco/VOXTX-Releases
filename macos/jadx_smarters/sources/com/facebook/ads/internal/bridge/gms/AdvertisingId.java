package com.facebook.ads.internal.bridge.gms;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import h4.C1858a;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z9) {
        this.mId = str;
        this.mLimitAdTracking = z9;
    }

    @SuppressLint({"CatchGeneralException"})
    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C1858a.C0341a c0341aA = C1858a.a(context);
            if (c0341aA != null) {
                return new AdvertisingId(c0341aA.a(), c0341aA.b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
