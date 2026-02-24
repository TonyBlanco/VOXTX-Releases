package H5;

import G5.AbstractC0553u;
import G5.InterfaceC0539f;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements y4.d {
    public static final Parcelable.Creator<d0> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0611b f2676a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f2677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G5.f0 f2678d;

    public d0(C0611b c0611b) {
        C0611b c0611b2 = (C0611b) com.google.android.gms.common.internal.r.m(c0611b);
        this.f2676a = c0611b2;
        List listA0 = c0611b2.a0();
        this.f2677c = null;
        for (int i9 = 0; i9 < listA0.size(); i9++) {
            if (!TextUtils.isEmpty(((f0) listA0.get(i9)).zza())) {
                this.f2677c = new b0(((f0) listA0.get(i9)).g(), ((f0) listA0.get(i9)).zza(), c0611b.b0());
            }
        }
        if (this.f2677c == null) {
            this.f2677c = new b0(c0611b.b0());
        }
        this.f2678d = c0611b.Z();
    }

    public d0(C0611b c0611b, b0 b0Var, G5.f0 f0Var) {
        this.f2676a = c0611b;
        this.f2677c = b0Var;
        this.f2678d = f0Var;
    }

    public final InterfaceC0539f a() {
        return this.f2677c;
    }

    public final AbstractC0553u c() {
        return this.f2676a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.r(parcel, 1, c(), i9, false);
        y4.c.r(parcel, 2, a(), i9, false);
        y4.c.r(parcel, 3, this.f2678d, i9, false);
        y4.c.b(parcel, iA);
    }
}
