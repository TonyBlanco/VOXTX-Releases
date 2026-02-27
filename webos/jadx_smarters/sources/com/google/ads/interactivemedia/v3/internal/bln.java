package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class bln {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bln f21668b;

    static {
        bln blmVar = null;
        if (bkz.a()) {
            try {
                blmVar = new bll(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (blmVar == null) {
            blmVar = new blm();
        }
        f21668b = blmVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
