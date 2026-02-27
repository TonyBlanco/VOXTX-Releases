package M4;

import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class P4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzgd f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f4428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S4 f4430e;

    public /* synthetic */ P4(S4 s42, O4 o42) {
        this.f4430e = s42;
    }

    public static final long b(zzft zzftVar) {
        return ((zzftVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean a(long j9, zzft zzftVar) {
        com.google.android.gms.common.internal.r.m(zzftVar);
        if (this.f4428c == null) {
            this.f4428c = new ArrayList();
        }
        if (this.f4427b == null) {
            this.f4427b = new ArrayList();
        }
        if (!this.f4428c.isEmpty() && b((zzft) this.f4428c.get(0)) != b(zzftVar)) {
            return false;
        }
        long jZzbz = this.f4429d + ((long) zzftVar.zzbz());
        this.f4430e.U();
        if (jZzbz >= Math.max(0, ((Integer) AbstractC0781m1.f4904k.a(null)).intValue())) {
            return false;
        }
        this.f4429d = jZzbz;
        this.f4428c.add(zzftVar);
        this.f4427b.add(Long.valueOf(j9));
        int size = this.f4428c.size();
        this.f4430e.U();
        return size < Math.max(1, ((Integer) AbstractC0781m1.f4906l.a(null)).intValue());
    }
}
