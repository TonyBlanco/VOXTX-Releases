package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class aru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20585a = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f20586f = afj.f19442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f20588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Task f20589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20590e;

    public aru(Context context, Executor executor, Task task, boolean z9) {
        this.f20587b = context;
        this.f20588c = executor;
        this.f20589d = task;
        this.f20590e = z9;
    }

    public static aru a(Context context, Executor executor, boolean z9) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(z9 ? new jc(context, taskCompletionSource, 10) : new ky(taskCompletionSource, 4));
        return new aru(context, executor, taskCompletionSource.getTask(), z9);
    }

    public static void g(int i9) {
        f20586f = i9;
    }

    private final Task h(final int i9, long j9, Exception exc, String str, String str2) {
        if (!this.f20590e) {
            return this.f20589d.continueWith(this.f20588c, new Continuation() { // from class: com.google.ads.interactivemedia.v3.internal.ars
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.isSuccessful());
                }
            });
        }
        final afl aflVarJ = afk.j();
        aflVarJ.a(this.f20587b.getPackageName());
        aflVarJ.e(j9);
        aflVarJ.g(f20586f);
        if (exc != null) {
            aflVarJ.f(atr.a(exc));
            aflVarJ.d(exc.getClass().getName());
        }
        if (str2 != null) {
            aflVarJ.b(str2);
        }
        if (str != null) {
            aflVarJ.c(str);
        }
        final byte[] bArr = null;
        return this.f20589d.continueWith(this.f20588c, new Continuation(i9, bArr) { // from class: com.google.ads.interactivemedia.v3.internal.art

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f20583a;

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                afl aflVar = this.f20584b;
                int i10 = this.f20583a;
                int i11 = aru.f20585a;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                asz aszVarA = ((ata) task.getResult()).a(((afk) aflVar.aY()).av());
                aszVarA.b(i10);
                aszVarA.a();
                return Boolean.TRUE;
            }
        });
    }

    public final void b(int i9, String str) {
        h(i9, 0L, null, null, str);
    }

    public final void c(int i9, long j9, Exception exc) {
        h(i9, j9, exc, null, null);
    }

    public final void d(int i9, long j9) {
        h(i9, j9, null, null, null);
    }

    public final void e(int i9, long j9, String str) {
        h(i9, j9, null, null, str);
    }

    public final void f(int i9, long j9, String str) {
        h(i9, j9, null, str, null);
    }
}
