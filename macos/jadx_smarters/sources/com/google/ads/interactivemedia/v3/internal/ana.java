package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Hide;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ana implements Runnable, amv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aru f20304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f20305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aff f20306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20307g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f20302b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CountDownLatch f20301a = new CountDownLatch(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f20308h = new ArrayList();

    public ana(Context context, Executor executor, aff affVar) {
        this.f20306f = affVar;
        this.f20303c = context;
        this.f20305e = executor;
        aqo.a(context);
        boolean z9 = ((Boolean) aqo.f20528c.f()).booleanValue() && affVar.d();
        this.f20307g = z9;
        this.f20304d = aru.a(context, executor, z9);
        executor.execute(this);
    }

    private final void d() {
        if (this.f20308h.isEmpty() || this.f20302b.get() == null) {
            return;
        }
        for (Object[] objArr : this.f20308h) {
            int length = objArr.length;
            if (length == 1) {
                ((amv) this.f20302b.get()).k((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((amv) this.f20302b.get()).l(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f20308h.clear();
    }

    private static final Context i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void j() {
        this.f20302b.set(anc.j(this.f20306f.b(), i(this.f20303c), this.f20306f.c()));
    }

    public final amv a() {
        return (amv) this.f20302b.get();
    }

    public final /* synthetic */ void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ams.a(this.f20306f.b(), i(this.f20303c), this.f20306f.c(), this.f20307g).o();
        } catch (NullPointerException e9) {
            this.f20304d.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    @Deprecated
    public final String e(Context context, String str, View view, Activity activity) {
        if (!s()) {
            return "";
        }
        d();
        return ((amv) this.f20302b.get()).e(i(context), str, view, activity);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String f(Context context) {
        return g(context, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String g(Context context, byte[] bArr) {
        if (!s()) {
            return "";
        }
        d();
        return ((amv) this.f20302b.get()).f(i(context));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final String h(Context context, View view, Activity activity) {
        return s() ? ((amv) this.f20302b.get()).h(context, view, activity) : "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void k(MotionEvent motionEvent) {
        if (this.f20302b.get() == null) {
            this.f20308h.add(new Object[]{motionEvent});
        } else {
            d();
            ((amv) this.f20302b.get()).k(motionEvent);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void l(int i9, int i10, int i11) {
        if (this.f20302b.get() == null) {
            this.f20308h.add(new Object[]{Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)});
        } else {
            d();
            ((amv) this.f20302b.get()).l(i9, i10, i11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final void n(View view) {
        if (this.f20302b.get() != null) {
            ((amv) this.f20302b.get()).n(view);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean q() {
        return this.f20301a.getCount() == 0 && this.f20302b.get() != null && ((amv) this.f20302b.get()).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: all -> 0x0018, NullPointerException -> 0x001b, TRY_ENTER, TryCatch #0 {NullPointerException -> 0x001b, blocks: (B:3:0x0005, B:7:0x0015, B:18:0x0050, B:23:0x0059, B:25:0x007e, B:27:0x0086, B:28:0x008a, B:30:0x0097, B:33:0x00a9, B:12:0x001e, B:14:0x0045, B:17:0x004e, B:34:0x00aa), top: B:42:0x0005, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ana.run():void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.amv
    public final boolean s() {
        try {
            this.f20301a.await();
            if (this.f20302b.get() != null) {
                return ((amv) this.f20302b.get()).s();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
