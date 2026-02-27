package W0;

import Q0.k;
import Q0.l;
import X0.i;
import Z0.p;
import android.content.Context;
import android.os.Build;
import c1.InterfaceC1247a;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10202e = k.f("NetworkMeteredCtrlr");

    public e(Context context, InterfaceC1247a interfaceC1247a) {
        super(i.c(context, interfaceC1247a).d());
    }

    @Override // W0.c
    public boolean b(p pVar) {
        return pVar.f10820j.b() == l.METERED;
    }

    @Override // W0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(V0.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        k.c().a(f10202e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
