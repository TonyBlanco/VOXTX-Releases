package i3;

import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1674k;
import d3.u;
import d3.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC1674k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41851a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1674k f41852c;

    public class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41853a;

        public a(g gVar) {
            this.f41853a = gVar;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public g.a e(long j9) {
            g.a aVarE = this.f41853a.e(j9);
            u uVar = aVarE.f25422a;
            u uVar2 = new u(uVar.f39610a, uVar.f39611b + d.this.f41851a);
            u uVar3 = aVarE.f25423b;
            return new g.a(uVar2, new u(uVar3.f39610a, uVar3.f39611b + d.this.f41851a));
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return this.f41853a.g();
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return this.f41853a.i();
        }
    }

    public d(long j9, InterfaceC1674k interfaceC1674k) {
        this.f41851a = j9;
        this.f41852c = interfaceC1674k;
    }

    @Override // d3.InterfaceC1674k
    public w e(int i9, int i10) {
        return this.f41852c.e(i9, i10);
    }

    @Override // d3.InterfaceC1674k
    public void n(g gVar) {
        this.f41852c.n(new a(gVar));
    }

    @Override // d3.InterfaceC1674k
    public void q() {
        this.f41852c.q();
    }
}
