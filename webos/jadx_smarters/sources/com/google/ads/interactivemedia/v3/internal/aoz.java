package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aoz extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f20449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f20450i;

    public aoz(anw anwVar, agl aglVar, int i9, Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", aglVar, i9, 31, null, null, null);
        this.f20449h = null;
        this.f20450i = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f20474g.aG(-1L);
        this.f20474g.aC(-1L);
        Context contextB = this.f20450i;
        if (contextB == null) {
            contextB = this.f20468a.b();
        }
        if (this.f20449h == null) {
            this.f20449h = (List) this.f20471d.invoke(null, contextB);
        }
        List list = this.f20449h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f20474g) {
            this.f20474g.aG(((Long) this.f20449h.get(0)).longValue());
            this.f20474g.aC(((Long) this.f20449h.get(1)).longValue());
        }
    }
}
