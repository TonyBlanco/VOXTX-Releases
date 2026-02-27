package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.k;
import com.nytimes.android.external.cache.l;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f37957p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f37958q = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f37964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k.r f37965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k.r f37966h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f37970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f37971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f37972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f37973o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37959a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37960b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37961c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f37962d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37963e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f37967i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f37968j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f37969k = -1;

    public class a extends u {
        @Override // com.nytimes.android.external.cache.u
        public long a() {
            return 0L;
        }
    }

    public enum b implements q {
        INSTANCE;

        @Override // com.nytimes.android.external.cache.q
        public void onRemoval(r rVar) {
        }
    }

    public enum c implements x {
        INSTANCE;

        @Override // com.nytimes.android.external.cache.x
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    public static e q() {
        return new e();
    }

    public d a() {
        c();
        b();
        return new k.m(this);
    }

    public final void b() {
        o.d(this.f37969k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    public final void c() {
        boolean z9;
        String str;
        if (this.f37964f == null) {
            z9 = this.f37963e == -1;
            str = "maximumWeight requires weigher";
        } else {
            if (!this.f37959a) {
                if (this.f37963e == -1) {
                    f37958q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                    return;
                }
                return;
            }
            z9 = this.f37963e != -1;
            str = "weigher requires maximumWeight";
        }
        o.d(z9, str);
    }

    public int d() {
        int i9 = this.f37961c;
        if (i9 == -1) {
            return 4;
        }
        return i9;
    }

    public long e() {
        long j9 = this.f37968j;
        if (j9 == -1) {
            return 0L;
        }
        return j9;
    }

    public long f() {
        long j9 = this.f37967i;
        if (j9 == -1) {
            return 0L;
        }
        return j9;
    }

    public int g() {
        int i9 = this.f37960b;
        if (i9 == -1) {
            return 16;
        }
        return i9;
    }

    public h h() {
        return (h) l.a(this.f37970l, i().defaultEquivalence());
    }

    public k.r i() {
        return (k.r) l.a(this.f37965g, k.r.STRONG);
    }

    public long j() {
        if (this.f37967i == 0 || this.f37968j == 0) {
            return 0L;
        }
        return this.f37964f == null ? this.f37962d : this.f37963e;
    }

    public long k() {
        long j9 = this.f37969k;
        if (j9 == -1) {
            return 0L;
        }
        return j9;
    }

    public q l() {
        return (q) l.a(this.f37972n, b.INSTANCE);
    }

    public u m(boolean z9) {
        u uVar = this.f37973o;
        return uVar != null ? uVar : z9 ? u.b() : f37957p;
    }

    public h n() {
        return (h) l.a(this.f37971m, o().defaultEquivalence());
    }

    public k.r o() {
        return (k.r) l.a(this.f37966h, k.r.STRONG);
    }

    public x p() {
        return (x) l.a(this.f37964f, c.INSTANCE);
    }

    public String toString() {
        l.b bVarB = l.b(this);
        int i9 = this.f37960b;
        if (i9 != -1) {
            bVarB.a("initialCapacity", i9);
        }
        int i10 = this.f37961c;
        if (i10 != -1) {
            bVarB.a("concurrencyLevel", i10);
        }
        long j9 = this.f37962d;
        if (j9 != -1) {
            bVarB.b("maximumSize", j9);
        }
        long j10 = this.f37963e;
        if (j10 != -1) {
            bVarB.b("maximumWeight", j10);
        }
        if (this.f37967i != -1) {
            bVarB.c("expireAfterWrite", this.f37967i + "ns");
        }
        if (this.f37968j != -1) {
            bVarB.c("expireAfterAccess", this.f37968j + "ns");
        }
        k.r rVar = this.f37965g;
        if (rVar != null) {
            bVarB.c("keyStrength", com.nytimes.android.external.cache.c.b(rVar.toString()));
        }
        k.r rVar2 = this.f37966h;
        if (rVar2 != null) {
            bVarB.c("valueStrength", com.nytimes.android.external.cache.c.b(rVar2.toString()));
        }
        if (this.f37970l != null) {
            bVarB.g("keyEquivalence");
        }
        if (this.f37971m != null) {
            bVarB.g("valueEquivalence");
        }
        if (this.f37972n != null) {
            bVarB.g("removalListener");
        }
        return bVarB.toString();
    }
}
