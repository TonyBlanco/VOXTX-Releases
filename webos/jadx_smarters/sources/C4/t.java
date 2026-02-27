package c4;

import android.os.ConditionVariable;
import c4.InterfaceC1255a;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements InterfaceC1255a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet f18291l = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1258d f18293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1267m f18294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1260f f18295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f18296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f18297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1255a.C0213a f18302k;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f18303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f18303a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (t.this) {
                this.f18303a.open();
                t.this.s();
                t.this.f18293b.f();
            }
        }
    }

    public t(File file, InterfaceC1258d interfaceC1258d) {
        this(file, interfaceC1258d, null, null, false, true);
    }

    public t(File file, InterfaceC1258d interfaceC1258d, T2.b bVar, byte[] bArr, boolean z9, boolean z10) {
        this(file, interfaceC1258d, new C1267m(bVar, file, bArr, z9, z10), (bVar == null || z10) ? null : new C1260f(bVar));
    }

    public t(File file, InterfaceC1258d interfaceC1258d, C1267m c1267m, C1260f c1260f) {
        if (!v(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f18292a = file;
        this.f18293b = interfaceC1258d;
        this.f18294c = c1267m;
        this.f18295d = c1260f;
        this.f18296e = new HashMap();
        this.f18297f = new Random();
        this.f18298g = interfaceC1258d.b();
        this.f18299h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
        conditionVariable.block();
    }

    public static void o(File file) throws InterfaceC1255a.C0213a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC1681B.d("SimpleCache", str);
        throw new InterfaceC1255a.C0213a(str);
    }

    public static long p(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long u(File[] fileArr) {
        int length = fileArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            File file = fileArr[i9];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return z(name);
                } catch (NumberFormatException unused) {
                    AbstractC1681B.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean v(File file) {
        return f18291l.add(file.getAbsoluteFile());
    }

    public static long z(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public final void A(AbstractC1264j abstractC1264j) {
        C1266l c1266lG = this.f18294c.g(abstractC1264j.f18244a);
        if (c1266lG == null || !c1266lG.k(abstractC1264j)) {
            return;
        }
        this.f18300i -= abstractC1264j.f18246d;
        if (this.f18295d != null) {
            String name = abstractC1264j.f18248f.getName();
            try {
                this.f18295d.f(name);
            } catch (IOException unused) {
                AbstractC1681B.j("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f18294c.p(c1266lG.f18261b);
        x(abstractC1264j);
    }

    public final void B() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f18294c.h().iterator();
        while (it.hasNext()) {
            for (AbstractC1264j abstractC1264j : ((C1266l) it.next()).f()) {
                if (abstractC1264j.f18248f.length() != abstractC1264j.f18246d) {
                    arrayList.add(abstractC1264j);
                }
            }
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            A((AbstractC1264j) arrayList.get(i9));
        }
    }

    public final u C(String str, u uVar) {
        boolean z9;
        if (!this.f18298g) {
            return uVar;
        }
        String name = ((File) AbstractC1684a.e(uVar.f18248f)).getName();
        long j9 = uVar.f18246d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1260f c1260f = this.f18295d;
        if (c1260f != null) {
            try {
                c1260f.h(name, j9, jCurrentTimeMillis);
            } catch (IOException unused) {
                AbstractC1681B.j("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z9 = false;
        } else {
            z9 = true;
        }
        u uVarL = this.f18294c.g(str).l(uVar, jCurrentTimeMillis, z9);
        y(uVar, uVarL);
        return uVarL;
    }

    @Override // c4.InterfaceC1255a
    public synchronized File a(String str, long j9, long j10) {
        C1266l c1266lG;
        File file;
        try {
            AbstractC1684a.g(!this.f18301j);
            n();
            c1266lG = this.f18294c.g(str);
            AbstractC1684a.e(c1266lG);
            AbstractC1684a.g(c1266lG.h(j9, j10));
            if (!this.f18292a.exists()) {
                o(this.f18292a);
                B();
            }
            this.f18293b.e(this, str, j9, j10);
            file = new File(this.f18292a, Integer.toString(this.f18297f.nextInt(10)));
            if (!file.exists()) {
                o(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return u.p(file, c1266lG.f18260a, j9, System.currentTimeMillis());
    }

    @Override // c4.InterfaceC1255a
    public synchronized InterfaceC1269o b(String str) {
        AbstractC1684a.g(!this.f18301j);
        return this.f18294c.j(str);
    }

    @Override // c4.InterfaceC1255a
    public synchronized long c(String str, long j9, long j10) {
        long j11;
        long j12 = j10 == -1 ? Long.MAX_VALUE : j10 + j9;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        j11 = 0;
        while (j9 < j13) {
            long jE = e(str, j9, j13 - j9);
            if (jE > 0) {
                j11 += jE;
            } else {
                jE = -jE;
            }
            j9 += jE;
        }
        return j11;
    }

    @Override // c4.InterfaceC1255a
    public synchronized AbstractC1264j d(String str, long j9, long j10) {
        AbstractC1684a.g(!this.f18301j);
        n();
        u uVarR = r(str, j9, j10);
        if (uVarR.f18247e) {
            return C(str, uVarR);
        }
        if (this.f18294c.m(str).j(j9, uVarR.f18246d)) {
            return uVarR;
        }
        return null;
    }

    @Override // c4.InterfaceC1255a
    public synchronized long e(String str, long j9, long j10) {
        C1266l c1266lG;
        AbstractC1684a.g(!this.f18301j);
        if (j10 == -1) {
            j10 = Long.MAX_VALUE;
        }
        c1266lG = this.f18294c.g(str);
        return c1266lG != null ? c1266lG.c(j9, j10) : -j10;
    }

    @Override // c4.InterfaceC1255a
    public synchronized void f(String str, C1270p c1270p) {
        AbstractC1684a.g(!this.f18301j);
        n();
        this.f18294c.e(str, c1270p);
        try {
            this.f18294c.s();
        } catch (IOException e9) {
            throw new InterfaceC1255a.C0213a(e9);
        }
    }

    @Override // c4.InterfaceC1255a
    public synchronized void g(AbstractC1264j abstractC1264j) {
        AbstractC1684a.g(!this.f18301j);
        C1266l c1266l = (C1266l) AbstractC1684a.e(this.f18294c.g(abstractC1264j.f18244a));
        c1266l.m(abstractC1264j.f18245c);
        this.f18294c.p(c1266l.f18261b);
        notifyAll();
    }

    @Override // c4.InterfaceC1255a
    public synchronized AbstractC1264j h(String str, long j9, long j10) {
        AbstractC1264j abstractC1264jD;
        AbstractC1684a.g(!this.f18301j);
        n();
        while (true) {
            abstractC1264jD = d(str, j9, j10);
            if (abstractC1264jD == null) {
                wait();
            }
        }
        return abstractC1264jD;
    }

    @Override // c4.InterfaceC1255a
    public synchronized void i(File file, long j9) {
        AbstractC1684a.g(!this.f18301j);
        if (file.exists()) {
            if (j9 == 0) {
                file.delete();
                return;
            }
            u uVar = (u) AbstractC1684a.e(u.l(file, j9, this.f18294c));
            C1266l c1266l = (C1266l) AbstractC1684a.e(this.f18294c.g(uVar.f18244a));
            AbstractC1684a.g(c1266l.h(uVar.f18245c, uVar.f18246d));
            long jA = AbstractC1268n.a(c1266l.d());
            if (jA != -1) {
                AbstractC1684a.g(uVar.f18245c + uVar.f18246d <= jA);
            }
            if (this.f18295d == null) {
                m(uVar);
                this.f18294c.s();
                notifyAll();
                return;
            }
            try {
                this.f18295d.h(file.getName(), uVar.f18246d, uVar.f18249g);
                m(uVar);
                try {
                    this.f18294c.s();
                    notifyAll();
                    return;
                } catch (IOException e9) {
                    throw new InterfaceC1255a.C0213a(e9);
                }
            } catch (IOException e10) {
                throw new InterfaceC1255a.C0213a(e10);
            }
        }
    }

    @Override // c4.InterfaceC1255a
    public synchronized void j(String str) {
        AbstractC1684a.g(!this.f18301j);
        Iterator it = q(str).iterator();
        while (it.hasNext()) {
            A((AbstractC1264j) it.next());
        }
    }

    public final void m(u uVar) {
        this.f18294c.m(uVar.f18244a).a(uVar);
        this.f18300i += uVar.f18246d;
        w(uVar);
    }

    public synchronized void n() {
        InterfaceC1255a.C0213a c0213a = this.f18302k;
        if (c0213a != null) {
            throw c0213a;
        }
    }

    public synchronized NavigableSet q(String str) {
        C1266l c1266lG;
        try {
            AbstractC1684a.g(!this.f18301j);
            c1266lG = this.f18294c.g(str);
        } catch (Throwable th) {
            throw th;
        }
        return (c1266lG == null || c1266lG.g()) ? new TreeSet() : new TreeSet((Collection) c1266lG.f());
    }

    public final u r(String str, long j9, long j10) {
        u uVarE;
        C1266l c1266lG = this.f18294c.g(str);
        if (c1266lG == null) {
            return u.n(str, j9, j10);
        }
        while (true) {
            uVarE = c1266lG.e(j9, j10);
            if (!uVarE.f18247e || uVarE.f18248f.length() == uVarE.f18246d) {
                break;
            }
            B();
        }
        return uVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: IOException -> 0x0092, TryCatch #2 {IOException -> 0x0092, blocks: (B:20:0x006c, B:22:0x0078, B:25:0x0094), top: B:37:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #2 {IOException -> 0x0092, blocks: (B:20:0x006c, B:22:0x0078, B:25:0x0094), top: B:37:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.t.s():void");
    }

    public final void t(File file, boolean z9, File[] fileArr, Map map) {
        long j9;
        long j10;
        if (fileArr == null || fileArr.length == 0) {
            if (z9) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z9 && name.indexOf(46) == -1) {
                t(file2, false, file2.listFiles(), map);
            } else if (!z9 || (!C1267m.o(name) && !name.endsWith(".uid"))) {
                C1259e c1259e = map != null ? (C1259e) map.remove(name) : null;
                if (c1259e != null) {
                    j10 = c1259e.f18238a;
                    j9 = c1259e.f18239b;
                } else {
                    j9 = -9223372036854775807L;
                    j10 = -1;
                }
                u uVarJ = u.j(file2, j10, j9, this.f18294c);
                if (uVarJ != null) {
                    m(uVarJ);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void w(u uVar) {
        ArrayList arrayList = (ArrayList) this.f18296e.get(uVar.f18244a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC1255a.b) arrayList.get(size)).c(this, uVar);
            }
        }
        this.f18293b.c(this, uVar);
    }

    public final void x(AbstractC1264j abstractC1264j) {
        ArrayList arrayList = (ArrayList) this.f18296e.get(abstractC1264j.f18244a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC1255a.b) arrayList.get(size)).d(this, abstractC1264j);
            }
        }
        this.f18293b.d(this, abstractC1264j);
    }

    public final void y(u uVar, AbstractC1264j abstractC1264j) {
        ArrayList arrayList = (ArrayList) this.f18296e.get(uVar.f18244a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC1255a.b) arrayList.get(size)).a(this, uVar, abstractC1264j);
            }
        }
        this.f18293b.a(this, uVar, abstractC1264j);
    }
}
