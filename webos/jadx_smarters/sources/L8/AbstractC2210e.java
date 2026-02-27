package l8;

/* JADX INFO: renamed from: l8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2210e {
    public static final void a(int i9, int i10) {
        if (i9 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i10 + ").");
    }
}
