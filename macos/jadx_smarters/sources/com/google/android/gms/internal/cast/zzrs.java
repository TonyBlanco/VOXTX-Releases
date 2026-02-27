package com.google.android.gms.internal.cast;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrs extends IOException {
    public zzrs() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzrs(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzrs(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
