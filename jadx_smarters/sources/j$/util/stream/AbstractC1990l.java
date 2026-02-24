package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1990l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42695a = 0;

    static {
        EnumC1975i enumC1975i = EnumC1975i.CONCURRENT;
        EnumC1975i enumC1975i2 = EnumC1975i.UNORDERED;
        EnumC1975i enumC1975i3 = EnumC1975i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC1975i, enumC1975i2, enumC1975i3));
        Collections.unmodifiableSet(EnumSet.of(enumC1975i, enumC1975i2));
        Collections.unmodifiableSet(EnumSet.of(enumC1975i3));
        Collections.unmodifiableSet(EnumSet.of(enumC1975i2, enumC1975i3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC1975i2));
    }

    static void a(double[] dArr, double d9) {
        double d10 = d9 - dArr[1];
        double d11 = dArr[0];
        double d12 = d11 + d10;
        dArr[1] = (d12 - d11) - d10;
        dArr[0] = d12;
    }
}
