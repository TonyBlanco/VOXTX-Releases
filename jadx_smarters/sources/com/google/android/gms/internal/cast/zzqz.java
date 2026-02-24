package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzqy;
import com.google.android.gms.internal.cast.zzqz;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzqz<MessageType extends zzqz<MessageType, BuilderType>, BuilderType extends zzqy<MessageType, BuilderType>> implements zztp {
    protected int zza = 0;

    public int zzp(zzua zzuaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final zzrm zzq() {
        try {
            int iZzt = zzt();
            zzrm zzrmVar = zzrm.zzb;
            byte[] bArr = new byte[iZzt];
            zzru zzruVarZzz = zzru.zzz(bArr, 0, iZzt);
            zzI(zzruVarZzz);
            zzruVarZzz.zzA();
            return new zzrj(bArr);
        } catch (IOException e9) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e9);
        }
    }
}
