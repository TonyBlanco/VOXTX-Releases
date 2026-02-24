package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class apf extends apj {
    public apf(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", aglVar, i9, 48, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        agl aglVar;
        int i9;
        this.f20474g.aP(agh.f19671c);
        boolean zBooleanValue = ((Boolean) this.f20471d.invoke(null, this.f20468a.b())).booleanValue();
        synchronized (this.f20474g) {
            try {
                if (zBooleanValue) {
                    aglVar = this.f20474g;
                    i9 = agh.f19670b;
                } else {
                    aglVar = this.f20474g;
                    i9 = agh.f19669a;
                }
                aglVar.aP(i9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
