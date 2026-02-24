package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = an.class)
public abstract class bx {
    public static bx create(int i9, int i10, int i11) {
        return new an(i9, i10, i11);
    }

    public static bx create(VersionInfo versionInfo) {
        return create(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();
}
