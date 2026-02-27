package R3;

import P3.h;
import P3.i;
import d4.M;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f8593o;

    public a(List list) {
        super("DvbDecoder");
        M m9 = new M((byte[]) list.get(0));
        this.f8593o = new b(m9.N(), m9.N());
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) {
        if (z9) {
            this.f8593o.r();
        }
        return new c(this.f8593o.b(bArr, i9));
    }
}
