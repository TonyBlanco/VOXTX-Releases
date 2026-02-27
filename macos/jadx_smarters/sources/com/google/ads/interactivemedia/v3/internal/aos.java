package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aos extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f20442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f20443i = new Object();

    public aos(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", aglVar, i9, 22, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f20442h == null) {
            synchronized (f20443i) {
                try {
                    if (f20442h == null) {
                        f20442h = (Long) this.f20471d.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f20474g) {
            this.f20474g.ah(f20442h.longValue());
        }
    }
}
