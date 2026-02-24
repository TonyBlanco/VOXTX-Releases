package Q0;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z0.p f7469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f7470c;

    public static abstract class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Z0.p f7473c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class f7475e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7471a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set f7474d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f7472b = UUID.randomUUID();

        public a(Class cls) {
            this.f7475e = cls;
            this.f7473c = new Z0.p(this.f7472b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.f7474d.add(str);
            return d();
        }

        public final v b() {
            v vVarC = c();
            b bVar = this.f7473c.f10820j;
            int i9 = Build.VERSION.SDK_INT;
            boolean z9 = (i9 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i9 >= 23 && bVar.h());
            if (this.f7473c.f10827q && z9) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f7472b = UUID.randomUUID();
            Z0.p pVar = new Z0.p(this.f7473c);
            this.f7473c = pVar;
            pVar.f10811a = this.f7472b.toString();
            return vVarC;
        }

        public abstract v c();

        public abstract a d();

        public final a e(b bVar) {
            this.f7473c.f10820j = bVar;
            return d();
        }

        public a f(long j9, TimeUnit timeUnit) {
            this.f7473c.f10817g = timeUnit.toMillis(j9);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f7473c.f10817g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a g(androidx.work.b bVar) {
            this.f7473c.f10815e = bVar;
            return d();
        }
    }

    public v(UUID uuid, Z0.p pVar, Set set) {
        this.f7468a = uuid;
        this.f7469b = pVar;
        this.f7470c = set;
    }

    public String a() {
        return this.f7468a.toString();
    }

    public Set b() {
        return this.f7470c;
    }

    public Z0.p c() {
        return this.f7469b;
    }
}
