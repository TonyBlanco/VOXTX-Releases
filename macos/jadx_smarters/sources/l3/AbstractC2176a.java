package l3;

import d4.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2176a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43886a;

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    public static final class C0372a extends AbstractC2176a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f43888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f43889d;

        public C0372a(int i9, long j9) {
            super(i9);
            this.f43887b = j9;
            this.f43888c = new ArrayList();
            this.f43889d = new ArrayList();
        }

        public void d(C0372a c0372a) {
            this.f43889d.add(c0372a);
        }

        public void e(b bVar) {
            this.f43888c.add(bVar);
        }

        public C0372a f(int i9) {
            int size = this.f43889d.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0372a c0372a = (C0372a) this.f43889d.get(i10);
                if (c0372a.f43886a == i9) {
                    return c0372a;
                }
            }
            return null;
        }

        public b g(int i9) {
            int size = this.f43888c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f43888c.get(i10);
                if (bVar.f43886a == i9) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // l3.AbstractC2176a
        public String toString() {
            return AbstractC2176a.a(this.f43886a) + " leaves: " + Arrays.toString(this.f43888c.toArray()) + " containers: " + Arrays.toString(this.f43889d.toArray());
        }
    }

    /* JADX INFO: renamed from: l3.a$b */
    public static final class b extends AbstractC2176a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M f43890b;

        public b(int i9, M m9) {
            super(i9);
            this.f43890b = m9;
        }
    }

    public AbstractC2176a(int i9) {
        this.f43886a = i9;
    }

    public static String a(int i9) {
        return "" + ((char) ((i9 >> 24) & 255)) + ((char) ((i9 >> 16) & 255)) + ((char) ((i9 >> 8) & 255)) + ((char) (i9 & 255));
    }

    public static int b(int i9) {
        return i9 & 16777215;
    }

    public static int c(int i9) {
        return (i9 >> 24) & 255;
    }

    public String toString() {
        return a(this.f43886a);
    }
}
