package G5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: renamed from: G5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0541h extends AbstractC0540g {
    public static final Parcelable.Creator<C0541h> CREATOR = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2235j;

    public C0541h(String str, String str2, String str3, String str4, boolean z9) {
        this.f2231f = com.google.android.gms.common.internal.r.g(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f2232g = str2;
        this.f2233h = str3;
        this.f2234i = str4;
        this.f2235j = z9;
    }

    @Override // G5.AbstractC0540g
    public String H() {
        return CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD;
    }

    @Override // G5.AbstractC0540g
    public String I() {
        return !TextUtils.isEmpty(this.f2232g) ? CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD : "emailLink";
    }

    @Override // G5.AbstractC0540g
    public final AbstractC0540g J() {
        return new C0541h(this.f2231f, this.f2232g, this.f2233h, this.f2234i, this.f2235j);
    }

    public final C0541h K(AbstractC0553u abstractC0553u) {
        this.f2234i = abstractC0553u.zze();
        this.f2235j = true;
        return this;
    }

    public final String L() {
        return this.f2234i;
    }

    public final boolean M() {
        return !TextUtils.isEmpty(this.f2233h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.t(parcel, 1, this.f2231f, false);
        y4.c.t(parcel, 2, this.f2232g, false);
        y4.c.t(parcel, 3, this.f2233h, false);
        y4.c.t(parcel, 4, this.f2234i, false);
        y4.c.c(parcel, 5, this.f2235j);
        y4.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f2231f;
    }

    public final String zzd() {
        return this.f2232g;
    }

    public final String zze() {
        return this.f2233h;
    }

    public final boolean zzg() {
        return this.f2235j;
    }
}
