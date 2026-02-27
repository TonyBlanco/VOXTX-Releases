package com.google.android.datatransport.cct;

import D2.d;
import D2.h;
import D2.m;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class CctBackendFactory implements d {
    @Override // D2.d
    public m create(h hVar) {
        return new A2.d(hVar.b(), hVar.e(), hVar.d());
    }
}
