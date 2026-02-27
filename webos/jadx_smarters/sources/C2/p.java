package C2;

import C2.d;
import android.util.Base64;
import z2.EnumC3016d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC3016d enumC3016d);
    }

    public static a a() {
        return new d.b().d(EnumC3016d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC3016d d();

    public boolean e() {
        return c() != null;
    }

    public p f(EnumC3016d enumC3016d) {
        return a().b(b()).d(enumC3016d).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
