package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class m extends BaseAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27354f = v.k().getMaximum(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f27355a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f27356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f27357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f27358e;

    public m(l lVar, d dVar, a aVar) {
        this.f27355a = lVar;
        this.f27358e = aVar;
        this.f27356c = dVar.B();
    }

    public int a(int i9) {
        return b() + (i9 - 1);
    }

    public int b() {
        return this.f27355a.r();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i9) {
        if (i9 < this.f27355a.r() || i9 > g()) {
            return null;
        }
        return Long.valueOf(this.f27355a.t(h(i9)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.e(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = R4.h.f8818m
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L73
            com.google.android.material.datepicker.l r8 = r5.f27355a
            int r3 = r8.f27351f
            if (r7 < r3) goto L2e
            goto L73
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f27355a
            long r7 = r8.t(r7)
            com.google.android.material.datepicker.l r3 = r5.f27355a
            int r3 = r3.f27349d
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.h()
            int r4 = r4.f27349d
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.f.a(r7)
        L63:
            r1.setContentDescription(r7)
            goto L6c
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.f.d(r7)
            goto L63
        L6c:
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L7b
        L73:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
        L7b:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L82
            return r1
        L82:
            long r6 = r6.longValue()
            r5.i(r1, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.f27357d == null) {
            this.f27357d = new c(context);
        }
    }

    public final boolean f(long j9) {
        throw null;
    }

    public int g() {
        return (this.f27355a.r() + this.f27355a.f27351f) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27355a.f27351f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9 / this.f27355a.f27350e;
    }

    public int h(int i9) {
        return (i9 - this.f27355a.r()) + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public final void i(TextView textView, long j9) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f27358e.f().b(j9)) {
            textView.setEnabled(true);
            if (f(j9)) {
                bVar = this.f27357d.f27271b;
            } else {
                long timeInMillis = v.i().getTimeInMillis();
                c cVar = this.f27357d;
                bVar = timeInMillis == j9 ? cVar.f27272c : cVar.f27270a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f27357d.f27276g;
        }
        bVar.b(textView);
    }

    public final void j(MaterialCalendarGridView materialCalendarGridView, long j9) {
        if (l.d(j9).equals(this.f27355a)) {
            i((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f27355a.v(j9)) - materialCalendarGridView.getFirstVisiblePosition()), j9);
        }
    }

    public void k(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f27356c.iterator();
        while (it.hasNext()) {
            j(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public boolean l(int i9) {
        return i9 >= b() && i9 <= g();
    }
}
