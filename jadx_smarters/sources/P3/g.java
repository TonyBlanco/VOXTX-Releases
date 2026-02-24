package P3;

import d4.AbstractC1684a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7232a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f7233b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deque f7234c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7236e;

    public class a extends o {
        public a() {
        }

        @Override // com.google.android.exoplayer2.decoder.a
        public void release() {
            g.this.i(this);
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7238a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC2743y f7239c;

        public b(long j9, AbstractC2743y abstractC2743y) {
            this.f7238a = j9;
            this.f7239c = abstractC2743y;
        }

        @Override // P3.i
        public int a(long j9) {
            return this.f7238a > j9 ? 0 : -1;
        }

        @Override // P3.i
        public List b(long j9) {
            return j9 >= this.f7238a ? this.f7239c : AbstractC2743y.z();
        }

        @Override // P3.i
        public long c(int i9) {
            AbstractC1684a.a(i9 == 0);
            return this.f7238a;
        }

        @Override // P3.i
        public int h() {
            return 1;
        }
    }

    public g() {
        for (int i9 = 0; i9 < 2; i9++) {
            this.f7234c.addFirst(new a());
        }
        this.f7235d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(o oVar) {
        AbstractC1684a.g(this.f7234c.size() < 2);
        AbstractC1684a.a(!this.f7234c.contains(oVar));
        oVar.clear();
        this.f7234c.addFirst(oVar);
    }

    @Override // P3.j
    public void a(long j9) {
    }

    @Override // U2.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public n d() {
        AbstractC1684a.g(!this.f7236e);
        if (this.f7235d != 0) {
            return null;
        }
        this.f7235d = 1;
        return this.f7233b;
    }

    @Override // U2.d
    public void flush() {
        AbstractC1684a.g(!this.f7236e);
        this.f7233b.clear();
        this.f7235d = 0;
    }

    @Override // U2.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o b() {
        AbstractC1684a.g(!this.f7236e);
        if (this.f7235d != 2 || this.f7234c.isEmpty()) {
            return null;
        }
        o oVar = (o) this.f7234c.removeFirst();
        if (this.f7233b.isEndOfStream()) {
            oVar.addFlag(4);
        } else {
            n nVar = this.f7233b;
            oVar.d(this.f7233b.f9701f, new b(nVar.f9701f, this.f7232a.a(((ByteBuffer) AbstractC1684a.e(nVar.f9699d)).array())), 0L);
        }
        this.f7233b.clear();
        this.f7235d = 0;
        return oVar;
    }

    @Override // U2.d
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // U2.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        AbstractC1684a.g(!this.f7236e);
        AbstractC1684a.g(this.f7235d == 1);
        AbstractC1684a.a(this.f7233b == nVar);
        this.f7235d = 2;
    }

    @Override // U2.d
    public void release() {
        this.f7236e = true;
    }
}
