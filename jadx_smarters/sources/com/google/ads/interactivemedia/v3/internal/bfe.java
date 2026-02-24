package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class bfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f21184c;

    private bfe() {
        this.f21182a = null;
        this.f21183b = null;
        this.f21184c = null;
    }

    public /* synthetic */ bfe(byte[] bArr) {
        this.f21182a = null;
        this.f21183b = null;
        this.f21184c = null;
    }

    public /* synthetic */ bfe(byte[] bArr, byte[] bArr2) {
        this.f21183b = null;
        this.f21182a = null;
        this.f21184c = bfb.f21171d;
    }

    public /* synthetic */ bfe(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21184c = null;
        this.f21183b = null;
        this.f21182a = null;
    }

    public final bff a() throws GeneralSecurityException {
        bjj bjjVarB;
        Object obj = this.f21182a;
        if (obj == null || this.f21183b == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((bfm) obj).g() != ((vk) this.f21183b).d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((bfm) this.f21182a).j() && this.f21184c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        }
        if (!((bfm) this.f21182a).j() && this.f21184c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        if (((bfm) this.f21182a).i() == bfl.f21201d) {
            bjjVarB = bjj.b(new byte[0]);
        } else if (((bfm) this.f21182a).i() == bfl.f21200c || ((bfm) this.f21182a).i() == bfl.f21199b) {
            bjjVarB = bjj.b(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f21184c).intValue()).array());
        } else {
            if (((bfm) this.f21182a).i() != bfl.f21198a) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((bfm) this.f21182a).i())));
            }
            bjjVarB = bjj.b(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f21184c).intValue()).array());
        }
        return new bff((bfm) this.f21182a, bjjVarB);
    }

    public final void b(Integer num) {
        this.f21184c = num;
    }

    public final void c(bfm bfmVar) {
        this.f21182a = bfmVar;
    }

    public final bfc d() throws GeneralSecurityException {
        Object obj = this.f21183b;
        if (obj == null || this.f21182a == null) {
            throw new GeneralSecurityException("Key size and/or tag size not set");
        }
        return new bfc(((Integer) obj).intValue(), ((Integer) this.f21182a).intValue(), (bfb) this.f21184c);
    }

    public final void e(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i9 * 8)));
        }
        this.f21183b = Integer.valueOf(i9);
    }

    public final void f(int i9) throws GeneralSecurityException {
        if (i9 >= 10 && i9 <= 16) {
            this.f21182a = Integer.valueOf(i9);
            return;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i9);
    }

    public final void g(bfb bfbVar) {
        this.f21184c = bfbVar;
    }

    public final bex h() throws GeneralSecurityException {
        bjj bjjVarB;
        Object obj = this.f21184c;
        if (obj == null || this.f21183b == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((bfc) obj).g() != ((vk) this.f21183b).d()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((bfc) this.f21184c).j() && this.f21182a == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        }
        if (!((bfc) this.f21184c).j() && this.f21182a != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        if (((bfc) this.f21184c).i() == bfb.f21171d) {
            bjjVarB = bjj.b(new byte[0]);
        } else if (((bfc) this.f21184c).i() == bfb.f21170c || ((bfc) this.f21184c).i() == bfb.f21169b) {
            bjjVarB = bjj.b(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f21182a).intValue()).array());
        } else {
            if (((bfc) this.f21184c).i() != bfb.f21168a) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((bfc) this.f21184c).i())));
            }
            bjjVarB = bjj.b(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f21182a).intValue()).array());
        }
        return new bex((bfc) this.f21184c, bjjVarB);
    }

    public final void i(Integer num) {
        this.f21182a = num;
    }

    public final void j(bfc bfcVar) {
        this.f21184c = bfcVar;
    }

    public final void k(vk vkVar) {
        this.f21183b = vkVar;
    }

    public final void l(vk vkVar) throws GeneralSecurityException {
        this.f21183b = vkVar;
    }
}
