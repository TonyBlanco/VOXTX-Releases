package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes3.dex */
public final class aag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18640a;

    private aag(String str) {
        this.f18640a = str;
    }

    public static aag a(cj cjVar) {
        String str;
        cjVar.G(2);
        int i9 = cjVar.i();
        int i10 = i9 >> 1;
        int i11 = (cjVar.i() >> 3) | ((i9 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        return new aag(str + ".0" + i10 + (i11 < 10 ? ".0" : InstructionFileId.DOT) + i11);
    }
}
