package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class alt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecureSignalsAdapter f20153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f20156d = new TaskCompletionSource();

    public alt(SecureSignalsAdapter secureSignalsAdapter, String str, Context context) {
        this.f20153a = secureSignalsAdapter;
        this.f20155c = str;
        this.f20154b = context;
    }

    public final Task b() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f20153a.collectSignals(this.f20154b, new als(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task c() {
        SecureSignalsAdapter secureSignalsAdapter = this.f20153a;
        Context context = this.f20154b;
        new alr(this);
        return this.f20156d.getTask();
    }

    public final String e() {
        return this.f20155c;
    }

    public final String f() {
        return this.f20153a.getVersion().toString();
    }
}
