package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o4.C2326c;
import t4.C2775b;
import t4.H;
import u0.C2811K;
import u0.C2812L;
import u0.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbf extends zzak {
    private static final C2775b zza = new C2775b("MediaRouterProxy");
    private final C2812L zzb;
    private final C2326c zzc;
    private final Map zzd = new HashMap();
    private zzbm zze;
    private boolean zzf;

    public zzbf(Context context, C2812L c2812l, final C2326c c2326c, H h9) {
        this.zzb = c2812l;
        this.zzc = c2326c;
        if (Build.VERSION.SDK_INT <= 32) {
            zza.e("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        zza.a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.zze = new zzbm(c2326c);
        Intent intent = new Intent(context, (Class<?>) h0.class);
        intent.setPackage(context.getPackageName());
        boolean z9 = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.zzf = z9;
        if (z9) {
            zzr.zzd(zzln.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        h9.h(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.cast.zzbd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzp(c2326c, task);
            }
        });
    }

    private final void zzt(C2811K c2811k, int i9) {
        Set set = (Set) this.zzd.get(c2811k);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.b(c2811k, (C2812L.a) it.next(), i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzq(C2811K c2811k) {
        Set set = (Set) this.zzd.get(c2811k);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.s((C2812L.a) it.next());
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final Bundle zzb(String str) {
        for (C2812L.h hVar : this.zzb.m()) {
            if (hVar.k().equals(str)) {
                return hVar.i();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final String zzc() {
        return this.zzb.n().k();
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzd(Bundle bundle, final int i9) {
        final C2811K c2811kD = C2811K.d(bundle);
        if (c2811kD == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzt(c2811kD, i9);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(c2811kD, i9);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zze(Bundle bundle, zzan zzanVar) {
        C2811K c2811kD = C2811K.d(bundle);
        if (c2811kD == null) {
            return;
        }
        if (!this.zzd.containsKey(c2811kD)) {
            this.zzd.put(c2811kD, new HashSet());
        }
        ((Set) this.zzd.get(c2811kD)).add(new zzas(zzanVar));
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzf() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.zzb.s((C2812L.a) it2.next());
            }
        }
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzg(Bundle bundle) {
        final C2811K c2811kD = C2811K.d(bundle);
        if (c2811kD == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzq(c2811kD);
        } else {
            new zzdy(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(c2811kD);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzh() {
        C2812L c2812l = this.zzb;
        c2812l.u(c2812l.g());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzi(String str) {
        zza.a("select route with routeId = %s", str);
        for (C2812L.h hVar : this.zzb.m()) {
            if (hVar.k().equals(str)) {
                zza.a("media route is found and selected", new Object[0]);
                this.zzb.u(hVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final void zzj(int i9) {
        this.zzb.z(i9);
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzk() {
        C2812L.h hVarF = this.zzb.f();
        return hVarF != null && this.zzb.n().k().equals(hVarF.k());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzl() {
        C2812L.h hVarG = this.zzb.g();
        return hVarG != null && this.zzb.n().k().equals(hVarG.k());
    }

    @Override // com.google.android.gms.internal.cast.zzal
    public final boolean zzm(Bundle bundle, int i9) {
        C2811K c2811kD = C2811K.d(bundle);
        if (c2811kD == null) {
            return false;
        }
        return this.zzb.q(c2811kD, i9);
    }

    public final zzbm zzn() {
        return this.zze;
    }

    public final /* synthetic */ void zzo(C2811K c2811k, int i9) {
        synchronized (this.zzd) {
            zzt(c2811k, i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzp(o4.C2326c r9, com.google.android.gms.tasks.Task r10) {
        /*
            r8 = this;
            r0 = 2
            boolean r1 = r10.isSuccessful()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            java.lang.Object r10 = r10.getResult()
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r1 = "com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"
            if (r10 == 0) goto L1b
            boolean r4 = r10.containsKey(r1)
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            t4.b r5 = com.google.android.gms.internal.cast.zzbf.zza
            if (r3 == r4) goto L23
            java.lang.String r6 = "not existed"
            goto L25
        L23:
            java.lang.String r6 = "existed"
        L25:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r6
            java.lang.String r6 = "The module-to-client output switcher flag %s"
            r5.a(r6, r7)
            if (r4 == 0) goto L35
            boolean r10 = r10.getBoolean(r1)
            goto L36
        L35:
            r10 = 1
        L36:
            t4.b r1 = com.google.android.gms.internal.cast.zzbf.zza
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            boolean r5 = r9.T()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r2] = r4
            r6[r3] = r5
            java.lang.String r4 = "Set up output switcher flags: %b (from module), %b (from CastOptions)"
            r1.e(r4, r6)
            if (r10 == 0) goto L59
            boolean r9 = r9.T()
            if (r9 == 0) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = 0
        L5a:
            u0.L r10 = r8.zzb
            if (r10 == 0) goto Lbf
            o4.c r4 = r8.zzc
            if (r4 != 0) goto L63
            goto Lbf
        L63:
            boolean r5 = r4.S()
            boolean r4 = r4.Q()
            u0.g0$a r6 = new u0.g0$a
            r6.<init>()
            u0.g0$a r6 = r6.b(r9)
            u0.g0$a r6 = r6.d(r5)
            u0.g0$a r6 = r6.c(r4)
            u0.g0 r6 = r6.a()
            r10.x(r6)
            boolean r10 = r8.zzf
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r10
            r7[r3] = r9
            r7[r0] = r6
            r9 = 3
            r7[r9] = r4
            java.lang.String r9 = "media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b"
            r1.e(r9, r7)
            if (r5 == 0) goto Lbf
            u0.L r9 = r8.zzb
            com.google.android.gms.internal.cast.zzbb r10 = new com.google.android.gms.internal.cast.zzbb
            com.google.android.gms.internal.cast.zzbm r0 = r8.zze
            java.lang.Object r0 = com.google.android.gms.common.internal.r.m(r0)
            com.google.android.gms.internal.cast.zzbm r0 = (com.google.android.gms.internal.cast.zzbm) r0
            r10.<init>(r0)
            r9.w(r10)
            com.google.android.gms.internal.cast.zzln r9 = com.google.android.gms.internal.cast.zzln.CAST_TRANSFER_TO_LOCAL_ENABLED
            com.google.android.gms.internal.cast.zzr.zzd(r9)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzbf.zzp(o4.c, com.google.android.gms.tasks.Task):void");
    }

    public final void zzr(MediaSessionCompat mediaSessionCompat) {
        this.zzb.v(mediaSessionCompat);
    }

    public final boolean zzs() {
        return this.zzf;
    }
}
