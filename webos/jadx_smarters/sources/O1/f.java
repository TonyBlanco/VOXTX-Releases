package O1;

import O1.j;
import Z1.l;
import android.content.Context;
import i2.C1883e;
import i2.InterfaceC1881c;
import j2.C2087m;
import j2.InterfaceC2081g;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final l f5453E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Class f5454F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Class f5455G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final j.d f5456H;

    public f(Context context, g gVar, Class cls, l lVar, Class cls2, Class cls3, C2087m c2087m, InterfaceC2081g interfaceC2081g, j.d dVar) {
        super(context, cls, w(gVar, lVar, cls2, cls3, C1883e.b()), cls3, gVar, c2087m, interfaceC2081g);
        this.f5453E = lVar;
        this.f5454F = cls2;
        this.f5455G = cls3;
        this.f5456H = dVar;
    }

    public static l2.f w(g gVar, l lVar, Class cls, Class cls2, InterfaceC1881c interfaceC1881c) {
        return new l2.e(lVar, interfaceC1881c, gVar.a(cls, cls2));
    }
}
