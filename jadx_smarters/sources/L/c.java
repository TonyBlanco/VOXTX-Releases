package L;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3853a = new c();

    public static final void a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size size) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putSize(key, size);
    }

    public static final void b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF sizeF) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
