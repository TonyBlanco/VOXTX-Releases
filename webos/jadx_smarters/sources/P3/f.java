package P3;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1687d;
import d4.k0;
import java.util.ArrayList;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements InterfaceC0901n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f7226d = new f(AbstractC2743y.z(), 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7227e = k0.A0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7228f = k0.A0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC0901n.a f7229g = new InterfaceC0901n.a() { // from class: P3.e
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return f.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2743y f7230a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7231c;

    public f(List list, long j9) {
        this.f7230a = AbstractC2743y.r(list);
        this.f7231c = j9;
    }

    public static AbstractC2743y b(List list) {
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((b) list.get(i9)).f7195e == null) {
                aVarP.a((b) list.get(i9));
            }
        }
        return aVarP.k();
    }

    public static final f c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7227e);
        return new f(parcelableArrayList == null ? AbstractC2743y.z() : AbstractC1687d.d(b.f7183K, parcelableArrayList), bundle.getLong(f7228f));
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f7227e, AbstractC1687d.i(b(this.f7230a)));
        bundle.putLong(f7228f, this.f7231c);
        return bundle;
    }
}
