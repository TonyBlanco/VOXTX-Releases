package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
final class zzot extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzou.zza();
    }
}
