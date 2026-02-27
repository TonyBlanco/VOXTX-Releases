package C4;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f1147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1148b;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f1147a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f1147a = Application.getProcessName();
            } else {
                int iMyPid = f1148b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f1148b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                com.google.android.gms.common.internal.r.m(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                k.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    k.a(bufferedReader);
                }
                f1147a = strTrim;
            }
        }
        return f1147a;
    }
}
