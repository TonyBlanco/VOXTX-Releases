package a0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074b {
    public static final File a(Context context, String name) {
        l.e(context, "<this>");
        l.e(name, "name");
        return X.a.a(context, l.l(name, ".preferences_pb"));
    }
}
