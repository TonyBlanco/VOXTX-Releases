package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0644c extends AbstractC2985a {
    public static final Parcelable.Creator<C0644c> CREATOR = new V();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3283g;

    public C0644c(int i9, int i10) {
        this.f3282f = i9;
        this.f3283g = i10;
    }

    public int H() {
        return this.f3282f;
    }

    public int I() {
        return this.f3283g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0644c)) {
            return false;
        }
        C0644c c0644c = (C0644c) obj;
        return this.f3282f == c0644c.f3282f && this.f3283g == c0644c.f3283g;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f3282f), Integer.valueOf(this.f3283g));
    }

    public String toString() {
        int i9 = this.f3282f;
        int i10 = this.f3283g;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i9);
        sb.append(", mTransitionType=");
        sb.append(i10);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        com.google.android.gms.common.internal.r.m(parcel);
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, H());
        y4.c.l(parcel, 2, I());
        y4.c.b(parcel, iA);
    }
}
