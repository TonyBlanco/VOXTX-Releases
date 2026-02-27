package r5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static class b implements n, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f49733a;

        public b(List list) {
            this.f49733a = list;
        }

        @Override // r5.n
        public boolean apply(Object obj) {
            for (int i9 = 0; i9 < this.f49733a.size(); i9++) {
                if (!((n) this.f49733a.get(i9)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f49733a.equals(((b) obj).f49733a);
            }
            return false;
        }

        public int hashCode() {
            return this.f49733a.hashCode() + 306654252;
        }

        public String toString() {
            return o.d("and", this.f49733a);
        }
    }

    public static n b(n nVar, n nVar2) {
        return new b(c((n) m.k(nVar), (n) m.k(nVar2)));
    }

    public static List c(n nVar, n nVar2) {
        return Arrays.asList(nVar, nVar2);
    }

    public static String d(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z9 = true;
        for (Object obj : iterable) {
            if (!z9) {
                sb.append(',');
            }
            sb.append(obj);
            z9 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
