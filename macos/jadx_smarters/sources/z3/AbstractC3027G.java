package z3;

import O2.H0;
import android.net.Uri;
import b4.C1227s;
import b4.I;
import b4.InterfaceC1224o;
import c4.AbstractC1268n;
import c4.C1257c;
import c4.C1265k;
import c4.InterfaceC1255a;
import c4.InterfaceC1263i;
import d4.AbstractC1684a;
import d4.Q;
import d4.k0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import z3.InterfaceC3021A;

/* JADX INFO: renamed from: z3.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3027G implements InterfaceC3021A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1227s f52672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I.a f52673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f52674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1257c.C0215c f52675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1255a f52676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1263i f52677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f52678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f52679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f52680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f52681j;

    /* JADX INFO: renamed from: z3.G$a */
    public class a extends Q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1224o f52682i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C1227s f52683j;

        public a(InterfaceC1224o interfaceC1224o, C1227s c1227s) {
            this.f52682i = interfaceC1224o;
            this.f52683j = c1227s;
        }

        @Override // d4.Q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC3023C d() {
            return (InterfaceC3023C) b4.I.g(this.f52682i, AbstractC3027G.this.f52673b, this.f52683j, 4);
        }
    }

    /* JADX INFO: renamed from: z3.G$b */
    public static final class b implements C1265k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3021A.a f52685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f52688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52689e;

        public b(InterfaceC3021A.a aVar, long j9, int i9, long j10, int i10) {
            this.f52685a = aVar;
            this.f52686b = j9;
            this.f52687c = i9;
            this.f52688d = j10;
            this.f52689e = i10;
        }

        @Override // c4.C1265k.a
        public void a(long j9, long j10, long j11) {
            long j12 = this.f52688d + j11;
            this.f52688d = j12;
            this.f52685a.a(this.f52686b, j12, b());
        }

        public final float b() {
            long j9 = this.f52686b;
            if (j9 != -1 && j9 != 0) {
                return (this.f52688d * 100.0f) / j9;
            }
            int i9 = this.f52687c;
            if (i9 != 0) {
                return (this.f52689e * 100.0f) / i9;
            }
            return -1.0f;
        }

        public void c() {
            this.f52689e++;
            this.f52685a.a(this.f52686b, this.f52688d, b());
        }
    }

    /* JADX INFO: renamed from: z3.G$c */
    public static class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f52690a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1227s f52691c;

        public c(long j9, C1227s c1227s) {
            this.f52690a = j9;
            this.f52691c = c1227s;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return k0.p(this.f52690a, cVar.f52690a);
        }
    }

    /* JADX INFO: renamed from: z3.G$d */
    public static final class d extends Q {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final c f52692i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C1257c f52693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final b f52694k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f52695l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C1265k f52696m;

        public d(c cVar, C1257c c1257c, b bVar, byte[] bArr) {
            this.f52692i = cVar;
            this.f52693j = c1257c;
            this.f52694k = bVar;
            this.f52695l = bArr;
            this.f52696m = new C1265k(c1257c, cVar.f52691c, bArr, bVar);
        }

        @Override // d4.Q
        public void c() {
            this.f52696m.b();
        }

        @Override // d4.Q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            this.f52696m.a();
            b bVar = this.f52694k;
            if (bVar == null) {
                return null;
            }
            bVar.c();
            return null;
        }
    }

    public AbstractC3027G(H0 h02, I.a aVar, C1257c.C0215c c0215c, Executor executor, long j9) {
        AbstractC1684a.e(h02.f5528c);
        this.f52672a = f(h02.f5528c.f5625a);
        this.f52673b = aVar;
        this.f52674c = new ArrayList(h02.f5528c.f5629f);
        this.f52675d = c0215c;
        this.f52678g = executor;
        this.f52676e = (InterfaceC1255a) AbstractC1684a.e(c0215c.f());
        this.f52677f = c0215c.g();
        c0215c.h();
        this.f52680i = new ArrayList();
        this.f52679h = k0.P0(j9);
    }

    public static boolean d(C1227s c1227s, C1227s c1227s2) {
        if (c1227s.f17598a.equals(c1227s2.f17598a)) {
            long j9 = c1227s.f17605h;
            if (j9 != -1 && c1227s.f17604g + j9 == c1227s2.f17604g && k0.c(c1227s.f17606i, c1227s2.f17606i) && c1227s.f17607j == c1227s2.f17607j && c1227s.f17600c == c1227s2.f17600c && c1227s.f17602e.equals(c1227s2.f17602e)) {
                return true;
            }
        }
        return false;
    }

    public static C1227s f(Uri uri) {
        return new C1227s.b().i(uri).b(1).a();
    }

    public static void i(List list, InterfaceC1263i interfaceC1263i, long j9) {
        HashMap map = new HashMap();
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            String strA = interfaceC1263i.a(cVar.f52691c);
            Integer num = (Integer) map.get(strA);
            c cVar2 = num == null ? null : (c) list.get(num.intValue());
            if (cVar2 == null || cVar.f52690a > cVar2.f52690a + j9 || !d(cVar2.f52691c, cVar.f52691c)) {
                map.put(strA, Integer.valueOf(i9));
                list.set(i9, cVar);
                i9++;
            } else {
                long j10 = cVar.f52691c.f17605h;
                list.set(((Integer) AbstractC1684a.e(num)).intValue(), new c(cVar2.f52690a, cVar2.f52691c.f(0L, j10 != -1 ? cVar2.f52691c.f17605h + j10 : -1L)));
            }
        }
        k0.a1(list, i9, list.size());
    }

    @Override // z3.InterfaceC3021A
    public final void a(InterfaceC3021A.a aVar) {
        C1257c c1257cC;
        byte[] bArr;
        int i9;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            C1257c c1257cC2 = this.f52675d.c();
            InterfaceC3023C interfaceC3023CG = g(c1257cC2, this.f52672a, false);
            if (!this.f52674c.isEmpty()) {
                interfaceC3023CG = (InterfaceC3023C) interfaceC3023CG.a(this.f52674c);
            }
            List listH = h(c1257cC2, interfaceC3023CG, false);
            Collections.sort(listH);
            i(listH, this.f52677f, this.f52679h);
            int size = listH.size();
            long j9 = 0;
            long j10 = 0;
            int i10 = 0;
            for (int size2 = listH.size() - 1; size2 >= 0; size2 = i9 - 1) {
                C1227s c1227s = ((c) listH.get(size2)).f52691c;
                String strA = this.f52677f.a(c1227s);
                long j11 = c1227s.f17605h;
                if (j11 == -1) {
                    long jA = AbstractC1268n.a(this.f52676e.b(strA));
                    if (jA != -1) {
                        j11 = jA - c1227s.f17604g;
                    }
                }
                int i11 = size2;
                long jC = this.f52676e.c(strA, c1227s.f17604g, j11);
                j10 += jC;
                if (j11 != -1) {
                    if (j11 == jC) {
                        i10++;
                        i9 = i11;
                        listH.remove(i9);
                    } else {
                        i9 = i11;
                    }
                    if (j9 != -1) {
                        j9 += j11;
                    }
                } else {
                    i9 = i11;
                    j9 = -1;
                }
            }
            b bVar = aVar != null ? new b(aVar, j9, size, j10, i10) : null;
            arrayDeque.addAll(listH);
            while (!this.f52681j && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    c1257cC = this.f52675d.c();
                    bArr = new byte[131072];
                } else {
                    d dVar = (d) arrayDeque2.removeFirst();
                    c1257cC = dVar.f52693j;
                    bArr = dVar.f52695l;
                }
                d dVar2 = new d((c) arrayDeque.removeFirst(), c1257cC, bVar, bArr);
                c(dVar2);
                this.f52678g.execute(dVar2);
                for (int size3 = this.f52680i.size() - 1; size3 >= 0; size3--) {
                    d dVar3 = (d) this.f52680i.get(size3);
                    if (arrayDeque.isEmpty() || dVar3.isDone()) {
                        try {
                            dVar3.get();
                            j(size3);
                            arrayDeque2.addLast(dVar3);
                        } catch (ExecutionException e9) {
                            Throwable th = (Throwable) AbstractC1684a.e(e9.getCause());
                            if (th instanceof IOException) {
                                throw ((IOException) th);
                            }
                            k0.g1(th);
                        }
                    }
                }
                dVar2.b();
            }
            for (int i12 = 0; i12 < this.f52680i.size(); i12++) {
                ((Q) this.f52680i.get(i12)).cancel(true);
            }
            for (int size4 = this.f52680i.size() - 1; size4 >= 0; size4--) {
                ((Q) this.f52680i.get(size4)).a();
                j(size4);
            }
        } catch (Throwable th2) {
            for (int i13 = 0; i13 < this.f52680i.size(); i13++) {
                ((Q) this.f52680i.get(i13)).cancel(true);
            }
            for (int size5 = this.f52680i.size() - 1; size5 >= 0; size5--) {
                ((Q) this.f52680i.get(size5)).a();
                j(size5);
            }
            throw th2;
        }
    }

    public final void c(Q q9) {
        synchronized (this.f52680i) {
            try {
                if (this.f52681j) {
                    throw new InterruptedException();
                }
                this.f52680i.add(q9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z3.InterfaceC3021A
    public void cancel() {
        synchronized (this.f52680i) {
            try {
                this.f52681j = true;
                for (int i9 = 0; i9 < this.f52680i.size(); i9++) {
                    ((Q) this.f52680i.get(i9)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object e(Q q9, boolean z9) throws Throwable {
        if (z9) {
            q9.run();
            try {
                return q9.get();
            } catch (ExecutionException e9) {
                Throwable th = (Throwable) AbstractC1684a.e(e9.getCause());
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                k0.g1(e9);
            }
        }
        while (!this.f52681j) {
            c(q9);
            this.f52678g.execute(q9);
            try {
                return q9.get();
            } catch (ExecutionException e10) {
                Throwable th2 = (Throwable) AbstractC1684a.e(e10.getCause());
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                k0.g1(e10);
            } finally {
                q9.a();
                k(q9);
            }
        }
        throw new InterruptedException();
    }

    public final InterfaceC3023C g(InterfaceC1224o interfaceC1224o, C1227s c1227s, boolean z9) {
        return (InterfaceC3023C) e(new a(interfaceC1224o, c1227s), z9);
    }

    public abstract List h(InterfaceC1224o interfaceC1224o, InterfaceC3023C interfaceC3023C, boolean z9);

    public final void j(int i9) {
        synchronized (this.f52680i) {
            this.f52680i.remove(i9);
        }
    }

    public final void k(Q q9) {
        synchronized (this.f52680i) {
            this.f52680i.remove(q9);
        }
    }

    @Override // z3.InterfaceC3021A
    public final void remove() {
        C1257c c1257cD = this.f52675d.d();
        try {
            try {
                List listH = h(c1257cD, g(c1257cD, this.f52672a, true), true);
                for (int i9 = 0; i9 < listH.size(); i9++) {
                    this.f52676e.j(this.f52677f.a(((c) listH.get(i9)).f52691c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.f52676e.j(this.f52677f.a(this.f52672a));
        }
    }
}
