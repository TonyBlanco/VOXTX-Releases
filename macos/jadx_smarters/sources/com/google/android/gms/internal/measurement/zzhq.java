package com.google.android.gms.internal.measurement;

import android.net.Uri;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhq {
    private static final C2695a zza = new C2695a();

    public static synchronized Uri zza(String str) {
        C2695a c2695a = zza;
        Uri uri = (Uri) c2695a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c2695a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
