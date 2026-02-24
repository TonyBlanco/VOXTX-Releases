package C2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
