package w4;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C extends AbstractBinderC2912A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakReference f51614d = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f51615c;

    public C(byte[] bArr) {
        super(bArr);
        this.f51615c = f51614d;
    }

    @Override // w4.AbstractBinderC2912A
    public final byte[] Z() {
        byte[] bArrC0;
        synchronized (this) {
            try {
                bArrC0 = (byte[]) this.f51615c.get();
                if (bArrC0 == null) {
                    bArrC0 = c0();
                    this.f51615c = new WeakReference(bArrC0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrC0;
    }

    public abstract byte[] c0();
}
