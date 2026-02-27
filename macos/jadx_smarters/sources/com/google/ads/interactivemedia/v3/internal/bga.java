package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class bga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f21228a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bfx f21229b = bfx.f21226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f21230c = null;

    public final bgc a() throws GeneralSecurityException {
        if (this.f21228a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f21230c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f21228a;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                int i10 = i9 + 1;
                if (((bgb) arrayList.get(i9)).a() != iIntValue) {
                    i9 = i10;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        bgc bgcVar = new bgc(this.f21229b, Collections.unmodifiableList(this.f21228a), this.f21230c);
        this.f21228a = null;
        return bgcVar;
    }

    public final void b(bfx bfxVar) {
        if (this.f21228a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f21229b = bfxVar;
    }

    public final void c(int i9) {
        if (this.f21228a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f21230c = Integer.valueOf(i9);
    }

    public final void d(bac bacVar, int i9, azh azhVar) {
        ArrayList arrayList = this.f21228a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new bgb(bacVar, i9, azhVar, null));
    }
}
