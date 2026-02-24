package O5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: renamed from: O5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0945i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6572a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f6573b = -1;

    /* JADX INFO: renamed from: O5.i$a */
    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, a> matcher;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", aVar3);
            map.put("armeabi", aVar2);
            map.put("arm64-v8a", aVar4);
            map.put("x86", aVar);
        }

        public static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                L5.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static boolean A() {
        boolean z9 = z();
        String str = Build.TAGS;
        if ((z9 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !z9 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean B(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String C(String str) {
        return u(str, MessageDigestAlgorithms.SHA_1);
    }

    public static String D(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean c(Context context) {
        if (!d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e9) {
                L5.f.f().e(str, e9);
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused) {
            }
        }
    }

    public static long g(String str, String str2, int i9) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i9);
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return C(string);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = r3[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.io.File r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L60
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r3 == 0) goto L3b
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r4 = r3.length     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r4 == 0) goto L15
            r2 = r3[r5]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L3b
        L36:
            r6 = move-exception
            r2 = r1
            goto L5c
        L39:
            r7 = move-exception
            goto L43
        L3b:
            e(r1, r0)
            goto L60
        L3f:
            r6 = move-exception
            goto L5c
        L41:
            r7 = move-exception
            r1 = r2
        L43:
            L5.f r3 = L5.f.f()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L36
            r4.append(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L36
            r3.e(r6, r7)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L5c:
            e(r2, r0)
            throw r6
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.AbstractC0945i.i(java.io.File, java.lang.String):java.lang.String");
    }

    public static ActivityManager.RunningAppProcessInfo j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean k(Context context, String str, boolean z9) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iR = r(context, str, "bool");
            if (iR > 0) {
                return resources.getBoolean(iR);
            }
            int iR2 = r(context, str, "string");
            if (iR2 > 0) {
                return Boolean.parseBoolean(context.getString(iR2));
            }
        }
        return z9;
    }

    public static List l(Context context) {
        ArrayList arrayList = new ArrayList();
        int iR = r(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iR2 = r(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iR3 = r(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iR == 0 || iR2 == 0 || iR3 == 0) {
            L5.f.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iR), Integer.valueOf(iR2), Integer.valueOf(iR3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iR);
        String[] stringArray2 = context.getResources().getStringArray(iR2);
        String[] stringArray3 = context.getResources().getStringArray(iR3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            L5.f.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i9 = 0; i9 < stringArray3.length; i9++) {
            arrayList.add(new C0942f(stringArray[i9], stringArray2[i9], stringArray3[i9]));
        }
        return arrayList;
    }

    public static int m() {
        return a.getValue().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int n() {
        boolean z9 = z();
        ?? r02 = z9;
        if (A()) {
            r02 = (z9 ? 1 : 0) | 2;
        }
        return y() ? r02 | 4 : r02;
    }

    public static String o(Context context) {
        int iR = r(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iR == 0) {
            iR = r(context, "com.crashlytics.android.build_id", "string");
        }
        if (iR != 0) {
            return context.getResources().getString(iR);
        }
        return null;
    }

    public static boolean p(Context context) {
        return (z() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String q(Context context) {
        int i9 = context.getApplicationContext().getApplicationInfo().icon;
        if (i9 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i9);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    public static int r(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, q(context));
    }

    public static SharedPreferences s(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long t() {
        try {
            if (f6573b == -1) {
                String strI = i(new File("/proc/meminfo"), "MemTotal");
                long jG = 0;
                if (!TextUtils.isEmpty(strI)) {
                    String upperCase = strI.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            jG = g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            jG = g(upperCase, "MB", Constants.MB);
                        } else if (upperCase.endsWith("GB")) {
                            jG = g(upperCase, "GB", 1073741824);
                        } else {
                            L5.f.f().k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e9) {
                        L5.f.f().e("Unexpected meminfo format while computing RAM: " + upperCase, e9);
                    }
                }
                f6573b = jG;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6573b;
    }

    public static String u(String str, String str2) {
        return v(str.getBytes(), str2);
    }

    public static String v(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return w(messageDigest.digest());
        } catch (NoSuchAlgorithmException e9) {
            L5.f.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e9);
            return "";
        }
    }

    public static String w(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b9 = bArr[i9];
            int i10 = i9 * 2;
            char[] cArr2 = f6572a;
            cArr[i10] = cArr2[(b9 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public static boolean x(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean y() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean z() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }
}
