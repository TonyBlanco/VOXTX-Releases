package retrofit2;

import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: retrofit2.-KotlinExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class KotlinExtensions {
    private static final <T> T create(@NotNull Retrofit retrofit) {
        l.i(4, "T");
        return (T) retrofit.create(Object.class);
    }
}
