package K4;

import M4.C0776l2;
import M4.C0824t3;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0776l2 f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0824t3 f3806b;

    public a(C0776l2 c0776l2) {
        super(null);
        r.m(c0776l2);
        this.f3805a = c0776l2;
        this.f3806b = c0776l2.I();
    }

    @Override // M4.InterfaceC0830u3
    public final void a(String str, String str2, Bundle bundle) {
        this.f3806b.r(str, str2, bundle);
    }

    @Override // M4.InterfaceC0830u3
    public final void b(String str) {
        this.f3805a.y().l(str, this.f3805a.a().b());
    }

    @Override // M4.InterfaceC0830u3
    public final void c(String str) {
        this.f3805a.y().m(str, this.f3805a.a().b());
    }

    @Override // M4.InterfaceC0830u3
    public final List d(String str, String str2) {
        return this.f3806b.Z(str, str2);
    }

    @Override // M4.InterfaceC0830u3
    public final Map e(String str, String str2, boolean z9) {
        return this.f3806b.a0(str, str2, z9);
    }

    @Override // M4.InterfaceC0830u3
    public final void f(Bundle bundle) {
        this.f3806b.D(bundle);
    }

    @Override // M4.InterfaceC0830u3
    public final void g(String str, String str2, Bundle bundle) {
        this.f3805a.I().o(str, str2, bundle);
    }

    @Override // M4.InterfaceC0830u3
    public final int zza(String str) {
        this.f3806b.Q(str);
        return 25;
    }

    @Override // M4.InterfaceC0830u3
    public final long zzb() {
        return this.f3805a.N().t0();
    }

    @Override // M4.InterfaceC0830u3
    public final String zzh() {
        return this.f3806b.V();
    }

    @Override // M4.InterfaceC0830u3
    public final String zzi() {
        return this.f3806b.W();
    }

    @Override // M4.InterfaceC0830u3
    public final String zzj() {
        return this.f3806b.X();
    }

    @Override // M4.InterfaceC0830u3
    public final String zzk() {
        return this.f3806b.V();
    }
}
