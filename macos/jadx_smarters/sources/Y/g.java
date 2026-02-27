package Y;

import G8.L;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10505a = new g();

    public final f a(k serializer, Z.b bVar, List migrations, L scope, w8.a produceFile) {
        kotlin.jvm.internal.l.e(serializer, "serializer");
        kotlin.jvm.internal.l.e(migrations, "migrations");
        kotlin.jvm.internal.l.e(scope, "scope");
        kotlin.jvm.internal.l.e(produceFile, "produceFile");
        return new m(produceFile, serializer, l8.j.b(e.f10488a.b(migrations)), new Z.a(), scope);
    }
}
