package Q5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i9, L5.e eVar) {
            return new y(str, str2, str3, str4, i9, eVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract L5.e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class b {
        public static b c(int i9, String str, int i10, long j9, long j10, boolean z9, int i11, String str2, String str3) {
            return new z(i9, str, i10, j9, j10, z9, i11, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static c a(String str, String str2, boolean z9) {
            return new A(str, str2, z9);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static D b(a aVar, c cVar, b bVar) {
        return new x(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
