package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aog extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Activity f20426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f20427i;

    public aog(anw anwVar, agl aglVar, int i9, View view, Activity activity, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", aglVar, i9, 62, null, null, null);
        this.f20427i = view;
        this.f20426h = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f20427i == null) {
            return;
        }
        Boolean bool = (Boolean) aqo.f20538m.f();
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f20471d.invoke(null, this.f20427i, this.f20426h, bool);
        synchronized (this.f20474g) {
            try {
                this.f20474g.L(((Long) objArr[0]).longValue());
                this.f20474g.N(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f20474g.M((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
