package d4;

import java.util.Arrays;

/* JADX INFO: renamed from: d4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1706x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f39832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39834c;

    public AbstractC1706x(String... strArr) {
        this.f39832a = strArr;
    }

    public synchronized boolean a() {
        if (this.f39833b) {
            return this.f39834c;
        }
        this.f39833b = true;
        try {
            for (String str : this.f39832a) {
                b(str);
            }
            this.f39834c = true;
        } catch (UnsatisfiedLinkError unused) {
            AbstractC1681B.j("LibraryLoader", "Failed to load " + Arrays.toString(this.f39832a));
        }
        return this.f39834c;
    }

    public abstract void b(String str);
}
