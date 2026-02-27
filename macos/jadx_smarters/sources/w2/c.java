package W2;

import O2.AbstractC0928w0;
import d4.AbstractC1706x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1706x f10226a;

    public class a extends AbstractC1706x {
        public a(String... strArr) {
            super(strArr);
        }

        @Override // d4.AbstractC1706x
        public void b(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.gav1");
        f10226a = new a("gav1JNI");
    }

    public static boolean a() {
        return f10226a.a();
    }
}
