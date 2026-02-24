package com.google.android.gms.internal.cast;

import java.util.Comparator;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
final class zzx implements Comparator {
    public static final zzx zza = new zzx();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((C2812L.h) obj).m().compareToIgnoreCase(((C2812L.h) obj2).m());
    }
}
