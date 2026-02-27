package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzahe;
import com.google.android.gms.internal.p001firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzahf<MessageType extends zzahf<MessageType, BuilderType>, BuilderType extends zzahe<MessageType, BuilderType>> implements zzakn {
    protected int zza = 0;

    public int a_() {
        throw new UnsupportedOperationException();
    }

    public int zza(zzalf zzalfVar) {
        int iA_ = a_();
        if (iA_ != -1) {
            return iA_;
        }
        int iZza = zzalfVar.zza(this);
        zzb(iZza);
        return iZza;
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzaik zzaikVarZza = zzaik.zza(outputStream, zzaik.zzf(zzl()));
        zza(zzaikVarZza);
        zzaikVarZza.zzc();
    }

    public void zzb(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
    public final zzahp zzi() {
        try {
            zzahu zzahuVarZzc = zzahp.zzc(zzl());
            zza(zzahuVarZzc.zzb());
            return zzahuVarZzc.zza();
        } catch (IOException e9) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e9);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzl()];
            zzaik zzaikVarZzb = zzaik.zzb(bArr);
            zza(zzaikVarZzb);
            zzaikVarZzb.zzb();
            return bArr;
        } catch (IOException e9) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e9);
        }
    }
}
