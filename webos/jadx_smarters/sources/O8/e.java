package O8;

import O8.c;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements c.b {
    @Override // O8.c.b
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // O8.c.b
    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // O8.c.b
    public String[] c() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // O8.c.b
    public void d(String str) {
        System.load(str);
    }

    @Override // O8.c.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
