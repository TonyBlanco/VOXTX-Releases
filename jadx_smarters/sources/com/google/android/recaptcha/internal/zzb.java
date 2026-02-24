package com.google.android.recaptcha.internal;

import G8.T;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {
    @NotNull
    public static final Task zza(@NotNull T t9) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        t9.i(new zza(taskCompletionSource, t9));
        return taskCompletionSource.getTask();
    }
}
