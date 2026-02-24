package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class bfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f21188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f21189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bfk f21190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bfl f21191d;

    private bfj() {
        this.f21188a = null;
        this.f21189b = null;
        this.f21190c = null;
        throw null;
    }

    public /* synthetic */ bfj(byte[] bArr) {
        this.f21188a = null;
        this.f21189b = null;
        this.f21190c = null;
        this.f21191d = bfl.f21201d;
    }

    public final bfm a() throws GeneralSecurityException {
        Integer num = this.f21188a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f21189b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f21190c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f21188a));
        }
        Integer num2 = this.f21189b;
        int iIntValue = num2.intValue();
        bfk bfkVar = this.f21190c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (bfkVar == bfk.f21192a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (bfkVar == bfk.f21193b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (bfkVar == bfk.f21194c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (bfkVar == bfk.f21195d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (bfkVar != bfk.f21196e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new bfm(this.f21188a.intValue(), this.f21189b.intValue(), this.f21191d, this.f21190c);
    }

    public final void b(bfk bfkVar) {
        this.f21190c = bfkVar;
    }

    public final void c(int i9) throws GeneralSecurityException {
        this.f21188a = Integer.valueOf(i9);
    }

    public final void d(int i9) throws GeneralSecurityException {
        this.f21189b = Integer.valueOf(i9);
    }

    public final void e(bfl bflVar) {
        this.f21191d = bflVar;
    }
}
