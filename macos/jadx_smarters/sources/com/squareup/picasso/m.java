package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class m implements InterfaceC1610d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f39109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39115g;

    public m(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f39110b = i9;
        this.f39109a = new LinkedHashMap(0, 0.75f, true);
    }

    public m(Context context) {
        this(G.b(context));
    }

    @Override // com.squareup.picasso.InterfaceC1610d
    public final synchronized int a() {
        return this.f39110b;
    }

    @Override // com.squareup.picasso.InterfaceC1610d
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            try {
                this.f39112d++;
                this.f39111c += G.k(bitmap);
                Bitmap bitmap2 = (Bitmap) this.f39109a.put(str, bitmap);
                if (bitmap2 != null) {
                    this.f39111c -= G.k(bitmap2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f39110b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f39111c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap r0 = r3.f39109a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f39111c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r4 = move-exception
            goto L74
        L14:
            int r0 = r3.f39111c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L53
            java.util.LinkedHashMap r0 = r3.f39109a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap r0 = r3.f39109a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r2 = r3.f39109a     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = r3.f39111c     // Catch: java.lang.Throwable -> L12
            int r0 = com.squareup.picasso.G.k(r0)     // Catch: java.lang.Throwable -> L12
            int r1 = r1 - r0
            r3.f39111c = r1     // Catch: java.lang.Throwable -> L12
            int r0 = r3.f39113e     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f39113e = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L53:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.m.c(int):void");
    }

    @Override // com.squareup.picasso.InterfaceC1610d
    public Bitmap get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmap = (Bitmap) this.f39109a.get(str);
                if (bitmap != null) {
                    this.f39114f++;
                    return bitmap;
                }
                this.f39115g++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.squareup.picasso.InterfaceC1610d
    public final synchronized int size() {
        return this.f39111c;
    }
}
