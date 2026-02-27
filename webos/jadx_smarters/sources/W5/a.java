package W5;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f10305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10306c;

    public a(int i9, d... dVarArr) {
        this.f10304a = i9;
        this.f10305b = dVarArr;
        this.f10306c = new b(i9);
    }

    @Override // W5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f10304a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f10305b) {
            if (stackTraceElementArrA.length <= this.f10304a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f10304a ? this.f10306c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
