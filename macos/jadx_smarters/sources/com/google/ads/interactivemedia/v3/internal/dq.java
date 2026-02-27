package com.google.ads.interactivemedia.v3.internal;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dq extends Cdo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f22735d;

    public dq(int i9, IOException iOException, Map map, dc dcVar) {
        super("Response code: " + i9, iOException, AdError.INTERNAL_ERROR_2004);
        this.f22734c = i9;
        this.f22735d = map;
    }
}
