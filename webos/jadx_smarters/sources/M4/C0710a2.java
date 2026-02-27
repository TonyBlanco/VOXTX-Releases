package M4;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

/* JADX INFO: renamed from: M4.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0710a2 implements zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0722c2 f4583a;

    public C0710a2(C0722c2 c0722c2) {
        this.f4583a = c0722c2;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i9, String str, List list, boolean z9, boolean z10) {
        C0846x1 c0846x1Q;
        int i10 = i9 - 1;
        if (i10 == 0) {
            c0846x1Q = this.f4583a.f4245a.d().q();
        } else if (i10 == 1) {
            C0858z1 c0858z1D = this.f4583a.f4245a.d();
            c0846x1Q = z9 ? c0858z1D.t() : !z10 ? c0858z1D.s() : c0858z1D.r();
        } else if (i10 == 3) {
            c0846x1Q = this.f4583a.f4245a.d().v();
        } else if (i10 != 4) {
            c0846x1Q = this.f4583a.f4245a.d().u();
        } else {
            C0858z1 c0858z1D2 = this.f4583a.f4245a.d();
            c0846x1Q = z9 ? c0858z1D2.y() : !z10 ? c0858z1D2.x() : c0858z1D2.w();
        }
        int size = list.size();
        if (size == 1) {
            c0846x1Q.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c0846x1Q.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c0846x1Q.a(str);
        } else {
            c0846x1Q.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
