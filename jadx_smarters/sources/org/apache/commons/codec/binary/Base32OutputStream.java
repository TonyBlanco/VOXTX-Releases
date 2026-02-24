package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Base32OutputStream extends BaseNCodecOutputStream {
    public Base32OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z9) {
        super(outputStream, new Base32(false), z9);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z9, int i9, byte[] bArr) {
        super(outputStream, new Base32(i9, bArr), z9);
    }
}
