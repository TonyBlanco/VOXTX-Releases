package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aow extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f20447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f20448i = new Object();

    public aow(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", aglVar, i9, 1, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f20474g.ak("E");
        if (f20447h == null) {
            synchronized (f20448i) {
                try {
                    if (f20447h == null) {
                        f20447h = (String) this.f20471d.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f20474g) {
            this.f20474g.ak(f20447h);
        }
    }
}
