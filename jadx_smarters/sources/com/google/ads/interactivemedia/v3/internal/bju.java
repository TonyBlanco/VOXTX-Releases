package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bju {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final bkj f21588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bkj f21589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LinkedList f21590l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bky f21579a = bky.f21629a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21591m = bkg.f21598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjm f21580b = bjl.IDENTITY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21581c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f21582d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f21583e = new ArrayList();

    public bju() {
        int i9 = bjt.f21572e;
        this.f21584f = 2;
        this.f21585g = 2;
        this.f21586h = true;
        this.f21587i = true;
        this.f21588j = bjt.f21570a;
        this.f21589k = bjt.f21571b;
        this.f21590l = new LinkedList();
    }

    public final bjt a() {
        ArrayList arrayList = new ArrayList(this.f21582d.size() + this.f21583e.size() + 3);
        arrayList.addAll(this.f21582d);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f21583e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z9 = boe.f21816a;
        bky bkyVar = this.f21579a;
        bjm bjmVar = this.f21580b;
        HashMap map = new HashMap(this.f21581c);
        int i9 = this.f21591m;
        new ArrayList(this.f21582d);
        new ArrayList(this.f21583e);
        return new bjt(bkyVar, bjmVar, map, true, true, i9, arrayList, this.f21588j, this.f21589k, new ArrayList(this.f21590l));
    }

    public final void b(Type type, Object obj) {
        boolean z9 = obj instanceof bke;
        boolean z10 = true;
        if (!z9 && !(obj instanceof bjx) && !(obj instanceof bjv) && !(obj instanceof bkl)) {
            z10 = false;
        }
        bjh.d(z10);
        if (obj instanceof bjv) {
            this.f21581c.put(type, (bjv) obj);
        }
        if (z9 || (obj instanceof bjx)) {
            this.f21582d.add(bmo.a(bof.b(type), obj));
        }
        if (obj instanceof bkl) {
            this.f21582d.add(bnw.a(bof.b(type), (bkl) obj));
        }
    }

    public final void c(bkm bkmVar) {
        this.f21582d.add(bkmVar);
    }

    public final void d(com.google.ads.interactivemedia.v3.impl.data.k kVar) {
        this.f21579a = this.f21579a.e(kVar);
    }
}
