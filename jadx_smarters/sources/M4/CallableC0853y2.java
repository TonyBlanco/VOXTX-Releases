package M4;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: M4.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC0853y2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832v f5133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D2 f5135c;

    public CallableC0853y2(D2 d22, C0832v c0832v, String str) {
        this.f5135c = d22;
        this.f5133a = c0832v;
        this.f5134b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        X4 x42;
        I2 i22;
        zzga zzgaVar;
        String str;
        Bundle bundle;
        zzgc zzgcVar;
        String str2;
        r rVarC;
        long j9;
        this.f5135c.f4226a.e();
        C0854y3 c0854y3D0 = this.f5135c.f4226a.d0();
        C0832v c0832v = this.f5133a;
        String str3 = this.f5134b;
        c0854y3D0.h();
        C0776l2.t();
        com.google.android.gms.common.internal.r.m(c0832v);
        com.google.android.gms.common.internal.r.g(str3);
        if (!c0854y3D0.f4245a.z().B(str3, AbstractC0781m1.f4880W)) {
            c0854y3D0.f4245a.d().q().b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(c0832v.f5088f) && !"_iapx".equals(c0832v.f5088f)) {
            c0854y3D0.f4245a.d().q().c("Generating a payload for this event is not available. package_name, event_name", str3, c0832v.f5088f);
            return null;
        }
        zzga zzgaVarZza = zzgb.zza();
        c0854y3D0.f4234b.V().e0();
        try {
            I2 i2R = c0854y3D0.f4234b.V().R(str3);
            if (i2R == null) {
                c0854y3D0.f4245a.d().q().b("Log and bundle not available. package_name", str3);
            } else {
                if (i2R.O()) {
                    zzgc zzgcVarZzu = zzgd.zzu();
                    zzgcVarZzu.zzad(1);
                    zzgcVarZzu.zzZ("android");
                    if (!TextUtils.isEmpty(i2R.l0())) {
                        zzgcVarZzu.zzD(i2R.l0());
                    }
                    if (!TextUtils.isEmpty(i2R.n0())) {
                        zzgcVarZzu.zzF((String) com.google.android.gms.common.internal.r.m(i2R.n0()));
                    }
                    if (!TextUtils.isEmpty(i2R.o0())) {
                        zzgcVarZzu.zzG((String) com.google.android.gms.common.internal.r.m(i2R.o0()));
                    }
                    if (i2R.R() != -2147483648L) {
                        zzgcVarZzu.zzH((int) i2R.R());
                    }
                    zzgcVarZzu.zzV(i2R.c0());
                    zzgcVarZzu.zzP(i2R.a0());
                    String strA = i2R.a();
                    String strJ0 = i2R.j0();
                    if (!TextUtils.isEmpty(strA)) {
                        zzgcVarZzu.zzU(strA);
                    } else if (!TextUtils.isEmpty(strJ0)) {
                        zzgcVarZzu.zzC(strJ0);
                    }
                    zzpz.zzc();
                    if (c0854y3D0.f4245a.z().B(null, AbstractC0781m1.f4860G0)) {
                        zzgcVarZzu.zzaj(i2R.h0());
                    }
                    K2 k2C0 = c0854y3D0.f4234b.c0(str3);
                    zzgcVarZzu.zzM(i2R.Z());
                    if (c0854y3D0.f4245a.o() && c0854y3D0.f4245a.z().C(zzgcVarZzu.zzaq()) && k2C0.j(J2.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzgcVarZzu.zzO(null);
                    }
                    zzgcVarZzu.zzL(k2C0.i());
                    if (k2C0.j(J2.AD_STORAGE) && i2R.N()) {
                        Pair pairN = c0854y3D0.f4234b.e0().n(i2R.l0(), k2C0);
                        if (i2R.N() && !TextUtils.isEmpty((CharSequence) pairN.first)) {
                            try {
                                zzgcVarZzu.zzae(C0854y3.e((String) pairN.first, Long.toString(c0832v.f5091i)));
                                Object obj = pairN.second;
                                if (obj != null) {
                                    zzgcVarZzu.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e9) {
                                c0854y3D0.f4245a.d().q().b("Resettable device id encryption failed", e9.getMessage());
                            }
                        }
                    }
                    c0854y3D0.f4245a.A().k();
                    zzgcVarZzu.zzN(Build.MODEL);
                    c0854y3D0.f4245a.A().k();
                    zzgcVarZzu.zzY(Build.VERSION.RELEASE);
                    zzgcVarZzu.zzak((int) c0854y3D0.f4245a.A().p());
                    zzgcVarZzu.zzao(c0854y3D0.f4245a.A().q());
                    try {
                        if (k2C0.j(J2.ANALYTICS_STORAGE) && i2R.m0() != null) {
                            zzgcVarZzu.zzE(C0854y3.e((String) com.google.android.gms.common.internal.r.m(i2R.m0()), Long.toString(c0832v.f5091i)));
                        }
                        if (!TextUtils.isEmpty(i2R.p0())) {
                            zzgcVarZzu.zzT((String) com.google.android.gms.common.internal.r.m(i2R.p0()));
                        }
                        String strL0 = i2R.l0();
                        List listC0 = c0854y3D0.f4234b.V().c0(strL0);
                        Iterator it = listC0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                x42 = null;
                                break;
                            }
                            x42 = (X4) it.next();
                            if ("_lte".equals(x42.f4545c)) {
                                break;
                            }
                        }
                        if (x42 == null || x42.f4547e == null) {
                            X4 x43 = new X4(strL0, "auto", "_lte", c0854y3D0.f4245a.a().a(), 0L);
                            listC0.add(x43);
                            c0854y3D0.f4234b.V().x(x43);
                        }
                        U4 u4G0 = c0854y3D0.f4234b.g0();
                        u4G0.f4245a.d().v().a("Checking account type status for ad personalization signals");
                        if (u4G0.f4245a.A().s()) {
                            String strL02 = i2R.l0();
                            com.google.android.gms.common.internal.r.m(strL02);
                            if (i2R.N() && u4G0.f4234b.Z().B(strL02)) {
                                u4G0.f4245a.d().q().a("Turning off ad personalization due to account type");
                                Iterator it2 = listC0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    if ("_npa".equals(((X4) it2.next()).f4545c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                listC0.add(new X4(strL02, "auto", "_npa", u4G0.f4245a.a().a(), 1L));
                            }
                        }
                        zzgm[] zzgmVarArr = new zzgm[listC0.size()];
                        for (int i9 = 0; i9 < listC0.size(); i9++) {
                            zzgl zzglVarZzd = zzgm.zzd();
                            zzglVarZzd.zzf(((X4) listC0.get(i9)).f4545c);
                            zzglVarZzd.zzg(((X4) listC0.get(i9)).f4546d);
                            c0854y3D0.f4234b.g0().M(zzglVarZzd, ((X4) listC0.get(i9)).f4547e);
                            zzgmVarArr[i9] = (zzgm) zzglVarZzd.zzaD();
                        }
                        zzgcVarZzu.zzj(Arrays.asList(zzgmVarArr));
                        A1 a1B = A1.b(c0832v);
                        c0854y3D0.f4245a.N().z(a1B.f4185d, c0854y3D0.f4234b.V().Q(str3));
                        c0854y3D0.f4245a.N().B(a1B, c0854y3D0.f4245a.z().n(str3));
                        Bundle bundle2 = a1B.f4185d;
                        bundle2.putLong("_c", 1L);
                        c0854y3D0.f4245a.d().q().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", c0832v.f5090h);
                        if (c0854y3D0.f4245a.N().U(zzgcVarZzu.zzaq())) {
                            c0854y3D0.f4245a.N().D(bundle2, "_dbg", 1L);
                            c0854y3D0.f4245a.N().D(bundle2, "_r", 1L);
                        }
                        r rVarV = c0854y3D0.f4234b.V().V(str3, c0832v.f5088f);
                        if (rVarV == null) {
                            zzgcVar = zzgcVarZzu;
                            i22 = i2R;
                            zzgaVar = zzgaVarZza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            rVarC = new r(str3, c0832v.f5088f, 0L, 0L, 0L, c0832v.f5091i, 0L, null, null, null, null);
                            j9 = 0;
                        } else {
                            i22 = i2R;
                            zzgaVar = zzgaVarZza;
                            str = str3;
                            bundle = bundle2;
                            zzgcVar = zzgcVarZzu;
                            str2 = null;
                            long j10 = rVarV.f5030f;
                            rVarC = rVarV.c(c0832v.f5091i);
                            j9 = j10;
                        }
                        c0854y3D0.f4234b.V().q(rVarC);
                        C0803q c0803q = new C0803q(c0854y3D0.f4245a, c0832v.f5090h, str, c0832v.f5088f, c0832v.f5091i, j9, bundle);
                        zzfs zzfsVarZze = zzft.zze();
                        zzfsVarZze.zzm(c0803q.f4999d);
                        zzfsVarZze.zzi(c0803q.f4997b);
                        zzfsVarZze.zzl(c0803q.f5000e);
                        C0814s c0814s = new C0814s(c0803q.f5001f);
                        while (c0814s.hasNext()) {
                            String next = c0814s.next();
                            zzfw zzfwVarZze = zzfx.zze();
                            zzfwVarZze.zzj(next);
                            Object objM = c0803q.f5001f.M(next);
                            if (objM != null) {
                                c0854y3D0.f4234b.g0().L(zzfwVarZze, objM);
                                zzfsVarZze.zze(zzfwVarZze);
                            }
                        }
                        zzgc zzgcVar2 = zzgcVar;
                        zzgcVar2.zzk(zzfsVarZze);
                        zzge zzgeVarZza = zzgg.zza();
                        zzfu zzfuVarZza = zzfv.zza();
                        zzfuVarZza.zza(rVarC.f5027c);
                        zzfuVarZza.zzb(c0832v.f5088f);
                        zzgeVarZza.zza(zzfuVarZza);
                        zzgcVar2.zzaa(zzgeVarZza);
                        zzgcVar2.zzf(c0854y3D0.f4234b.T().m(i22.l0(), Collections.emptyList(), zzgcVar2.zzau(), Long.valueOf(zzfsVarZze.zzc()), Long.valueOf(zzfsVarZze.zzc())));
                        if (zzfsVarZze.zzq()) {
                            zzgcVar2.zzai(zzfsVarZze.zzc());
                            zzgcVar2.zzQ(zzfsVarZze.zzc());
                        }
                        long jD0 = i22.d0();
                        if (jD0 != 0) {
                            zzgcVar2.zzab(jD0);
                        }
                        long jF0 = i22.f0();
                        if (jF0 != 0) {
                            zzgcVar2.zzac(jF0);
                        } else if (jD0 != 0) {
                            zzgcVar2.zzac(jD0);
                        }
                        String strD = i22.d();
                        zzqu.zzc();
                        String str4 = str;
                        if (c0854y3D0.f4245a.z().B(str4, AbstractC0781m1.f4917q0) && strD != null) {
                            zzgcVar2.zzah(strD);
                        }
                        i22.g();
                        zzgcVar2.zzI((int) i22.e0());
                        c0854y3D0.f4245a.z().q();
                        zzgcVar2.zzam(79000L);
                        zzgcVar2.zzal(c0854y3D0.f4245a.a().a());
                        zzgcVar2.zzag(true);
                        if (c0854y3D0.f4245a.z().B(str2, AbstractC0781m1.f4925u0)) {
                            c0854y3D0.f4234b.h(zzgcVar2.zzaq(), zzgcVar2);
                        }
                        zzga zzgaVar2 = zzgaVar;
                        zzgaVar2.zza(zzgcVar2);
                        I2 i23 = i22;
                        i23.E(zzgcVar2.zzd());
                        i23.C(zzgcVar2.zzc());
                        c0854y3D0.f4234b.V().p(i23);
                        c0854y3D0.f4234b.V().o();
                        c0854y3D0.f4234b.V().f0();
                        try {
                            return c0854y3D0.f4234b.g0().Q(((zzgb) zzgaVar2.zzaD()).zzbx());
                        } catch (IOException e10) {
                            c0854y3D0.f4245a.d().r().c("Data loss. Failed to bundle and serialize. appId", C0858z1.z(str4), e10);
                            return str2;
                        }
                    } catch (SecurityException e11) {
                        c0854y3D0.f4245a.d().q().b("app instance id encryption failed", e11.getMessage());
                        byte[] bArr = new byte[0];
                        c0854y3D0.f4234b.V().f0();
                        return bArr;
                    }
                }
                c0854y3D0.f4245a.d().q().b("Log and bundle disabled. package_name", str3);
            }
            byte[] bArr2 = new byte[0];
            c0854y3D0.f4234b.V().f0();
            return bArr2;
        } catch (Throwable th) {
            c0854y3D0.f4234b.V().f0();
            throw th;
        }
    }
}
