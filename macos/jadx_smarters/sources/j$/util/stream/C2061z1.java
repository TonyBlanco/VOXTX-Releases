package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2061z1 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final K0 f42801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f42802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f42804d;

    public C2061z1(K0 k02, Object obj, int i9) {
        this.f42803c = i9;
        this.f42801a = k02;
        this.f42802b = 0;
        this.f42804d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2061z1(C2061z1 c2061z1, J0 j02, int i9) {
        this(c2061z1, j02, i9, (byte) 0);
        this.f42803c = 0;
        this.f42804d = c2061z1.f42804d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2061z1(C2061z1 c2061z1, K0 k02, int i9) {
        this(c2061z1, k02, i9, (byte) 0);
        this.f42803c = 1;
        this.f42804d = (Object[]) c2061z1.f42804d;
    }

    C2061z1(C2061z1 c2061z1, K0 k02, int i9, byte b9) {
        super(c2061z1);
        this.f42801a = k02;
        this.f42802b = i9;
    }

    final void a() {
        switch (this.f42803c) {
            case 0:
                ((J0) this.f42801a).d(this.f42804d, this.f42802b);
                break;
            default:
                this.f42801a.j((Object[]) this.f42804d, this.f42802b);
                break;
        }
    }

    final C2061z1 b(int i9, int i10) {
        switch (this.f42803c) {
            case 0:
                return new C2061z1(this, ((J0) this.f42801a).b(i9), i10);
            default:
                return new C2061z1(this, this.f42801a.b(i9), i10);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C2061z1 c2061z1B = this;
        while (c2061z1B.f42801a.r() != 0) {
            c2061z1B.setPendingCount(c2061z1B.f42801a.r() - 1);
            int i9 = 0;
            int iCount = 0;
            while (i9 < c2061z1B.f42801a.r() - 1) {
                C2061z1 c2061z1B2 = c2061z1B.b(i9, c2061z1B.f42802b + iCount);
                iCount = (int) (((long) iCount) + c2061z1B2.f42801a.count());
                c2061z1B2.fork();
                i9++;
            }
            c2061z1B = c2061z1B.b(i9, c2061z1B.f42802b + iCount);
        }
        c2061z1B.a();
        c2061z1B.propagateCompletion();
    }
}
