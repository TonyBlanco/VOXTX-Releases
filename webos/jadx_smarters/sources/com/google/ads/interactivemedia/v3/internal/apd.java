package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class apd extends apj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aod f20456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20457i;

    public apd(anw anwVar, agl aglVar, int i9, aod aodVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", aglVar, i9, 53, null, null, null);
        this.f20456h = aodVar;
        if (aodVar != null) {
            this.f20457i = aodVar.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f20456h != null) {
            this.f20474g.az(((Long) this.f20471d.invoke(null, Long.valueOf(this.f20457i))).longValue());
        }
    }
}
