package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19397b;

    public aeq(Handler handler, no noVar) {
        this.f19397b = handler;
        this.f19396a = noVar;
    }

    public aeq(WebView webView, ViewGroup viewGroup) {
        this.f19396a = webView;
        this.f19397b = viewGroup;
    }

    public aeq(cx cxVar) {
        this.f19397b = ut.f24768a;
        this.f19396a = cxVar;
    }

    public aeq(ly lyVar, String str, byte[] bArr) {
        this.f19396a = new ArrayList();
        this.f19397b = lyVar;
        f(str);
    }

    public aeq(C1328q c1328q, SparseArray sparseArray) {
        this.f19397b = c1328q;
        SparseArray sparseArray2 = new SparseArray(c1328q.b());
        for (int i9 = 0; i9 < c1328q.b(); i9++) {
            int iA = c1328q.a(i9);
            hv hvVar = (hv) sparseArray.get(iA);
            af.s(hvVar);
            sparseArray2.append(iA, hvVar);
        }
        this.f19396a = sparseArray2;
    }

    public aeq(String str, byte[] bArr) {
        this.f19396a = str;
        this.f19397b = bArr;
    }

    public aeq(List list) {
        this.f19396a = list;
        this.f19397b = new aae[list.size()];
    }

    public aeq(byte[] bArr, String str) {
        this.f19396a = bArr;
        this.f19397b = str;
    }

    public final void a(long j9, cj cjVar) {
        if (cjVar.a() < 9) {
            return;
        }
        int iE = cjVar.e();
        int iE2 = cjVar.e();
        int i9 = cjVar.i();
        if (iE == 434 && iE2 == 1195456820 && i9 == 3) {
            fz.m(j9, cjVar, (aae[]) this.f19397b);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void b(zk zkVar, aet aetVar) {
        for (int i9 = 0; i9 < ((aae[]) this.f19397b).length; i9++) {
            aetVar.c();
            aae aaeVarI = zkVar.i(aetVar.a(), 3);
            C1333s c1333s = (C1333s) this.f19396a.get(i9);
            String str = c1333s.f24467l;
            boolean z9 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z9 = false;
            }
            af.v(z9, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            r rVar = new r();
            rVar.S(aetVar.b());
            rVar.ae(str);
            rVar.ag(c1333s.f24459d);
            rVar.V(c1333s.f24458c);
            rVar.F(c1333s.f24453D);
            rVar.T(c1333s.f24469n);
            aaeVarI.b(rVar.v());
            ((aae[]) this.f19397b)[i9] = aaeVarI;
        }
    }

    public final void c() {
        ((WebView) this.f19396a).setVisibility(4);
    }

    public final void d() {
        if (((ViewGroup) ((WebView) this.f19396a).getParent()) == null) {
            Object obj = this.f19397b;
            ViewGroup viewGroup = (ViewGroup) obj;
            viewGroup.addView((View) this.f19396a, new ViewGroup.LayoutParams(-1, -1));
        }
        ((WebView) this.f19396a).setVisibility(0);
        ((ViewGroup) this.f19397b).bringChildToFront((View) this.f19396a);
    }

    public final ArrayList e() {
        return (ArrayList) this.f19396a;
    }

    public final void f(String str) {
        ((ArrayList) this.f19396a).add(str);
    }

    public final ly g() {
        return (ly) this.f19397b;
    }

    public final String h() {
        return (String) this.f19397b;
    }

    public final byte[] i() {
        return (byte[]) this.f19396a;
    }

    public final int j(int i9) {
        return ((C1328q) this.f19397b).a(i9);
    }

    public final int k() {
        return ((C1328q) this.f19397b).b();
    }

    public final hv l(int i9) {
        hv hvVar = (hv) ((SparseArray) this.f19396a).get(i9);
        af.s(hvVar);
        return hvVar;
    }

    public final boolean m(int i9) {
        return ((C1328q) this.f19397b).c(i9);
    }

    public final ku n(xd xdVar, lu luVar, ly lyVar, int i9, int[] iArr, we weVar, int i10, long j9, boolean z9, List list, lq lqVar, dw dwVar, iw iwVar) {
        de deVarA = ((df) this.f19396a).a();
        if (dwVar != null) {
            deVarA.f(dwVar);
        }
        return new lm(xdVar, luVar, lyVar, i9, iArr, weVar, i10, deVarA, j9, z9, list, lqVar, null);
    }
}
