package G8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I0 extends H {
    public abstract I0 f0();

    public final String g0() {
        I0 i0F0;
        I0 i0C = C0562b0.c();
        if (this == i0C) {
            return "Dispatchers.Main";
        }
        try {
            i0F0 = i0C.f0();
        } catch (UnsupportedOperationException unused) {
            i0F0 = null;
        }
        if (this == i0F0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
