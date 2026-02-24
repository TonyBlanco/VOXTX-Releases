package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f16311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16314d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f16315a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f16317c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16316b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f16318d = false;

        public d a() {
            if (this.f16315a == null) {
                this.f16315a = q.e(this.f16317c);
            }
            return new d(this.f16315a, this.f16316b, this.f16317c, this.f16318d);
        }

        public a b(Object obj) {
            this.f16317c = obj;
            this.f16318d = true;
            return this;
        }

        public a c(boolean z9) {
            this.f16316b = z9;
            return this;
        }

        public a d(q qVar) {
            this.f16315a = qVar;
            return this;
        }
    }

    public d(q qVar, boolean z9, Object obj, boolean z10) {
        if (!qVar.f() && z9) {
            throw new IllegalArgumentException(qVar.c() + " does not allow nullable values");
        }
        if (!z9 && z10 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + qVar.c() + " has null value but is not nullable.");
        }
        this.f16311a = qVar;
        this.f16312b = z9;
        this.f16314d = obj;
        this.f16313c = z10;
    }

    public q a() {
        return this.f16311a;
    }

    public boolean b() {
        return this.f16313c;
    }

    public void c(String str, Bundle bundle) {
        if (this.f16313c) {
            this.f16311a.i(bundle, str, this.f16314d);
        }
    }

    public boolean d(String str, Bundle bundle) {
        if (!this.f16312b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f16311a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16312b != dVar.f16312b || this.f16313c != dVar.f16313c || !this.f16311a.equals(dVar.f16311a)) {
            return false;
        }
        Object obj2 = this.f16314d;
        Object obj3 = dVar.f16314d;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public int hashCode() {
        int iHashCode = ((((this.f16311a.hashCode() * 31) + (this.f16312b ? 1 : 0)) * 31) + (this.f16313c ? 1 : 0)) * 31;
        Object obj = this.f16314d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
