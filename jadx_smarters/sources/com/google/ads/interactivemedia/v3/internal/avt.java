package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class avt implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final avs f20828a;

    public avt(avs avsVar) {
        this.f20828a = avsVar;
    }

    public Object readResolve() {
        return this.f20828a.entrySet();
    }
}
