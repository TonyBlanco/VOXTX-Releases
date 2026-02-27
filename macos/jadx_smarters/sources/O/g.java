package O;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5404c;

    public g(int i9) {
        super(i9);
        this.f5404c = new Object();
    }

    @Override // O.f, O.e
    public boolean a(Object obj) {
        boolean zA;
        synchronized (this.f5404c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // O.f, O.e
    public Object b() {
        Object objB;
        synchronized (this.f5404c) {
            objB = super.b();
        }
        return objB;
    }
}
