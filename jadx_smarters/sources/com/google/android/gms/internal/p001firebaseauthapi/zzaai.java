package com.google.android.gms.internal.p001firebaseauthapi;

import A5.f;
import G5.AbstractC0540g;
import G5.AbstractC0553u;
import G5.C0537d;
import G5.C0541h;
import G5.C0555w;
import G5.F;
import G5.H;
import G5.I;
import G5.J;
import G5.L;
import G5.P;
import H5.AbstractC0631w;
import H5.C0611b;
import H5.C0613d;
import H5.C0620k;
import H5.InterfaceC0625p;
import H5.InterfaceC0627s;
import H5.Q;
import H5.T;
import H5.f0;
import android.app.Activity;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaai extends zzadh {
    public zzaai(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzacg(fVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public static C0611b zza(f fVar, zzafc zzafcVar) {
        r.m(fVar);
        r.m(zzafcVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f0(zzafcVar, "firebase"));
        List<zzafs> listZzl = zzafcVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i9 = 0; i9 < listZzl.size(); i9++) {
                arrayList.add(new f0(listZzl.get(i9)));
            }
        }
        C0611b c0611b = new C0611b(fVar, arrayList);
        c0611b.W(new C0613d(zzafcVar.zzb(), zzafcVar.zza()));
        c0611b.X(zzafcVar.zzn());
        c0611b.V(zzafcVar.zze());
        c0611b.R(AbstractC0631w.b(zzafcVar.zzk()));
        c0611b.Y(zzafcVar.zzd());
        return c0611b;
    }

    public final Task<zzafj> zza() {
        return zza(new zzaas());
    }

    public final Task<Object> zza(f fVar, F f9, String str, T t9) {
        zzadt.zza();
        return zza((zzabq) new zzabq(f9, str).zza(fVar).zza(t9));
    }

    public final Task<Void> zza(f fVar, I i9, AbstractC0553u abstractC0553u, String str, T t9) {
        zzadt.zza();
        zzaan zzaanVar = new zzaan(i9, abstractC0553u.zze(), str, null);
        zzaanVar.zza(fVar).zza(t9);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(f fVar, L l9, AbstractC0553u abstractC0553u, String str, String str2, T t9) {
        zzaan zzaanVar = new zzaan(l9, abstractC0553u.zze(), str, str2);
        zzaanVar.zza(fVar).zza(t9);
        return zza(zzaanVar);
    }

    public final Task<Void> zza(f fVar, C0537d c0537d, String str) {
        return zza((zzabi) new zzabi(str, c0537d).zza(fVar));
    }

    public final Task<Object> zza(f fVar, AbstractC0540g abstractC0540g, String str, T t9) {
        return zza((zzabm) new zzabm(abstractC0540g, str).zza(fVar).zza(t9));
    }

    public final Task<Object> zza(f fVar, C0541h c0541h, String str, T t9) {
        return zza((zzabn) new zzabn(c0541h, str).zza(fVar).zza(t9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, F f9, Q q9) {
        zzadt.zza();
        return zza((zzabx) new zzabx(f9).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, F f9, String str, Q q9) {
        zzadt.zza();
        return zza((zzabe) new zzabe(f9, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zza(f fVar, AbstractC0553u abstractC0553u, I i9, String str, T t9) {
        zzadt.zza();
        zzaaq zzaaqVar = new zzaaq(i9, str, null);
        zzaaqVar.zza(fVar).zza(t9);
        if (abstractC0553u != null) {
            zzaaqVar.zza(abstractC0553u);
        }
        return zza(zzaaqVar);
    }

    public final Task<Object> zza(f fVar, AbstractC0553u abstractC0553u, L l9, String str, String str2, T t9) {
        zzaaq zzaaqVar = new zzaaq(l9, str, str2);
        zzaaqVar.zza(fVar).zza(t9);
        if (abstractC0553u != null) {
            zzaaqVar.zza(abstractC0553u);
        }
        return zza(zzaaqVar);
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, P p9, Q q9) {
        return zza((zzaca) new zzaca(p9).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zza(f fVar, AbstractC0553u abstractC0553u, AbstractC0540g abstractC0540g, String str, Q q9) {
        r.m(fVar);
        r.m(abstractC0540g);
        r.m(abstractC0553u);
        r.m(q9);
        List listT = abstractC0553u.T();
        if (listT != null && listT.contains(abstractC0540g.H())) {
            return Tasks.forException(zzacf.zza(new Status(17015)));
        }
        if (abstractC0540g instanceof C0541h) {
            C0541h c0541h = (C0541h) abstractC0540g;
            return !c0541h.M() ? zza((zzaau) new zzaau(c0541h, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9)) : zza((zzaav) new zzaav(c0541h).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
        }
        if (abstractC0540g instanceof F) {
            zzadt.zza();
            return zza((zzaaw) new zzaaw((F) abstractC0540g).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
        }
        r.m(fVar);
        r.m(abstractC0540g);
        r.m(abstractC0553u);
        r.m(q9);
        return zza((zzaat) new zzaat(abstractC0540g).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, C0541h c0541h, String str, Q q9) {
        return zza((zzaba) new zzaba(c0541h, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, Q q9) {
        return zza((zzabg) new zzabg().zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<C0555w> zza(f fVar, AbstractC0553u abstractC0553u, String str, Q q9) {
        return zza((zzaap) new zzaap(str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, String str, String str2, Q q9) {
        return zza((zzabu) new zzabu(abstractC0553u.zze(), str, str2).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zza(f fVar, AbstractC0553u abstractC0553u, String str, String str2, String str3, String str4, Q q9) {
        return zza((zzabc) new zzabc(str, str2, str3, str4).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zza(f fVar, T t9, String str) {
        return zza((zzabj) new zzabj(str).zza(fVar).zza(t9));
    }

    public final Task<Void> zza(f fVar, String str, C0537d c0537d, String str2, String str3) {
        c0537d.O(1);
        return zza((zzabh) new zzabh(str, c0537d, str2, str3, "sendPasswordResetEmail").zza(fVar));
    }

    public final Task<Void> zza(f fVar, String str, String str2) {
        return zza((zzaah) new zzaah(str, str2).zza(fVar));
    }

    public final Task<Object> zza(f fVar, String str, String str2, T t9) {
        return zza((zzabl) new zzabl(str, str2).zza(fVar).zza(t9));
    }

    public final Task<Void> zza(f fVar, String str, String str2, String str3) {
        return zza((zzaaj) new zzaaj(str, str2, str3).zza(fVar));
    }

    public final Task<Object> zza(f fVar, String str, String str2, String str3, String str4, T t9) {
        return zza((zzaam) new zzaam(str, str2, str3, str4).zza(fVar).zza(t9));
    }

    public final Task<Void> zza(AbstractC0553u abstractC0553u, InterfaceC0625p interfaceC0625p) {
        return zza((zzaal) new zzaal().zza(abstractC0553u).zza(interfaceC0625p).zza((InterfaceC0627s) interfaceC0625p));
    }

    public final Task<Void> zza(C0620k c0620k, J j9, String str, long j10, boolean z9, boolean z10, String str2, String str3, boolean z11, H h9, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(j9, r.g(c0620k.zzc()), str, j10, z9, z10, str2, str3, z11);
        zzabrVar.zza(h9, activity, executor, j9.K());
        return zza(zzabrVar);
    }

    public final Task<zzagj> zza(C0620k c0620k, String str) {
        return zza(new zzabs(c0620k, str));
    }

    public final Task<Void> zza(C0620k c0620k, String str, String str2, long j9, boolean z9, boolean z10, String str3, String str4, boolean z11, H h9, Executor executor, Activity activity) {
        zzabp zzabpVar = new zzabp(c0620k, str, str2, j9, z9, z10, str3, str4, z11);
        zzabpVar.zza(h9, activity, executor, str);
        return zza(zzabpVar);
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabk(str));
    }

    public final Task<zzafk> zza(String str, String str2) {
        return zza(new zzaar(str, str2));
    }

    public final Task<Void> zza(String str, String str2, C0537d c0537d) {
        c0537d.O(7);
        return zza(new zzabz(str, str2, c0537d));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabf(str, str2, str3, str4));
    }

    public final void zza(f fVar, zzaga zzagaVar, H h9, Activity activity, Executor executor) {
        zza((zzacb) new zzacb(zzagaVar).zza(fVar).zza(h9, activity, executor, zzagaVar.zzd()));
    }

    public final Task<Object> zzb(f fVar, AbstractC0553u abstractC0553u, F f9, String str, Q q9) {
        zzadt.zza();
        return zza((zzabd) new zzabd(f9, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zzb(f fVar, AbstractC0553u abstractC0553u, AbstractC0540g abstractC0540g, String str, Q q9) {
        return zza((zzaay) new zzaay(abstractC0540g, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zzb(f fVar, AbstractC0553u abstractC0553u, C0541h c0541h, String str, Q q9) {
        return zza((zzaaz) new zzaaz(c0541h, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zzb(f fVar, AbstractC0553u abstractC0553u, String str, Q q9) {
        r.m(fVar);
        r.g(str);
        r.m(abstractC0553u);
        r.m(q9);
        List listT = abstractC0553u.T();
        if ((listT != null && !listT.contains(str)) || abstractC0553u.M()) {
            return Tasks.forException(zzacf.zza(new Status(17016, str)));
        }
        str.hashCode();
        return !str.equals(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD) ? zza((zzabw) new zzabw(str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9)) : zza((zzabt) new zzabt().zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zzb(f fVar, AbstractC0553u abstractC0553u, String str, String str2, String str3, String str4, Q q9) {
        return zza((zzabb) new zzabb(str, str2, str3, str4).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zzb(f fVar, String str, C0537d c0537d, String str2, String str3) {
        c0537d.O(6);
        return zza((zzabh) new zzabh(str, c0537d, str2, str3, "sendSignInLinkToEmail").zza(fVar));
    }

    public final Task<Object> zzb(f fVar, String str, String str2) {
        return zza((zzaak) new zzaak(str, str2).zza(fVar));
    }

    public final Task<Object> zzb(f fVar, String str, String str2, String str3, String str4, T t9) {
        return zza((zzabo) new zzabo(str, str2, str3, str4).zza(fVar).zza(t9));
    }

    public final Task<Object> zzc(f fVar, AbstractC0553u abstractC0553u, AbstractC0540g abstractC0540g, String str, Q q9) {
        return zza((zzaax) new zzaax(abstractC0540g, str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Void> zzc(f fVar, AbstractC0553u abstractC0553u, String str, Q q9) {
        return zza((zzabv) new zzabv(str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<Object> zzc(f fVar, String str, String str2) {
        return zza((zzaao) new zzaao(str, str2).zza(fVar));
    }

    public final Task<Void> zzd(f fVar, AbstractC0553u abstractC0553u, String str, Q q9) {
        return zza((zzaby) new zzaby(str).zza(fVar).zza(abstractC0553u).zza(q9).zza((InterfaceC0627s) q9));
    }

    public final Task<String> zzd(f fVar, String str, String str2) {
        return zza((zzacc) new zzacc(str, str2).zza(fVar));
    }
}
