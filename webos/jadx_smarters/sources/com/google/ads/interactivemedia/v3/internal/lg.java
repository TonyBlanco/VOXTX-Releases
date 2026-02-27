package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
final class lg implements xe {
    private lg() {
    }

    public /* synthetic */ lg(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xe
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        return Long.valueOf(cq.u(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
