package M4;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class D1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1 f4220a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f4222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f4225g;

    public /* synthetic */ D1(String str, B1 b12, int i9, Throwable th, byte[] bArr, Map map, C1 c12) {
        com.google.android.gms.common.internal.r.m(b12);
        this.f4220a = b12;
        this.f4221c = i9;
        this.f4222d = th;
        this.f4223e = bArr;
        this.f4224f = str;
        this.f4225g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4220a.a(this.f4224f, this.f4221c, this.f4222d, this.f4223e, this.f4225g);
    }
}
