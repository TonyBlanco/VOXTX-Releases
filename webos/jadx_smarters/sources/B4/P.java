package b4;

import android.net.Uri;
import d4.AbstractC1684a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o f17545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f17547c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f17548d = Collections.emptyMap();

    public P(InterfaceC1224o interfaceC1224o) {
        this.f17545a = (InterfaceC1224o) AbstractC1684a.e(interfaceC1224o);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        this.f17547c = c1227s.f17598a;
        this.f17548d = Collections.emptyMap();
        long jA = this.f17545a.a(c1227s);
        this.f17547c = (Uri) AbstractC1684a.e(getUri());
        this.f17548d = e();
        return jA;
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17545a.close();
    }

    @Override // b4.InterfaceC1224o
    public Map e() {
        return this.f17545a.e();
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
        AbstractC1684a.e(s9);
        this.f17545a.g(s9);
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17545a.getUri();
    }

    public long j() {
        return this.f17546b;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        int i11 = this.f17545a.read(bArr, i9, i10);
        if (i11 != -1) {
            this.f17546b += (long) i11;
        }
        return i11;
    }

    public Uri t() {
        return this.f17547c;
    }

    public Map u() {
        return this.f17548d;
    }

    public void v() {
        this.f17546b = 0L;
    }
}
