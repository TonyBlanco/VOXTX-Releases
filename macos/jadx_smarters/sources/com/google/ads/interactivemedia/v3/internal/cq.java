package com.google.ads.interactivemedia.v3.internal;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.ads.AdError;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.util.LangUtils;
import org.joda.time.DateTimeConstants;
import org.simpleframework.xml.strategy.Name;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class cq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f22641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f22643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f22644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f22645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f22646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f22647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f22648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static HashMap f22649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f22650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f22651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f22652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f22653n;

    static {
        int i9 = Build.VERSION.SDK_INT;
        f22640a = i9;
        String str = Build.DEVICE;
        f22641b = str;
        String str2 = Build.MANUFACTURER;
        f22642c = str2;
        String str3 = Build.MODEL;
        f22643d = str3;
        f22644e = str + ", " + str3 + ", " + str2 + ", " + i9;
        f22645f = new byte[0];
        f22646g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f22647h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f22648i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f22650k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Name.MARK, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f22651l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f22652m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f22653n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpStatus.SC_ACCEPTED, HttpStatus.SC_RESET_CONTENT, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpStatus.SC_CREATED, HttpStatus.SC_PARTIAL_CONTENT, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, HttpStatus.SC_PROCESSING, 115, 116, 125, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, HttpStatus.SC_MULTI_STATUS, 200, 221, 218, 211, 212, 105, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    public static Handler A() {
        return B(null);
    }

    public static Handler B(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        af.t(looperMyLooper);
        return z(looperMyLooper, callback);
    }

    public static Handler C() {
        return z(D(), null);
    }

    public static Looper D() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static C1333s E(int i9, int i10, int i11) {
        r rVar = new r();
        rVar.ae("audio/raw");
        rVar.H(i10);
        rVar.af(i11);
        rVar.Y(i9);
        return rVar.v();
    }

    public static aw F(az azVar, aw awVar) {
        boolean zR = azVar.r();
        boolean zE = azVar.e();
        AbstractC1301h abstractC1301h = (AbstractC1301h) azVar;
        boolean z9 = abstractC1301h.b() != -1;
        boolean z10 = abstractC1301h.a() != -1;
        boolean zD = azVar.d();
        boolean zC = azVar.c();
        boolean zP = azVar.o().p();
        av avVar = new av();
        avVar.c(awVar);
        boolean z11 = !zR;
        avVar.e(4, z11);
        avVar.e(5, zE && !zR);
        avVar.e(6, z9 && !zR);
        avVar.e(7, !zP && (z9 || !zD || zE) && !zR);
        avVar.e(8, z10 && !zR);
        avVar.e(9, !zP && (z10 || (zD && zC)) && !zR);
        avVar.e(10, z11);
        avVar.e(11, zE && !zR);
        avVar.e(12, zE && !zR);
        return avVar.a();
    }

    public static Object G(Object obj) {
        return obj;
    }

    public static String H(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String I(byte[] bArr) {
        return new String(bArr, ath.f20681b);
    }

    public static String J(byte[] bArr, int i9, int i10) {
        return new String(bArr, i9, i10, ath.f20681b);
    }

    public static String K(String str, int i9) {
        String[] strArrAm = am(str);
        if (strArrAm.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrAm) {
            if (i9 == ar.c(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String L(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i9 = 0;
        while (true) {
            int length = objArr.length;
            if (i9 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i9].getClass().getSimpleName());
            if (i9 < length - 1) {
                sb.append(", ");
            }
            i9++;
        }
    }

    public static String M(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return com.google.ads.interactivemedia.v3.impl.data.k.e(networkCountryIso);
            }
        }
        return com.google.ads.interactivemedia.v3.impl.data.k.e(Locale.getDefault().getCountry());
    }

    public static String N(int i9) {
        if (i9 == 0) {
            return "NO";
        }
        if (i9 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i9 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i9 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i9 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String O(Locale locale) {
        return f22640a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String P(int i9) {
        switch (i9) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return CookieSpecs.DEFAULT;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String Q(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strD = com.google.ads.interactivemedia.v3.impl.data.k.d(str);
        int i9 = 0;
        String str2 = al(strD, "-")[0];
        if (f22649j == null) {
            f22649j = ay();
        }
        String str3 = (String) f22649j.get(str2);
        if (str3 != null) {
            strD = str3.concat(String.valueOf(strD.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strD;
        }
        while (true) {
            String[] strArr = f22651l;
            int length = strArr.length;
            if (i9 >= 18) {
                return strD;
            }
            if (strD.startsWith(strArr[i9])) {
                return String.valueOf(strArr[i9 + 1]).concat(String.valueOf(strD.substring(strArr[i9].length())));
            }
            i9 += 2;
        }
    }

    public static ExecutorService R(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.ads.interactivemedia.v3.internal.cp
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void S(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void T(List list, int i9, int i10) {
        if (i9 < 0 || i10 > list.size() || i9 > i10) {
            throw new IllegalArgumentException();
        }
        if (i9 != i10) {
            list.subList(i9, i10).clear();
        }
    }

    public static void U(Parcel parcel, boolean z9) {
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static boolean V(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean W(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (V(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean X(int i9) {
        return i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static boolean Y(int i9) {
        return i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static boolean Z(int i9) {
        return i9 == 10 || i9 == 13;
    }

    public static float a(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f9, f11));
    }

    public static boolean aa(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    public static boolean ab(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean ac(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] ad(String str) {
        return str.getBytes(ath.f20681b);
    }

    public static byte[] ae(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    public static Object[] af(Object[] objArr) {
        return objArr;
    }

    public static Object[] ag(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        return objArrCopyOf;
    }

    public static Object[] ah(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static Object[] ai(Object[] objArr, int i9) {
        af.u(i9 <= objArr.length);
        return Arrays.copyOf(objArr, i9);
    }

    public static String[] aj() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrAk = f22640a >= 24 ? ak(configuration.getLocales().toLanguageTags(), ",") : new String[]{O(configuration.locale)};
        for (int i9 = 0; i9 < strArrAk.length; i9++) {
            strArrAk[i9] = Q(strArrAk[i9]);
        }
        return strArrAk;
    }

    public static String[] ak(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] al(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] am(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : ak(str.trim(), "(\\s*,\\s*)");
    }

    public static long an(long j9, long j10) {
        long j11 = j9 + j10;
        if (((j9 ^ j11) & (j10 ^ j11)) < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    public static int ao(long[] jArr, long j9, boolean z9) {
        int i9;
        int iBinarySearch = Arrays.binarySearch(jArr, j9);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i9 = iBinarySearch + 1;
            if (i9 >= jArr.length || jArr[i9] != j9) {
                break;
            }
            iBinarySearch = i9;
        }
        return !z9 ? i9 : iBinarySearch;
    }

    public static int ap(List list, Comparable comparable, boolean z9) {
        int i9;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i9 = iBinarySearch;
        }
        return z9 ? Math.max(0, i9) : i9;
    }

    public static int aq(long[] jArr, long j9, boolean z9) {
        int i9;
        int iBinarySearch = Arrays.binarySearch(jArr, j9);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j9) {
                    break;
                }
                iBinarySearch = i10;
            }
            i9 = iBinarySearch;
        }
        return z9 ? Math.max(0, i9) : i9;
    }

    public static int ar(byte[] bArr, int i9) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 = f22652m[(i10 >>> 24) ^ (bArr[i11] & 255)] ^ (i10 << 8);
        }
        return i10;
    }

    public static String as(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        return "IMA SDK ExoPlayer/" + str + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.0.0-beta02";
    }

    public static void at(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void au(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f22640a < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public static void av(long[] jArr, long j9) {
        int i9 = 0;
        if (j9 >= 1000000 && j9 % 1000000 == 0) {
            long j10 = j9 / 1000000;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] / j10;
                i9++;
            }
            return;
        }
        if (j9 >= 1000000 || 1000000 % j9 != 0) {
            double d9 = 1000000.0d / j9;
            while (i9 < jArr.length) {
                jArr[i9] = (long) (jArr[i9] * d9);
                i9++;
            }
            return;
        }
        long j11 = 1000000 / j9;
        while (i9 < jArr.length) {
            jArr[i9] = jArr[i9] * j11;
            i9++;
        }
    }

    public static long aw(long j9, long j10) {
        long j11 = j9 - j10;
        if (((j9 ^ j11) & (j10 ^ j9)) < 0) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    private static String ax(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e9) {
            cd.c("Util", "Failed to read system property ".concat(str), e9);
            return null;
        }
    }

    private static HashMap ay() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f22650k.length;
        HashMap map = new HashMap(length + 88);
        int i9 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f22650k;
            int length3 = strArr.length;
            if (i9 >= 88) {
                return map;
            }
            map.put(strArr[i9], strArr[i9 + 1]);
            i9 += 2;
        }
    }

    public static int b(int[] iArr, int i9, boolean z9, boolean z10) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i9);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || iArr[i10] != i9) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z9 ? iBinarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int c(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public static int d(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i9, i11));
    }

    public static int e(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int f(int i9) {
        if (i9 == 12) {
            return f22640a >= 32 ? 743676 : 0;
        }
        switch (i9) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return HttpStatus.SC_NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i10 = f22640a;
                return (i10 < 23 && i10 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int g(ByteBuffer byteBuffer, int i9) {
        int i10 = byteBuffer.getInt(i9);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static int h(String str, int i9) {
        int i10 = 0;
        for (String str2 : am(str)) {
            if (i9 == ar.c(str2)) {
                i10++;
            }
        }
        return i10;
    }

    public static int i(int i9) {
        if (i9 == 2 || i9 == 4) {
            return 6005;
        }
        if (i9 == 10) {
            return 6004;
        }
        if (i9 == 7) {
            return 6005;
        }
        if (i9 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i9) {
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case LangUtils.HASH_SEED /* 17 */:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i9) {
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int j(String str) {
        String[] strArrAk;
        int length;
        int i9 = 0;
        if (str == null || (length = (strArrAk = ak(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrAk[length - 1];
        boolean z9 = length >= 3 && "neg".equals(strArrAk[length + (-2)]);
        try {
            af.s(str2);
            i9 = Integer.parseInt(str2);
            if (z9) {
                return -i9;
            }
        } catch (NumberFormatException unused) {
        }
        return i9;
    }

    public static int k(int i9) {
        if (i9 == 8) {
            return 3;
        }
        if (i9 == 16) {
            return 2;
        }
        if (i9 != 24) {
            return i9 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int l(int i9, int i10) {
        if (i9 != 2) {
            if (i9 == 3) {
                return i10;
            }
            if (i9 != 4) {
                if (i9 != 268435456) {
                    if (i9 == 536870912) {
                        return i10 * 3;
                    }
                    if (i9 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i10 * 4;
        }
        return i10 + i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L11
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.ads.interactivemedia.v3.impl.data.k.f(r2, r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L19
            return r2
        L19:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L71
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.ads.interactivemedia.v3.impl.data.k.d(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L53;
                case 108321: goto L49;
                case 3242057: goto L3f;
                case 3299913: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 1
            goto L5e
        L3f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 3
            goto L5e
        L49:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 0
            goto L5e
        L53:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 2
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L6a
            if (r0 == r5) goto L68
            if (r0 == r1) goto L68
            r0 = 4
            goto L6d
        L68:
            r0 = 1
            goto L6d
        L6a:
            r0 = 2
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r0
        L71:
            java.util.regex.Pattern r0 = com.google.ads.interactivemedia.v3.internal.cq.f22648i
            java.lang.String r7 = r7.getPath()
            com.google.ads.interactivemedia.v3.internal.af.s(r7)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L9d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L9c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L93
            return r4
        L93:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L9c
            return r5
        L9c:
            return r6
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.cq.m(android.net.Uri):int");
    }

    public static int n(int[] iArr, int i9) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    public static long o(long j9, long j10) {
        return ((j9 + j10) - 1) / j10;
    }

    public static long p(long j9, long j10, long j11) {
        return Math.max(j10, Math.min(j9, j11));
    }

    public static long q(long j9, float f9) {
        return f9 == 1.0f ? j9 : Math.round(j9 * ((double) f9));
    }

    public static long r(long j9) {
        return j9 == -9223372036854775807L ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime();
    }

    public static long s(long j9, float f9) {
        return f9 == 1.0f ? j9 : Math.round(j9 / ((double) f9));
    }

    public static long t(long j9) {
        return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 * 1000;
    }

    public static long u(String str) throws as {
        Matcher matcher = f22646g.matcher(str);
        if (!matcher.matches()) {
            throw as.a("Invalid date/time format: ".concat(String.valueOf(str)), null);
        }
        int i9 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i9 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i9 = -i9;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i9 != 0 ? timeInMillis - (((long) i9) * 60000) : timeInMillis;
    }

    public static long v(String str) {
        Matcher matcher = f22647h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d9 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d10 = d9 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d11 = d10 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d12 = d11 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d13 = d12 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j9 = (long) ((d13 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j9 : j9;
    }

    public static long w(long j9, long j10, long j11) {
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (long) (j9 * (j10 / j11)) : j9 * (j10 / j11) : j9 / (j11 / j10);
    }

    public static long x(long j9) {
        return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 / 1000;
    }

    public static Point y(Context context) {
        DisplayManager displayManager;
        int i9 = f22640a;
        Display defaultDisplay = null;
        if (i9 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            defaultDisplay = displayManager.getDisplay(0);
        }
        if (defaultDisplay == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            af.s(windowManager);
            defaultDisplay = windowManager.getDefaultDisplay();
        }
        if (defaultDisplay.getDisplayId() == 0 && ab(context)) {
            String strAx = ax(i9 < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(strAx)) {
                try {
                    String[] strArrAk = ak(strAx.trim(), "x");
                    if (strArrAk.length == 2) {
                        int i10 = Integer.parseInt(strArrAk[0]);
                        int i11 = Integer.parseInt(strArrAk[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                cd.b("Util", "Invalid display size: ".concat(String.valueOf(strAx)));
            }
            if ("Sony".equals(f22642c) && f22643d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i12 = f22640a;
        if (i12 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i12 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }
}
