package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzeh;
import com.google.android.recaptcha.internal.zzei;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzeh<MessageType extends zzei<MessageType, BuilderType>, BuilderType extends zzeh<MessageType, BuilderType>> implements zzhx {
    @Override // 
    public abstract zzeh zza();

    public abstract zzeh zzb(zzei zzeiVar);

    @Override // com.google.android.recaptcha.internal.zzhx
    public final /* bridge */ /* synthetic */ zzhx zzc(zzhy zzhyVar) {
        if (zzX().getClass().isInstance(zzhyVar)) {
            return zzb((zzei) zzhyVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
