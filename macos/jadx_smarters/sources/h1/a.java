package H1;

import F1.d;
import java.util.ArrayList;
import java.util.List;
import v1.InterfaceC2868f;
import v1.k;
import y1.C2982a;
import z1.AbstractC3004c;
import z1.C3003b;
import z1.C3005d;
import z1.C3010i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2868f.b f2407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3004c f2408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2982a f2409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F1.a f2410e;

    /* JADX INFO: renamed from: H1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2411a;

        static {
            int[] iArr = new int[k.b.values().length];
            f2411a = iArr;
            try {
                iArr[k.b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2411a[k.b.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(d dVar, InterfaceC2868f.b bVar, AbstractC3004c abstractC3004c, C2982a c2982a, F1.a aVar) {
        this.f2406a = dVar;
        this.f2407b = bVar;
        this.f2408c = abstractC3004c;
        this.f2409d = c2982a;
        this.f2410e = aVar;
    }

    public final Object b(C3010i c3010i, k kVar) {
        String strA = this.f2410e.a(kVar, this.f2407b);
        if (c3010i.f(strA)) {
            return c3010i.d(strA);
        }
        throw new NullPointerException("Missing value: " + kVar.c());
    }

    @Override // H1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object a(C3010i c3010i, k kVar) {
        int i9 = C0044a.f2411a[kVar.l().ordinal()];
        if (i9 == 1) {
            return e(c3010i, kVar);
        }
        Object objB = b(c3010i, kVar);
        return i9 != 2 ? objB : d((List) objB);
    }

    public final List d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object objD : list) {
            if (objD instanceof C3005d) {
                objD = this.f2406a.t(((C3005d) objD).c(), this.f2409d);
                if (objD == null) {
                    throw new IllegalStateException("Cache MISS: failed to find record in cache by reference");
                }
            } else if (objD instanceof List) {
                objD = d((List) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    public final C3010i e(C3010i c3010i, k kVar) {
        C3003b c3003bFromFieldArguments = this.f2408c.fromFieldArguments(kVar, this.f2407b);
        C3005d c3005d = c3003bFromFieldArguments != C3003b.f52622b ? new C3005d(c3003bFromFieldArguments.b()) : (C3005d) b(c3010i, kVar);
        if (c3005d == null) {
            return null;
        }
        C3010i c3010iT = this.f2406a.t(c3005d.c(), this.f2409d);
        if (c3010iT != null) {
            return c3010iT;
        }
        throw new IllegalStateException("Cache MISS: failed to find record in cache by reference");
    }
}
