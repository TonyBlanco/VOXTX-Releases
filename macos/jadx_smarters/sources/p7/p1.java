package p7;

import android.content.Context;
import android.util.Log;
import c4.C1272r;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c4.t f46664a;

    public static c4.t a(Context context) {
        if (f46664a == null) {
            File file = new File(context.getExternalFilesDir(null), "downloads");
            Log.i("directoryIS", file.toString());
            f46664a = new c4.t(file, new C1272r());
        }
        return f46664a;
    }
}
