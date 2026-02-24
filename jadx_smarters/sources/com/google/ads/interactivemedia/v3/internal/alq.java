package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class alq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f20145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aib f20146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alm f20147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TaskCompletionSource f20148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f20149f;

    public alq(Context context, ExecutorService executorService, alm almVar) {
        alp alpVar = new alp(null);
        this.f20148e = new TaskCompletionSource();
        this.f20144a = context;
        this.f20145b = executorService;
        this.f20147d = almVar;
        this.f20146c = alpVar;
    }

    public final Map a() {
        try {
            Task task = this.f20148e.getTask();
            return (Map) Tasks.await(this.f20149f == null ? Tasks.forResult(null) : Tasks.withTimeout(task, r2.intValue(), TimeUnit.MILLISECONDS).addOnFailureListener(new alo(this, 1)));
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public final /* synthetic */ void b(Exception exc) {
        this.f20147d.b(com.google.ads.interactivemedia.v3.impl.data.bi.PLATFORM_SIGNAL_COLLECTOR, com.google.ads.interactivemedia.v3.impl.data.bj.PLATFORM_COLLECT_SIGNALS, exc);
    }

    public final void c(Integer num) {
        this.f20149f = num;
        Task taskForResult = Tasks.forResult(null);
        final TaskCompletionSource taskCompletionSource = this.f20148e;
        taskForResult.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.ads.interactivemedia.v3.internal.aln
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                taskCompletionSource.setResult((Map) obj);
            }
        });
        taskForResult.addOnFailureListener(new alo(this.f20148e, 0));
    }
}
