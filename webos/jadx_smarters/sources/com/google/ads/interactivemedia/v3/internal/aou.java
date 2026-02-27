package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aou extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final anh f20444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f20445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f20446j;

    public aou(anw anwVar, agl aglVar, int i9, anh anhVar, long j9, long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", aglVar, i9, 11, null, null, null);
        this.f20444h = anhVar;
        this.f20445i = j9;
        this.f20446j = j10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        anh anhVar = this.f20444h;
        if (anhVar != null) {
            anf anfVar = new anf((String) this.f20471d.invoke(null, anhVar.b(), Long.valueOf(this.f20445i), Long.valueOf(this.f20446j)));
            synchronized (this.f20474g) {
                try {
                    this.f20474g.ai(anfVar.f20325a.longValue());
                    if (anfVar.f20326b.longValue() >= 0) {
                        this.f20474g.aA(anfVar.f20326b.longValue());
                    }
                    if (anfVar.f20327c.longValue() >= 0) {
                        this.f20474g.O(anfVar.f20327c.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
