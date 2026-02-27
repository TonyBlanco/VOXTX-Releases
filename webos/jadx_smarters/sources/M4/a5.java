package M4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzpq;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.achartengine.chart.TimeChart;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import w4.C2921i;

/* JADX INFO: loaded from: classes3.dex */
public final class a5 extends F2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f4591g = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f4592h = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f4593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f4594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f4596f;

    public a5(C0776l2 c0776l2) {
        super(c0776l2);
        this.f4596f = null;
        this.f4594d = new AtomicLong(0L);
    }

    public static boolean Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean Z(String str) {
        com.google.android.gms.common.internal.r.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.r.m(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b0(Context context, boolean z9) {
        com.google.android.gms.common.internal.r.m(context);
        return k0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean c0(String str) {
        return !f4592h[0].equals(str);
    }

    public static final boolean f0(Bundle bundle, int i9) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i9);
        return true;
    }

    public static final boolean g0(String str) {
        com.google.android.gms.common.internal.r.m(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static boolean j0(String str, String[] strArr) {
        com.google.android.gms.common.internal.r.m(strArr);
        for (String str2 : strArr) {
            if (Y4.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static long s0(byte[] bArr) {
        com.google.android.gms.common.internal.r.m(bArr);
        int length = bArr.length;
        int i9 = 0;
        com.google.android.gms.common.internal.r.p(length > 0);
        long j9 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j9 += (((long) bArr[i10]) & 255) << i9;
            i9 += 8;
        }
        return j9;
    }

    public static MessageDigest t() {
        MessageDigest messageDigest;
        for (int i9 = 0; i9 < 2; i9++) {
            try {
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0725d c0725d = (C0725d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0725d.f4637f);
            bundle.putString("origin", c0725d.f4638g);
            bundle.putLong("creation_timestamp", c0725d.f4640i);
            bundle.putString("name", c0725d.f4639h.f4519g);
            H2.b(bundle, com.google.android.gms.common.internal.r.m(c0725d.f4639h.H()));
            bundle.putBoolean("active", c0725d.f4641j);
            String str = c0725d.f4642k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0832v c0832v = c0725d.f4643l;
            if (c0832v != null) {
                bundle.putString("timed_out_event_name", c0832v.f5088f);
                C0820t c0820t = c0832v.f5089g;
                if (c0820t != null) {
                    bundle.putBundle("timed_out_event_params", c0820t.J());
                }
            }
            bundle.putLong("trigger_timeout", c0725d.f4644m);
            C0832v c0832v2 = c0725d.f4645n;
            if (c0832v2 != null) {
                bundle.putString("triggered_event_name", c0832v2.f5088f);
                C0820t c0820t2 = c0832v2.f5089g;
                if (c0820t2 != null) {
                    bundle.putBundle("triggered_event_params", c0820t2.J());
                }
            }
            bundle.putLong("triggered_timestamp", c0725d.f4639h.f4520h);
            bundle.putLong("time_to_live", c0725d.f4646o);
            C0832v c0832v3 = c0725d.f4647p;
            if (c0832v3 != null) {
                bundle.putString("expired_event_name", c0832v3.f5088f);
                C0820t c0820t3 = c0832v3.f5089g;
                if (c0820t3 != null) {
                    bundle.putBundle("expired_event_params", c0820t3.J());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void y(A3 a32, Bundle bundle, boolean z9) {
        if (bundle != null && a32 != null) {
            if (!bundle.containsKey("_sc") || z9) {
                String str = a32.f4188a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = a32.f4189b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", a32.f4190c);
                return;
            }
            z9 = false;
        }
        if (bundle != null && a32 == null && z9) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Parcelable[] parcelableArr, int i9, boolean z9) {
        int i10;
        com.google.android.gms.common.internal.r.m(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (Z(str) && !j0(str, M2.f4370d) && (i11 = i11 + 1) > i9) {
                    C0846x1 c0846x1S = this.f4245a.d().s();
                    if (z9) {
                        c0846x1S.c("Param can't contain more than " + i9 + " item-scoped custom parameters", this.f4245a.D().e(str), this.f4245a.D().b(bundle));
                        i10 = 28;
                    } else {
                        c0846x1S.c("Param cannot contain item-scoped custom parameters", this.f4245a.D().e(str), this.f4245a.D().b(bundle));
                        i10 = 23;
                    }
                    f0(bundle, i10);
                    bundle.remove(str);
                }
            }
        }
    }

    public final void B(A1 a12, int i9) {
        int i10 = 0;
        for (String str : new TreeSet(a12.f4185d.keySet())) {
            if (Z(str) && (i10 = i10 + 1) > i9) {
                this.f4245a.d().s().c("Event can't contain more than " + i9 + " params", this.f4245a.D().d(a12.f4182a), this.f4245a.D().b(a12.f4185d));
                f0(a12.f4185d, 5);
                a12.f4185d.remove(str);
            }
        }
    }

    public final void C(Z4 z42, String str, int i9, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        f0(bundle, i9);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i9 == 6 || i9 == 7 || i9 == 2) {
            bundle.putLong("_el", i10);
        }
        z42.a(str, "_err", bundle);
    }

    public final void D(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f4245a.d().x().c("Not putting event parameter. Invalid value type. name, type", this.f4245a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void E(zzcf zzcfVar, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z9);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning boolean value to wrapper", e9);
        }
    }

    public final void F(zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning bundle list to wrapper", e9);
        }
    }

    public final void G(zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning bundle value to wrapper", e9);
        }
    }

    public final void H(zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning byte array to wrapper", e9);
        }
    }

    public final void I(zzcf zzcfVar, int i9) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i9);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning int value to wrapper", e9);
        }
    }

    public final void J(zzcf zzcfVar, long j9) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j9);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning long value to wrapper", e9);
        }
    }

    public final void K(zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e9) {
            this.f4245a.d().w().b("Error returning string value to wrapper", e9);
        }
    }

    public final void L(String str, String str2, String str3, Bundle bundle, List list, boolean z9) {
        int i9;
        String str4;
        int i10;
        int iO;
        int i11;
        String str5;
        if (bundle == null) {
            return;
        }
        C0749h c0749hZ = this.f4245a.z();
        zzpq.zzc();
        String str6 = null;
        int i12 = (c0749hZ.f4245a.z().B(null, AbstractC0781m1.f4850B0) && c0749hZ.f4245a.N().X(231100000, true)) ? 35 : 0;
        int i13 = 0;
        for (String str7 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str7)) {
                int iO0 = !z9 ? o0(str7) : 0;
                if (iO0 == 0) {
                    iO0 = n0(str7);
                }
                i9 = iO0;
            } else {
                i9 = 0;
            }
            if (i9 != 0) {
                x(bundle, i9, str7, str7, i9 == 3 ? str7 : str6);
                bundle.remove(str7);
                i11 = i12;
                str5 = str6;
            } else {
                if (V(bundle.get(str7))) {
                    this.f4245a.d().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str7);
                    str4 = str7;
                    i10 = i12;
                    iO = 22;
                } else {
                    str4 = str7;
                    i10 = i12;
                    iO = O(str, str2, str7, bundle.get(str7), bundle, list, z9, false);
                }
                if (iO != 0 && !"_ev".equals(str4)) {
                    x(bundle, iO, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (Z(str4) && !j0(str4, M2.f4370d)) {
                    int i14 = i13 + 1;
                    int i15 = 23;
                    if (X(231100000, true)) {
                        i11 = i10;
                        if (i14 > i11) {
                            zzpq.zzc();
                            str5 = null;
                            if (this.f4245a.z().B(null, AbstractC0781m1.f4850B0)) {
                                this.f4245a.d().s().c("Item can't contain more than " + i11 + " item-scoped custom params", this.f4245a.D().d(str2), this.f4245a.D().b(bundle));
                                i15 = 28;
                            } else {
                                this.f4245a.d().s().c("Item cannot contain custom parameters", this.f4245a.D().d(str2), this.f4245a.D().b(bundle));
                            }
                            f0(bundle, i15);
                            bundle.remove(str4);
                        }
                        i13 = i14;
                    } else {
                        this.f4245a.d().s().c("Item array not supported on client's version of Google Play Services (Android Only)", this.f4245a.D().d(str2), this.f4245a.D().b(bundle));
                        f0(bundle, 23);
                        bundle.remove(str4);
                        i11 = i10;
                    }
                    str5 = null;
                    i13 = i14;
                }
                i11 = i10;
                str5 = null;
            }
            i12 = i11;
            str6 = str5;
        }
    }

    public final boolean M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (g0(str)) {
                return true;
            }
            if (this.f4245a.q()) {
                this.f4245a.d().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C0858z1.z(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f4245a.q()) {
                this.f4245a.d().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (g0(str2)) {
            return true;
        }
        this.f4245a.d().s().b("Invalid admob_app_id. Analytics disabled.", C0858z1.z(str2));
        return false;
    }

    public final boolean N(String str, int i9, String str2) {
        if (str2 == null) {
            this.f4245a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i9) {
            return true;
        }
        this.f4245a.d().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i9), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.a5.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f4245a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.r.m(str2);
        String[] strArr3 = f4591g;
        for (int i9 = 0; i9 < 3; i9++) {
            if (str2.startsWith(strArr3[i9])) {
                this.f4245a.d().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && j0(str2, strArr2)) {
            return true;
        }
        this.f4245a.d().s().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean Q(String str, String str2, int i9, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i9) {
                this.f4245a.d().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean R(String str, String str2) {
        if (str2 == null) {
            this.f4245a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f4245a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f4245a.d().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f4245a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean S(String str, String str2) {
        if (str2 == null) {
            this.f4245a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f4245a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f4245a.d().s().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f4245a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean T(String str) {
        h();
        if (E4.e.a(this.f4245a.c()).a(str) == 0) {
            return true;
        }
        this.f4245a.d().q().b("Permission not granted", str);
        return false;
    }

    public final boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strU = this.f4245a.z().u();
        this.f4245a.b();
        return strU.equals(str);
    }

    public final boolean V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean W(Context context, String str) {
        C0846x1 c0846x1R;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = E4.e.a(context).e(str, 64);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e9) {
            e = e9;
            c0846x1R = this.f4245a.d().r();
            str2 = "Package name not found";
            c0846x1R.b(str2, e);
            return true;
        } catch (CertificateException e10) {
            e = e10;
            c0846x1R = this.f4245a.d().r();
            str2 = "Error obtaining certificate";
            c0846x1R.b(str2, e);
            return true;
        }
    }

    public final boolean X(int i9, boolean z9) {
        Boolean boolJ = this.f4245a.L().J();
        if (q0() < i9 / 1000) {
            return (boolJ == null || boolJ.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.r.m(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final byte[] e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final int h0(String str) {
        if ("_ldl".equals(str)) {
            this.f4245a.z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f4245a.z();
            return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if ("_lgclid".equals(str)) {
            this.f4245a.z();
            return 100;
        }
        this.f4245a.z();
        return 36;
    }

    @Override // M4.F2
    public final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f4245a.d().w().a("Utils falling back to Random for random id");
            }
        }
        this.f4594d.set(jNextLong);
    }

    public final Object i0(int i9, Object obj, boolean z9, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return r(obj.toString(), i9, z9);
        }
        if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleW0 = w0((Bundle) parcelable);
                if (!bundleW0.isEmpty()) {
                    arrayList.add(bundleW0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    @Override // M4.F2
    public final boolean j() {
        return true;
    }

    public final int l0(String str, Object obj) {
        int iH0;
        String str2;
        if ("_ldl".equals(str)) {
            iH0 = h0(str);
            str2 = "user property referrer";
        } else {
            iH0 = h0(str);
            str2 = "user property";
        }
        return Q(str2, str, iH0, obj) ? 0 : 7;
    }

    public final int m0(String str) {
        if (!R("event", str)) {
            return 2;
        }
        if (!P("event", L2.f4355a, L2.f4356b, str)) {
            return 13;
        }
        this.f4245a.z();
        return !N("event", 40, str) ? 2 : 0;
    }

    public final int n0(String str) {
        if (!R("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.f4245a.z();
        return !N("event param", 40, str) ? 3 : 0;
    }

    public final Object o(String str, Object obj) {
        boolean zEquals = "_ev".equals(str);
        int i9 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        if (zEquals) {
            this.f4245a.z();
            return i0(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, obj, true, true);
        }
        if (Y(str)) {
            this.f4245a.z();
        } else {
            this.f4245a.z();
            i9 = 100;
        }
        return i0(i9, obj, false, true);
    }

    public final int o0(String str) {
        if (!S("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.f4245a.z();
        return !N("event param", 40, str) ? 3 : 0;
    }

    public final Object p(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iH0 = h0(str);
        return zEquals ? i0(iH0, obj, true, false) : i0(iH0, obj, false, false);
    }

    public final int p0(String str) {
        if (!R("user property", str)) {
            return 6;
        }
        if (!P("user property", N2.f4384a, null, str)) {
            return 15;
        }
        this.f4245a.z();
        return !N("user property", 24, str) ? 6 : 0;
    }

    public final String q() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int q0() {
        if (this.f4596f == null) {
            this.f4596f = Integer.valueOf(C2921i.h().b(this.f4245a.c()) / 1000);
        }
        return this.f4596f.intValue();
    }

    public final String r(String str, int i9, boolean z9) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i9) {
            return str;
        }
        if (z9) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i9))).concat("...");
        }
        return null;
    }

    public final int r0(int i9) {
        return C2921i.h().j(this.f4245a.c(), 12451000);
    }

    public final URL s(long j9, String str, String str2, long j10) {
        try {
            com.google.android.gms.common.internal.r.g(str2);
            com.google.android.gms.common.internal.r.g(str);
            String strConcat = String.format("http://=", String.format("v%s.%s", 79000L, Integer.valueOf(q0())), str2, str, Long.valueOf(j10));
            if (str.equals(this.f4245a.z().v())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e9) {
            e = e9;
            this.f4245a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e10) {
            e = e10;
            this.f4245a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long t0() {
        long j9 = this.f4594d.get();
        synchronized (this.f4594d) {
            if (j9 != 0) {
                this.f4594d.compareAndSet(-1L, 1L);
                return this.f4594d.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ this.f4245a.a().a()).nextLong();
            int i9 = this.f4595e + 1;
            this.f4595e = i9;
            return jNextLong + ((long) i9);
        }
    }

    public final SecureRandom u() {
        h();
        if (this.f4593c == null) {
            this.f4593c = new SecureRandom();
        }
        return this.f4593c;
    }

    public final long u0(long j9, long j10) {
        return (j9 + (j10 * 60000)) / TimeChart.DAY;
    }

    public final Bundle v0(Uri uri, boolean z9) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("utm_id");
                queryParameter6 = uri.getQueryParameter("dclid");
                queryParameter7 = uri.getQueryParameter("srsltid");
                queryParameter8 = z9 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && (!z9 || TextUtils.isEmpty(queryParameter8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter9 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("term", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("content", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("aclid", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("cp1", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("anid", queryParameter13);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("campaign_id", queryParameter5);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("dclid", queryParameter6);
            }
            String queryParameter14 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("source_platform", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("creative_format", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("marketing_tactic", queryParameter16);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("srsltid", queryParameter7);
            }
            if (z9 && !TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("sfmc_id", queryParameter8);
            }
            return bundle;
        } catch (UnsupportedOperationException e9) {
            this.f4245a.d().w().b("Install referrer url isn't a hierarchical URI", e9);
            return null;
        }
    }

    public final void w(Bundle bundle, long j9) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            this.f4245a.d().w().b("Params already contained engagement", Long.valueOf(j10));
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j9 + j10);
    }

    public final Bundle w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objO = o(str, bundle.get(str));
                if (objO == null) {
                    this.f4245a.d().x().b("Param value can't be null", this.f4245a.D().e(str));
                } else {
                    D(bundle2, str, objO);
                }
            }
        }
        return bundle2;
    }

    public final void x(Bundle bundle, int i9, String str, String str2, Object obj) {
        if (f0(bundle, i9)) {
            this.f4245a.z();
            bundle.putString("_ev", r(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.r.m(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle x0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.a5.x0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final C0832v y0(String str, String str2, Bundle bundle, String str3, long j9, boolean z9, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m0(str2) != 0) {
            this.f4245a.d().r().b("Invalid conditional property event name", this.f4245a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleX0 = x0(str, str2, bundle2, C4.f.a("_o"), true);
        if (z9) {
            bundleX0 = w0(bundleX0);
        }
        com.google.android.gms.common.internal.r.m(bundleX0);
        return new C0832v(str2, new C0820t(bundleX0), str3, j9);
    }

    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f4245a.N().D(bundle, str, bundle2.get(str));
            }
        }
    }
}
