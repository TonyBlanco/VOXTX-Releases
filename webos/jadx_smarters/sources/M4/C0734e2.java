package M4;

import java.lang.Thread;

/* JADX INFO: renamed from: M4.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0734e2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0758i2 f4662b;

    public C0734e2(C0758i2 c0758i2, String str) {
        this.f4662b = c0758i2;
        com.google.android.gms.common.internal.r.m(str);
        this.f4661a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4662b.f4245a.d().r().b(this.f4661a, th);
    }
}
