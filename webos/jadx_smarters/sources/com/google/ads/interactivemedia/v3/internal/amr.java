package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class amr implements asu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ arl f20252a;

    public amr(arl arlVar) {
        this.f20252a = arlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asu
    public final boolean a(File file) {
        try {
            return this.f20252a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
