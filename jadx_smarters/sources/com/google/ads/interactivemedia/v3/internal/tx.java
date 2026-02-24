package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class tx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cx f24661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nu f24662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private xv f24664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ws f24665e;

    public tx(cx cxVar, xv xvVar, byte[] bArr, byte[] bArr2) {
        nk nkVar = new nk();
        ws wsVar = new ws();
        this.f24661a = cxVar;
        this.f24664d = xvVar;
        this.f24662b = nkVar;
        this.f24665e = wsVar;
        this.f24663c = Constants.MB;
    }

    public final ty a(ai aiVar) {
        af.s(aiVar.f19815b);
        Object obj = aiVar.f19815b.f19034h;
        return new ty(aiVar, this.f24661a, this.f24664d, this.f24662b.a(aiVar), this.f24665e, this.f24663c, null, null, null);
    }
}
