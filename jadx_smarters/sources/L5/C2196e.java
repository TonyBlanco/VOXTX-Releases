package l5;

/* JADX INFO: renamed from: l5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2196e extends AbstractC2195d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44080a = -1.0f;

    @Override // l5.AbstractC2195d
    public void a(m mVar, float f9, float f10, float f11) {
        mVar.o(0.0f, f11 * f10, 180.0f, 180.0f - f9);
        double d9 = f11;
        double d10 = f10;
        mVar.m((float) (Math.sin(Math.toRadians(f9)) * d9 * d10), (float) (Math.sin(Math.toRadians(90.0f - f9)) * d9 * d10));
    }
}
