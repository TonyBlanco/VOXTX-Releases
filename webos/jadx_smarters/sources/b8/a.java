package B8;

import l8.x;
import r8.AbstractC2694c;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Iterable, x8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0007a f756e = new C0007a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f757a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f759d;

    /* JADX INFO: renamed from: B8.a$a, reason: collision with other inner class name */
    public static final class C0007a {
        public C0007a() {
        }

        public /* synthetic */ C0007a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(int i9, int i10, int i11) {
            return new a(i9, i10, i11);
        }
    }

    public a(int i9, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f757a = i9;
        this.f758c = AbstractC2694c.c(i9, i10, i11);
        this.f759d = i11;
    }

    public final int d() {
        return this.f757a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f757a != aVar.f757a || this.f758c != aVar.f758c || this.f759d != aVar.f759d) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f758c;
    }

    public final int g() {
        return this.f759d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f757a * 31) + this.f758c) * 31) + this.f759d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x iterator() {
        return new b(this.f757a, this.f758c, this.f759d);
    }

    public boolean isEmpty() {
        if (this.f759d > 0) {
            if (this.f757a <= this.f758c) {
                return false;
            }
        } else if (this.f757a >= this.f758c) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i9;
        if (this.f759d > 0) {
            sb = new StringBuilder();
            sb.append(this.f757a);
            sb.append("..");
            sb.append(this.f758c);
            sb.append(" step ");
            i9 = this.f759d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f757a);
            sb.append(" downTo ");
            sb.append(this.f758c);
            sb.append(" step ");
            i9 = -this.f759d;
        }
        sb.append(i9);
        return sb.toString();
    }
}
