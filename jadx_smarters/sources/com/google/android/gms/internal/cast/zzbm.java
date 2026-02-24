package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n4.C2286s;
import o4.AbstractC2318A;
import o4.C2326c;
import o4.C2328e;
import o4.C2346x;
import p4.C2434i;
import t.AbstractC2756c;
import t4.C2775b;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(30)
public final class zzbm {
    private static final C2775b zza = new C2775b("SessionTransController");
    private final C2326c zzb;
    private C2346x zzg;
    private AbstractC2756c.a zzh;
    private C2286s zzi;
    private final Set zzc = Collections.synchronizedSet(new HashSet());
    private int zzf = 0;
    private final Handler zzd = new zzdy(Looper.getMainLooper());
    private final Runnable zze = new Runnable() { // from class: com.google.android.gms.internal.cast.zzbh
        @Override // java.lang.Runnable
        public final void run() {
            zzbm.zze(this.zza);
        }
    };

    public zzbm(C2326c c2326c) {
        this.zzb = c2326c;
    }

    public static /* synthetic */ void zzd(zzbm zzbmVar, C2286s c2286s) {
        zzbmVar.zzi = c2286s;
        AbstractC2756c.a aVar = zzbmVar.zzh;
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public static /* synthetic */ void zze(zzbm zzbmVar) {
        zza.e("transfer with type = %d has timed out", Integer.valueOf(zzbmVar.zzf));
        zzbmVar.zzp(101);
    }

    public static /* bridge */ /* synthetic */ void zzg(zzbm zzbmVar) {
        int i9 = zzbmVar.zzf;
        if (i9 == 0) {
            zza.a("No need to notify transferred if the transfer type is unknown", new Object[0]);
            return;
        }
        C2286s c2286s = zzbmVar.zzi;
        if (c2286s == null) {
            zza.a("No need to notify with null sessionState", new Object[0]);
            return;
        }
        zza.a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i9), zzbmVar.zzi);
        Iterator it = new HashSet(zzbmVar.zzc).iterator();
        while (it.hasNext()) {
            ((AbstractC2318A) it.next()).onTransferred(zzbmVar.zzf, c2286s);
        }
    }

    public static /* bridge */ /* synthetic */ void zzi(zzbm zzbmVar) {
        if (zzbmVar.zzi == null) {
            zza.a("skip restoring session state due to null SessionState", new Object[0]);
            return;
        }
        C2434i c2434iZzo = zzbmVar.zzo();
        if (c2434iZzo == null) {
            zza.a("skip restoring session state due to null RemoteMediaClient", new Object[0]);
        } else {
            zza.a("resume SessionState to current session", new Object[0]);
            c2434iZzo.m0(zzbmVar.zzi);
        }
    }

    private final C2434i zzo() {
        C2346x c2346x = this.zzg;
        if (c2346x == null) {
            zza.a("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        C2328e c2328eC = c2346x.c();
        if (c2328eC != null) {
            return c2328eC.r();
        }
        zza.a("skip transferring as CastSession is null", new Object[0]);
        return null;
    }

    private final void zzp(int i9) {
        AbstractC2756c.a aVar = this.zzh;
        if (aVar != null) {
            aVar.c();
        }
        zza.a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.zzf), Integer.valueOf(i9));
        Iterator it = new HashSet(this.zzc).iterator();
        while (it.hasNext()) {
            ((AbstractC2318A) it.next()).onTransferFailed(this.zzf, i9);
        }
        zzq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq() {
        ((Handler) r.m(this.zzd)).removeCallbacks((Runnable) r.m(this.zze));
        this.zzf = 0;
        this.zzi = null;
    }

    public final void zzj(C2346x c2346x) {
        this.zzg = c2346x;
        ((Handler) r.m(this.zzd)).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                zzbm zzbmVar = this.zza;
                ((C2346x) r.m(zzbmVar.zzg)).a(new zzbl(zzbmVar, null), C2328e.class);
            }
        });
    }

    public final /* synthetic */ void zzk(Exception exc) {
        zza.g(exc, "Fail to store SessionState", new Object[0]);
        zzp(100);
    }

    public final void zzl(C2812L.h hVar, C2812L.h hVar2, AbstractC2756c.a aVar) {
        int i9;
        if (new HashSet(this.zzc).isEmpty()) {
            zza.a("No need to prepare transfer without any callback", new Object[0]);
            aVar.b(null);
            return;
        }
        if (hVar.o() != 1) {
            zza.a("No need to prepare transfer when transferring from local", new Object[0]);
            aVar.b(null);
            return;
        }
        C2434i c2434iZzo = zzo();
        if (c2434iZzo == null || !c2434iZzo.q()) {
            zza.a("No need to prepare transfer when there is no media session", new Object[0]);
            aVar.b(null);
            return;
        }
        C2775b c2775b = zza;
        c2775b.a("Prepare route transfer for changing endpoint", new Object[0]);
        if (hVar2.o() == 0) {
            zzr.zzd(zzln.CAST_TRANSFER_TO_LOCAL_USED);
            i9 = 1;
        } else {
            i9 = CastDevice.K(hVar2.i()) == null ? 3 : 2;
        }
        this.zzf = i9;
        this.zzh = aVar;
        c2775b.a("notify transferring with type = %d", Integer.valueOf(i9));
        Iterator it = new HashSet(this.zzc).iterator();
        while (it.hasNext()) {
            ((AbstractC2318A) it.next()).onTransferring(this.zzf);
        }
        this.zzi = null;
        c2434iZzo.g0(null).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzbi
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                zzbm.zzd(this.zza, (C2286s) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzbj
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzk(exc);
            }
        });
        ((Handler) r.m(this.zzd)).postDelayed((Runnable) r.m(this.zze), 10000L);
    }

    public final void zzm(AbstractC2318A abstractC2318A) {
        zza.a("register callback = %s", abstractC2318A);
        r.f("Must be called from the main thread.");
        r.m(abstractC2318A);
        this.zzc.add(abstractC2318A);
    }

    public final void zzn(AbstractC2318A abstractC2318A) {
        zza.a("unregister callback = %s", abstractC2318A);
        r.f("Must be called from the main thread.");
        if (abstractC2318A != null) {
            this.zzc.remove(abstractC2318A);
        }
    }
}
