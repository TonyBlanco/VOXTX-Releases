package Q3;

import P3.i;
import P3.j;
import P3.n;
import P3.o;
import Q3.e;
import com.google.android.exoplayer2.decoder.a;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f8007a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f8009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f8010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8012f;

    public static final class b extends n implements Comparable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f8013k;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j9 = this.f9701f - bVar.f9701f;
            if (j9 == 0) {
                j9 = this.f8013k - bVar.f8013k;
                if (j9 == 0) {
                    return 0;
                }
            }
            return j9 > 0 ? 1 : -1;
        }
    }

    public static final class c extends o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a.InterfaceC0238a f8014d;

        public c(a.InterfaceC0238a interfaceC0238a) {
            this.f8014d = interfaceC0238a;
        }

        @Override // com.google.android.exoplayer2.decoder.a
        public final void release() {
            this.f8014d.a(this);
        }
    }

    public e() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.f8007a.add(new b());
        }
        this.f8008b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f8008b.add(new c(new a.InterfaceC0238a() { // from class: Q3.d
                @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
                public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                    this.f8006a.n((e.c) aVar);
                }
            }));
        }
        this.f8009c = new PriorityQueue();
    }

    @Override // P3.j
    public void a(long j9) {
        this.f8011e = j9;
    }

    public abstract i e();

    public abstract void f(n nVar);

    @Override // U2.d
    public void flush() {
        this.f8012f = 0L;
        this.f8011e = 0L;
        while (!this.f8009c.isEmpty()) {
            m((b) k0.j((b) this.f8009c.poll()));
        }
        b bVar = this.f8010d;
        if (bVar != null) {
            m(bVar);
            this.f8010d = null;
        }
    }

    @Override // U2.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n d() {
        AbstractC1684a.g(this.f8010d == null);
        if (this.f8007a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f8007a.pollFirst();
        this.f8010d = bVar;
        return bVar;
    }

    @Override // U2.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o b() {
        o oVar;
        if (this.f8008b.isEmpty()) {
            return null;
        }
        while (!this.f8009c.isEmpty() && ((b) k0.j((b) this.f8009c.peek())).f9701f <= this.f8011e) {
            b bVar = (b) k0.j((b) this.f8009c.poll());
            if (bVar.isEndOfStream()) {
                oVar = (o) k0.j((o) this.f8008b.pollFirst());
                oVar.addFlag(4);
            } else {
                f(bVar);
                if (k()) {
                    i iVarE = e();
                    oVar = (o) k0.j((o) this.f8008b.pollFirst());
                    oVar.d(bVar.f9701f, iVarE, Long.MAX_VALUE);
                } else {
                    m(bVar);
                }
            }
            m(bVar);
            return oVar;
        }
        return null;
    }

    public final o i() {
        return (o) this.f8008b.pollFirst();
    }

    public final long j() {
        return this.f8011e;
    }

    public abstract boolean k();

    @Override // U2.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        AbstractC1684a.a(nVar == this.f8010d);
        b bVar = (b) nVar;
        if (bVar.isDecodeOnly()) {
            m(bVar);
        } else {
            long j9 = this.f8012f;
            this.f8012f = 1 + j9;
            bVar.f8013k = j9;
            this.f8009c.add(bVar);
        }
        this.f8010d = null;
    }

    public final void m(b bVar) {
        bVar.clear();
        this.f8007a.add(bVar);
    }

    public void n(o oVar) {
        oVar.clear();
        this.f8008b.add(oVar);
    }

    @Override // U2.d
    public void release() {
    }
}
