package l5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC2194c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44131a;

    public i(float f9) {
        this.f44131a = f9;
    }

    @Override // l5.InterfaceC2194c
    public float a(RectF rectF) {
        return this.f44131a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f44131a == ((i) obj).f44131a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44131a)});
    }
}
