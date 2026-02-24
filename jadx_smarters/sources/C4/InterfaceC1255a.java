package c4;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: c4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1255a {

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    public static class C0213a extends IOException {
        public C0213a(String str) {
            super(str);
        }

        public C0213a(String str, Throwable th) {
            super(str, th);
        }

        public C0213a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: c4.a$b */
    public interface b {
        void a(InterfaceC1255a interfaceC1255a, AbstractC1264j abstractC1264j, AbstractC1264j abstractC1264j2);

        void c(InterfaceC1255a interfaceC1255a, AbstractC1264j abstractC1264j);

        void d(InterfaceC1255a interfaceC1255a, AbstractC1264j abstractC1264j);
    }

    File a(String str, long j9, long j10);

    InterfaceC1269o b(String str);

    long c(String str, long j9, long j10);

    AbstractC1264j d(String str, long j9, long j10);

    long e(String str, long j9, long j10);

    void f(String str, C1270p c1270p);

    void g(AbstractC1264j abstractC1264j);

    AbstractC1264j h(String str, long j9, long j10);

    void i(File file, long j9);

    void j(String str);
}
