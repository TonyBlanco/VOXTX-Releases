package com.google.android.recaptcha.internal;

import G8.L;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import k8.k;
import k8.q;
import l8.s;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzbb extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbc zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(String[] strArr, zzbc zzbcVar, String str, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zza = strArr;
        this.zzb = zzbcVar;
        this.zzc = str;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzbb(this.zza, this.zzb, this.zzc, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AbstractC2512c.d();
        k.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + s.A(arrayList, ",", null, null, 0, null, null, 62, null) + ")", null);
        return q.f43674a;
    }
}
