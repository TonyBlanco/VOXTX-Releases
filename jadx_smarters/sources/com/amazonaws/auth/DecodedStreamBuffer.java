package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: loaded from: classes.dex */
class DecodedStreamBuffer {
    private static final Log log = LogFactory.getLog((Class<?>) DecodedStreamBuffer.class);
    private byte[] bufferArray;
    private boolean bufferSizeOverflow;
    private int byteBuffered;
    private int maxBufferSize;
    private int pos = -1;

    public DecodedStreamBuffer(int i9) {
        this.bufferArray = new byte[i9];
        this.maxBufferSize = i9;
    }

    public void buffer(byte b9) {
        this.pos = -1;
        int i9 = this.byteBuffered;
        if (i9 < this.maxBufferSize) {
            byte[] bArr = this.bufferArray;
            this.byteBuffered = i9 + 1;
            bArr[i9] = b9;
            return;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
        }
        this.bufferSizeOverflow = true;
    }

    public void buffer(byte[] bArr, int i9, int i10) {
        this.pos = -1;
        int i11 = this.byteBuffered;
        if (i11 + i10 <= this.maxBufferSize) {
            System.arraycopy(bArr, i9, this.bufferArray, i11, i10);
            this.byteBuffered += i10;
            return;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
        }
        this.bufferSizeOverflow = true;
    }

    public boolean hasNext() {
        int i9 = this.pos;
        return i9 != -1 && i9 < this.byteBuffered;
    }

    public byte next() {
        byte[] bArr = this.bufferArray;
        int i9 = this.pos;
        this.pos = i9 + 1;
        return bArr[i9];
    }

    public void startReadBuffer() {
        if (!this.bufferSizeOverflow) {
            this.pos = 0;
            return;
        }
        throw new AmazonClientException("The input stream is not repeatable since the buffer size " + this.maxBufferSize + " has been exceeded.");
    }
}
