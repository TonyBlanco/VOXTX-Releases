package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public interface FrameReader extends Closeable {

    public interface Handler {
        void ackSettings();

        void alternateService(int i9, String str, ByteString byteString, String str2, int i10, long j9);

        void data(boolean z9, int i9, BufferedSource bufferedSource, int i10) throws IOException;

        void goAway(int i9, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z9, boolean z10, int i9, int i10, List<Header> list, HeadersMode headersMode);

        void ping(boolean z9, int i9, int i10);

        void priority(int i9, int i10, int i11, boolean z9);

        void pushPromise(int i9, int i10, List<Header> list) throws IOException;

        void rstStream(int i9, ErrorCode errorCode);

        void settings(boolean z9, Settings settings);

        void windowUpdate(int i9, long j9);
    }

    boolean nextFrame(Handler handler) throws IOException;

    void readConnectionPreface() throws IOException;
}
