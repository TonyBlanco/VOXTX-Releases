package org.apache.http.impl.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface SpnegoTokenGenerator {
    byte[] generateSpnegoDERObject(byte[] bArr) throws IOException;
}
