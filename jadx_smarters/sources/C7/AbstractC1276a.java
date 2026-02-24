package c7;

import androidx.fragment.app.AbstractActivityC1145e;
import d7.C1713a;
import d7.InterfaceC1714b;

/* JADX INFO: renamed from: c7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1276a {
    public static void a(AbstractActivityC1145e abstractActivityC1145e, InterfaceC1714b interfaceC1714b) {
        abstractActivityC1145e.getSupportLoaderManager().c(2, null, new C1713a(abstractActivityC1145e, interfaceC1714b, 2));
    }

    public static void b(AbstractActivityC1145e abstractActivityC1145e, InterfaceC1714b interfaceC1714b) {
        abstractActivityC1145e.getSupportLoaderManager().c(1, null, new C1713a(abstractActivityC1145e, interfaceC1714b, 1));
    }
}
