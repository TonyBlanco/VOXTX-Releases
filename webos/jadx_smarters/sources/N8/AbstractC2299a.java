package n8;

import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: n8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2299a {

    /* JADX INFO: renamed from: n8.a$a, reason: collision with other inner class name */
    public static final class C0399a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w8.a f45663a;

        public C0399a(w8.a aVar) {
            this.f45663a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f45663a.invoke();
        }
    }

    public static final Thread a(boolean z9, boolean z10, ClassLoader classLoader, String str, int i9, w8.a block) {
        l.e(block, "block");
        C0399a c0399a = new C0399a(block);
        if (z10) {
            c0399a.setDaemon(true);
        }
        if (i9 > 0) {
            c0399a.setPriority(i9);
        }
        if (str != null) {
            c0399a.setName(str);
        }
        if (classLoader != null) {
            c0399a.setContextClassLoader(classLoader);
        }
        if (z9) {
            c0399a.start();
        }
        return c0399a;
    }
}
