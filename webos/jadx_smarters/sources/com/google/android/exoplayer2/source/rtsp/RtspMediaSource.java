package com.google.android.exoplayer2.source.rtsp;

import B3.AbstractC0493a;
import B3.AbstractC0510s;
import B3.C;
import B3.InterfaceC0517z;
import B3.b0;
import K3.w;
import O2.AbstractC0928w0;
import O2.H0;
import O2.Q1;
import V2.B;
import android.net.Uri;
import b4.F;
import b4.InterfaceC1211b;
import b4.S;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.f;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaSource extends AbstractC0493a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H0 f25604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a.InterfaceC0243a f25605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f25606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f25607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SocketFactory f25608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f25609n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25612q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25610o = -9223372036854775807L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25613r = true;

    public static final class Factory implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f25614a = 8000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25615b = "ExoPlayerLib/2.19.0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SocketFactory f25616c = SocketFactory.getDefault();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f25618e;

        @Override // B3.C.a
        public int[] c() {
            return new int[]{3};
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource b(H0 h02) {
            AbstractC1684a.e(h02.f5528c);
            return new RtspMediaSource(h02, this.f25617d ? new k(this.f25614a) : new m(this.f25614a), this.f25615b, this.f25616c, this.f25618e);
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory d(B b9) {
            return this;
        }

        @Override // B3.C.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory a(F f9) {
            return this;
        }
    }

    public class a implements f.c {
        public a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void a() {
            RtspMediaSource.this.f25611p = false;
            RtspMediaSource.this.t0();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void b(w wVar) {
            RtspMediaSource.this.f25610o = k0.P0(wVar.a());
            RtspMediaSource.this.f25611p = !wVar.c();
            RtspMediaSource.this.f25612q = wVar.c();
            RtspMediaSource.this.f25613r = false;
            RtspMediaSource.this.t0();
        }
    }

    public class b extends AbstractC0510s {
        public b(Q1 q12) {
            super(q12);
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.b l(int i9, Q1.b bVar, boolean z9) {
            super.l(i9, bVar, z9);
            bVar.f5721g = true;
            return bVar;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            super.t(i9, dVar, j9);
            dVar.f5755m = true;
            return dVar;
        }
    }

    public static class c extends IOException {
        public c(String str) {
            super(str);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }

        public c(Throwable th) {
            super(th);
        }
    }

    public static final class d extends c {
        public d(String str) {
            super(str);
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.rtsp");
    }

    public RtspMediaSource(H0 h02, a.InterfaceC0243a interfaceC0243a, String str, SocketFactory socketFactory, boolean z9) {
        this.f25604i = h02;
        this.f25605j = interfaceC0243a;
        this.f25606k = str;
        this.f25607l = ((H0.h) AbstractC1684a.e(h02.f5528c)).f5625a;
        this.f25608m = socketFactory;
        this.f25609n = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        Q1 b0Var = new b0(this.f25610o, this.f25611p, false, this.f25612q, null, this.f25604i);
        if (this.f25613r) {
            b0Var = new b(b0Var);
        }
        m0(b0Var);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        return new f(interfaceC1211b, this.f25605j, this.f25607l, new a(), this.f25606k, this.f25608m, this.f25609n);
    }

    @Override // B3.C
    public void P() {
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((f) interfaceC0517z).Y();
    }

    @Override // B3.C
    public H0 e() {
        return this.f25604i;
    }

    @Override // B3.AbstractC0493a
    public void l0(S s9) {
        t0();
    }

    @Override // B3.AbstractC0493a
    public void n0() {
    }
}
