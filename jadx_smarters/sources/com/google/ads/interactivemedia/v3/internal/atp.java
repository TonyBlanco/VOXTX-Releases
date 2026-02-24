package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class atp {
    public static String a(String str) {
        if (atl.a(str)) {
            return null;
        }
        return str;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                string = Constants.NULL_VERSION_ID;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e9) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e9);
                    string = "<" + str2 + " threw " + e9.getClass().getName() + ">";
                }
            }
            objArr[i10] = string;
            i10++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i11, iIndexOf);
            sb.append(objArr[i9]);
            i11 = iIndexOf + 2;
            i9++;
        }
        sb.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean c(String str) {
        return atl.a(str);
    }

    public static atm d(atm atmVar, atm atmVar2) {
        k(atmVar);
        k(atmVar2);
        return new atn(Arrays.asList(atmVar, atmVar2));
    }

    public static void e(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(b(str, obj));
        }
    }

    public static void h(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? o(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? o(i10, i11, "end index") : b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    public static void i(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void j(int i9, int i10) {
        String strB;
        if (i9 < 0 || i9 >= i10) {
            if (i9 < 0) {
                strB = b("%s (%s) must not be negative", "index", Integer.valueOf(i9));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException("negative size: " + i10);
                }
                strB = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void k(Object obj) {
        obj.getClass();
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void m(int i9, int i10) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(o(i9, i10, "index"));
        }
    }

    public static atk n(Object obj) {
        return new atk(obj.getClass().getSimpleName());
    }

    private static String o(int i9, int i10, String str) {
        if (i9 < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException("negative size: " + i10);
    }
}
