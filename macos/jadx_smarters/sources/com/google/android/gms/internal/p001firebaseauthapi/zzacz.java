package com.google.android.gms.internal.p001firebaseauthapi;

import G5.AbstractC0540g;
import G5.F;
import H5.AbstractC0622m;
import H5.InterfaceC0627s;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
final class zzacz implements zzace {
    final /* synthetic */ zzacx zza;

    public zzacz(zzacx zzacxVar) {
        this.zza = zzacxVar;
    }

    private final void zza(Status status, AbstractC0540g abstractC0540g, String str, String str2) {
        zzacx.zza(this.zza, status);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzp = abstractC0540g;
        zzacxVar.zzq = str;
        zzacxVar.zzr = str2;
        InterfaceC0627s interfaceC0627s = zzacxVar.zzf;
        if (interfaceC0627s != null) {
            interfaceC0627s.zza(status);
        }
        this.zza.zza(status);
    }

    private final void zza(zzadf zzadfVar) {
        this.zza.zzi.execute(new zzadc(this, zzadfVar));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza() throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 5, "Unexpected response type " + i9);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(F f9) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 8, "Unexpected response type " + i9);
        this.zza.zzz = true;
        this.zza.zzx = true;
        zza(new zzadb(this, f9));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(Status status) throws RemoteException {
        String strJ = status.J();
        if (strJ != null) {
            if (strJ.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (strJ.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (strJ.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (strJ.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (strJ.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (strJ.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (strJ.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (strJ.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (strJ.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (strJ.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzacx zzacxVar = this.zza;
        if (zzacxVar.zza != 8) {
            zzacx.zza(zzacxVar, status);
            this.zza.zza(status);
        } else {
            zzacxVar.zzz = true;
            this.zza.zzx = false;
            zza(new zzadd(this, status));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(Status status, F f9) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 2, "Unexpected response type " + i9);
        zza(status, f9, null, null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzaen zzaenVar) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 3, "Unexpected response type " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzl = zzaenVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzafj zzafjVar) throws RemoteException {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzu = zzafjVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzafk zzafkVar) throws RemoteException {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzt = zzafkVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzafn zzafnVar) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 1, "Unexpected response type: " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzj = zzafnVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzafn zzafnVar, zzafc zzafcVar) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 2, "Unexpected response type: " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzj = zzafnVar;
        zzacxVar.zzk = zzafcVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzafw zzafwVar) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 4, "Unexpected response type " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzm = zzafwVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzagb zzagbVar) throws RemoteException {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzw = zzagbVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzagj zzagjVar) throws RemoteException {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzv = zzagjVar;
        zzacx.zza(zzacxVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzyh zzyhVar) {
        zza(zzyhVar.zza(), zzyhVar.zzb(), zzyhVar.zzc(), zzyhVar.zzd());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(zzyk zzykVar) {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzs = zzykVar;
        zzacxVar.zza(AbstractC0622m.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zza(String str) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 8, "Unexpected response type " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzo = str;
        zzacxVar.zzz = true;
        this.zza.zzx = true;
        zza(new zzada(this, str));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zzb() throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 6, "Unexpected response type " + i9);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zzb(String str) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 8, "Unexpected response type " + i9);
        this.zza.zzo = str;
        zza(new zzacy(this, str));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zzc() throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 9, "Unexpected response type " + i9);
        zzacx.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzace
    public final void zzc(String str) throws RemoteException {
        int i9 = this.zza.zza;
        r.q(i9 == 7, "Unexpected response type " + i9);
        zzacx zzacxVar = this.zza;
        zzacxVar.zzn = str;
        zzacx.zza(zzacxVar);
    }
}
