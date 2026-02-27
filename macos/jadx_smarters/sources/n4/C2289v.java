package n4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import t4.C2775b;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2289v extends AbstractC2985a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2775b f45537i = new C2775b("VideoInfo");
    public static final Parcelable.Creator<C2289v> CREATOR = new y0();

    public C2289v(int i9, int i10, int i11) {
        this.f45538f = i9;
        this.f45539g = i10;
        this.f45540h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n4.C2289v I(org.json.JSONObject r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            if (r8 != 0) goto L6
            return r2
        L6:
            java.lang.String r3 = "hdrType"
            java.lang.String r3 = r8.getString(r3)     // Catch: org.json.JSONException -> L64
            int r4 = r3.hashCode()     // Catch: org.json.JSONException -> L64
            r5 = 3218(0xc92, float:4.51E-42)
            r6 = 2
            r7 = 3
            if (r4 == r5) goto L44
            r5 = 103158(0x192f6, float:1.44555E-40)
            if (r4 == r5) goto L3a
            r5 = 113729(0x1bc41, float:1.59368E-40)
            if (r4 == r5) goto L30
            r5 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r4 == r5) goto L26
            goto L4e
        L26:
            java.lang.String r4 = "hdr10"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L4e
            r4 = 1
            goto L4f
        L30:
            java.lang.String r4 = "sdr"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L4e
            r4 = 3
            goto L4f
        L3a:
            java.lang.String r4 = "hdr"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L4e
            r4 = 2
            goto L4f
        L44:
            java.lang.String r4 = "dv"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L4e
            r4 = 0
            goto L4f
        L4e:
            r4 = -1
        L4f:
            if (r4 == 0) goto L6a
            if (r4 == r0) goto L68
            if (r4 == r6) goto L66
            if (r4 == r7) goto L6b
            t4.b r4 = n4.C2289v.f45537i     // Catch: org.json.JSONException -> L64
            java.lang.String r5 = "Unknown HDR type: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: org.json.JSONException -> L64
            r0[r1] = r3     // Catch: org.json.JSONException -> L64
            r4.a(r5, r0)     // Catch: org.json.JSONException -> L64
            r0 = 0
            goto L6b
        L64:
            r8 = move-exception
            goto L7d
        L66:
            r0 = 4
            goto L6b
        L68:
            r0 = 2
            goto L6b
        L6a:
            r0 = 3
        L6b:
            n4.v r3 = new n4.v     // Catch: org.json.JSONException -> L64
            java.lang.String r4 = "width"
            int r4 = r8.getInt(r4)     // Catch: org.json.JSONException -> L64
            java.lang.String r5 = "height"
            int r8 = r8.getInt(r5)     // Catch: org.json.JSONException -> L64
            r3.<init>(r4, r8, r0)     // Catch: org.json.JSONException -> L64
            return r3
        L7d:
            t4.b r0 = n4.C2289v.f45537i
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Error while creating a VideoInfo instance from JSON"
            r0.b(r8, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C2289v.I(org.json.JSONObject):n4.v");
    }

    public int H() {
        return this.f45540h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2289v)) {
            return false;
        }
        C2289v c2289v = (C2289v) obj;
        return this.f45539g == c2289v.getHeight() && this.f45538f == c2289v.getWidth() && this.f45540h == c2289v.H();
    }

    public int getHeight() {
        return this.f45539g;
    }

    public int getWidth() {
        return this.f45538f;
    }

    public int hashCode() {
        return AbstractC1418q.c(Integer.valueOf(this.f45539g), Integer.valueOf(this.f45538f), Integer.valueOf(this.f45540h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.l(parcel, 2, getWidth());
        y4.c.l(parcel, 3, getHeight());
        y4.c.l(parcel, 4, H());
        y4.c.b(parcel, iA);
    }
}
