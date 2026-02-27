package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkInputStream;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AdjustedRangeInputStream extends SdkInputStream {
    private boolean closed = false;
    private InputStream decryptedContents;
    private long virtualAvailable;

    public AdjustedRangeInputStream(InputStream inputStream, long j9, long j10) throws IOException {
        this.decryptedContents = inputStream;
        initializeForRead(j9, j10);
    }

    private void initializeForRead(long j9, long j10) throws IOException {
        int i9 = j9 < 16 ? (int) j9 : ((int) (j9 % 16)) + 16;
        if (i9 != 0) {
            while (i9 > 0) {
                this.decryptedContents.read();
                i9--;
            }
        }
        this.virtualAvailable = (j10 - j9) + 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        int iAvailable = this.decryptedContents.available();
        long j9 = iAvailable;
        long j10 = this.virtualAvailable;
        return j9 < j10 ? iAvailable : (int) j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.decryptedContents.close();
        }
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.decryptedContents;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i9 = this.virtualAvailable <= 0 ? -1 : this.decryptedContents.read();
        if (i9 != -1) {
            this.virtualAvailable--;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11;
        abortIfNeeded();
        long j9 = this.virtualAvailable;
        if (j9 <= 0) {
            i11 = -1;
        } else {
            if (i10 > j9) {
                i10 = j9 < 2147483647L ? (int) j9 : a.e.API_PRIORITY_OTHER;
            }
            i11 = this.decryptedContents.read(bArr, i9, i10);
        }
        if (i11 != -1) {
            this.virtualAvailable -= (long) i11;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return i11;
    }
}
