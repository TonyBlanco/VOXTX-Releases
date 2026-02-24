package a3;

import O2.C0936z0;
import Q2.B;
import Q2.I;
import Q2.InterfaceC1027m;
import Q2.InterfaceC1039z;
import android.os.Handler;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import d4.a0;
import d4.k0;

/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1083a extends I {
    public C1083a() {
        this((Handler) null, (InterfaceC1039z) null, new InterfaceC1027m[0]);
    }

    public C1083a(Handler handler, InterfaceC1039z interfaceC1039z, B b9) {
        super(handler, interfaceC1039z, b9);
    }

    public C1083a(Handler handler, InterfaceC1039z interfaceC1039z, InterfaceC1027m... interfaceC1027mArr) {
        super(handler, interfaceC1039z, interfaceC1027mArr);
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "LibopusAudioRenderer";
    }

    @Override // Q2.I
    public int l0(C0936z0 c0936z0) {
        boolean zC = OpusLibrary.c(c0936z0.f6454H);
        if (!OpusLibrary.b() || !"audio/opus".equalsIgnoreCase(c0936z0.f6467m)) {
            return 0;
        }
        if (k0(k0.i0(2, c0936z0.f6480z, c0936z0.f6447A))) {
            return !zC ? 2 : 4;
        }
        return 1;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final OpusDecoder U(C0936z0 c0936z0, CryptoConfig cryptoConfig) {
        a0.a("createOpusDecoder");
        boolean z9 = Z(k0.i0(4, c0936z0.f6480z, c0936z0.f6447A)) == 2;
        int i9 = c0936z0.f6468n;
        OpusDecoder opusDecoder = new OpusDecoder(16, 16, i9 != -1 ? i9 : 5760, c0936z0.f6469o, cryptoConfig, z9);
        opusDecoder.z(o0());
        a0.c();
        return opusDecoder;
    }

    public boolean o0() {
        return false;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final C0936z0 Y(OpusDecoder opusDecoder) {
        return k0.i0(opusDecoder.f25361n ? 4 : 2, opusDecoder.f25362o, 48000);
    }
}
