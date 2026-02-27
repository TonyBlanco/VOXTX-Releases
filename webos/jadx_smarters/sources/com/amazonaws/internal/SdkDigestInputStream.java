package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SKIP_BUF_SIZE = 2048;

    public SdkDigestInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    public final boolean isMetricActivated() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).isMetricActivated();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j9) throws IOException {
        if (j9 <= 0) {
            return j9;
        }
        int iMin = (int) Math.min(2048L, j9);
        byte[] bArr = new byte[iMin];
        long j10 = j9;
        while (j10 > 0) {
            int i9 = read(bArr, 0, (int) Math.min(j10, iMin));
            if (i9 == -1) {
                if (j10 == j9) {
                    return -1L;
                }
                return j9 - j10;
            }
            j10 -= (long) i9;
        }
        return j9;
    }
}
