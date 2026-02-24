package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import n4.E0;
import t4.AbstractC2774a;
import t4.T;
import t4.U;
import y4.AbstractC2985a;
import y4.c;

/* JADX INFO: loaded from: classes3.dex */
public class CastDevice extends AbstractC2985a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new E0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InetAddress f26236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f26239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f26241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f26244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f26245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f26246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f26247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f26248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f26249u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f26250v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U f26251w;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i9, List list, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z9, U u9) {
        this.f26234f = S(str);
        String strS = S(str2);
        this.f26235g = strS;
        if (!TextUtils.isEmpty(strS)) {
            try {
                this.f26236h = InetAddress.getByName(strS);
            } catch (UnknownHostException e9) {
                Log.i("CastDevice", "Unable to convert host address (" + this.f26235g + ") to ipaddress: " + e9.getMessage());
            }
        }
        this.f26237i = S(str3);
        this.f26238j = S(str4);
        this.f26239k = S(str5);
        this.f26240l = i9;
        this.f26241m = list == null ? new ArrayList() : list;
        this.f26242n = i10;
        this.f26243o = i11;
        this.f26244p = S(str6);
        this.f26245q = str7;
        this.f26246r = i12;
        this.f26247s = str8;
        this.f26248t = bArr;
        this.f26249u = str9;
        this.f26250v = z9;
        this.f26251w = u9;
    }

    public static CastDevice K(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public static String S(String str) {
        return str == null ? "" : str;
    }

    public String H() {
        return this.f26234f.startsWith("__cast_nearby__") ? this.f26234f.substring(16) : this.f26234f;
    }

    public String I() {
        return this.f26239k;
    }

    public String J() {
        return this.f26237i;
    }

    public List L() {
        return Collections.unmodifiableList(this.f26241m);
    }

    public String M() {
        return this.f26238j;
    }

    public int N() {
        return this.f26240l;
    }

    public boolean O(int i9) {
        return (this.f26242n & i9) == i9;
    }

    public void P(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final int Q() {
        return this.f26242n;
    }

    public final U R() {
        if (this.f26251w == null) {
            boolean zO = O(32);
            boolean zO2 = O(64);
            if (zO || zO2) {
                return T.a(1);
            }
        }
        return this.f26251w;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f26234f;
        return str == null ? castDevice.f26234f == null : AbstractC2774a.k(str, castDevice.f26234f) && AbstractC2774a.k(this.f26236h, castDevice.f26236h) && AbstractC2774a.k(this.f26238j, castDevice.f26238j) && AbstractC2774a.k(this.f26237i, castDevice.f26237i) && AbstractC2774a.k(this.f26239k, castDevice.f26239k) && this.f26240l == castDevice.f26240l && AbstractC2774a.k(this.f26241m, castDevice.f26241m) && this.f26242n == castDevice.f26242n && this.f26243o == castDevice.f26243o && AbstractC2774a.k(this.f26244p, castDevice.f26244p) && AbstractC2774a.k(Integer.valueOf(this.f26246r), Integer.valueOf(castDevice.f26246r)) && AbstractC2774a.k(this.f26247s, castDevice.f26247s) && AbstractC2774a.k(this.f26245q, castDevice.f26245q) && AbstractC2774a.k(this.f26239k, castDevice.I()) && this.f26240l == castDevice.N() && (((bArr = this.f26248t) == null && castDevice.f26248t == null) || Arrays.equals(bArr, castDevice.f26248t)) && AbstractC2774a.k(this.f26249u, castDevice.f26249u) && this.f26250v == castDevice.f26250v && AbstractC2774a.k(R(), castDevice.R());
    }

    public int hashCode() {
        String str = this.f26234f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        Locale locale = Locale.ROOT;
        String str = this.f26237i;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            str = length <= 2 ? length == 2 ? "xx" : "x" : String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
        }
        return String.format(locale, "\"%s\" (%s)", str, this.f26234f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = c.a(parcel);
        c.t(parcel, 2, this.f26234f, false);
        c.t(parcel, 3, this.f26235g, false);
        c.t(parcel, 4, J(), false);
        c.t(parcel, 5, M(), false);
        c.t(parcel, 6, I(), false);
        c.l(parcel, 7, N());
        c.x(parcel, 8, L(), false);
        c.l(parcel, 9, this.f26242n);
        c.l(parcel, 10, this.f26243o);
        c.t(parcel, 11, this.f26244p, false);
        c.t(parcel, 12, this.f26245q, false);
        c.l(parcel, 13, this.f26246r);
        c.t(parcel, 14, this.f26247s, false);
        c.f(parcel, 15, this.f26248t, false);
        c.t(parcel, 16, this.f26249u, false);
        c.c(parcel, 17, this.f26250v);
        c.r(parcel, 18, R(), i9, false);
        c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f26245q;
    }
}
