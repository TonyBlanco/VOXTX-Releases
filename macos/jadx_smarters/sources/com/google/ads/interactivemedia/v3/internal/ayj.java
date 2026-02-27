package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.axz;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
class ayj extends axz.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ayg f20938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f20939c = Logger.getLogger(ayj.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        ayg ayiVar;
        Throwable th;
        byte[] bArr = null;
        try {
            AtomicReferenceFieldUpdater.newUpdater(ayj.class, Set.class, "seenExceptions");
            ayiVar = new ayh(AtomicIntegerFieldUpdater.newUpdater(ayj.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e9) {
            ayiVar = new ayi(bArr);
            th = e9;
        }
        f20938b = ayiVar;
        if (th != null) {
            f20939c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public ayj(int i9) {
        this.remaining = i9;
    }

    public static /* synthetic */ int t(ayj ayjVar) {
        int i9 = ayjVar.remaining - 1;
        ayjVar.remaining = i9;
        return i9;
    }

    public final int u() {
        return f20938b.a(this);
    }

    public final void v() {
        this.seenExceptions = null;
    }
}
