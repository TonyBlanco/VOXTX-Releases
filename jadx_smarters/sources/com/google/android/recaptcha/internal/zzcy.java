package com.google.android.recaptcha.internal;

import G8.L;
import android.content.Context;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzcy extends l implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ zzda zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzda zzdaVar, String str, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zze = zzdaVar;
        this.zzf = str;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzcy(this.zze, this.zzf, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcy) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        ?? r02;
        Object objD = AbstractC2512c.d();
        int i9 = this.zzd;
        try {
            if (i9 == 0) {
                k.b(obj);
                zzda zzdaVar = this.zze;
                kotlinx.coroutines.sync.b bVar = zzdaVar.zzo;
                obj2 = this.zzf;
                this.zza = bVar;
                this.zzb = zzdaVar;
                this.zzc = obj2;
                this.zzd = 1;
                if (bVar.a(null, this) == objD) {
                    return objD;
                }
                obj3 = zzdaVar;
                obj4 = bVar;
            } else {
                if (i9 != 1) {
                    r02 = this.zza;
                    try {
                        k.b(obj);
                        r02 = r02;
                        q qVar = q.f43674a;
                        r02.c(null);
                        return q.f43674a;
                    } catch (Throwable th) {
                        th = th;
                        r02.c(null);
                        throw th;
                    }
                }
                Object obj5 = this.zzc;
                obj3 = this.zzb;
                Object obj6 = this.zza;
                k.b(obj);
                obj2 = obj5;
                obj4 = obj6;
            }
            String strZzb = ((zzda) obj3).zzf.zzb();
            String str = ((zzda) obj3).zzd;
            String str2 = ((zzda) obj3).zzh;
            String str3 = ((zzda) obj3).zzg;
            Context context = ((zzda) obj3).zze;
            zzr zzrVar = ((zzda) obj3).zzf;
            this.zza = obj4;
            this.zzb = null;
            this.zzc = null;
            this.zzd = 2;
            if (zzbj.zzb(strZzb, str, (String) obj2, str2, str3, context, zzrVar, this) == objD) {
                return objD;
            }
            r02 = obj4;
            q qVar2 = q.f43674a;
            r02.c(null);
            return q.f43674a;
        } catch (Throwable th2) {
            th = th2;
            r02 = obj4;
            r02.c(null);
            throw th;
        }
    }
}
