package com.google.android.exoplayer2.source.rtsp;

import K3.o;
import android.os.Handler;
import b4.G;
import b4.InterfaceC1220k;
import b4.r;
import com.google.android.exoplayer2.source.rtsp.a;
import d3.C1666c;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements G.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25621a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f25622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f25623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1674k f25624e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.InterfaceC0243a f25626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.source.rtsp.a f25627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K3.d f25628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1666c f25629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f25630k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f25632m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f25625f = k0.x();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f25631l = -9223372036854775807L;

    public interface a {
        void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar);
    }

    public b(int i9, o oVar, a aVar, InterfaceC1674k interfaceC1674k, a.InterfaceC0243a interfaceC0243a) {
        this.f25621a = i9;
        this.f25622c = oVar;
        this.f25623d = aVar;
        this.f25624e = interfaceC1674k;
        this.f25626g = interfaceC0243a;
    }

    @Override // b4.G.e
    public void a() {
        if (this.f25630k) {
            this.f25630k = false;
        }
        try {
            if (this.f25627h == null) {
                com.google.android.exoplayer2.source.rtsp.a aVarA = this.f25626g.a(this.f25621a);
                this.f25627h = aVarA;
                final String strC = aVarA.c();
                final com.google.android.exoplayer2.source.rtsp.a aVar = this.f25627h;
                this.f25625f.post(new Runnable() { // from class: K3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3698a.d(strC, aVar);
                    }
                });
                this.f25629j = new C1666c((InterfaceC1220k) AbstractC1684a.e(this.f25627h), 0L, -1L);
                K3.d dVar = new K3.d(this.f25622c.f3753a, this.f25621a);
                this.f25628i = dVar;
                dVar.b(this.f25624e);
            }
            while (!this.f25630k) {
                if (this.f25631l != -9223372036854775807L) {
                    ((K3.d) AbstractC1684a.e(this.f25628i)).a(this.f25632m, this.f25631l);
                    this.f25631l = -9223372036854775807L;
                }
                if (((K3.d) AbstractC1684a.e(this.f25628i)).d((InterfaceC1673j) AbstractC1684a.e(this.f25629j), new t()) == -1) {
                    break;
                }
            }
            this.f25630k = false;
            if (((com.google.android.exoplayer2.source.rtsp.a) AbstractC1684a.e(this.f25627h)).i()) {
                r.a(this.f25627h);
                this.f25627h = null;
            }
        } catch (Throwable th) {
            if (((com.google.android.exoplayer2.source.rtsp.a) AbstractC1684a.e(this.f25627h)).i()) {
                r.a(this.f25627h);
                this.f25627h = null;
            }
            throw th;
        }
    }

    @Override // b4.G.e
    public void c() {
        this.f25630k = true;
    }

    public final /* synthetic */ void d(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
        this.f25623d.a(str, aVar);
    }

    public void e() {
        ((K3.d) AbstractC1684a.e(this.f25628i)).f();
    }

    public void f(long j9, long j10) {
        this.f25631l = j9;
        this.f25632m = j10;
    }

    public void g(int i9) {
        if (((K3.d) AbstractC1684a.e(this.f25628i)).e()) {
            return;
        }
        this.f25628i.g(i9);
    }

    public void h(long j9) {
        if (j9 == -9223372036854775807L || ((K3.d) AbstractC1684a.e(this.f25628i)).e()) {
            return;
        }
        this.f25628i.i(j9);
    }
}
