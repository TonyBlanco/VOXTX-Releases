package com.google.android.exoplayer2.ext.ffmpeg;

import O2.C0936z0;
import Q2.B;
import Q2.I;
import Q2.InterfaceC1027m;
import Q2.InterfaceC1039z;
import Q2.X;
import android.os.Handler;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import d4.AbstractC1684a;
import d4.F;
import d4.a0;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends I {
    public b() {
        this((Handler) null, (InterfaceC1039z) null, new InterfaceC1027m[0]);
    }

    public b(Handler handler, InterfaceC1039z interfaceC1039z, B b9) {
        super(handler, interfaceC1039z, b9);
    }

    public b(Handler handler, InterfaceC1039z interfaceC1039z, InterfaceC1027m... interfaceC1027mArr) {
        this(handler, interfaceC1039z, new X.f().j(interfaceC1027mArr).g());
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "FfmpegAudioRenderer";
    }

    @Override // Q2.I
    public int l0(C0936z0 c0936z0) {
        String str = (String) AbstractC1684a.e(c0936z0.f6467m);
        if (!FfmpegLibrary.d() || !F.o(str)) {
            return 0;
        }
        if (!FfmpegLibrary.e(str)) {
            return 1;
        }
        if (q0(c0936z0, 2) || q0(c0936z0, 4)) {
            return c0936z0.f6454H != 0 ? 2 : 4;
        }
        return 1;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public FfmpegAudioDecoder U(C0936z0 c0936z0, CryptoConfig cryptoConfig) {
        a0.a("createFfmpegAudioDecoder");
        int i9 = c0936z0.f6468n;
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(c0936z0, 16, 16, i9 != -1 ? i9 : 5760, p0(c0936z0));
        a0.c();
        return ffmpegAudioDecoder;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0936z0 Y(FfmpegAudioDecoder ffmpegAudioDecoder) {
        AbstractC1684a.e(ffmpegAudioDecoder);
        return new C0936z0.b().g0("audio/raw").J(ffmpegAudioDecoder.A()).h0(ffmpegAudioDecoder.D()).a0(ffmpegAudioDecoder.B()).G();
    }

    public final boolean p0(C0936z0 c0936z0) {
        if (!q0(c0936z0, 2)) {
            return true;
        }
        if (Z(k0.i0(4, c0936z0.f6480z, c0936z0.f6447A)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(c0936z0.f6467m);
    }

    public final boolean q0(C0936z0 c0936z0, int i9) {
        return k0(k0.i0(i9, c0936z0.f6480z, c0936z0.f6447A));
    }

    @Override // O2.AbstractC0892k, O2.E1
    public int t() {
        return 8;
    }
}
