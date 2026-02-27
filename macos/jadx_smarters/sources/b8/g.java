package B8;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final void a(boolean z9, Number step) {
        l.e(step, "step");
        if (z9) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
