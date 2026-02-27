package com.google.android.gms.internal.p001firebaseauthapi;

import C4.a;
import C4.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadp {
    private final String zza;
    private final String zzb;

    public zzadp(Context context) {
        this(context, context.getPackageName());
    }

    private zzadp(Context context, String str) {
        r.m(context);
        String strG = r.g(str);
        this.zza = strG;
        try {
            byte[] bArrA = a.a(context, strG);
            if (bArrA != null) {
                this.zzb = j.c(bArrA, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
