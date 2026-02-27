package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String fileName) {
        l.e(context, "<this>");
        l.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), l.l("datastore/", fileName));
    }
}
