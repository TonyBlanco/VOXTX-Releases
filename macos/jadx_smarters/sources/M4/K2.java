package M4;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class K2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K2 f4337c = new K2(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f4338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4339b;

    public K2(Boolean bool, Boolean bool2, int i9) {
        EnumMap enumMap = new EnumMap(J2.class);
        this.f4338a = enumMap;
        enumMap.put(J2.AD_STORAGE, bool);
        enumMap.put(J2.ANALYTICS_STORAGE, bool2);
        this.f4339b = i9;
    }

    public K2(EnumMap enumMap, int i9) {
        EnumMap enumMap2 = new EnumMap(J2.class);
        this.f4338a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f4339b = i9;
    }

    public static K2 b(Bundle bundle, int i9) {
        if (bundle == null) {
            return new K2(null, null, i9);
        }
        EnumMap enumMap = new EnumMap(J2.class);
        for (J2 j22 : J2.values()) {
            enumMap.put(j22, p(bundle.getString(j22.zzd)));
        }
        return new K2(enumMap, i9);
    }

    public static K2 c(String str, int i9) {
        EnumMap enumMap = new EnumMap(J2.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                J2[] j2Arr = J2.zzc;
                int length = j2Arr.length;
                if (i10 >= 2) {
                    break;
                }
                J2 j22 = j2Arr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(j22, bool);
                }
                i10++;
            }
        }
        return new K2(enumMap, i9);
    }

    public static String h(Bundle bundle) {
        String string;
        for (J2 j22 : J2.values()) {
            if (bundle.containsKey(j22.zzd) && (string = bundle.getString(j22.zzd)) != null && p(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean k(int i9, int i10) {
        return i9 <= i10;
    }

    public static final int o(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean p(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int a() {
        return this.f4339b;
    }

    public final K2 d(K2 k22) {
        EnumMap enumMap = new EnumMap(J2.class);
        for (J2 j22 : J2.values()) {
            Boolean boolValueOf = (Boolean) this.f4338a.get(j22);
            Boolean bool = (Boolean) k22.f4338a.get(j22);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(j22, boolValueOf);
        }
        return new K2(enumMap, 100);
    }

    public final K2 e(K2 k22) {
        EnumMap enumMap = new EnumMap(J2.class);
        for (J2 j22 : J2.values()) {
            Boolean bool = (Boolean) this.f4338a.get(j22);
            if (bool == null) {
                bool = (Boolean) k22.f4338a.get(j22);
            }
            enumMap.put(j22, bool);
        }
        return new K2(enumMap, this.f4339b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K2)) {
            return false;
        }
        K2 k22 = (K2) obj;
        for (J2 j22 : J2.values()) {
            if (o((Boolean) this.f4338a.get(j22)) != o((Boolean) k22.f4338a.get(j22))) {
                return false;
            }
        }
        return this.f4339b == k22.f4339b;
    }

    public final Boolean f() {
        return (Boolean) this.f4338a.get(J2.AD_STORAGE);
    }

    public final Boolean g() {
        return (Boolean) this.f4338a.get(J2.ANALYTICS_STORAGE);
    }

    public final int hashCode() {
        int iO = this.f4339b * 17;
        Iterator it = this.f4338a.values().iterator();
        while (it.hasNext()) {
            iO = (iO * 31) + o((Boolean) it.next());
        }
        return iO;
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("G1");
        J2[] j2Arr = J2.zzc;
        int length = j2Arr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            Boolean bool = (Boolean) this.f4338a.get(j2Arr[i9]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean j(J2 j22) {
        Boolean bool = (Boolean) this.f4338a.get(j22);
        return bool == null || bool.booleanValue();
    }

    public final boolean l() {
        Iterator it = this.f4338a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(K2 k22) {
        return n(k22, (J2[]) this.f4338a.keySet().toArray(new J2[0]));
    }

    public final boolean n(K2 k22, J2... j2Arr) {
        for (J2 j22 : j2Arr) {
            Boolean bool = (Boolean) this.f4338a.get(j22);
            Boolean bool2 = (Boolean) k22.f4338a.get(j22);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.f4339b);
        for (J2 j22 : J2.values()) {
            sb.append(", ");
            sb.append(j22.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f4338a.get(j22);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
