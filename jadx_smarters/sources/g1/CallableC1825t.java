package g1;

import com.google.android.gms.internal.play_billing.zzai;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: g1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1825t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1815i f41250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1810d f41251c;

    public CallableC1825t(C1810d c1810d, String str, InterfaceC1815i interfaceC1815i) {
        this.f41249a = str;
        this.f41250b = interfaceC1815i;
        this.f41251c = c1810d;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        P pG = C1810d.G(this.f41251c, this.f41249a, 9);
        if (pG.b() != null) {
            this.f41250b.a(pG.a(), pG.b());
            return null;
        }
        this.f41250b.a(pG.a(), zzai.zzk());
        return null;
    }
}
