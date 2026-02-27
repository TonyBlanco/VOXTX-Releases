package M4;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class V4 extends AbstractC2985a {
    public static final Parcelable.Creator<V4> CREATOR = new W4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f4521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f4524l;

    public V4(int i9, String str, long j9, Long l9, Float f9, String str2, String str3, Double d9) {
        this.f4518f = i9;
        this.f4519g = str;
        this.f4520h = j9;
        this.f4521i = l9;
        if (i9 == 1) {
            this.f4524l = f9 != null ? Double.valueOf(f9.doubleValue()) : null;
        } else {
            this.f4524l = d9;
        }
        this.f4522j = str2;
        this.f4523k = str3;
    }

    public V4(X4 x42) {
        this(x42.f4545c, x42.f4546d, x42.f4547e, x42.f4544b);
    }

    public V4(String str, long j9, Object obj, String str2) {
        com.google.android.gms.common.internal.r.g(str);
        this.f4518f = 2;
        this.f4519g = str;
        this.f4520h = j9;
        this.f4523k = str2;
        if (obj == null) {
            this.f4521i = null;
            this.f4524l = null;
            this.f4522j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f4521i = (Long) obj;
            this.f4524l = null;
            this.f4522j = null;
        } else if (obj instanceof String) {
            this.f4521i = null;
            this.f4524l = null;
            this.f4522j = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f4521i = null;
            this.f4524l = (Double) obj;
            this.f4522j = null;
        }
    }

    public final Object H() {
        Long l9 = this.f4521i;
        if (l9 != null) {
            return l9;
        }
        Double d9 = this.f4524l;
        if (d9 != null) {
            return d9;
        }
        String str = this.f4522j;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        W4.a(this, parcel, i9);
    }
}
