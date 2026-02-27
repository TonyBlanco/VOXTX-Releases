package W0;

import Q0.l;
import X0.i;
import Z0.p;
import android.content.Context;
import android.os.Build;
import c1.InterfaceC1247a;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    public d(Context context, InterfaceC1247a interfaceC1247a) {
        super(i.c(context, interfaceC1247a).d());
    }

    @Override // W0.c
    public boolean b(p pVar) {
        return pVar.f10820j.b() == l.CONNECTED;
    }

    @Override // W0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(V0.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
