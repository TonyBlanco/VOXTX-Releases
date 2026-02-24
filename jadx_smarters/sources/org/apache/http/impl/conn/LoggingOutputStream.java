package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
class LoggingOutputStream extends OutputStream {
    private final OutputStream out;
    private final Wire wire;

    public LoggingOutputStream(OutputStream outputStream, Wire wire) {
        this.out = outputStream;
        this.wire = wire;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.out.close();
        } catch (IOException e9) {
            this.wire.output("[close] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.out.flush();
        } catch (IOException e9) {
            this.wire.output("[flush] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i9) throws IOException {
        try {
            this.wire.output(i9);
        } catch (IOException e9) {
            this.wire.output("[write] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.wire.output(bArr);
            this.out.write(bArr);
        } catch (IOException e9) {
            this.wire.output("[write] I/O error: " + e9.getMessage());
            throw e9;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        try {
            this.wire.output(bArr, i9, i10);
            this.out.write(bArr, i9, i10);
        } catch (IOException e9) {
            this.wire.output("[write] I/O error: " + e9.getMessage());
            throw e9;
        }
    }
}
