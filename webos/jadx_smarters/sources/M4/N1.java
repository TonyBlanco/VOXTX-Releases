package M4;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1 f4383e;

    public /* synthetic */ N1(P1 p12, String str, long j9, M1 m12) {
        this.f4383e = p12;
        com.google.android.gms.common.internal.r.g("health_monitor");
        com.google.android.gms.common.internal.r.a(j9 > 0);
        this.f4379a = "health_monitor:start";
        this.f4380b = "health_monitor:count";
        this.f4381c = "health_monitor:value";
        this.f4382d = j9;
    }

    public final Pair a() {
        long jAbs;
        this.f4383e.h();
        this.f4383e.h();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f4383e.f4245a.a().a());
        }
        long j9 = this.f4382d;
        if (jAbs < j9) {
            return null;
        }
        if (jAbs > j9 + j9) {
            d();
            return null;
        }
        String string = this.f4383e.o().getString(this.f4381c, null);
        long j10 = this.f4383e.o().getLong(this.f4380b, 0L);
        d();
        return (string == null || j10 <= 0) ? P1.f4401y : new Pair(string, Long.valueOf(j10));
    }

    public final void b(String str, long j9) {
        this.f4383e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j10 = this.f4383e.o().getLong(this.f4380b, 0L);
        if (j10 <= 0) {
            SharedPreferences.Editor editorEdit = this.f4383e.o().edit();
            editorEdit.putString(this.f4381c, str);
            editorEdit.putLong(this.f4380b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.f4383e.f4245a.N().u().nextLong() & Long.MAX_VALUE;
        long j11 = j10 + 1;
        long j12 = Long.MAX_VALUE / j11;
        SharedPreferences.Editor editorEdit2 = this.f4383e.o().edit();
        if (jNextLong < j12) {
            editorEdit2.putString(this.f4381c, str);
        }
        editorEdit2.putLong(this.f4380b, j11);
        editorEdit2.apply();
    }

    public final long c() {
        return this.f4383e.o().getLong(this.f4379a, 0L);
    }

    public final void d() {
        this.f4383e.h();
        long jA = this.f4383e.f4245a.a().a();
        SharedPreferences.Editor editorEdit = this.f4383e.o().edit();
        editorEdit.remove(this.f4380b);
        editorEdit.remove(this.f4381c);
        editorEdit.putLong(this.f4379a, jA);
        editorEdit.apply();
    }
}
