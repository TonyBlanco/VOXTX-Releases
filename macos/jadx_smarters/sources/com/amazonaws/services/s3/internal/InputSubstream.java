package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {
    private final boolean closeSourceStream;
    private long currentPosition;
    private long markedPosition;
    private final long requestedLength;
    private final long requestedOffset;

    public InputSubstream(InputStream inputStream, long j9, long j10, boolean z9) {
        super(inputStream);
        this.markedPosition = 0L;
        this.currentPosition = 0L;
        this.requestedLength = j10;
        this.requestedOffset = j9;
        this.closeSourceStream = z9;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        long j9 = this.currentPosition;
        long j10 = this.requestedOffset;
        return (int) Math.min(j9 < j10 ? this.requestedLength : (this.requestedLength + j10) - j9, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeSourceStream) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
        this.markedPosition = this.currentPosition;
        super.mark(i9);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int i9 = read(bArr, 0, 1);
        return i9 == -1 ? i9 : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        long j9;
        long j10;
        while (true) {
            j9 = this.currentPosition;
            j10 = this.requestedOffset;
            if (j9 >= j10) {
                break;
            }
            this.currentPosition += super.skip(j10 - j9);
        }
        long j11 = (this.requestedLength + j10) - j9;
        if (j11 <= 0) {
            return -1;
        }
        int i11 = super.read(bArr, i9, (int) Math.min(i10, j11));
        this.currentPosition += (long) i11;
        return i11;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.currentPosition = this.markedPosition;
        super.reset();
    }
}
