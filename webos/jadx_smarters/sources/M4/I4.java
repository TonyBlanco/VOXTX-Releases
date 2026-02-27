package M4;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class I4 implements B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S4 f4318b;

    public I4(S4 s42, String str) {
        this.f4318b = s42;
        this.f4317a = str;
    }

    @Override // M4.B1
    public final void a(String str, int i9, Throwable th, byte[] bArr, Map map) {
        this.f4318b.p(i9, th, bArr, this.f4317a);
    }
}
