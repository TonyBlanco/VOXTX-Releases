package C3;

import C3.h;
import O2.H0;
import O2.InterfaceC0920t1;
import a4.InterfaceC1088b;
import b4.C1227s;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    public interface a {
        void a(C3.b bVar);

        void b(h.a aVar, C1227s c1227s);

        void c();

        void d();
    }

    public interface b {
        e a(H0.b bVar);
    }

    void a(h hVar, int i9, int i10);

    void b(h hVar, int i9, int i10, IOException iOException);

    void c(int... iArr);

    void d(h hVar, a aVar);

    void e(h hVar, C1227s c1227s, Object obj, InterfaceC1088b interfaceC1088b, a aVar);

    void f(InterfaceC0920t1 interfaceC0920t1);

    void release();
}
