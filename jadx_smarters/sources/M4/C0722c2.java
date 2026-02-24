package M4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzt;
import com.google.android.gms.internal.measurement.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import s.C2695a;
import s.C2701g;

/* JADX INFO: renamed from: M4.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0722c2 extends E4 implements InterfaceC0743g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f4620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f4621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f4622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f4623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f4624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f4625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2701g f4626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzr f4627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f4628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f4629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f4630n;

    public C0722c2(S4 s42) {
        super(s42);
        this.f4620d = new C2695a();
        this.f4621e = new C2695a();
        this.f4622f = new C2695a();
        this.f4623g = new C2695a();
        this.f4624h = new C2695a();
        this.f4628l = new C2695a();
        this.f4629m = new C2695a();
        this.f4630n = new C2695a();
        this.f4625i = new C2695a();
        this.f4626j = new Z1(this, 20);
        this.f4627k = new C0710a2(this);
    }

    public static final Map q(zzff zzffVar) {
        C2695a c2695a = new C2695a();
        if (zzffVar != null) {
            for (zzfj zzfjVar : zzffVar.zzp()) {
                c2695a.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return c2695a;
    }

    public static /* bridge */ /* synthetic */ zzc s(C0722c2 c0722c2, String str) throws Throwable {
        c0722c2.i();
        com.google.android.gms.common.internal.r.g(str);
        if (!c0722c2.C(str)) {
            return null;
        }
        if (!c0722c2.f4624h.containsKey(str) || c0722c2.f4624h.get(str) == null) {
            c0722c2.o(str);
        } else {
            c0722c2.p(str, (zzff) c0722c2.f4624h.get(str));
        }
        return (zzc) c0722c2.f4626j.snapshot().get(str);
    }

    public final void A(String str) {
        h();
        this.f4624h.remove(str);
    }

    public final boolean B(String str) {
        h();
        zzff zzffVarT = t(str);
        if (zzffVarT == null) {
            return false;
        }
        return zzffVarT.zzs();
    }

    public final boolean C(String str) {
        zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (zzff) this.f4624h.get(str)) == null || zzffVar.zza() == 0) ? false : true;
    }

    public final boolean D(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f4623g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean F(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        o(str);
        if (D(str) && a5.Y(str2)) {
            return true;
        }
        if (G(str) && a5.Z(str2)) {
            return true;
        }
        Map map = (Map) this.f4622f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_public"));
    }

    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        i();
        h();
        com.google.android.gms.common.internal.r.g(str);
        zzfe zzfeVar = (zzfe) m(str, bArr).zzbB();
        n(str, zzfeVar);
        p(str, (zzff) zzfeVar.zzaD());
        this.f4624h.put(str, (zzff) zzfeVar.zzaD());
        this.f4628l.put(str, zzfeVar.zze());
        this.f4629m.put(str, str2);
        this.f4630n.put(str, str3);
        this.f4620d.put(str, q((zzff) zzfeVar.zzaD()));
        this.f4234b.V().n(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((zzff) zzfeVar.zzaD()).zzbx();
        } catch (RuntimeException e9) {
            this.f4245a.d().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", C0858z1.z(str), e9);
        }
        C0773l c0773lV = this.f4234b.V();
        com.google.android.gms.common.internal.r.g(str);
        c0773lV.h();
        c0773lV.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c0773lV.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c0773lV.f4245a.d().r().b("Failed to update remote config (got 0). appId", C0858z1.z(str));
            }
        } catch (SQLiteException e10) {
            c0773lV.f4245a.d().r().c("Error storing remote config. appId", C0858z1.z(str), e10);
        }
        this.f4624h.put(str, (zzff) zzfeVar.zzaD());
        return true;
    }

    public final boolean I(String str) throws Throwable {
        h();
        o(str);
        return this.f4621e.get(str) != null && ((Set) this.f4621e.get(str)).contains("app_instance_id");
    }

    public final boolean J(String str) throws Throwable {
        h();
        o(str);
        if (this.f4621e.get(str) != null) {
            return ((Set) this.f4621e.get(str)).contains("device_model") || ((Set) this.f4621e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) throws Throwable {
        h();
        o(str);
        return this.f4621e.get(str) != null && ((Set) this.f4621e.get(str)).contains("enhanced_user_id");
    }

    public final boolean L(String str) throws Throwable {
        h();
        o(str);
        return this.f4621e.get(str) != null && ((Set) this.f4621e.get(str)).contains("google_signals");
    }

    public final boolean M(String str) throws Throwable {
        h();
        o(str);
        if (this.f4621e.get(str) != null) {
            return ((Set) this.f4621e.get(str)).contains("os_version") || ((Set) this.f4621e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean N(String str) throws Throwable {
        h();
        o(str);
        return this.f4621e.get(str) != null && ((Set) this.f4621e.get(str)).contains("user_id");
    }

    @Override // M4.InterfaceC0743g
    public final String e(String str, String str2) throws Throwable {
        h();
        o(str);
        Map map = (Map) this.f4620d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // M4.E4
    public final boolean l() {
        return false;
    }

    public final zzff m(String str, byte[] bArr) {
        if (bArr == null) {
            return zzff.zzg();
        }
        try {
            zzff zzffVar = (zzff) ((zzfe) U4.E(zzff.zze(), bArr)).zzaD();
            this.f4245a.d().v().c("Parsed config. version, gmp_app_id", zzffVar.zzu() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzt() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (zzll e9) {
            e = e9;
            this.f4245a.d().w().c("Unable to merge remote config. appId", C0858z1.z(str), e);
            return zzff.zzg();
        } catch (RuntimeException e10) {
            e = e10;
            this.f4245a.d().w().c("Unable to merge remote config. appId", C0858z1.z(str), e);
            return zzff.zzg();
        }
    }

    public final void n(String str, zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        C2695a c2695a = new C2695a();
        C2695a c2695a2 = new C2695a();
        C2695a c2695a3 = new C2695a();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzfb) it.next()).zzb());
        }
        for (int i9 = 0; i9 < zzfeVar.zza(); i9++) {
            zzfc zzfcVar = (zzfc) zzfeVar.zzb(i9).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                this.f4245a.d().w().a("EventConfig contained null event name");
            } else {
                String strZzc = zzfcVar.zzc();
                String strB = L2.b(zzfcVar.zzc());
                if (!TextUtils.isEmpty(strB)) {
                    zzfcVar.zzb(strB);
                    zzfeVar.zzd(i9, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    c2695a.put(strZzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    c2695a2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        this.f4245a.d().w().c("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        c2695a3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.f4621e.put(str, hashSet);
        this.f4622f.put(str, c2695a);
        this.f4623g.put(str, c2695a2);
        this.f4625i.put(str, c2695a3);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0082: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x0082 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0722c2.o(java.lang.String):void");
    }

    public final void p(final String str, zzff zzffVar) {
        if (zzffVar.zza() == 0) {
            this.f4626j.remove(str);
            return;
        }
        this.f4245a.d().v().b("EES programs found", Integer.valueOf(zzffVar.zza()));
        zzgt zzgtVar = (zzgt) zzffVar.zzo().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: M4.W1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new C0716b2(this.f4527a, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: M4.X1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C0722c2 c0722c2 = this.f4534a;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: M4.V1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C0722c2 c0722c22 = c0722c2;
                            String str3 = str2;
                            I2 i2R = c0722c22.f4234b.V().R(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            c0722c22.f4245a.z().q();
                            map.put("gmp_version", 79000L);
                            if (i2R != null) {
                                String strO0 = i2R.o0();
                                if (strO0 != null) {
                                    map.put("app_version", strO0);
                                }
                                map.put("app_version_int", Long.valueOf(i2R.R()));
                                map.put("dynamite_version", Long.valueOf(i2R.a0()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: M4.Y1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzt(this.f4550a.f4627k);
                }
            });
            zzcVar.zzc(zzgtVar);
            this.f4626j.put(str, zzcVar);
            this.f4245a.d().v().c("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.f4245a.d().v().b("EES program activity", ((zzgr) it.next()).zzb());
            }
        } catch (zzd unused) {
            this.f4245a.d().r().b("Failed to load EES program. appId", str);
        }
    }

    public final int r(String str, String str2) throws Throwable {
        Integer num;
        h();
        o(str);
        Map map = (Map) this.f4625i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzff t(String str) {
        i();
        h();
        com.google.android.gms.common.internal.r.g(str);
        o(str);
        return (zzff) this.f4624h.get(str);
    }

    public final String u(String str) {
        h();
        return (String) this.f4630n.get(str);
    }

    public final String v(String str) {
        h();
        return (String) this.f4629m.get(str);
    }

    public final String w(String str) throws Throwable {
        h();
        o(str);
        return (String) this.f4628l.get(str);
    }

    public final Set y(String str) {
        h();
        o(str);
        return (Set) this.f4621e.get(str);
    }

    public final void z(String str) {
        h();
        this.f4629m.put(str, null);
    }
}
