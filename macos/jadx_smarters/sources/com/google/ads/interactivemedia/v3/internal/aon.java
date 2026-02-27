package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aon extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f20435h;

    public aon(anw anwVar, agl aglVar, long j9, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", aglVar, i9, 25, null, null, null);
        this.f20435h = j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f20471d.invoke(null, null)).longValue();
        synchronized (this.f20474g) {
            try {
                this.f20474g.ac(jLongValue);
                long j9 = this.f20435h;
                if (j9 != 0) {
                    this.f20474g.aD(jLongValue - j9);
                    this.f20474g.aE(this.f20435h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
