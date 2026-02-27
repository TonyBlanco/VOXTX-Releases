package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A1 implements InterfaceC0901n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5500a = d4.k0.A0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC0901n.a f5501c = new InterfaceC0901n.a() { // from class: O2.z1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return A1.b(bundle);
        }
    };

    public static A1 b(Bundle bundle) {
        InterfaceC0901n.a aVar;
        int i9 = bundle.getInt(f5500a, -1);
        if (i9 == 0) {
            aVar = C0.f5506h;
        } else if (i9 == 1) {
            aVar = C0903n1.f6135f;
        } else if (i9 == 2) {
            aVar = K1.f5682h;
        } else {
            if (i9 != 3) {
                throw new IllegalArgumentException("Unknown RatingType: " + i9);
            }
            aVar = O1.f5701h;
        }
        return (A1) aVar.a(bundle);
    }
}
