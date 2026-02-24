package M4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: M4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0820t extends AbstractC2985a implements Iterable {
    public static final Parcelable.Creator<C0820t> CREATOR = new C0826u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f5061f;

    public C0820t(Bundle bundle) {
        this.f5061f = bundle;
    }

    public final int H() {
        return this.f5061f.size();
    }

    public final Bundle J() {
        return new Bundle(this.f5061f);
    }

    public final Double K(String str) {
        return Double.valueOf(this.f5061f.getDouble("value"));
    }

    public final Long L(String str) {
        return Long.valueOf(this.f5061f.getLong("value"));
    }

    public final Object M(String str) {
        return this.f5061f.get(str);
    }

    public final String N(String str) {
        return this.f5061f.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0814s(this);
    }

    public final String toString() {
        return this.f5061f.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.e(parcel, 2, J(), false);
        y4.c.b(parcel, iA);
    }
}
