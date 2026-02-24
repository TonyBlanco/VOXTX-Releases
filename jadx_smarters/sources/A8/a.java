package A8;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends z8.a {
    @Override // z8.c
    public int d(int i9, int i10) {
        return ThreadLocalRandom.current().nextInt(i9, i10);
    }

    @Override // z8.a
    public Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
