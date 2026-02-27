package com.google.android.gms.internal.cast;

import com.google.ads.interactivemedia.v3.internal.F;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzqb {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j9, Object obj2, Object obj3) {
        while (!F.a(unsafe, obj, j9, obj2, obj3)) {
            if (unsafe.getObject(obj, j9) != obj2) {
                return false;
            }
        }
        return true;
    }
}
