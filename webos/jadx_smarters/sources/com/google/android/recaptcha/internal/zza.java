package com.google.android.recaptcha.internal;

import G8.T;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import k8.q;
import kotlin.jvm.internal.m;
import w8.l;

/* JADX INFO: loaded from: classes3.dex */
final class zza extends m implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ T zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(TaskCompletionSource taskCompletionSource, T t9) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = t9;
    }

    @Override // w8.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable thE = this.zzb.e();
            if (thE == null) {
                this.zza.setResult(this.zzb.c());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = thE instanceof Exception ? (Exception) thE : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(thE);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return q.f43674a;
    }
}
