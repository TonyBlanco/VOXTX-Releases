package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aom extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f20433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f20434i = new Object();

    public aom(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", aglVar, i9, 44, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f20433h == null) {
            synchronized (f20434i) {
                try {
                    if (f20433h == null) {
                        f20433h = (Long) this.f20471d.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f20474g) {
            this.f20474g.X(f20433h.longValue());
        }
    }
}
