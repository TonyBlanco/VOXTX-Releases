package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import x.C2944a;
import x.e;
import z.d;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2944a f14250l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f14250l = new C2944a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f52345a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == d.f52387h1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f52381g1) {
                    this.f14250l.K0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == d.f52393i1) {
                    this.f14250l.M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f14362e = this.f14250l;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public void f(e eVar, boolean z9) {
        m(eVar, this.f14248j, z9);
    }

    public int getMargin() {
        return this.f14250l.I0();
    }

    public int getType() {
        return this.f14248j;
    }

    public boolean l() {
        return this.f14250l.G0();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(x.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f14249k = r5
            r5 = 0
            r0 = 6
            r1 = 1
            r2 = 5
            if (r6 == 0) goto L14
            int r6 = r3.f14248j
            if (r6 != r2) goto Lf
        Lc:
            r3.f14249k = r1
            goto L1c
        Lf:
            if (r6 != r0) goto L1c
        L11:
            r3.f14249k = r5
            goto L1c
        L14:
            int r6 = r3.f14248j
            if (r6 != r2) goto L19
            goto L11
        L19:
            if (r6 != r0) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof x.C2944a
            if (r5 == 0) goto L27
            x.a r4 = (x.C2944a) r4
            int r5 = r3.f14249k
            r4.L0(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m(x.e, int, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f14250l.K0(z9);
    }

    public void setDpMargin(int i9) {
        this.f14250l.M0((int) ((i9 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i9) {
        this.f14250l.M0(i9);
    }

    public void setType(int i9) {
        this.f14248j = i9;
    }
}
