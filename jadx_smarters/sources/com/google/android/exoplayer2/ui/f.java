package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public interface a {
        void C(f fVar, long j9, boolean z9);

        void D(f fVar, long j9);

        void o(f fVar, long j9);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i9);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j9);

    void setDuration(long j9);

    void setEnabled(boolean z9);

    void setPosition(long j9);
}
