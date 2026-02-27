package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
class LoggingInputStream extends InputStream {
    private final InputStream in;
    private final Wire wire;

    public LoggingInputStream(InputStream inputStream, Wire wire) {
        this.in = inputStream;
        this.wire = wire;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.in.available();
        } catch (IOException e9) {
            this.wire.input("[available] I/O error : " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.in.close();
        } catch (IOException e9) {
            this.wire.input("[close] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        super.mark(i9);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i9 = this.in.read();
            if (i9 == -1) {
                this.wire.input("end of stream");
            } else {
                this.wire.input(i9);
            }
            return i9;
        } catch (IOException e9) {
            this.wire.input("[read] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i9 = this.in.read(bArr);
            if (i9 == -1) {
                this.wire.input("end of stream");
            } else if (i9 > 0) {
                this.wire.input(bArr, 0, i9);
            }
            return i9;
        } catch (IOException e9) {
            this.wire.input("[read] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        try {
            int i11 = this.in.read(bArr, i9, i10);
            if (i11 == -1) {
                this.wire.input("end of stream");
            } else if (i11 > 0) {
                this.wire.input(bArr, i9, i11);
            }
            return i11;
        } catch (IOException e9) {
            this.wire.input("[read] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j9) throws IOException {
        try {
            return super.skip(j9);
        } catch (IOException e9) {
            this.wire.input("[skip] I/O error: " + e9.getMessage());
            throw e9;
        }
    }
}
