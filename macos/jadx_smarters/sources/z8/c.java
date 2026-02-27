package z8;

import java.io.Serializable;
import kotlin.jvm.internal.g;
import r8.AbstractC2693b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f52855a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f52856c = AbstractC2693b.f49801a.b();

    public static final class a extends c implements Serializable {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        @Override // z8.c
        public int b(int i9) {
            return c.f52856c.b(i9);
        }

        @Override // z8.c
        public int c() {
            return c.f52856c.c();
        }

        @Override // z8.c
        public int d(int i9, int i10) {
            return c.f52856c.d(i9, i10);
        }
    }

    public abstract int b(int i9);

    public abstract int c();

    public int d(int i9, int i10) {
        int iC;
        int i11;
        int iB;
        d.b(i9, i10);
        int i12 = i10 - i9;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                iB = b(d.c(i12));
            } else {
                do {
                    iC = c() >>> 1;
                    i11 = iC % i12;
                } while ((iC - i11) + (i12 - 1) < 0);
                iB = i11;
            }
            return i9 + iB;
        }
        while (true) {
            int iC2 = c();
            if (i9 <= iC2 && iC2 < i10) {
                return iC2;
            }
        }
    }
}
