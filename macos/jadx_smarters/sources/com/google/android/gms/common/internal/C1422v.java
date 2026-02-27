package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1422v extends AbstractC2985a {
    public static final Parcelable.Creator<C1422v> CREATOR = new A();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f26895g;

    public C1422v(int i9, List list) {
        this.f26894f = i9;
        this.f26895g = list;
    }

    public final int H() {
        return this.f26894f;
    }

    public final List I() {
        return this.f26895g;
    }

    public final void J(C1417p c1417p) {
        if (this.f26895g == null) {
            this.f26895g = new ArrayList();
        }
        this.f26895g.add(c1417p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f26894f);
        y4.c.x(parcel, 2, this.f26895g, false);
        y4.c.b(parcel, iA);
    }
}
