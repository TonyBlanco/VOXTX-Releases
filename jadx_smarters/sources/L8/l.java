package l8;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends k {
    public static int o(Iterable iterable, int i9) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i9;
    }
}
