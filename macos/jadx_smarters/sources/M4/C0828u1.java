package M4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: M4.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0828u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f5079b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f5080c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f5081d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0822t1 f5082a;

    public C0828u1(InterfaceC0822t1 interfaceC0822t1) {
        this.f5082a = interfaceC0822t1;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.r.m(strArr);
        com.google.android.gms.common.internal.r.m(strArr2);
        com.google.android.gms.common.internal.r.m(atomicReference);
        com.google.android.gms.common.internal.r.a(strArr.length == strArr2.length);
        for (int i9 = 0; i9 < strArr.length; i9++) {
            Object obj = strArr[i9];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i9];
                        if (str2 == null) {
                            str2 = strArr2[i9] + "(" + strArr[i9] + ")";
                            strArr3[i9] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strB);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f5082a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(C0832v c0832v) {
        if (!this.f5082a.zza()) {
            return c0832v.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c0832v.f5090h);
        sb.append(",name=");
        sb.append(d(c0832v.f5088f));
        sb.append(",params=");
        C0820t c0820t = c0832v.f5089g;
        sb.append(c0820t == null ? null : !this.f5082a.zza() ? c0820t.toString() : b(c0820t.J()));
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f5082a.zza() ? str : g(str, L2.f4357c, L2.f4355a, f5079b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f5082a.zza() ? str : g(str, M2.f4368b, M2.f4367a, f5080c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f5082a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, N2.f4385b, N2.f4384a, f5081d);
        }
        return "experiment_id(" + str + ")";
    }
}
