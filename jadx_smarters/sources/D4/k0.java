package d4;

import O2.AbstractC0904o;
import O2.C0897l1;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
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
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.util.LangUtils;
import org.joda.time.DateTimeConstants;
import org.simpleframework.xml.strategy.Name;
import r5.AbstractC2673b;
import r5.AbstractC2675d;
import s5.AbstractC2743y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f39780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f39782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f39783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f39784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f39785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f39786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap f39787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f39788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f39789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f39790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f39791o;

    public static final class a {
        public static Drawable a(Context context, Resources resources, int i9) {
            return resources.getDrawable(i9, context.getTheme());
        }
    }

    static {
        int i9 = Build.VERSION.SDK_INT;
        f39777a = i9;
        String str = Build.DEVICE;
        f39778b = str;
        String str2 = Build.MANUFACTURER;
        f39779c = str2;
        String str3 = Build.MODEL;
        f39780d = str3;
        f39781e = str + ", " + str3 + ", " + str2 + ", " + i9;
        f39782f = new byte[0];
        f39783g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f39784h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f39785i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f39786j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f39788l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Name.MARK, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f39789m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f39790n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f39791o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpStatus.SC_ACCEPTED, HttpStatus.SC_RESET_CONTENT, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 151, 158, 153, 140, 139, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpStatus.SC_CREATED, HttpStatus.SC_PARTIAL_CONTENT, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, HttpStatus.SC_PROCESSING, 115, 116, 125, IjkMediaMeta.FF_PROFILE_H264_HIGH_422, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, HttpStatus.SC_MULTI_STATUS, 200, 221, 218, 211, 212, 105, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243};
    }

    public static Handler A(Handler.Callback callback) {
        return w(S(), callback);
    }

    public static String A0(int i9) {
        return Integer.toString(i9, 36);
    }

    public static HashMap B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap map = new HashMap(iSOLanguages.length + f39788l.length);
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
            String[] strArr = f39788l;
            if (i9 >= strArr.length) {
                return map;
            }
            map.put(strArr[i9], strArr[i9 + 1]);
            i9 += 2;
        }
    }

    public static boolean B0(Context context) {
        return f39777a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Uri C(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f39786j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean C0(int i9) {
        return i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static String D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean D0(int i9) {
        return i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 536870912 || i9 == 805306368 || i9 == 4;
    }

    public static String E(byte[] bArr) {
        return new String(bArr, AbstractC2675d.f49724c);
    }

    public static boolean E0(int i9) {
        return i9 == 10 || i9 == 13;
    }

    public static String F(byte[] bArr, int i9, int i10) {
        return new String(bArr, i9, i10, AbstractC2675d.f49724c);
    }

    public static boolean F0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || TransferTable.COLUMN_FILE.equals(scheme);
    }

    public static int G(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static boolean G0(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    public static String H(int i9) {
        if (i9 == 0) {
            return "application/dash+xml";
        }
        if (i9 == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i9 != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    public static boolean H0(Uri uri) {
        return HttpHost.DEFAULT_SCHEME_NAME.equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) AbstractC1684a.e(uri.getHost()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int I(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = d4.k0.f39777a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k0.I(int):int");
    }

    public static boolean I0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static InterfaceC0920t1.b J(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.b bVar) {
        boolean zD = interfaceC0920t1.d();
        boolean zV = interfaceC0920t1.V();
        boolean zM = interfaceC0920t1.M();
        boolean zQ = interfaceC0920t1.q();
        boolean zG0 = interfaceC0920t1.g0();
        boolean zU = interfaceC0920t1.u();
        boolean zV2 = interfaceC0920t1.w().v();
        boolean z9 = false;
        InterfaceC0920t1.b.a aVarD = new InterfaceC0920t1.b.a().b(bVar).d(4, !zD).d(5, zV && !zD).d(6, zM && !zD).d(7, !zV2 && (zM || !zG0 || zV) && !zD).d(8, zQ && !zD).d(9, !zV2 && (zQ || (zG0 && zU)) && !zD).d(10, !zD).d(11, zV && !zD);
        if (zV && !zD) {
            z9 = true;
        }
        return aVarD.d(12, z9).e();
    }

    public static /* synthetic */ Thread J0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int K(ByteBuffer byteBuffer, int i9) {
        int i10 = byteBuffer.getInt(i9);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static int K0(int[] iArr, int i9) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    public static byte[] L(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static String L0(String str) {
        int i9 = 0;
        while (true) {
            String[] strArr = f39789m;
            if (i9 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i9])) {
                return strArr[i9 + 1] + str.substring(strArr[i9].length());
            }
            i9 += 2;
        }
    }

    public static int M(String str, int i9) {
        int i10 = 0;
        for (String str2 : k1(str)) {
            if (i9 == F.m(str2)) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean M0(Activity activity, Uri uri) {
        return f39777a >= 23 && (F0(uri) || G0(uri)) && b1(activity);
    }

    public static String N(String str, int i9) {
        String[] strArrK1 = k1(str);
        if (strArrK1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrK1) {
            if (i9 == F.m(str2)) {
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

    public static boolean N0(Activity activity, H0... h0Arr) {
        if (f39777a < 23) {
            return false;
        }
        for (H0 h02 : h0Arr) {
            H0.h hVar = h02.f5528c;
            if (hVar != null) {
                if (M0(activity, hVar.f5625a)) {
                    return true;
                }
                AbstractC2743y abstractC2743y = h02.f5528c.f5631h;
                for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                    if (M0(activity, ((H0.k) abstractC2743y.get(i9)).f5653a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String O(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < objArr.length; i9++) {
            sb.append(objArr[i9].getClass().getSimpleName());
            if (i9 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static boolean O0(Activity activity, Uri... uriArr) {
        if (f39777a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (M0(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static String P(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return AbstractC2673b.f(networkCountryIso);
            }
        }
        return AbstractC2673b.f(Locale.getDefault().getCountry());
    }

    public static long P0(long j9) {
        return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 * 1000;
    }

    public static Point Q(Context context) {
        DisplayManager displayManager;
        Display display = (f39777a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) AbstractC1684a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return R(context, display);
    }

    public static ExecutorService Q0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: d4.j0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return k0.J0(str, runnable);
            }
        });
    }

    public static Point R(Context context, Display display) {
        if (display.getDisplayId() == 0 && I0(context)) {
            String strQ0 = q0(f39777a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(strQ0)) {
                try {
                    String[] strArrI1 = i1(strQ0.trim(), "x");
                    if (strArrI1.length == 2) {
                        int i9 = Integer.parseInt(strArrI1[0]);
                        int i10 = Integer.parseInt(strArrI1[1]);
                        if (i9 > 0 && i10 > 0) {
                            return new Point(i9, i10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC1681B.d("Util", "Invalid display size: " + strQ0);
            }
            if ("Sony".equals(f39779c) && f39780d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i11 = f39777a;
        if (i11 >= 23) {
            W(display, point);
        } else if (i11 >= 17) {
            V(display, point);
        } else {
            U(display, point);
        }
        return point;
    }

    public static String R0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = AbstractC2673b.e(str);
        String str2 = j1(strE, "-")[0];
        if (f39787k == null) {
            f39787k = B();
        }
        String str3 = (String) f39787k.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? L0(strE) : strE;
    }

    public static Looper S() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Object[] S0(Object[] objArr, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        objArrCopyOf[objArr.length] = obj;
        return k(objArrCopyOf);
    }

    public static Locale T() {
        return f39777a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static Object[] T0(Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
        return objArrCopyOf;
    }

    public static void U(Display display, Point point) {
        display.getSize(point);
    }

    public static Object[] U0(Object[] objArr, int i9) {
        AbstractC1684a.a(i9 <= objArr.length);
        return Arrays.copyOf(objArr, i9);
    }

    public static void V(Display display, Point point) {
        display.getRealSize(point);
    }

    public static Object[] V0(Object[] objArr, int i9, int i10) {
        AbstractC1684a.a(i9 >= 0);
        AbstractC1684a.a(i10 <= objArr.length);
        return Arrays.copyOfRange(objArr, i9, i10);
    }

    public static void W(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long W0(String str) throws C0897l1 {
        Matcher matcher = f39783g.matcher(str);
        if (!matcher.matches()) {
            throw C0897l1.a("Invalid date/time format: " + str, null);
        }
        int i9 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i9 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i9 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i9 != 0 ? timeInMillis - (((long) i9) * 60000) : timeInMillis;
    }

    public static Drawable X(Context context, Resources resources, int i9) {
        return f39777a >= 21 ? a.a(context, resources, i9) : resources.getDrawable(i9);
    }

    public static long X0(String str) {
        Matcher matcher = f39784h.matcher(str);
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

    public static UUID Y(String str) {
        String strE = AbstractC2673b.e(str);
        strE.hashCode();
        switch (strE) {
            case "playready":
                return AbstractC0904o.f6141e;
            case "widevine":
                return AbstractC0904o.f6140d;
            case "clearkey":
                return AbstractC0904o.f6139c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static boolean Y0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static int Z(int i9) {
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

    public static boolean Z0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int a0(String str) {
        String[] strArrI1;
        int length;
        if (str == null || (length = (strArrI1 = i1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrI1[length - 1];
        boolean z9 = length >= 3 && "neg".equals(strArrI1[length - 2]);
        try {
            int i9 = Integer.parseInt((String) AbstractC1684a.e(str2));
            return z9 ? -i9 : i9;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static void a1(List list, int i9, int i10) {
        if (i9 < 0 || i10 > list.size() || i9 > i10) {
            throw new IllegalArgumentException();
        }
        if (i9 != i10) {
            list.subList(i9, i10).clear();
        }
    }

    public static long b(long j9, long j10, long j11) {
        long j12 = j9 + j10;
        return ((j9 ^ j12) & (j10 ^ j12)) < 0 ? j11 : j12;
    }

    public static String b0(int i9) {
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

    public static boolean b1(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String c0(Locale locale) {
        return f39777a >= 21 ? d0(locale) : locale.toString();
    }

    public static long c1(long j9, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            return j9 / (j11 / j10);
        }
        if (j11 < j10 && j10 % j11 == 0) {
            return j9 * (j10 / j11);
        }
        return (long) (j9 * (j10 / j11));
    }

    public static int d(List list, Comparable comparable, boolean z9, boolean z10) {
        int i9;
        int i10;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i9 = iBinarySearch + 1;
                if (i9 >= size || ((Comparable) list.get(i9)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z9 ? iBinarySearch : i9;
        }
        return z10 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static String d0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long[] d1(List list, long j9, long j10) {
        int size = list.size();
        long[] jArr = new long[size];
        int i9 = 0;
        if (j10 >= j9 && j10 % j9 == 0) {
            long j11 = j10 / j9;
            while (i9 < size) {
                jArr[i9] = ((Long) list.get(i9)).longValue() / j11;
                i9++;
            }
        } else if (j10 >= j9 || j9 % j10 != 0) {
            double d9 = j9 / j10;
            while (i9 < size) {
                jArr[i9] = (long) (((Long) list.get(i9)).longValue() * d9);
                i9++;
            }
        } else {
            long j12 = j9 / j10;
            while (i9 < size) {
                jArr[i9] = ((Long) list.get(i9)).longValue() * j12;
                i9++;
            }
        }
        return jArr;
    }

    public static int e(long[] jArr, long j9, boolean z9, boolean z10) {
        int i9;
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j9);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            while (true) {
                i9 = iBinarySearch + 1;
                if (i9 >= jArr.length || jArr[i9] != j9) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z9 ? iBinarySearch : i9;
        }
        return z10 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static int e0(Context context, String str, boolean z9) {
        return (f39777a < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    public static void e1(long[] jArr, long j9, long j10) {
        int i9 = 0;
        if (j10 >= j9 && j10 % j9 == 0) {
            long j11 = j10 / j9;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] / j11;
                i9++;
            }
            return;
        }
        if (j10 >= j9 || j9 % j10 != 0) {
            double d9 = j9 / j10;
            while (i9 < jArr.length) {
                jArr[i9] = (long) (jArr[i9] * d9);
                i9++;
            }
            return;
        }
        long j12 = j9 / j10;
        while (i9 < jArr.length) {
            jArr[i9] = jArr[i9] * j12;
            i9++;
        }
    }

    public static int f(C1682C c1682c, long j9, boolean z9, boolean z10) {
        int i9;
        int iC = c1682c.c() - 1;
        int i10 = 0;
        while (i10 <= iC) {
            int i11 = (i10 + iC) >>> 1;
            if (c1682c.b(i11) < j9) {
                i10 = i11 + 1;
            } else {
                iC = i11 - 1;
            }
        }
        if (z9 && (i9 = iC + 1) < c1682c.c() && c1682c.b(i9) == j9) {
            return i9;
        }
        if (z10 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static long f0(long j9, float f9) {
        return f9 == 1.0f ? j9 : Math.round(j9 * ((double) f9));
    }

    public static boolean f1(InterfaceC0920t1 interfaceC0920t1) {
        return interfaceC0920t1 == null || !interfaceC0920t1.E() || interfaceC0920t1.getPlaybackState() == 1 || interfaceC0920t1.getPlaybackState() == 4;
    }

    public static int g(List list, Comparable comparable, boolean z9, boolean z10) {
        int i9;
        int i10;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i9 = iBinarySearch - 1;
                if (i9 < 0 || ((Comparable) list.get(i9)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z9 ? iBinarySearch : i9;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static long g0(long j9) {
        return j9 == -9223372036854775807L ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime();
    }

    public static void g1(Throwable th) throws Throwable {
        h1(th);
    }

    public static int h(int[] iArr, int i9, boolean z9, boolean z10) {
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

    public static int h0(int i9) {
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

    public static void h1(Throwable th) throws Throwable {
        throw th;
    }

    public static int i(long[] jArr, long j9, boolean z9, boolean z10) {
        int i9;
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j9);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i9 = iBinarySearch - 1;
                if (i9 < 0 || jArr[i9] != j9) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z9 ? iBinarySearch : i9;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static C0936z0 i0(int i9, int i10, int i11) {
        return new C0936z0.b().g0("audio/raw").J(i10).h0(i11).a0(i9).G();
    }

    public static String[] i1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static Object j(Object obj) {
        return obj;
    }

    public static int j0(int i9, int i10) {
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
        return i10 * 2;
    }

    public static String[] j1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Object[] k(Object[] objArr) {
        return objArr;
    }

    public static long k0(long j9, float f9) {
        return f9 == 1.0f ? j9 : Math.round(j9 / ((double) f9));
    }

    public static String[] k1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : i1(str.trim(), "(\\s*,\\s*)");
    }

    public static int l(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public static int l0(int i9) {
        if (i9 == 13) {
            return 1;
        }
        switch (i9) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static ComponentName l1(Context context, Intent intent) {
        return f39777a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long m(long j9, long j10) {
        return ((j9 + j10) - 1) / j10;
    }

    public static String m0(StringBuilder sb, Formatter formatter, long j9) {
        long j10 = j9 == -9223372036854775807L ? 0L : j9;
        String str = j10 < 0 ? "-" : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb.setLength(0);
        return (j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)) : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11))).toString();
    }

    public static long m1(long j9, long j10, long j11) {
        long j12 = j9 - j10;
        return ((j9 ^ j12) & (j10 ^ j9)) < 0 ? j11 : j12;
    }

    public static boolean n(H0... h0Arr) {
        if (f39777a < 24) {
            return true;
        }
        for (H0 h02 : h0Arr) {
            H0.h hVar = h02.f5528c;
            if (hVar != null) {
                if (H0(hVar.f5625a)) {
                    return false;
                }
                for (int i9 = 0; i9 < h02.f5528c.f5631h.size(); i9++) {
                    if (H0(((H0.k) h02.f5528c.f5631h.get(i9)).f5653a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static String[] n0() {
        String[] strArrO0 = o0();
        for (int i9 = 0; i9 < strArrO0.length; i9++) {
            strArrO0[i9] = R0(strArrO0[i9]);
        }
        return strArrO0;
    }

    public static long n1(long... jArr) {
        long j9 = 0;
        for (long j10 : jArr) {
            j9 += j10;
        }
        return j9;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String[] o0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f39777a >= 24 ? p0(configuration) : new String[]{c0(configuration.locale)};
    }

    public static boolean o1(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int p(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 == j10 ? 0 : 1;
    }

    public static String[] p0(Configuration configuration) {
        return i1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static byte[] p1(InputStream inputStream) throws IOException {
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

    public static float q(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f9, f11));
    }

    public static String q0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e9) {
            AbstractC1681B.e("Util", "Failed to read system property " + str, e9);
            return null;
        }
    }

    public static float q1(byte[] bArr) {
        AbstractC1684a.a(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public static int r(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i9, i11));
    }

    public static String r0(int i9) {
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
            case 6:
                return "camera motion";
            default:
                if (i9 < 10000) {
                    return "?";
                }
                return "custom (" + i9 + ")";
        }
    }

    public static String r1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i9 = 0; i9 < bArr.length; i9++) {
            sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i9] & 15, 16));
        }
        return sb.toString();
    }

    public static long s(long j9, long j10, long j11) {
        return Math.max(j10, Math.min(j9, j11));
    }

    public static byte[] s0(String str) {
        return str.getBytes(AbstractC2675d.f49724c);
    }

    public static int s1(byte[] bArr) {
        AbstractC1684a.a(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    public static boolean t(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t0(InterfaceC0920t1 interfaceC0920t1) {
        if (interfaceC0920t1 == null || !interfaceC0920t1.t(1)) {
            return false;
        }
        interfaceC0920t1.pause();
        return true;
    }

    public static long t1(int i9, int i10) {
        return u1(i10) | (u1(i9) << 32);
    }

    public static int u(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            i11 = f39790n[((i11 >>> 24) ^ (bArr[i9] & 255)) & 255] ^ (i11 << 8);
            i9++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u0(O2.InterfaceC0920t1 r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.t(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = 1
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.t(r3)
            if (r1 == 0) goto L24
            r4.g()
            goto L15
        L24:
            boolean r1 = r4.t(r2)
            if (r1 == 0) goto L2e
            r4.play()
            goto L2f
        L2e:
            r2 = r0
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k0.u0(O2.t1):boolean");
    }

    public static long u1(int i9) {
        return ((long) i9) & 4294967295L;
    }

    public static int v(byte[] bArr, int i9, int i10, int i11) {
        while (i9 < i10) {
            i11 = f39791o[i11 ^ (bArr[i9] & 255)];
            i9++;
        }
        return i11;
    }

    public static boolean v0(InterfaceC0920t1 interfaceC0920t1) {
        return f1(interfaceC0920t1) ? u0(interfaceC0920t1) : t0(interfaceC0920t1);
    }

    public static CharSequence v1(CharSequence charSequence, int i9) {
        return charSequence.length() <= i9 ? charSequence : charSequence.subSequence(0, i9);
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static int w0(Uri uri) {
        int iX0;
        String scheme = uri.getScheme();
        if (scheme != null && AbstractC2673b.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iX0 = x0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iX0;
        }
        Matcher matcher = f39786j.matcher((CharSequence) AbstractC1684a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static String w1(String str) {
        int length = str.length();
        int iEnd = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '%') {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        int i11 = length - (i9 * 2);
        StringBuilder sb = new StringBuilder(i11);
        Matcher matcher = f39785i.matcher(str);
        while (i9 > 0 && matcher.find()) {
            char c9 = (char) Integer.parseInt((String) AbstractC1684a.e(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c9);
            iEnd = matcher.end();
            i9--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i11) {
            return null;
        }
        return sb.toString();
    }

    public static Handler x() {
        return y(null);
    }

    public static int x0(String str) {
        String strE = AbstractC2673b.e(str);
        strE.hashCode();
        switch (strE) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static long x1(long j9) {
        return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 / 1000;
    }

    public static Handler y(Handler.Callback callback) {
        return w((Looper) AbstractC1684a.i(Looper.myLooper()), callback);
    }

    public static int y0(Uri uri, String str) {
        if (str == null) {
            return w0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static void y1(Parcel parcel, boolean z9) {
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static Handler z() {
        return A(null);
    }

    public static boolean z0(M m9, M m10, Inflater inflater) {
        if (m9.a() <= 0) {
            return false;
        }
        if (m10.b() < m9.a()) {
            m10.c(m9.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(m9.e(), m9.f(), m9.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(m10.e(), iInflate, m10.b() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == m10.b()) {
                        m10.c(m10.b() * 2);
                    }
                } else {
                    m10.T(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }
}
