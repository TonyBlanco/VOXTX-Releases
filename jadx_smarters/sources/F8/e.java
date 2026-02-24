package F8;

import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final long a(long j9, d sourceUnit, d targetUnit) {
        l.e(sourceUnit, "sourceUnit");
        l.e(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j9, sourceUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j9, d sourceUnit, d targetUnit) {
        l.e(sourceUnit, "sourceUnit");
        l.e(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit$kotlin_stdlib().convert(j9, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
