package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa implements RecaptchaClient, RecaptchaTasksClient {

    @Nullable
    private static zzaa zzb;
    private static String zzd;

    @NotNull
    private final zzda zzf;

    @NotNull
    public static final zzw zza = new zzw(null);

    @NotNull
    private static final String zzc = UUID.randomUUID().toString();

    @NotNull
    private static final kotlinx.coroutines.sync.b zze = kotlinx.coroutines.sync.d.b(false, 1, null);

    public zzaa(@NotNull zzda zzdaVar) {
        this.zzf = zzdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo11executegIAlus(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r6, @org.jetbrains.annotations.NotNull o8.InterfaceC2372d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzx
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzx r0 = (com.google.android.recaptcha.internal.zzx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzx r0 = new com.google.android.recaptcha.internal.zzx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k8.k.b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            k8.k.b(r7)
            G8.L r7 = com.google.android.recaptcha.internal.zzp.zzb()
            o8.g r7 = r7.t()
            com.google.android.recaptcha.internal.zzy r2 = new com.google.android.recaptcha.internal.zzy
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.zzc = r3
            java.lang.Object r7 = G8.AbstractC0575i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            k8.j r7 = (k8.j) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaa.mo11executegIAlus(com.google.android.recaptcha.RecaptchaAction, o8.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        return zzb.zza(AbstractC0579k.b(zzp.zzb(), null, null, new zzz(this, recaptchaAction, null), 3, null));
    }

    @NotNull
    public final zzda zzb() {
        return this.zzf;
    }
}
