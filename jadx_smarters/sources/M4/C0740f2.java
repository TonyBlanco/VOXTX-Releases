package M4;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: M4.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0740f2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4671a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0758i2 f4674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740f2(C0758i2 c0758i2, Runnable runnable, boolean z9, String str) {
        super(runnable, null);
        this.f4674e = c0758i2;
        com.google.android.gms.common.internal.r.m(str);
        long andIncrement = C0758i2.f4730l.getAndIncrement();
        this.f4671a = andIncrement;
        this.f4673d = str;
        this.f4672c = z9;
        if (andIncrement == Long.MAX_VALUE) {
            c0758i2.f4245a.d().r().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740f2(C0758i2 c0758i2, Callable callable, boolean z9, String str) {
        super(callable);
        this.f4674e = c0758i2;
        com.google.android.gms.common.internal.r.m("Task exception on worker thread");
        long andIncrement = C0758i2.f4730l.getAndIncrement();
        this.f4671a = andIncrement;
        this.f4673d = "Task exception on worker thread";
        this.f4672c = z9;
        if (andIncrement == Long.MAX_VALUE) {
            c0758i2.f4245a.d().r().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0740f2 c0740f2 = (C0740f2) obj;
        boolean z9 = this.f4672c;
        if (z9 == c0740f2.f4672c) {
            long j9 = this.f4671a;
            long j10 = c0740f2.f4671a;
            if (j9 < j10) {
                return -1;
            }
            if (j9 <= j10) {
                this.f4674e.f4245a.d().t().b("Two tasks share the same index. index", Long.valueOf(this.f4671a));
                return 0;
            }
        } else if (z9) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f4674e.f4245a.d().r().b(this.f4673d, th);
        super.setException(th);
    }
}
