package w4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends AbstractBinderC2912A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f51613c;

    public B(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f51613c = bArr;
    }

    @Override // w4.AbstractBinderC2912A
    public final byte[] Z() {
        return this.f51613c;
    }
}
