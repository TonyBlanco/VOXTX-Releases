package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lr implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp f23705a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lu f23709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wr f23714j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TreeMap f23708d = new TreeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f23707c = cq.B(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aam f23706b = new aam();

    public lr(lu luVar, lp lpVar, wr wrVar) {
        this.f23709e = luVar;
        this.f23705a = lpVar;
        this.f23714j = wrVar;
    }

    private final void i() {
        if (this.f23711g) {
            this.f23712h = true;
            this.f23711g = false;
            ((lb) this.f23705a).f23624a.j();
        }
    }

    public final lq b() {
        return new lq(this, this.f23714j);
    }

    public final void d() {
        this.f23713i = true;
        this.f23707c.removeCallbacksAndMessages(null);
    }

    public final void e(lu luVar) {
        this.f23712h = false;
        this.f23710f = -9223372036854775807L;
        this.f23709e = luVar;
        Iterator it = this.f23708d.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f23709e.f23732h) {
                it.remove();
            }
        }
    }

    public final boolean f(long j9) {
        lu luVar = this.f23709e;
        boolean z9 = false;
        if (!luVar.f23728d) {
            return false;
        }
        if (this.f23712h) {
            return true;
        }
        Map.Entry entryCeilingEntry = this.f23708d.ceilingEntry(Long.valueOf(luVar.f23732h));
        if (entryCeilingEntry != null && ((Long) entryCeilingEntry.getValue()).longValue() < j9) {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            this.f23710f = jLongValue;
            ((lb) this.f23705a).f23624a.i(jLongValue);
            z9 = true;
        }
        if (z9) {
            i();
        }
        return z9;
    }

    public final boolean g(boolean z9) {
        if (!this.f23709e.f23728d) {
            return false;
        }
        if (this.f23712h) {
            return true;
        }
        if (!z9) {
            return false;
        }
        i();
        return true;
    }

    public final void h() {
        this.f23711g = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f23713i) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        lo loVar = (lo) message.obj;
        long j9 = loVar.f23698a;
        long j10 = loVar.f23699b;
        TreeMap treeMap = this.f23708d;
        Long lValueOf = Long.valueOf(j10);
        Long l9 = (Long) treeMap.get(lValueOf);
        if (l9 == null || l9.longValue() > j9) {
            this.f23708d.put(lValueOf, Long.valueOf(j9));
        }
        return true;
    }
}
