package q3;

import O2.A0;
import O2.AbstractC0892k;
import O2.C0936z0;
import O2.D1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d4.AbstractC1684a;
import d4.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC0892k implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f46822A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC2543d f46823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC2545f f46824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f46825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C2544e f46826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f46827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC2542c f46828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f46831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2540a f46832z;

    public g(InterfaceC2545f interfaceC2545f, Looper looper) {
        this(interfaceC2545f, looper, InterfaceC2543d.f46820a);
    }

    public g(InterfaceC2545f interfaceC2545f, Looper looper, InterfaceC2543d interfaceC2543d) {
        this(interfaceC2545f, looper, interfaceC2543d, false);
    }

    public g(InterfaceC2545f interfaceC2545f, Looper looper, InterfaceC2543d interfaceC2543d, boolean z9) {
        super(5);
        this.f46824r = (InterfaceC2545f) AbstractC1684a.e(interfaceC2545f);
        this.f46825s = looper == null ? null : k0.w(looper, this);
        this.f46823q = (InterfaceC2543d) AbstractC1684a.e(interfaceC2543d);
        this.f46827u = z9;
        this.f46826t = new C2544e();
        this.f46822A = -9223372036854775807L;
    }

    @Override // O2.AbstractC0892k
    public void G() {
        this.f46832z = null;
        this.f46828v = null;
        this.f46822A = -9223372036854775807L;
    }

    @Override // O2.AbstractC0892k
    public void I(long j9, boolean z9) {
        this.f46832z = null;
        this.f46829w = false;
        this.f46830x = false;
    }

    @Override // O2.AbstractC0892k
    public void O(C0936z0[] c0936z0Arr, long j9, long j10) {
        this.f46828v = this.f46823q.b(c0936z0Arr[0]);
        C2540a c2540a = this.f46832z;
        if (c2540a != null) {
            this.f46832z = c2540a.d((c2540a.f46819c + this.f46822A) - j10);
        }
        this.f46822A = j10;
    }

    public final void S(C2540a c2540a, List list) {
        for (int i9 = 0; i9 < c2540a.f(); i9++) {
            C0936z0 wrappedMetadataFormat = c2540a.e(i9).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f46823q.a(wrappedMetadataFormat)) {
                list.add(c2540a.e(i9));
            } else {
                InterfaceC2542c interfaceC2542cB = this.f46823q.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) AbstractC1684a.e(c2540a.e(i9).getWrappedMetadataBytes());
                this.f46826t.clear();
                this.f46826t.e(bArr.length);
                ((ByteBuffer) k0.j(this.f46826t.f9699d)).put(bArr);
                this.f46826t.i();
                C2540a c2540aA = interfaceC2542cB.a(this.f46826t);
                if (c2540aA != null) {
                    S(c2540aA, list);
                }
            }
        }
    }

    public final long T(long j9) {
        AbstractC1684a.g(j9 != -9223372036854775807L);
        AbstractC1684a.g(this.f46822A != -9223372036854775807L);
        return j9 - this.f46822A;
    }

    public final void U(C2540a c2540a) {
        Handler handler = this.f46825s;
        if (handler != null) {
            handler.obtainMessage(0, c2540a).sendToTarget();
        } else {
            V(c2540a);
        }
    }

    public final void V(C2540a c2540a) {
        this.f46824r.e(c2540a);
    }

    public final boolean W(long j9) {
        boolean z9;
        C2540a c2540a = this.f46832z;
        if (c2540a == null || (!this.f46827u && c2540a.f46819c > T(j9))) {
            z9 = false;
        } else {
            U(this.f46832z);
            this.f46832z = null;
            z9 = true;
        }
        if (this.f46829w && this.f46832z == null) {
            this.f46830x = true;
        }
        return z9;
    }

    public final void X() {
        if (this.f46829w || this.f46832z != null) {
            return;
        }
        this.f46826t.clear();
        A0 a0B = B();
        int iP = P(a0B, this.f46826t, 0);
        if (iP != -4) {
            if (iP == -5) {
                this.f46831y = ((C0936z0) AbstractC1684a.e(a0B.f5499b)).f6471q;
            }
        } else {
            if (this.f46826t.isEndOfStream()) {
                this.f46829w = true;
                return;
            }
            C2544e c2544e = this.f46826t;
            c2544e.f46821j = this.f46831y;
            c2544e.i();
            C2540a c2540aA = ((InterfaceC2542c) k0.j(this.f46828v)).a(this.f46826t);
            if (c2540aA != null) {
                ArrayList arrayList = new ArrayList(c2540aA.f());
                S(c2540aA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f46832z = new C2540a(T(this.f46826t.f9701f), arrayList);
            }
        }
    }

    @Override // O2.E1
    public int a(C0936z0 c0936z0) {
        if (this.f46823q.a(c0936z0)) {
            return D1.a(c0936z0.f6454H == 0 ? 4 : 2);
        }
        return D1.a(0);
    }

    @Override // O2.C1
    public boolean d() {
        return this.f46830x;
    }

    @Override // O2.C1
    public boolean e() {
        return true;
    }

    @Override // O2.C1, O2.E1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        V((C2540a) message.obj);
        return true;
    }

    @Override // O2.C1
    public void u(long j9, long j10) {
        boolean zW = true;
        while (zW) {
            X();
            zW = W(j9);
        }
    }
}
