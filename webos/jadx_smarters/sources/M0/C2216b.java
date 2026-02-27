package m0;

import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: m0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2216b implements J.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f44279a;

    public C2216b(f... initializers) {
        l.e(initializers, "initializers");
        this.f44279a = initializers;
    }

    @Override // androidx.lifecycle.J.b
    public I a(Class modelClass, AbstractC2215a extras) {
        l.e(modelClass, "modelClass");
        l.e(extras, "extras");
        I i9 = null;
        for (f fVar : this.f44279a) {
            if (l.a(fVar.a(), modelClass)) {
                Object objInvoke = fVar.b().invoke(extras);
                i9 = objInvoke instanceof I ? (I) objInvoke : null;
            }
        }
        if (i9 != null) {
            return i9;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }

    @Override // androidx.lifecycle.J.b
    public /* synthetic */ I b(Class cls) {
        return K.a(this, cls);
    }
}
