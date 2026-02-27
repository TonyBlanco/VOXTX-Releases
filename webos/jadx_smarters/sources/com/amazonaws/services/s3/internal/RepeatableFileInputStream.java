package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableFileInputStream extends SdkInputStream {
    private static final Log log = LogFactory.getLog("RepeatableFIS");
    private final File file;
    private FileInputStream fis;
    private long bytesReadPastMarkPoint = 0;
    private long markPoint = 0;

    public RepeatableFileInputStream(File file) throws FileNotFoundException {
        this.fis = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.fis = new FileInputStream(file);
        this.file = file;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        return this.fis.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.fis.close();
        abortIfNeeded();
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.fis;
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        abortIfNeeded();
        this.markPoint += this.bytesReadPastMarkPoint;
        this.bytesReadPastMarkPoint = 0L;
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Input stream marked at " + this.markPoint + " bytes");
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i9 = this.fis.read();
        if (i9 == -1) {
            return -1;
        }
        this.bytesReadPastMarkPoint++;
        return i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        abortIfNeeded();
        int i11 = this.fis.read(bArr, i9, i10);
        this.bytesReadPastMarkPoint += (long) i11;
        return i11;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.fis.close();
        abortIfNeeded();
        this.fis = new FileInputStream(this.file);
        long jSkip = this.markPoint;
        while (jSkip > 0) {
            jSkip -= this.fis.skip(jSkip);
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Reset to mark point " + this.markPoint + " after returning " + this.bytesReadPastMarkPoint + " bytes");
        }
        this.bytesReadPastMarkPoint = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j9) throws IOException {
        abortIfNeeded();
        long jSkip = this.fis.skip(j9);
        this.bytesReadPastMarkPoint += jSkip;
        return jSkip;
    }
}
