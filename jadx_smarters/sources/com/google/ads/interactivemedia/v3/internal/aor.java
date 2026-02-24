package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class aor extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f20439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f20440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f20441j;

    public aor(anw anwVar, agl aglVar, int i9, Map map, View view, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", aglVar, i9, 85, null, null, null);
        this.f20439h = map;
        this.f20440i = view;
        this.f20441j = context;
    }

    private final long c(int i9) {
        Map map = this.f20439h;
        Integer numValueOf = Integer.valueOf(i9);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f20439h.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.f20441j;
        if (contextB == null) {
            contextB = this.f20468a.b();
        }
        long[] jArr2 = (long[]) this.f20471d.invoke(null, jArr, contextB, this.f20440i);
        long j9 = jArr2[0];
        this.f20439h.put(1, Long.valueOf(jArr2[1]));
        long j10 = jArr2[2];
        this.f20439h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f20474g) {
            this.f20474g.ae(j9);
            this.f20474g.ad(j10);
        }
    }
}
