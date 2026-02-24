package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface rf {
    int a();

    int b(MediaCodec.BufferInfo bufferInfo);

    MediaFormat c();

    ByteBuffer f(int i9);

    ByteBuffer g(int i9);

    void h();

    void i();

    void j(int i9, long j9);

    void k(int i9, boolean z9);

    void l(Surface surface);

    void m(Bundle bundle);

    void n(int i9);

    void p();

    void q(int i9, int i10, long j9, int i11);

    void r(int i9, ec ecVar, long j9);
}
