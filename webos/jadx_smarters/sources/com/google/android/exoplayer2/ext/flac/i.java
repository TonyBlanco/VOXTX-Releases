package com.google.android.exoplayer2.ext.flac;

import O2.C0936z0;
import Q2.B;
import Q2.I;
import Q2.InterfaceC1027m;
import Q2.InterfaceC1039z;
import android.os.Handler;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d4.a0;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends I {
    public i() {
        this((Handler) null, (InterfaceC1039z) null, new InterfaceC1027m[0]);
    }

    public i(Handler handler, InterfaceC1039z interfaceC1039z, B b9) {
        super(handler, interfaceC1039z, b9);
    }

    public i(Handler handler, InterfaceC1039z interfaceC1039z, InterfaceC1027m... interfaceC1027mArr) {
        super(handler, interfaceC1039z, interfaceC1027mArr);
    }

    public static C0936z0 p0(FlacStreamMetadata flacStreamMetadata) {
        return k0.i0(k0.h0(flacStreamMetadata.bitsPerSample), flacStreamMetadata.channels, flacStreamMetadata.sampleRate);
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "LibflacAudioRenderer";
    }

    @Override // Q2.I
    public int l0(C0936z0 c0936z0) {
        if (!h.isAvailable() || !"audio/flac".equalsIgnoreCase(c0936z0.f6467m)) {
            return 0;
        }
        if (k0(c0936z0.f6469o.isEmpty() ? k0.i0(2, c0936z0.f6480z, c0936z0.f6447A) : p0(new FlacStreamMetadata((byte[]) c0936z0.f6469o.get(0), 8)))) {
            return c0936z0.f6454H != 0 ? 2 : 4;
        }
        return 1;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d U(C0936z0 c0936z0, CryptoConfig cryptoConfig) {
        a0.a("createFlacDecoder");
        d dVar = new d(16, 16, c0936z0.f6468n, c0936z0.f6469o);
        a0.c();
        return dVar;
    }

    @Override // Q2.I
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0936z0 Y(d dVar) {
        return p0(dVar.z());
    }
}
