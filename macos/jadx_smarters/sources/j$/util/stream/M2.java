package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class M2 extends E2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f42481d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42481d.add(obj);
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        List.EL.sort(this.f42481d, this.f42417b);
        long size = this.f42481d.size();
        InterfaceC2018q2 interfaceC2018q2 = this.f42708a;
        interfaceC2018q2.m(size);
        if (this.f42418c) {
            for (Object obj : this.f42481d) {
                if (interfaceC2018q2.o()) {
                    break;
                } else {
                    interfaceC2018q2.accept(obj);
                }
            }
        } else {
            java.util.List list = this.f42481d;
            Objects.requireNonNull(interfaceC2018q2);
            C1935a c1935a = new C1935a(interfaceC2018q2, 1);
            if (list instanceof Collection) {
                ((Collection) list).forEach(c1935a);
            } else {
                Objects.requireNonNull(c1935a);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c1935a.accept(it.next());
                }
            }
        }
        interfaceC2018q2.l();
        this.f42481d = null;
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42481d = j9 >= 0 ? new ArrayList((int) j9) : new ArrayList();
    }
}
