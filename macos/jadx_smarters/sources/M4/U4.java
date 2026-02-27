package M4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import y4.b;

/* JADX INFO: loaded from: classes3.dex */
public final class U4 extends E4 {
    public U4(S4 s42) {
        super(s42);
    }

    public static zzmh E(zzmh zzmhVar, byte[] bArr) {
        zzkn zzknVarZza = zzkn.zza();
        return zzknVarZza != null ? zzmhVar.zzaz(bArr, zzknVarZza) : zzmhVar.zzay(bArr);
    }

    public static List J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i9 = 0; i9 < length; i9++) {
            long j9 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i9 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j9 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j9));
        }
        return arrayList;
    }

    public static boolean N(List list, int i9) {
        if (i9 < list.size() * 64) {
            return ((1 << (i9 % 64)) & ((Long) list.get(i9 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void m(zzfs zzfsVar, String str, Object obj) {
        List listZzp = zzfsVar.zzp();
        int i9 = 0;
        while (true) {
            if (i9 >= listZzp.size()) {
                i9 = -1;
                break;
            } else if (str.equals(((zzfx) listZzp.get(i9)).zzg())) {
                break;
            } else {
                i9++;
            }
        }
        zzfw zzfwVarZze = zzfx.zze();
        zzfwVarZze.zzj(str);
        if (obj instanceof Long) {
            zzfwVarZze.zzi(((Long) obj).longValue());
        }
        if (i9 >= 0) {
            zzfsVar.zzj(i9, zzfwVarZze);
        } else {
            zzfsVar.zze(zzfwVarZze);
        }
    }

    public static final boolean n(C0832v c0832v, f5 f5Var) {
        com.google.android.gms.common.internal.r.m(c0832v);
        com.google.android.gms.common.internal.r.m(f5Var);
        return (TextUtils.isEmpty(f5Var.f4687g) && TextUtils.isEmpty(f5Var.f4702v)) ? false : true;
    }

    public static final zzfx o(zzft zzftVar, String str) {
        for (zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    public static final Object p(zzft zzftVar, String str) {
        zzfx zzfxVarO = o(zzftVar, str);
        if (zzfxVarO == null) {
            return null;
        }
        if (zzfxVarO.zzy()) {
            return zzfxVarO.zzh();
        }
        if (zzfxVarO.zzw()) {
            return Long.valueOf(zzfxVarO.zzd());
        }
        if (zzfxVarO.zzu()) {
            return Double.valueOf(zzfxVarO.zza());
        }
        if (zzfxVarO.zzc() <= 0) {
            return null;
        }
        List<zzfx> listZzi = zzfxVarO.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfx zzfxVar : listZzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void s(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("  ");
        }
    }

    public static final String t(boolean z9, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void u(StringBuilder sb, int i9, String str, zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        s(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            s(sb, 4);
            sb.append("results: ");
            int i10 = 0;
            for (Long l9 : zzgiVar.zzi()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            s(sb, 4);
            sb.append("status: ");
            int i12 = 0;
            for (Long l10 : zzgiVar.zzk()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            s(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (zzfr zzfrVar : zzgiVar.zzh()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(":");
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            s(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (zzgk zzgkVar : zzgiVar.zzj()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        s(sb, 3);
        sb.append("}\n");
    }

    public static final void v(StringBuilder sb, int i9, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(sb, i9 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void w(StringBuilder sb, int i9, String str, zzer zzerVar) {
        if (zzerVar == null) {
            return;
        }
        s(sb, i9);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int iZzm = zzerVar.zzm();
            v(sb, i9, "comparison_type", iZzm != 1 ? iZzm != 2 ? iZzm != 3 ? iZzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzerVar.zzi()) {
            v(sb, i9, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            v(sb, i9, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            v(sb, i9, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            v(sb, i9, "max_comparison_value", zzerVar.zzd());
        }
        s(sb, i9);
        sb.append("}\n");
    }

    public static int x(zzgc zzgcVar, String str) {
        for (int i9 = 0; i9 < zzgcVar.zzb(); i9++) {
            if (str.equals(zzgcVar.zzap(i9).zzf())) {
                return i9;
            }
        }
        return -1;
    }

    public final Bundle A(Map map, boolean z9) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z9) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList2.add(A((Map) arrayList.get(i9), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    public final Parcelable B(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            this.f4245a.d().r().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final C0832v C(zzaa zzaaVar) {
        Object obj;
        Bundle bundleA = A(zzaaVar.zze(), true);
        String string = (!bundleA.containsKey("_o") || (obj = bundleA.get("_o")) == null) ? "app" : obj.toString();
        String strB = L2.b(zzaaVar.zzd());
        if (strB == null) {
            strB = zzaaVar.zzd();
        }
        return new C0832v(strB, new C0820t(bundleA), string, zzaaVar.zza());
    }

    public final zzft D(C0803q c0803q) {
        zzfs zzfsVarZze = zzft.zze();
        zzfsVarZze.zzl(c0803q.f5000e);
        C0814s c0814s = new C0814s(c0803q.f5001f);
        while (c0814s.hasNext()) {
            String next = c0814s.next();
            zzfw zzfwVarZze = zzfx.zze();
            zzfwVarZze.zzj(next);
            Object objM = c0803q.f5001f.M(next);
            com.google.android.gms.common.internal.r.m(objM);
            L(zzfwVarZze, objM);
            zzfsVarZze.zze(zzfwVarZze);
        }
        return (zzft) zzfsVarZze.zzaD();
    }

    public final String F(zzgb zzgbVar) {
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                s(sb, 1);
                sb.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    v(sb, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                if (this.f4245a.z().B(zzgdVar.zzy(), AbstractC0781m1.f4917q0) && zzgdVar.zzbo()) {
                    v(sb, 1, "session_stitching_token", zzgdVar.zzL());
                }
                v(sb, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    v(sb, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    v(sb, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    v(sb, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    v(sb, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                v(sb, 1, "gmp_app_id", zzgdVar.zzG());
                v(sb, 1, "admob_app_id", zzgdVar.zzx());
                v(sb, 1, "app_id", zzgdVar.zzy());
                v(sb, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    v(sb, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                v(sb, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    v(sb, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                v(sb, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    v(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    v(sb, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    v(sb, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    v(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    v(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                v(sb, 1, "app_instance_id", zzgdVar.zzz());
                v(sb, 1, "resettable_device_id", zzgdVar.zzK());
                v(sb, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    v(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                v(sb, 1, "os_version", zzgdVar.zzI());
                v(sb, 1, "device_model", zzgdVar.zzD());
                v(sb, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    v(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    v(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    v(sb, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                v(sb, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    v(sb, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    v(sb, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpz.zzc();
                if (this.f4245a.z().B(null, AbstractC0781m1.f4860G0) && zzgdVar.zzbq()) {
                    v(sb, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<zzgm> listZzP = zzgdVar.zzP();
                if (listZzP != null) {
                    for (zzgm zzgmVar : listZzP) {
                        if (zzgmVar != null) {
                            s(sb, 2);
                            sb.append("user_property {\n");
                            v(sb, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            v(sb, 2, "name", this.f4245a.D().f(zzgmVar.zzf()));
                            v(sb, 2, "string_value", zzgmVar.zzg());
                            v(sb, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            v(sb, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfp> listZzN = zzgdVar.zzN();
                if (listZzN != null) {
                    for (zzfp zzfpVar : listZzN) {
                        if (zzfpVar != null) {
                            s(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                v(sb, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                v(sb, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            u(sb, 2, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                u(sb, 2, "previous_data", zzfpVar.zze());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzft> listZzO = zzgdVar.zzO();
                if (listZzO != null) {
                    for (zzft zzftVar : listZzO) {
                        if (zzftVar != null) {
                            s(sb, 2);
                            sb.append("event {\n");
                            v(sb, 2, "name", this.f4245a.D().d(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                v(sb, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                v(sb, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                v(sb, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                q(sb, 2, zzftVar.zzi());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                s(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final String G(zzek zzekVar) {
        if (zzekVar == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzekVar.zzp()) {
            v(sb, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
        }
        v(sb, 0, "event_name", this.f4245a.D().d(zzekVar.zzg()));
        String strT = t(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!strT.isEmpty()) {
            v(sb, 0, "filter_type", strT);
        }
        if (zzekVar.zzo()) {
            w(sb, 1, "event_count_filter", zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            sb.append("  filters {\n");
            Iterator it = zzekVar.zzh().iterator();
            while (it.hasNext()) {
                r(sb, 2, (zzem) it.next());
            }
        }
        s(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String H(zzet zzetVar) {
        if (zzetVar == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            v(sb, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        v(sb, 0, "property_name", this.f4245a.D().f(zzetVar.zze()));
        String strT = t(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!strT.isEmpty()) {
            v(sb, 0, "filter_type", strT);
        }
        r(sb, 1, zzetVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    public final List I(List list, List list2) {
        int i9;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f4245a.d().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f4245a.d().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i9 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i9);
    }

    public final Map K(Bundle bundle, boolean z9) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z9) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(K((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Object obj2 = arrayList2.get(i9);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(K((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(K((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void L(zzfw zzfwVar, Object obj) {
        com.google.android.gms.common.internal.r.m(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f4245a.d().r().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfw zzfwVarZze = zzfx.zze();
                for (String str : bundle.keySet()) {
                    zzfw zzfwVarZze2 = zzfx.zze();
                    zzfwVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfwVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfwVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfwVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfwVarZze.zzc(zzfwVarZze2);
                }
                if (zzfwVarZze.zza() > 0) {
                    arrayList.add((zzfx) zzfwVarZze.zzaD());
                }
            }
        }
        zzfwVar.zzb(arrayList);
    }

    public final void M(zzgl zzglVar, Object obj) {
        com.google.android.gms.common.internal.r.m(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.f4245a.d().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean O(long j9, long j10) {
        return j9 == 0 || j10 <= 0 || Math.abs(this.f4245a.a().a() - j9) > j10;
    }

    public final byte[] Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e9) {
            this.f4245a.d().r().b("Failed to gzip content", e9);
            throw e9;
        }
    }

    @Override // M4.E4
    public final boolean l() {
        return false;
    }

    public final void q(StringBuilder sb, int i9, List list) {
        if (list == null) {
            return;
        }
        int i10 = i9 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfx zzfxVar = (zzfx) it.next();
            if (zzfxVar != null) {
                s(sb, i10);
                sb.append("param {\n");
                v(sb, i10, "name", zzfxVar.zzx() ? this.f4245a.D().e(zzfxVar.zzg()) : null);
                v(sb, i10, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                v(sb, i10, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                v(sb, i10, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    q(sb, i10, zzfxVar.zzi());
                }
                s(sb, i10);
                sb.append("}\n");
            }
        }
    }

    public final void r(StringBuilder sb, int i9, zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        s(sb, i9);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            v(sb, i9, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            v(sb, i9, "param_name", this.f4245a.D().e(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i10 = i9 + 1;
            zzey zzeyVarZzd = zzemVar.zzd();
            if (zzeyVarZzd != null) {
                s(sb, i10);
                sb.append("string_filter {\n");
                if (zzeyVarZzd.zzi()) {
                    switch (zzeyVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    v(sb, i10, "match_type", str);
                }
                if (zzeyVarZzd.zzh()) {
                    v(sb, i10, "expression", zzeyVarZzd.zzd());
                }
                if (zzeyVarZzd.zzg()) {
                    v(sb, i10, "case_sensitive", Boolean.valueOf(zzeyVarZzd.zzf()));
                }
                if (zzeyVarZzd.zza() > 0) {
                    s(sb, i9 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzeyVarZzd.zze()) {
                        s(sb, i9 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(sb, i10);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            w(sb, i9 + 1, "number_filter", zzemVar.zzc());
        }
        s(sb, i9);
        sb.append("}\n");
    }

    public final long y(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return z(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long z(byte[] bArr) {
        com.google.android.gms.common.internal.r.m(bArr);
        this.f4245a.N().h();
        MessageDigest messageDigestT = a5.t();
        if (messageDigestT != null) {
            return a5.s0(messageDigestT.digest(bArr));
        }
        this.f4245a.d().r().a("Failed to get MD5");
        return 0L;
    }
}
