package d3;

import O2.C0936z0;
import b4.InterfaceC1220k;
import d4.M;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface w {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f39613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39615d;

        public a(int i9, byte[] bArr, int i10, int i11) {
            this.f39612a = i9;
            this.f39613b = bArr;
            this.f39614c = i10;
            this.f39615d = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39612a == aVar.f39612a && this.f39614c == aVar.f39614c && this.f39615d == aVar.f39615d && Arrays.equals(this.f39613b, aVar.f39613b);
        }

        public int hashCode() {
            return (((((this.f39612a * 31) + Arrays.hashCode(this.f39613b)) * 31) + this.f39614c) * 31) + this.f39615d;
        }
    }

    int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9);

    void b(M m9, int i9);

    void c(M m9, int i9, int i10);

    void d(C0936z0 c0936z0);

    int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10);

    void f(long j9, int i9, int i10, int i11, a aVar);
}
