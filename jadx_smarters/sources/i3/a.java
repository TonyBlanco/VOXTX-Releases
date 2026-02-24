package I3;

import J3.f;
import J3.g;
import J3.h;
import J3.i;
import O2.H0;
import android.net.Uri;
import b4.C1227s;
import b4.I;
import b4.InterfaceC1224o;
import c4.C1257c;
import d4.b0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import z3.AbstractC3027G;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC3027G {
    public a(H0 h02, I.a aVar, C1257c.C0215c c0215c, Executor executor, long j9) {
        super(h02, aVar, c0215c, executor, j9);
    }

    public a(H0 h02, C1257c.C0215c c0215c, Executor executor) {
        this(h02, new i(), c0215c, executor, 20000L);
    }

    public final void l(List list, List list2) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            list2.add(AbstractC3027G.f((Uri) list.get(i9)));
        }
    }

    public final void m(f fVar, f.d dVar, HashSet hashSet, ArrayList arrayList) {
        String str = fVar.f3191a;
        long j9 = fVar.f3132h + dVar.f3158f;
        String str2 = dVar.f3160h;
        if (str2 != null) {
            Uri uriE = b0.e(str, str2);
            if (hashSet.add(uriE)) {
                arrayList.add(new AbstractC3027G.c(j9, AbstractC3027G.f(uriE)));
            }
        }
        arrayList.add(new AbstractC3027G.c(j9, new C1227s(b0.e(str, dVar.f3154a), dVar.f3162j, dVar.f3163k)));
    }

    @Override // z3.AbstractC3027G
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List h(InterfaceC1224o interfaceC1224o, h hVar, boolean z9) throws IOException {
        ArrayList<C1227s> arrayList = new ArrayList();
        if (hVar instanceof g) {
            l(((g) hVar).f3171d, arrayList);
        } else {
            arrayList.add(AbstractC3027G.f(Uri.parse(hVar.f3191a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C1227s c1227s : arrayList) {
            arrayList2.add(new AbstractC3027G.c(0L, c1227s));
            try {
                f fVar = (f) g(interfaceC1224o, c1227s, z9);
                List list = fVar.f3142r;
                f.d dVar = null;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    f.d dVar2 = (f.d) list.get(i9);
                    f.d dVar3 = dVar2.f3155c;
                    if (dVar3 != null && dVar3 != dVar) {
                        m(fVar, dVar3, hashSet, arrayList2);
                        dVar = dVar3;
                    }
                    m(fVar, dVar2, hashSet, arrayList2);
                }
            } catch (IOException e9) {
                if (!z9) {
                    throw e9;
                }
            }
        }
        return arrayList2;
    }
}
