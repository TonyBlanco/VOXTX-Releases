package com.google.ads.interactivemedia.v3.internal;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f25054a = xg.f25049b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f25055b = xg.f25048a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25062i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25056c = AdError.SERVER_ERROR_CODE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xh[] f25058e = new xh[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f25057d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25059f = -1;

    public xi(int i9) {
    }

    public final void a(int i9, float f9) {
        xh xhVar;
        int i10;
        xh xhVar2;
        int i11;
        if (this.f25059f != 1) {
            Collections.sort(this.f25057d, f25054a);
            this.f25059f = 1;
        }
        int i12 = this.f25062i;
        if (i12 > 0) {
            xh[] xhVarArr = this.f25058e;
            int i13 = i12 - 1;
            this.f25062i = i13;
            xhVar = xhVarArr[i13];
        } else {
            xhVar = new xh(null);
        }
        int i14 = this.f25060g;
        this.f25060g = i14 + 1;
        xhVar.f25051a = i14;
        xhVar.f25052b = i9;
        xhVar.f25053c = f9;
        this.f25057d.add(xhVar);
        int i15 = this.f25061h + i9;
        while (true) {
            this.f25061h = i15;
            while (true) {
                int i16 = this.f25061h;
                if (i16 <= 2000) {
                    return;
                }
                i10 = i16 - 2000;
                xhVar2 = (xh) this.f25057d.get(0);
                i11 = xhVar2.f25052b;
                if (i11 <= i10) {
                    this.f25061h -= i11;
                    this.f25057d.remove(0);
                    int i17 = this.f25062i;
                    if (i17 < 5) {
                        xh[] xhVarArr2 = this.f25058e;
                        this.f25062i = i17 + 1;
                        xhVarArr2[i17] = xhVar2;
                    }
                }
            }
            xhVar2.f25052b = i11 - i10;
            i15 = this.f25061h - i10;
        }
    }

    public final void b() {
        this.f25057d.clear();
        this.f25059f = -1;
        this.f25060g = 0;
        this.f25061h = 0;
    }

    public final float c() {
        if (this.f25059f != 0) {
            Collections.sort(this.f25057d, f25055b);
            this.f25059f = 0;
        }
        float f9 = this.f25061h * 0.5f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f25057d.size(); i10++) {
            xh xhVar = (xh) this.f25057d.get(i10);
            i9 += xhVar.f25052b;
            if (i9 >= f9) {
                return xhVar.f25053c;
            }
        }
        if (this.f25057d.isEmpty()) {
            return Float.NaN;
        }
        return ((xh) this.f25057d.get(r0.size() - 1)).f25053c;
    }
}
