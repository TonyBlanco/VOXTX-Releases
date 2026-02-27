package kotlinx.coroutines.sync;

import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void a(b bVar, Object obj, int i9, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i9 & 1) != 0) {
                obj = null;
            }
            bVar.c(obj);
        }
    }

    Object a(Object obj, InterfaceC2372d interfaceC2372d);

    boolean b();

    void c(Object obj);
}
