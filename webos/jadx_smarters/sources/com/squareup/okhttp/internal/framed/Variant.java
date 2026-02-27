package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public interface Variant {
    Protocol getProtocol();

    FrameReader newReader(BufferedSource bufferedSource, boolean z9);

    FrameWriter newWriter(BufferedSink bufferedSink, boolean z9);
}
