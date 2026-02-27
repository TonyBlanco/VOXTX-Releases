package J1;

import java.io.Closeable;
import java.io.Flushable;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3016a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f3017c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f3018d = new String[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f3019e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3023i;

    public static h i(BufferedSink bufferedSink) {
        return new g(bufferedSink);
    }

    public abstract h a();

    public abstract h c();

    public abstract h d();

    public abstract h e();

    public abstract h g(String str);

    public final String getPath() {
        return f.a(this.f3016a, this.f3017c, this.f3018d, this.f3019e);
    }

    public abstract h h();

    public final int j() {
        int i9 = this.f3016a;
        if (i9 != 0) {
            return this.f3017c[i9 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(int i9) {
        int i10 = this.f3016a;
        int[] iArr = this.f3017c;
        if (i10 != iArr.length) {
            this.f3016a = i10 + 1;
            iArr[i10] = i9;
        } else {
            throw new N1.a("Nesting too deep at " + getPath() + ": circular reference?");
        }
    }

    public final void l(int i9) {
        this.f3017c[this.f3016a - 1] = i9;
    }

    public final void m(boolean z9) {
        this.f3022h = z9;
    }

    public abstract h n(Boolean bool);

    public abstract h o(Number number);

    public abstract h p(String str);

    public abstract h q(boolean z9);
}
