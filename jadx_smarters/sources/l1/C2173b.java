package l1;

/* JADX INFO: renamed from: l1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2173b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2173b f43864b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f43865a = new c();

    public static C2173b b() {
        if (f43864b == null) {
            synchronized (C2173b.class) {
                try {
                    if (f43864b == null) {
                        f43864b = new C2173b();
                    }
                } finally {
                }
            }
        }
        return f43864b;
    }

    public d a() {
        return this.f43865a;
    }
}
