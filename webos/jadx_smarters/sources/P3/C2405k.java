package p3;

import d4.AbstractC1681B;
import d4.F;
import d4.k0;
import p3.C2394D;
import p3.C2397c;
import p3.InterfaceC2407m;

/* JADX INFO: renamed from: p3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2405k implements InterfaceC2407m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46284a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46285b;

    @Override // p3.InterfaceC2407m.b
    public InterfaceC2407m a(InterfaceC2407m.a aVar) {
        int i9;
        int i10 = k0.f39777a;
        if (i10 < 23 || ((i9 = this.f46284a) != 1 && (i9 != 0 || i10 < 31))) {
            return new C2394D.b().a(aVar);
        }
        int iK = F.k(aVar.f46293c.f6467m);
        AbstractC1681B.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + k0.r0(iK));
        return new C2397c.b(iK, this.f46285b).a(aVar);
    }
}
