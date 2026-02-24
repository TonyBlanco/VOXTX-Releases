package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rz implements xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xe f24448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24449b;

    public rz(xe xeVar, List list) {
        this.f24448a = xeVar;
        this.f24449b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xe
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        ry ryVar = (ry) this.f24448a.a(uri, inputStream);
        List list = this.f24449b;
        return (list == null || list.isEmpty()) ? ryVar : (ry) ryVar.e(this.f24449b);
    }
}
