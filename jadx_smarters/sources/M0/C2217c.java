package m0;

import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w8.l;

/* JADX INFO: renamed from: m0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2217c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44280a = new ArrayList();

    public final void a(C8.c clazz, l initializer) {
        kotlin.jvm.internal.l.e(clazz, "clazz");
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f44280a.add(new f(v8.a.a(clazz), initializer));
    }

    public final J.b b() {
        Object[] array = this.f44280a.toArray(new f[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        f[] fVarArr = (f[]) array;
        return new C2216b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
