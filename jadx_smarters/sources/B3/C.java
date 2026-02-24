package B3;

import O2.H0;
import O2.Q1;
import P2.v0;
import V2.InterfaceC1065w;
import android.os.Handler;
import b4.InterfaceC1211b;

/* JADX INFO: loaded from: classes3.dex */
public interface C {

    public interface a {
        a a(b4.F f9);

        C b(H0 h02);

        int[] c();

        a d(V2.B b9);
    }

    public static final class b extends A {
        public b(A a9) {
            super(a9);
        }

        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i9, int i10, long j9) {
            super(obj, i9, i10, j9);
        }

        public b(Object obj, long j9) {
            super(obj, j9);
        }

        public b(Object obj, long j9, int i9) {
            super(obj, j9, i9);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }
    }

    public interface c {
        void J(C c9, Q1 q12);
    }

    void A(Handler handler, InterfaceC1065w interfaceC1065w);

    void B(c cVar);

    InterfaceC0517z E(b bVar, InterfaceC1211b interfaceC1211b, long j9);

    void F(c cVar);

    void P();

    boolean S();

    Q1 U();

    void V(c cVar);

    void Y(InterfaceC0517z interfaceC0517z);

    void a(c cVar, b4.S s9, v0 v0Var);

    H0 e();

    void k(Handler handler, J j9);

    void u(J j9);

    void z(InterfaceC1065w interfaceC1065w);
}
