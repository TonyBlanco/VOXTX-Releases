package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class apa extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f20454h;

    public apa(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", aglVar, i9, 61, null, null, null);
        this.f20454h = anwVar.q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f20471d.invoke(null, this.f20468a.b(), Boolean.valueOf(this.f20454h))).longValue();
        synchronized (this.f20474g) {
            this.f20474g.ao(jLongValue);
        }
    }
}
