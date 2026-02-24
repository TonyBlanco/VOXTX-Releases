package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: com.squareup.okhttp.internal.framed.PushObserver.1
        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onData(int i9, BufferedSource bufferedSource, int i10, boolean z9) throws IOException {
            bufferedSource.skip(i10);
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onHeaders(int i9, List<Header> list, boolean z9) {
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public boolean onRequest(int i9, List<Header> list) {
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public void onReset(int i9, ErrorCode errorCode) {
        }
    };

    boolean onData(int i9, BufferedSource bufferedSource, int i10, boolean z9) throws IOException;

    boolean onHeaders(int i9, List<Header> list, boolean z9);

    boolean onRequest(int i9, List<Header> list);

    void onReset(int i9, ErrorCode errorCode);
}
