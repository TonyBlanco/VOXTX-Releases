package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import java.util.Arrays;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class ast extends AbstractC2985a {
    public static final Parcelable.Creator<ast> CREATOR = new asm(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f20653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20654c;

    public ast() {
        this(1, null, 1);
    }

    public ast(int i9, byte[] bArr, int i10) {
        this.f20652a = i9;
        this.f20653b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f20654c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 1, this.f20652a);
        y4.c.f(parcel, 2, this.f20653b, false);
        y4.c.l(parcel, 3, this.f20654c);
        y4.c.b(parcel, iA);
    }
}
