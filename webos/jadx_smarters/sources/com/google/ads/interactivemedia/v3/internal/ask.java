package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ask extends AbstractC2985a {
    public static final Parcelable.Creator<ask> CREATOR = new asm(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20629c;

    public ask(int i9, String str, String str2) {
        this.f20627a = i9;
        this.f20628b = str;
        this.f20629c = str2;
    }

    public ask(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f20627a);
        y4.c.t(parcel, 2, this.f20628b, false);
        y4.c.t(parcel, 3, this.f20629c, false);
        y4.c.b(parcel, iA);
    }
}
