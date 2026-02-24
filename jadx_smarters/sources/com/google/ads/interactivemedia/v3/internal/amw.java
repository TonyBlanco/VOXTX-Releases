package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class amw implements amv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static volatile anw f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MotionEvent f20278b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected double f20287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f20288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f20289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected float f20290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f20291o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected DisplayMetrics f20293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double f20294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double f20295s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final LinkedList f20279c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f20280d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f20281e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f20282f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f20283g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f20284h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f20285i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected long f20286j = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20296t = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f20292p = false;

    public amw(Context context) {
        try {
            if (((Boolean) aqo.f20546u.f()).booleanValue()) {
                amc.c();
            } else {
                any.a(f20277a);
            }
            this.f20293q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void j() {
        this.f20284h = 0L;
        this.f20280d = 0L;
        this.f20281e = 0L;
        this.f20282f = 0L;
        this.f20283g = 0L;
        this.f20285i = 0L;
        this.f20286j = 0L;
        if (this.f20279c.size() > 0) {
            Iterator it = this.f20279c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f20279c.clear();
        } else {
            MotionEvent motionEvent = this.f20278b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f20278b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: Exception -> 0x00e5, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e5, blocks: (B:45:0x00b3, B:48:0x00c0, B:56:0x00dc, B:59:0x00e9), top: B:72:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String m(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26, byte[] r27) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.amw.m(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr) throws anp;

    public abstract anz b(MotionEvent motionEvent) throws anp;

    public abstract agl c(Context context, View view, Activity activity);

    public abstract agl d(Context context, afm afmVar);

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String e(Context context, String str, View view, Activity activity) {
        return m(context, str, 3, view, activity, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String f(Context context) {
        if (aoa.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return m(context, null, 1, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String g(Context context, byte[] bArr) {
        if (aoa.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return m(context, null, 1, null, null, bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String h(Context context, View view, Activity activity) {
        return m(context, null, 2, view, activity, null);
    }

    public abstract agl i(Context context, View view, Activity activity);

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final synchronized void k(MotionEvent motionEvent) {
        Long l9;
        try {
            if (this.f20296t) {
                j();
                this.f20296t = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20287k = 0.0d;
                this.f20294r = motionEvent.getRawX();
                this.f20295s = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d9 = rawX - this.f20294r;
                double d10 = rawY - this.f20295s;
                this.f20287k += Math.sqrt((d9 * d9) + (d10 * d10));
                this.f20294r = rawX;
                this.f20295s = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f20278b = motionEventObtain;
                        this.f20279c.add(motionEventObtain);
                        if (this.f20279c.size() > 6) {
                            ((MotionEvent) this.f20279c.remove()).recycle();
                        }
                        this.f20282f++;
                        this.f20284h = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f20281e += (long) (motionEvent.getHistorySize() + 1);
                        anz anzVarB = b(motionEvent);
                        Long l10 = anzVarB.f20390d;
                        if (l10 != null && anzVarB.f20393g != null) {
                            this.f20285i += l10.longValue() + anzVarB.f20393g.longValue();
                        }
                        if (this.f20293q != null && (l9 = anzVarB.f20391e) != null && anzVarB.f20394h != null) {
                            this.f20286j += l9.longValue() + anzVarB.f20394h.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f20283g++;
                    }
                } catch (anp unused) {
                }
            } else {
                this.f20288l = motionEvent.getX();
                this.f20289m = motionEvent.getY();
                this.f20290n = motionEvent.getRawX();
                this.f20291o = motionEvent.getRawY();
                this.f20280d++;
            }
            this.f20292p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final synchronized void l(int i9, int i10, int i11) {
        try {
            if (this.f20278b != null) {
                if (((Boolean) aqo.f20533h.f()).booleanValue()) {
                    j();
                } else {
                    this.f20278b.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f20293q;
            if (displayMetrics != null) {
                float f9 = displayMetrics.density;
                this.f20278b = MotionEvent.obtain(0L, i11, 1, i9 * f9, i10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f20278b = null;
            }
            this.f20292p = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public void n(View view) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean q() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean s() {
        return true;
    }
}
