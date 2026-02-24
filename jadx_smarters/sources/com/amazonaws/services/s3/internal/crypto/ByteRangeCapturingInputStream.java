package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ByteRangeCapturingInputStream extends SdkFilterInputStream {
    private final byte[] block;
    private int blockPosition;
    private final long endingPosition;
    private int markedBlockPosition;
    private long markedStreamPosition;
    private final long startingPosition;
    private long streamPosition;

    public ByteRangeCapturingInputStream(InputStream inputStream, long j9, long j10) {
        super(inputStream);
        this.blockPosition = 0;
        if (j9 >= j10) {
            throw new IllegalArgumentException("Invalid byte range specified: the starting position must be less than the ending position");
        }
        this.startingPosition = j9;
        this.endingPosition = j10;
        this.block = new byte[(int) (j10 - j9)];
    }

    public byte[] getBlock() {
        return this.block;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i9) {
        super.mark(i9);
        if (markSupported()) {
            this.markedStreamPosition = this.streamPosition;
            this.markedBlockPosition = this.blockPosition;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i9 = super.read();
        if (i9 == -1) {
            return -1;
        }
        long j9 = this.streamPosition;
        if (j9 >= this.startingPosition && j9 <= this.endingPosition) {
            byte[] bArr = this.block;
            int i10 = this.blockPosition;
            this.blockPosition = i10 + 1;
            bArr[i10] = (byte) i9;
        }
        this.streamPosition = j9 + 1;
        return i9;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = super.read(bArr, i9, i10);
        if (i11 == -1) {
            return -1;
        }
        long j9 = this.streamPosition;
        long j10 = i11;
        if (j9 + j10 >= this.startingPosition && j9 <= this.endingPosition) {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = this.streamPosition;
                long j12 = i12;
                if (j11 + j12 >= this.startingPosition && j11 + j12 < this.endingPosition) {
                    byte[] bArr2 = this.block;
                    int i13 = this.blockPosition;
                    this.blockPosition = i13 + 1;
                    bArr2[i13] = bArr[i9 + i12];
                }
            }
        }
        this.streamPosition += j10;
        return i11;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        if (markSupported()) {
            this.streamPosition = this.markedStreamPosition;
            this.blockPosition = this.markedBlockPosition;
        }
    }
}
