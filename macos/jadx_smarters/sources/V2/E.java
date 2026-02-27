package V2;

import O2.AbstractC0904o;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import d4.AbstractC1684a;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements InterfaceC1058o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1058o.a f9875a;

    public E(InterfaceC1058o.a aVar) {
        this.f9875a = (InterfaceC1058o.a) AbstractC1684a.e(aVar);
    }

    @Override // V2.InterfaceC1058o
    public final UUID a() {
        return AbstractC0904o.f6137a;
    }

    @Override // V2.InterfaceC1058o
    public boolean b() {
        return false;
    }

    @Override // V2.InterfaceC1058o
    public byte[] c() {
        return null;
    }

    @Override // V2.InterfaceC1058o
    public CryptoConfig d() {
        return null;
    }

    @Override // V2.InterfaceC1058o
    public Map e() {
        return null;
    }

    @Override // V2.InterfaceC1058o
    public void f(InterfaceC1065w.a aVar) {
    }

    @Override // V2.InterfaceC1058o
    public void g(InterfaceC1065w.a aVar) {
    }

    @Override // V2.InterfaceC1058o
    public InterfaceC1058o.a getError() {
        return this.f9875a;
    }

    @Override // V2.InterfaceC1058o
    public int getState() {
        return 1;
    }

    @Override // V2.InterfaceC1058o
    public boolean h(String str) {
        return false;
    }
}
