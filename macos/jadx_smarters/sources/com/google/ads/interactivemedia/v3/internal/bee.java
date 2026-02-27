package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class bee extends azu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final beq f21135a;

    public bee(beq beqVar) throws GeneralSecurityException {
        int i9 = bec.f21132b[beqVar.b().ordinal()];
        this.f21135a = beqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azu
    public final azh a() {
        beq beqVar = this.f21135a;
        return new bed(beqVar.g(), beqVar.c());
    }
}
