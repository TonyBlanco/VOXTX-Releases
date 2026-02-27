package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public interface FrameWriter extends Closeable {
    void ackSettings(Settings settings) throws IOException;

    void connectionPreface() throws IOException;

    void data(boolean z9, int i9, Buffer buffer, int i10) throws IOException;

    void flush() throws IOException;

    void goAway(int i9, ErrorCode errorCode, byte[] bArr) throws IOException;

    void headers(int i9, List<Header> list) throws IOException;

    int maxDataLength();

    void ping(boolean z9, int i9, int i10) throws IOException;

    void pushPromise(int i9, int i10, List<Header> list) throws IOException;

    void rstStream(int i9, ErrorCode errorCode) throws IOException;

    void settings(Settings settings) throws IOException;

    void synReply(boolean z9, int i9, List<Header> list) throws IOException;

    void synStream(boolean z9, boolean z10, int i9, int i10, List<Header> list) throws IOException;

    void windowUpdate(int i9, long j9) throws IOException;
}
