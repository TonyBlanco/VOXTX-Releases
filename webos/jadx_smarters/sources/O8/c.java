package O8;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, d dVar);
    }

    public interface b {
        String a(String str);

        String b(String str);

        String[] c();

        void d(String str);

        void loadLibrary(String str);
    }

    /* JADX INFO: renamed from: O8.c$c, reason: collision with other inner class name */
    public interface InterfaceC0077c {
    }

    public static void a(Context context, String str) {
        b(context, str, null, null);
    }

    public static void b(Context context, String str, String str2, InterfaceC0077c interfaceC0077c) {
        new d().f(context, str, str2, interfaceC0077c);
    }
}
