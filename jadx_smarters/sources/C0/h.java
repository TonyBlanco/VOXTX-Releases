package C0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class h implements G0.e, G0.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f921j = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f922a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f929i;

    public h(int i9) {
        this.f928h = i9;
        int i10 = i9 + 1;
        this.f927g = new int[i10];
        this.f923c = new long[i10];
        this.f924d = new double[i10];
        this.f925e = new String[i10];
        this.f926f = new byte[i10][];
    }

    public static h d(String str, int i9) {
        TreeMap treeMap = f921j;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i9));
                if (entryCeilingEntry == null) {
                    h hVar = new h(i9);
                    hVar.e(str, i9);
                    return hVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                h hVar2 = (h) entryCeilingEntry.getValue();
                hVar2.e(str, i9);
                return hVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g() {
        TreeMap treeMap = f921j;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i9 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i9;
        }
    }

    @Override // G0.d
    public void A(int i9, long j9) {
        this.f927g[i9] = 2;
        this.f923c[i9] = j9;
    }

    @Override // G0.d
    public void S(int i9, byte[] bArr) {
        this.f927g[i9] = 5;
        this.f926f[i9] = bArr;
    }

    @Override // G0.d
    public void X(int i9) {
        this.f927g[i9] = 1;
    }

    @Override // G0.e
    public String a() {
        return this.f922a;
    }

    @Override // G0.e
    public void c(G0.d dVar) {
        for (int i9 = 1; i9 <= this.f929i; i9++) {
            int i10 = this.f927g[i9];
            if (i10 == 1) {
                dVar.X(i9);
            } else if (i10 == 2) {
                dVar.A(i9, this.f923c[i9]);
            } else if (i10 == 3) {
                dVar.f(i9, this.f924d[i9]);
            } else if (i10 == 4) {
                dVar.x(i9, this.f925e[i9]);
            } else if (i10 == 5) {
                dVar.S(i9, this.f926f[i9]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void e(String str, int i9) {
        this.f922a = str;
        this.f929i = i9;
    }

    @Override // G0.d
    public void f(int i9, double d9) {
        this.f927g[i9] = 3;
        this.f924d[i9] = d9;
    }

    public void h() {
        TreeMap treeMap = f921j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f928h), this);
            g();
        }
    }

    @Override // G0.d
    public void x(int i9, String str) {
        this.f927g[i9] = 4;
        this.f925e[i9] = str;
    }
}
