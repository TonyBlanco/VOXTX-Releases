package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
class ChunkContentIterator {
    private int pos;
    private final byte[] signedChunk;

    public ChunkContentIterator(byte[] bArr) {
        this.signedChunk = bArr;
    }

    public boolean hasNext() {
        return this.pos < this.signedChunk.length;
    }

    public int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (!hasNext()) {
            return -1;
        }
        int iMin = Math.min(this.signedChunk.length - this.pos, i10);
        System.arraycopy(this.signedChunk, this.pos, bArr, i9, iMin);
        this.pos += iMin;
        return iMin;
    }
}
