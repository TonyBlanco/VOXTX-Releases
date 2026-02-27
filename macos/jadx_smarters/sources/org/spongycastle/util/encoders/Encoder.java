package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream) throws IOException;

    int decode(byte[] bArr, int i9, int i10, OutputStream outputStream) throws IOException;

    int encode(byte[] bArr, int i9, int i10, OutputStream outputStream) throws IOException;
}
