package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1607a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f39038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f39039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f39044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f39045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f39046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39048l;

    /* JADX INFO: renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    public static class C0306a extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1607a f39049a;

        public C0306a(AbstractC1607a abstractC1607a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f39049a = abstractC1607a;
        }
    }

    public AbstractC1607a(t tVar, Object obj, w wVar, int i9, int i10, int i11, Drawable drawable, String str, Object obj2, boolean z9) {
        this.f39037a = tVar;
        this.f39038b = wVar;
        this.f39039c = obj == null ? null : new C0306a(this, obj, tVar.f39137k);
        this.f39041e = i9;
        this.f39042f = i10;
        this.f39040d = z9;
        this.f39043g = i11;
        this.f39044h = drawable;
        this.f39045i = str;
        this.f39046j = obj2 == null ? this : obj2;
    }

    public void a() {
        this.f39048l = true;
    }

    public abstract void b(Bitmap bitmap, t.e eVar);

    public abstract void c();

    public String d() {
        return this.f39045i;
    }

    public int e() {
        return this.f39041e;
    }

    public int f() {
        return this.f39042f;
    }

    public t g() {
        return this.f39037a;
    }

    public t.f h() {
        return this.f39038b.f39184r;
    }

    public w i() {
        return this.f39038b;
    }

    public Object j() {
        return this.f39046j;
    }

    public Object k() {
        WeakReference weakReference = this.f39039c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.f39048l;
    }

    public boolean m() {
        return this.f39047k;
    }
}
