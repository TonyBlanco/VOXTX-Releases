package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f16309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f16310c;

    public c(int i9) {
        this(i9, null);
    }

    public c(int i9, p pVar) {
        this(i9, pVar, null);
    }

    public c(int i9, p pVar, Bundle bundle) {
        this.f16308a = i9;
        this.f16309b = pVar;
        this.f16310c = bundle;
    }

    public Bundle a() {
        return this.f16310c;
    }

    public int b() {
        return this.f16308a;
    }

    public p c() {
        return this.f16309b;
    }

    public void d(Bundle bundle) {
        this.f16310c = bundle;
    }

    public void e(p pVar) {
        this.f16309b = pVar;
    }
}
