package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import w4.AbstractC2925m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class arr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20580a = "com.google.android.gms.ads.adshield.AdShieldCreatorImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f20581b;

    public abstract Object b(IBinder iBinder);

    public final Object c(Context context) throws arq {
        if (this.f20581b == null) {
            com.google.android.gms.common.internal.r.m(context);
            Context contextE = AbstractC2925m.e(context);
            if (contextE == null) {
                throw new arq();
            }
            try {
                this.f20581b = b((IBinder) contextE.getClassLoader().loadClass(this.f20580a).newInstance());
            } catch (ClassNotFoundException e9) {
                throw new arq("Could not load creator class.", e9);
            } catch (IllegalAccessException e10) {
                throw new arq("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new arq("Could not instantiate creator.", e11);
            }
        }
        return this.f20581b;
    }
}
