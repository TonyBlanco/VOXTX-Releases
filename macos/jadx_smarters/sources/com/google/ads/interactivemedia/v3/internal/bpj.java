package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class bpj extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public bpj() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public bpj(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public bpj(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
