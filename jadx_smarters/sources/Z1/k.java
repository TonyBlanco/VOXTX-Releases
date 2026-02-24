package Z1;

import java.util.Queue;
import q2.AbstractC2539h;
import q2.C2536e;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2536e f10890a;

    public class a extends C2536e {
        public a(int i9) {
            super(i9);
        }

        @Override // q2.C2536e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Queue f10892d = AbstractC2539h.c(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10895c;

        public static b a(Object obj, int i9, int i10) {
            b bVar = (b) f10892d.poll();
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i9, i10);
            return bVar;
        }

        public final void b(Object obj, int i9, int i10) {
            this.f10895c = obj;
            this.f10894b = i9;
            this.f10893a = i10;
        }

        public void c() {
            f10892d.offer(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10894b == bVar.f10894b && this.f10893a == bVar.f10893a && this.f10895c.equals(bVar.f10895c);
        }

        public int hashCode() {
            return (((this.f10893a * 31) + this.f10894b) * 31) + this.f10895c.hashCode();
        }
    }

    public k(int i9) {
        this.f10890a = new a(i9);
    }

    public Object a(Object obj, int i9, int i10) {
        b bVarA = b.a(obj, i9, i10);
        Object objG = this.f10890a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i9, int i10, Object obj2) {
        this.f10890a.k(b.a(obj, i9, i10), obj2);
    }
}
