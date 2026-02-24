package com.google.android.gms.internal.cast;

import A2.a;
import C2.u;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import n4.C;
import o4.C2328e;
import o4.C2346x;
import org.checkerframework.dataflow.qual.Pure;
import t4.H;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3018f;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {

    @VisibleForTesting
    InterfaceC3018f zza;
    private final Context zzb;
    private final H zzc;
    private final C2346x zzd;
    private final zzbm zze;
    private final zzae zzf;
    private int zzh = 1;
    private final String zzg = UUID.randomUUID().toString();

    private zzf(Context context, H h9, C2346x c2346x, zzbm zzbmVar, zzae zzaeVar) {
        this.zzb = context;
        this.zzc = h9;
        this.zzd = c2346x;
        this.zze = zzbmVar;
        this.zzf = zzaeVar;
    }

    public static zzf zza(Context context, H h9, C2346x c2346x, zzbm zzbmVar, zzae zzaeVar) {
        return new zzf(context, h9, c2346x, zzbmVar, zzaeVar);
    }

    public final /* synthetic */ void zzb(String str, SharedPreferences sharedPreferences, Bundle bundle) {
        r.m(this.zzd);
        C2346x c2346x = this.zzd;
        zzbm zzbmVar = this.zze;
        zzk zzkVar = new zzk(sharedPreferences, this, bundle, str);
        this.zzf.zze(zzkVar.zzc());
        c2346x.a(new zzi(zzkVar), C2328e.class);
        if (zzbmVar != null) {
            zzbmVar.zzm(new zzj(zzkVar));
        }
    }

    public final void zzc(Bundle bundle) {
        boolean z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (z9 || z10) {
            final String packageName = this.zzb.getPackageName();
            String str = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
            this.zzh = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            u.f(this.zzb);
            this.zza = u.c().g(a.f75g).a("CAST_SENDER_SDK", zzmq.class, C3014b.b("proto"), new InterfaceC3017e() { // from class: com.google.android.gms.internal.cast.zze
                @Override // z2.InterfaceC3017e
                public final Object apply(Object obj) {
                    zzmq zzmqVar = (zzmq) obj;
                    try {
                        int iZzt = zzmqVar.zzt();
                        byte[] bArr = new byte[iZzt];
                        zzru zzruVarZzz = zzru.zzz(bArr, 0, iZzt);
                        zzmqVar.zzI(zzruVarZzz);
                        zzruVarZzz.zzA();
                        return bArr;
                    } catch (IOException e9) {
                        throw new RuntimeException("Serializing " + zzmqVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e9);
                    }
                }
            });
            final SharedPreferences sharedPreferences = this.zzb.getApplicationContext().getSharedPreferences(str, 0);
            if (z9) {
                final H h9 = this.zzc;
                final String[] strArr = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                h9.doRead(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: t4.A
                    @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
                    public final void accept(Object obj, Object obj2) throws RemoteException {
                        H h10 = h9;
                        String[] strArr2 = strArr;
                        ((C2785l) ((I) obj).getService()).Z(new BinderC2773F(h10, (TaskCompletionSource) obj2), strArr2);
                    }
                }).d(C.f45269g).c(false).e(8426).a()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzd
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        this.zza.zzb(packageName, sharedPreferences, (Bundle) obj);
                    }
                });
            }
            if (z10) {
                r.m(sharedPreferences);
                zzr.zza(sharedPreferences, this, packageName).zze();
                zzr.zzd(zzln.CAST_CONTEXT);
            }
            zzp.zzg(this, packageName);
        }
    }

    @Pure
    public final void zzd(zzmq zzmqVar, int i9) {
        zzmp zzmpVarZzd = zzmq.zzd(zzmqVar);
        zzmpVarZzd.zzk(this.zzg);
        zzmpVarZzd.zzf(this.zzg);
        zzmq zzmqVar2 = (zzmq) zzmpVarZzd.zzp();
        int i10 = this.zzh;
        int i11 = i10 - 1;
        AbstractC3015c abstractC3015cF = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            abstractC3015cF = AbstractC3015c.f(i9 - 1, zzmqVar2);
        } else if (i11 == 1) {
            abstractC3015cF = AbstractC3015c.d(i9 - 1, zzmqVar2);
        }
        r.m(abstractC3015cF);
        InterfaceC3018f interfaceC3018f = this.zza;
        if (interfaceC3018f != null) {
            interfaceC3018f.a(abstractC3015cF);
        }
    }
}
