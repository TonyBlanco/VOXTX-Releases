package t6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ int a(double d9) {
        long jDoubleToLongBits = Double.doubleToLongBits(d9);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
