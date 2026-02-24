package G5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class F extends AbstractC0540g implements Cloneable {
    public static final Parcelable.Creator<F> CREATOR = new W();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2184j;

    public F(String str, String str2, String str3, boolean z9, String str4) {
        com.google.android.gms.common.internal.r.b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f2180f = str;
        this.f2181g = str2;
        this.f2182h = str3;
        this.f2183i = z9;
        this.f2184j = str4;
    }

    public static F L(String str, String str2) {
        return new F(str, str2, null, true, null);
    }

    public static F N(String str, String str2) {
        return new F(null, null, str, true, str2);
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return "phone";
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return "phone";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return (F) clone();
    }

    public String K() {
        return this.f2181g;
    }

    public final F M(boolean z9) {
        this.f2183i = false;
        return this;
    }

    public final String O() {
        return this.f2182h;
    }

    public final boolean P() {
        return this.f2183i;
    }

    public /* synthetic */ Object clone() {
        return new F(this.f2180f, K(), this.f2182h, this.f2183i, this.f2184j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2180f, false);
        y4.c.t(parcel, 2, K(), false);
        y4.c.t(parcel, 4, this.f2182h, false);
        y4.c.c(parcel, 5, this.f2183i);
        y4.c.t(parcel, 6, this.f2184j, false);
        y4.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f2180f;
    }

    public final String zzd() {
        return this.f2184j;
    }
}
