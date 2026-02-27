package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Base32InputStream extends BaseNCodecInputStream {
    public Base32InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base32InputStream(InputStream inputStream, boolean z9) {
        super(inputStream, new Base32(false), z9);
    }

    public Base32InputStream(InputStream inputStream, boolean z9, int i9, byte[] bArr) {
        super(inputStream, new Base32(i9, bArr), z9);
    }
}
