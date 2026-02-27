package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacm {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iJ = C2921i.h().j(context, 12451000);
            zza = Boolean.valueOf(iJ == 0 || iJ == 2);
        }
        return zza.booleanValue();
    }
}
