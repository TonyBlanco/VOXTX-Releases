package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh f24358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaFormat f24359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1333s f24360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Surface f24361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCrypto f24362e;

    private rd(rh rhVar, MediaFormat mediaFormat, C1333s c1333s, Surface surface, MediaCrypto mediaCrypto) {
        this.f24358a = rhVar;
        this.f24359b = mediaFormat;
        this.f24360c = c1333s;
        this.f24361d = surface;
        this.f24362e = mediaCrypto;
    }

    public static rd a(rh rhVar, MediaFormat mediaFormat, C1333s c1333s, MediaCrypto mediaCrypto) {
        return new rd(rhVar, mediaFormat, c1333s, null, mediaCrypto);
    }

    public static rd b(rh rhVar, MediaFormat mediaFormat, C1333s c1333s, Surface surface, MediaCrypto mediaCrypto) {
        return new rd(rhVar, mediaFormat, c1333s, surface, mediaCrypto);
    }
}
