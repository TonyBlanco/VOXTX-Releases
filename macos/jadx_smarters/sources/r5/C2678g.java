package r5;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: r5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2678g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49728a;

    /* JADX INFO: renamed from: r5.g$a */
    public class a extends C2678g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2678g c2678g, String str) {
            super(c2678g, null);
            this.f49729b = str;
        }

        @Override // r5.C2678g
        public CharSequence h(Object obj) {
            return obj == null ? this.f49729b : C2678g.this.h(obj);
        }

        @Override // r5.C2678g
        public C2678g i(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public C2678g(String str) {
        this.f49728a = (String) m.k(str);
    }

    public C2678g(C2678g c2678g) {
        this.f49728a = c2678g.f49728a;
    }

    public /* synthetic */ C2678g(C2678g c2678g, a aVar) {
        this(c2678g);
    }

    public static C2678g f(char c9) {
        return new C2678g(String.valueOf(c9));
    }

    public static C2678g g(String str) {
        return new C2678g(str);
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        m.k(appendable);
        if (it.hasNext()) {
            while (true) {
                appendable.append(h(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(this.f49728a);
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterable iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    public CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public C2678g i(String str) {
        m.k(str);
        return new a(this, str);
    }
}
