package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aol extends apj {
    public aol(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", aglVar, i9, 5, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f20474g.V(-1L);
        this.f20474g.U(-1L);
        int[] iArr = (int[]) this.f20471d.invoke(null, this.f20468a.b());
        synchronized (this.f20474g) {
            try {
                this.f20474g.V(iArr[0]);
                this.f20474g.U(iArr[1]);
                int i9 = iArr[2];
                if (i9 != Integer.MIN_VALUE) {
                    this.f20474g.T(i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
