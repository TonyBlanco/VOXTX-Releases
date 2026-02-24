package z3;

import O2.H0;
import android.util.SparseArray;
import c4.C1257c;
import d4.AbstractC1684a;
import d4.k0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3031b implements InterfaceC3022B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f52711c = c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1257c.C0215c f52712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f52713b;

    public C3031b(C1257c.C0215c c0215c, Executor executor) {
        this.f52712a = (C1257c.C0215c) AbstractC1684a.e(c0215c);
        this.f52713b = (Executor) AbstractC1684a.e(executor);
    }

    public static SparseArray c() {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, d(G3.a.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, d(I3.a.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, d(O3.a.class));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    public static Constructor d(Class cls) {
        try {
            return cls.asSubclass(InterfaceC3021A.class).getConstructor(H0.class, C1257c.C0215c.class, Executor.class);
        } catch (NoSuchMethodException e9) {
            throw new IllegalStateException("Downloader constructor missing", e9);
        }
    }

    @Override // z3.InterfaceC3022B
    public InterfaceC3021A a(C3052w c3052w) {
        int iY0 = k0.y0(c3052w.f52802c, c3052w.f52803d);
        if (iY0 == 0 || iY0 == 1 || iY0 == 2) {
            return b(c3052w, iY0);
        }
        if (iY0 == 4) {
            return new C3026F(new H0.c().m(c3052w.f52802c).d(c3052w.f52806g).a(), this.f52712a, this.f52713b);
        }
        throw new IllegalArgumentException("Unsupported type: " + iY0);
    }

    public final InterfaceC3021A b(C3052w c3052w, int i9) {
        Constructor constructor = (Constructor) f52711c.get(i9);
        if (constructor == null) {
            throw new IllegalStateException("Module missing for content type " + i9);
        }
        try {
            return (InterfaceC3021A) constructor.newInstance(new H0.c().m(c3052w.f52802c).j(c3052w.f52804e).d(c3052w.f52806g).a(), this.f52712a, this.f52713b);
        } catch (Exception e9) {
            throw new IllegalStateException("Failed to instantiate downloader for content type " + i9, e9);
        }
    }
}
