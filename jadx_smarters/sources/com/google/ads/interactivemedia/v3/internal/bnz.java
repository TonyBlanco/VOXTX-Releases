package com.google.ads.interactivemedia.v3.internal;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class bnz implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21808a;

    public bnz(int i9) {
        this.f21808a = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        int i9 = this.f21808a;
        if (i9 == 0) {
            if (bofVar.c() == Time.class) {
                return new boa(null);
            }
            return null;
        }
        if (i9 != 1) {
            if (bofVar.c() == Timestamp.class) {
                return new bob(bjtVar.b(Date.class));
            }
            return null;
        }
        if (bofVar.c() == java.sql.Date.class) {
            return new bny(null);
        }
        return null;
    }
}
