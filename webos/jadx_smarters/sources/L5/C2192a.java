package l5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: l5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2192a implements InterfaceC2194c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44077a;

    public C2192a(float f9) {
        this.f44077a = f9;
    }

    @Override // l5.InterfaceC2194c
    public float a(RectF rectF) {
        return this.f44077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2192a) && this.f44077a == ((C2192a) obj).f44077a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44077a)});
    }
}
