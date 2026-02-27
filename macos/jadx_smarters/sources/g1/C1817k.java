package g1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1817k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f41230b;

    /* JADX INFO: renamed from: g1.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f41232b;

        public /* synthetic */ a(S s9) {
        }

        public C1817k a() {
            String str = this.f41231a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f41232b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            C1817k c1817k = new C1817k();
            c1817k.f41229a = str;
            c1817k.f41230b = this.f41232b;
            return c1817k;
        }

        public a b(List list) {
            this.f41232b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f41231a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f41229a;
    }

    public List b() {
        return this.f41230b;
    }
}
