package s5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {

    public class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f50005a;

        public a(int i9) {
            this.f50005a = i9;
        }

        @Override // s5.K.e
        public Map c() {
            return S.c(this.f50005a);
        }
    }

    public class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f50006a;

        public b(Comparator comparator) {
            this.f50006a = comparator;
        }

        @Override // s5.K.e
        public Map c() {
            return new TreeMap(this.f50006a);
        }
    }

    public static final class c implements r5.r, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50007a;

        public c(int i9) {
            this.f50007a = AbstractC2731l.b(i9, "expectedValuesPerKey");
        }

        @Override // r5.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f50007a);
        }
    }

    public static abstract class d extends K {
        public d() {
            super(null);
        }

        public abstract F e();
    }

    public static abstract class e {

        public class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f50008a;

            public a(int i9) {
                this.f50008a = i9;
            }

            @Override // s5.K.d
            public F e() {
                return L.b(e.this.c(), new c(this.f50008a));
            }
        }

        public d a() {
            return b(2);
        }

        public d b(int i9) {
            AbstractC2731l.b(i9, "expectedValuesPerKey");
            return new a(i9);
        }

        public abstract Map c();
    }

    public K() {
    }

    public /* synthetic */ K(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i9) {
        AbstractC2731l.b(i9, "expectedKeys");
        return new a(i9);
    }

    public static e c() {
        return d(Q.c());
    }

    public static e d(Comparator comparator) {
        r5.m.k(comparator);
        return new b(comparator);
    }
}
