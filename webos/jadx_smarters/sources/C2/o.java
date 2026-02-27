package C2;

import C2.c;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(C3014b c3014b);

        public abstract a c(AbstractC3015c abstractC3015c);

        public abstract a d(InterfaceC3017e interfaceC3017e);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C3014b b();

    public abstract AbstractC3015c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract InterfaceC3017e e();

    public abstract p f();

    public abstract String g();
}
