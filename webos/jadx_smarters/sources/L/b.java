package L;

import android.os.Bundle;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3852a = new b();

    public static final void a(@NotNull Bundle bundle, @NotNull String key, @Nullable IBinder iBinder) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
