package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class F {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j9, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j9, obj2, obj3)) {
            if (unsafe.getObject(obj, j9) != obj2) {
                return false;
            }
        }
        return true;
    }
}
