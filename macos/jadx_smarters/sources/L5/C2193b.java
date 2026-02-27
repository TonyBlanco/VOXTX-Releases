package l5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: l5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2193b implements InterfaceC2194c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2194c f44078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44079b;

    public C2193b(float f9, InterfaceC2194c interfaceC2194c) {
        while (interfaceC2194c instanceof C2193b) {
            interfaceC2194c = ((C2193b) interfaceC2194c).f44078a;
            f9 += ((C2193b) interfaceC2194c).f44079b;
        }
        this.f44078a = interfaceC2194c;
        this.f44079b = f9;
    }

    @Override // l5.InterfaceC2194c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f44078a.a(rectF) + this.f44079b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2193b)) {
            return false;
        }
        C2193b c2193b = (C2193b) obj;
        return this.f44078a.equals(c2193b.f44078a) && this.f44079b == c2193b.f44079b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44078a, Float.valueOf(this.f44079b)});
    }
}
