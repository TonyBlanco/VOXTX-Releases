package W5;

/* JADX INFO: loaded from: classes3.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10307a;

    public b(int i9) {
        this.f10307a = i9;
    }

    @Override // W5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i9 = this.f10307a;
        if (length <= i9) {
            return stackTraceElementArr;
        }
        int i10 = i9 / 2;
        int i11 = i9 - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i9];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }
}
