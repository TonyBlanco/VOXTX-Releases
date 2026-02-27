package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class Base64InputStream extends BaseNCodecInputStream {
    public Base64InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(InputStream inputStream, boolean z9) {
        super(inputStream, new Base64(false), z9);
    }

    public Base64InputStream(InputStream inputStream, boolean z9, int i9, byte[] bArr) {
        super(inputStream, new Base64(i9, bArr), z9);
    }
}
