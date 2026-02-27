package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class aht implements ahf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aht f19792a = new aht();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f19793b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f19794c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Runnable f19795d = new ahq(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Runnable f19796e = new ahq(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19798g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19802k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f19797f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19799h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f19800i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aho f19801j = new aho();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bdy f19804m = new bdy((byte[]) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aly f19803l = new aly(new ahw());

    public static aht c() {
        return f19792a;
    }

    public static /* bridge */ /* synthetic */ void f(aht ahtVar) {
        ahtVar.f19798g = 0;
        ahtVar.f19800i.clear();
        ahtVar.f19799h = false;
        for (agt agtVar : agz.a().b()) {
        }
        ahtVar.f19802k = System.nanoTime();
        ahtVar.f19801j.h();
        long jNanoTime = System.nanoTime();
        ahg ahgVarG = ahtVar.f19804m.g();
        if (ahtVar.f19801j.d().size() > 0) {
            for (String str : ahtVar.f19801j.d()) {
                JSONObject jSONObjectA = ahgVarG.a(null);
                View viewA = ahtVar.f19801j.a(str);
                ahg ahgVarH = ahtVar.f19804m.h();
                String strB = ahtVar.f19801j.b(str);
                if (strB != null) {
                    JSONObject jSONObjectA2 = ahgVarH.a(viewA);
                    ahn.c(jSONObjectA2, str);
                    ahn.f(jSONObjectA2, strB);
                    ahn.d(jSONObjectA, jSONObjectA2);
                }
                ahn.i(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                ahtVar.f19803l.e(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (ahtVar.f19801j.e().size() > 0) {
            JSONObject jSONObjectA3 = ahgVarG.a(null);
            ahtVar.k(null, ahgVarG, jSONObjectA3, 1, false);
            ahn.i(jSONObjectA3);
            ahtVar.f19803l.f(jSONObjectA3, ahtVar.f19801j.e(), jNanoTime);
        } else {
            ahtVar.f19803l.d();
        }
        ahtVar.f19801j.f();
        long jNanoTime2 = System.nanoTime() - ahtVar.f19802k;
        if (ahtVar.f19797f.size() > 0) {
            for (ahs ahsVar : ahtVar.f19797f) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                ahsVar.b();
                if (ahsVar instanceof ahr) {
                    ((ahr) ahsVar).a();
                }
            }
        }
    }

    private final void k(View view, ahg ahgVar, JSONObject jSONObject, int i9, boolean z9) {
        ahgVar.b(view, jSONObject, this, i9 == 1, z9);
    }

    private static final void l() {
        Handler handler = f19794c;
        if (handler != null) {
            handler.removeCallbacks(f19796e);
            f19794c = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahf
    public final void a(View view, ahg ahgVar, JSONObject jSONObject, boolean z9) {
        int iJ;
        boolean z10;
        if (com.google.ads.interactivemedia.v3.impl.data.i.c(view) != null || (iJ = this.f19801j.j(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = ahgVar.a(view);
        ahn.d(jSONObject, jSONObjectA);
        String strC = this.f19801j.c(view);
        if (strC != null) {
            ahn.c(jSONObjectA, strC);
            ahn.e(jSONObjectA, Boolean.valueOf(this.f19801j.i(view)));
            this.f19801j.g();
        } else {
            aeq aeqVarK = this.f19801j.k(view);
            if (aeqVarK != null) {
                ahn.k(jSONObjectA, aeqVarK);
                z10 = true;
            } else {
                z10 = false;
            }
            k(view, ahgVar, jSONObjectA, iJ, z9 || z10);
        }
        this.f19798g++;
    }

    public final void g() {
        l();
    }

    public final void h() {
        if (f19794c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19794c = handler;
            handler.post(f19795d);
            f19794c.postDelayed(f19796e, 200L);
        }
    }

    public final void i() {
        l();
        this.f19797f.clear();
        f19793b.post(new ahp(this));
    }
}
