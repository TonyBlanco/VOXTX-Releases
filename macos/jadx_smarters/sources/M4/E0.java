package M4;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public final class E0 extends AbstractC0739f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f4237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4238d;

    public E0(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4237c = new C2695a();
        this.f4236b = new C2695a();
    }

    public static /* synthetic */ void i(E0 e02, String str, long j9) {
        e02.h();
        com.google.android.gms.common.internal.r.g(str);
        if (e02.f4237c.isEmpty()) {
            e02.f4238d = j9;
        }
        Integer num = (Integer) e02.f4237c.get(str);
        if (num != null) {
            e02.f4237c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (e02.f4237c.size() >= 100) {
            e02.f4245a.d().w().a("Too many ads visible");
        } else {
            e02.f4237c.put(str, 1);
            e02.f4236b.put(str, Long.valueOf(j9));
        }
    }

    public static /* synthetic */ void j(E0 e02, String str, long j9) {
        e02.h();
        com.google.android.gms.common.internal.r.g(str);
        Integer num = (Integer) e02.f4237c.get(str);
        if (num == null) {
            e02.f4245a.d().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        A3 a3S = e02.f4245a.K().s(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            e02.f4237c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        e02.f4237c.remove(str);
        Long l9 = (Long) e02.f4236b.get(str);
        if (l9 == null) {
            e02.f4245a.d().r().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j9 - l9.longValue();
            e02.f4236b.remove(str);
            e02.p(str, jLongValue, a3S);
        }
        if (e02.f4237c.isEmpty()) {
            long j10 = e02.f4238d;
            if (j10 == 0) {
                e02.f4245a.d().r().a("First ad exposure time was never set");
            } else {
                e02.o(j9 - j10, a3S);
                e02.f4238d = 0L;
            }
        }
    }

    public final void l(String str, long j9) {
        if (str == null || str.length() == 0) {
            this.f4245a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f4245a.f().z(new RunnableC0707a(this, str, j9));
        }
    }

    public final void m(String str, long j9) {
        if (str == null || str.length() == 0) {
            this.f4245a.d().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f4245a.f().z(new B(this, str, j9));
        }
    }

    public final void n(long j9) {
        A3 a3S = this.f4245a.K().s(false);
        for (String str : this.f4236b.keySet()) {
            p(str, j9 - ((Long) this.f4236b.get(str)).longValue(), a3S);
        }
        if (!this.f4236b.isEmpty()) {
            o(j9 - this.f4238d, a3S);
        }
        q(j9);
    }

    public final void o(long j9, A3 a32) {
        if (a32 == null) {
            this.f4245a.d().v().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j9 < 1000) {
            this.f4245a.d().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j9));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j9);
        a5.y(a32, bundle, true);
        this.f4245a.I().u("am", "_xa", bundle);
    }

    public final void p(String str, long j9, A3 a32) {
        if (a32 == null) {
            this.f4245a.d().v().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j9 < 1000) {
            this.f4245a.d().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j9));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j9);
        a5.y(a32, bundle, true);
        this.f4245a.I().u("am", "_xu", bundle);
    }

    public final void q(long j9) {
        Iterator it = this.f4236b.keySet().iterator();
        while (it.hasNext()) {
            this.f4236b.put((String) it.next(), Long.valueOf(j9));
        }
        if (this.f4236b.isEmpty()) {
            return;
        }
        this.f4238d = j9;
    }
}
