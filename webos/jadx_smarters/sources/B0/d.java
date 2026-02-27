package b0;

import java.util.Map;
import kotlin.jvm.internal.l;
import l8.AbstractC2205B;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17431a;

        public a(String name) {
            l.e(name, "name");
            this.f17431a = name;
        }

        public final String a() {
            return this.f17431a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f17431a, ((a) obj).f17431a);
            }
            return false;
        }

        public int hashCode() {
            return this.f17431a.hashCode();
        }

        public String toString() {
            return this.f17431a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final C1194a c() {
        return new C1194a(AbstractC2205B.n(a()), false);
    }

    public final d d() {
        return new C1194a(AbstractC2205B.n(a()), true);
    }
}
