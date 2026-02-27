package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F {
    public static String[] a(Context context) {
        Vector vector = new Vector();
        vector.add(g(context));
        vector.add("--config");
        vector.add(b(context));
        return (String[]) vector.toArray(new String[0]);
    }

    public static String b(Context context) {
        return context.getCacheDir().getAbsolutePath() + "/android.conf";
    }

    public static String c() {
        return "pie_openvpn";
    }

    public static String[] d() {
        return Build.SUPPORTED_ABIS;
    }

    public static String[] e(String[] strArr) {
        strArr[0] = strArr[0].replace("pie_openvpn", "nopie_openvpn");
        return strArr;
    }

    public static void f(f8.l lVar, Context context) {
        Intent intentJ = lVar.J(context);
        if (intentJ != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intentJ);
            } else {
                context.startService(intentJ);
            }
        }
    }

    public static String g(Context context) {
        String strA = NativeUtils.a();
        if (Build.VERSION.SDK_INT >= 28) {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libovpnexec.so").getPath();
        }
        String[] strArrD = d();
        if (!strA.equals(strArrD[0])) {
            G.y(a7.j.f13306l, Arrays.toString(strArrD), strA);
            strArrD = new String[]{strA};
        }
        for (String str : strArrD) {
            File file = new File(context.getCacheDir(), "c_" + c() + InstructionFileId.DOT + str);
            if ((file.exists() && file.canExecute()) || h(context, str, file)) {
                return file.getPath();
            }
        }
        throw new RuntimeException("Cannot find any executable for this device's ABIs " + Arrays.toString(strArrD));
    }

    public static boolean h(Context context, String str, File file) {
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(c() + InstructionFileId.DOT + str);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i9 = inputStreamOpen.read(bArr);
                    if (i9 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i9);
                }
                fileOutputStream.close();
                if (file.setExecutable(true)) {
                    return true;
                }
                G.p("Failed to make OpenVPN executable");
                return false;
            } catch (IOException unused) {
                G.u("Failed getting assets for archicture " + str);
                return false;
            }
        } catch (IOException e9) {
            G.r(e9);
            return false;
        }
    }
}
