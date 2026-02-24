package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.codec.binary.BaseNCodec;

/* JADX INFO: loaded from: classes4.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecOutputStream(OutputStream outputStream, BaseNCodec baseNCodec, boolean z9) {
        super(outputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.baseNCodec = baseNCodec;
        this.doEncode = z9;
    }

    private void flush(boolean z9) throws IOException {
        byte[] bArr;
        int results;
        int iAvailable = this.baseNCodec.available(this.context);
        if (iAvailable > 0 && (results = this.baseNCodec.readResults((bArr = new byte[iAvailable]), 0, iAvailable, this.context)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, results);
        }
        if (z9) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.doEncode) {
            this.baseNCodec.encode(this.singleByte, 0, -1, this.context);
        } else {
            this.baseNCodec.decode(this.singleByte, 0, -1, this.context);
        }
        flush();
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flush(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i9) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) i9;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        bArr.getClass();
        if (i9 < 0 || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i9 > bArr.length || i9 + i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 > 0) {
            if (this.doEncode) {
                this.baseNCodec.encode(bArr, i9, i10, this.context);
            } else {
                this.baseNCodec.decode(bArr, i9, i10, this.context);
            }
            flush(false);
        }
    }
}
