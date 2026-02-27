package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public class rg extends ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(Throwable th, rh rhVar) {
        super("Decoder failed: ".concat(String.valueOf(rhVar == null ? null : rhVar.f24365a)), th);
        String diagnosticInfo = null;
        if (cq.f22640a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f24364a = diagnosticInfo;
    }
}
