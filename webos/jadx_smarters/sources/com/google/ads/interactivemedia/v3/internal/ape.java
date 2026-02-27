package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ape extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f20458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f20459i = new Object();

    public ape(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", aglVar, i9, 33, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f20458h == null) {
            synchronized (f20459i) {
                try {
                    if (f20458h == null) {
                        f20458h = (Long) this.f20471d.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f20474g) {
            this.f20474g.aF(f20458h.longValue());
        }
    }
}
