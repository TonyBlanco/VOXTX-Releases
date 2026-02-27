package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.http2.Http2;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class aga extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aga f19562a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19563d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19580u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19564e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19565f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19566g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19567h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19568i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19569j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19570k = 1000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19571l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19572m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19573n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19574o = 1000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f19575p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19576q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19577r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f19578s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f19581v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19582w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f19583x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19584y = -1;

    static {
        aga agaVar = new aga();
        f19562a = agaVar;
        bqn.aL(aga.class, agaVar);
    }

    private aga() {
    }

    public static /* synthetic */ void b(aga agaVar, long j9) {
        agaVar.f19563d |= 1;
        agaVar.f19564e = j9;
    }

    public static /* synthetic */ void c(aga agaVar, long j9) {
        agaVar.f19563d |= 2;
        agaVar.f19565f = j9;
    }

    public static /* synthetic */ void d(aga agaVar, long j9) {
        agaVar.f19563d |= 4;
        agaVar.f19566g = j9;
    }

    public static /* synthetic */ void e(aga agaVar, long j9) {
        agaVar.f19563d |= 8;
        agaVar.f19567h = j9;
    }

    public static /* synthetic */ void f(aga agaVar) {
        agaVar.f19563d &= -9;
        agaVar.f19567h = -1L;
    }

    public static /* synthetic */ void g(aga agaVar, long j9) {
        agaVar.f19563d |= 16;
        agaVar.f19568i = j9;
    }

    public static /* synthetic */ void h(aga agaVar, long j9) {
        agaVar.f19563d |= 32;
        agaVar.f19569j = j9;
    }

    public static /* synthetic */ void j(aga agaVar, long j9) {
        agaVar.f19563d |= 128;
        agaVar.f19571l = j9;
    }

    public static /* synthetic */ void k(aga agaVar, long j9) {
        agaVar.f19563d |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        agaVar.f19572m = j9;
    }

    public static /* synthetic */ void l(aga agaVar, long j9) {
        agaVar.f19563d |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        agaVar.f19573n = j9;
    }

    public static /* synthetic */ void m(aga agaVar, long j9) {
        agaVar.f19563d |= 2048;
        agaVar.f19575p = j9;
    }

    public static /* synthetic */ void n(aga agaVar, long j9) {
        agaVar.f19563d |= 4096;
        agaVar.f19576q = j9;
    }

    public static /* synthetic */ void o(aga agaVar, long j9) {
        agaVar.f19563d |= Segment.SIZE;
        agaVar.f19577r = j9;
    }

    public static /* synthetic */ void p(aga agaVar, long j9) {
        agaVar.f19563d |= Http2.INITIAL_MAX_FRAME_SIZE;
        agaVar.f19578s = j9;
    }

    public static /* synthetic */ void q(aga agaVar, long j9) {
        agaVar.f19563d |= 32768;
        agaVar.f19579t = j9;
    }

    public static /* synthetic */ void r(aga agaVar, long j9) {
        agaVar.f19563d |= 65536;
        agaVar.f19580u = j9;
    }

    public static /* synthetic */ void s(aga agaVar, long j9) {
        agaVar.f19563d |= 131072;
        agaVar.f19581v = j9;
    }

    public static /* synthetic */ void t(aga agaVar, long j9) {
        agaVar.f19563d |= 262144;
        agaVar.f19582w = j9;
    }

    public static /* synthetic */ void u(aga agaVar, int i9) {
        agaVar.f19570k = agh.b(i9);
        agaVar.f19563d |= 64;
    }

    public static /* synthetic */ void v(aga agaVar, int i9) {
        agaVar.f19574o = agh.b(i9);
        agaVar.f19563d |= 1024;
    }

    public static agl w() {
        return (agl) f19562a.ay();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19562a, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"d", "e", "f", "g", "h", "i", "j", "k", agh.a(), "l", "m", "n", "o", agh.a(), "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        }
        if (i10 == 3) {
            return new aga();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19562a;
    }
}
