package K3;

import K3.g;
import java.util.Comparator;
import java.util.TreeSet;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f3734a = new TreeSet(new Comparator() { // from class: K3.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g.d((g.a) obj, (g.a) obj2);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3737d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f3738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3739b;

        public a(e eVar, long j9) {
            this.f3738a = eVar;
            this.f3739b = j9;
        }
    }

    public g() {
        g();
    }

    public static int c(int i9, int i10) {
        int iMin;
        int i11 = i9 - i10;
        return (Math.abs(i11) <= 1000 || (iMin = (Math.min(i9, i10) - Math.max(i9, i10)) + Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 1000) ? i11 : i9 < i10 ? iMin : -iMin;
    }

    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.f3738a.f3721g, aVar2.f3738a.f3721g);
    }

    public final synchronized void b(a aVar) {
        this.f3735b = aVar.f3738a.f3721g;
        this.f3734a.add(aVar);
    }

    public synchronized boolean e(e eVar, long j9) {
        if (this.f3734a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i9 = eVar.f3721g;
        if (!this.f3737d) {
            g();
            this.f3736c = e.c(i9);
            this.f3737d = true;
            b(new a(eVar, j9));
            return true;
        }
        if (Math.abs(c(i9, e.b(this.f3735b))) < 1000) {
            if (c(i9, this.f3736c) <= 0) {
                return false;
            }
            b(new a(eVar, j9));
            return true;
        }
        this.f3736c = e.c(i9);
        this.f3734a.clear();
        b(new a(eVar, j9));
        return true;
    }

    public synchronized e f(long j9) {
        if (this.f3734a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.f3734a.first();
        int i9 = aVar.f3738a.f3721g;
        if (i9 != e.b(this.f3736c) && j9 < aVar.f3739b) {
            return null;
        }
        this.f3734a.pollFirst();
        this.f3736c = i9;
        return aVar.f3738a;
    }

    public synchronized void g() {
        this.f3734a.clear();
        this.f3737d = false;
        this.f3736c = -1;
        this.f3735b = -1;
    }
}
