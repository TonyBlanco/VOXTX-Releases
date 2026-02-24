package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ch f22616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f22617b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f22618c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f22619d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22620e = 0;

    private ch(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        cq.au(context, new cg(this), intentFilter);
    }

    public static synchronized ch b(Context context) {
        try {
            if (f22616a == null) {
                f22616a = new ch(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22616a;
    }

    public static /* bridge */ /* synthetic */ void c(ch chVar, int i9) {
        synchronized (chVar.f22619d) {
            try {
                if (chVar.f22620e == i9) {
                    return;
                }
                chVar.f22620e = i9;
                for (WeakReference weakReference : chVar.f22618c) {
                    xv xvVar = (xv) weakReference.get();
                    if (xvVar != null) {
                        xvVar.b(i9);
                    } else {
                        chVar.f22618c.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i9;
        synchronized (this.f22619d) {
            i9 = this.f22620e;
        }
        return i9;
    }

    public final void d(xv xvVar) {
        for (WeakReference weakReference : this.f22618c) {
            if (weakReference.get() == null) {
                this.f22618c.remove(weakReference);
            }
        }
        this.f22618c.add(new WeakReference(xvVar));
        this.f22617b.post(new jc(this, xvVar, 1, (byte[]) null));
    }
}
