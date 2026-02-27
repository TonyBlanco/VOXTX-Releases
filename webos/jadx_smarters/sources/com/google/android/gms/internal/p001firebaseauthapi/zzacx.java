package com.google.android.gms.internal.p001firebaseauthapi;

import A5.f;
import G5.AbstractC0540g;
import G5.AbstractC0553u;
import G5.H;
import H5.InterfaceC0627s;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1369j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzacx<ResultT, CallbackT> implements zzadj<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected f zzc;
    protected AbstractC0553u zzd;
    protected CallbackT zze;
    protected InterfaceC0627s zzf;
    protected zzacv<ResultT> zzg;
    protected Executor zzi;
    protected zzafn zzj;
    protected zzafc zzk;
    protected zzaen zzl;
    protected zzafw zzm;
    protected String zzn;
    protected String zzo;
    protected AbstractC0540g zzp;
    protected String zzq;
    protected String zzr;
    protected zzyk zzs;
    protected zzafk zzt;
    protected zzafj zzu;
    protected zzagj zzv;
    protected zzagb zzw;
    boolean zzx;
    private boolean zzz;
    protected final zzacz zzb = new zzacz(this);
    protected final List<H> zzh = new ArrayList();
    private boolean zzy = true;

    public static class zza extends LifecycleCallback {
        private final List<H> zza;

        private zza(InterfaceC1369j interfaceC1369j, List<H> list) {
            super(interfaceC1369j);
            this.mLifecycleFragment.f("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<H> list) {
            InterfaceC1369j fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.g("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacx(int i9) {
        this.zza = i9;
    }

    public static /* synthetic */ void zza(zzacx zzacxVar) {
        zzacxVar.zzb();
        r.q(zzacxVar.zzz, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzacx zzacxVar, Status status) {
        InterfaceC0627s interfaceC0627s = zzacxVar.zzf;
        if (interfaceC0627s != null) {
            interfaceC0627s.zza(status);
        }
    }

    public final zzacx<ResultT, CallbackT> zza(f fVar) {
        this.zzc = (f) r.n(fVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(H h9, Activity activity, Executor executor, String str) {
        H hZza = zzadt.zza(str, h9, this);
        synchronized (this.zzh) {
            this.zzh.add((H) r.m(hZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) r.m(executor);
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(AbstractC0553u abstractC0553u) {
        this.zzd = (AbstractC0553u) r.n(abstractC0553u, "firebaseUser cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(InterfaceC0627s interfaceC0627s) {
        this.zzf = (InterfaceC0627s) r.n(interfaceC0627s, "external failure callback cannot be null");
        return this;
    }

    public final zzacx<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) r.n(callbackt, "external callback cannot be null");
        return this;
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, null);
    }
}
