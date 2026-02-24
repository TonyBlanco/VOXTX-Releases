package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Base64OutputStream extends BaseNCodecOutputStream {
    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z9) {
        super(outputStream, new Base64(false), z9);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z9, int i9, byte[] bArr) {
        super(outputStream, new Base64(i9, bArr), z9);
    }
}
