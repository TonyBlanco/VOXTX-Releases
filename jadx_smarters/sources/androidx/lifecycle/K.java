package androidx.lifecycle;

import androidx.lifecycle.J;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class K {
    public static I a(J.b bVar, Class modelClass) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static I b(J.b bVar, Class modelClass, AbstractC2215a extras) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        kotlin.jvm.internal.l.e(extras, "extras");
        return bVar.b(modelClass);
    }
}
