package u3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.util.List;
import java.util.Map;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: u3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2851b implements C2540a.b {
    public static final Parcelable.Creator<C2851b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51200a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51205g;

    /* JADX INFO: renamed from: u3.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2851b createFromParcel(Parcel parcel) {
            return new C2851b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2851b[] newArray(int i9) {
            return new C2851b[i9];
        }
    }

    public C2851b(int i9, String str, String str2, String str3, boolean z9, int i10) {
        AbstractC1684a.a(i10 == -1 || i10 > 0);
        this.f51200a = i9;
        this.f51201c = str;
        this.f51202d = str2;
        this.f51203e = str3;
        this.f51204f = z9;
        this.f51205g = i10;
    }

    public C2851b(Parcel parcel) {
        this.f51200a = parcel.readInt();
        this.f51201c = parcel.readString();
        this.f51202d = parcel.readString();
        this.f51203e = parcel.readString();
        this.f51204f = k0.Z0(parcel);
        this.f51205g = parcel.readInt();
    }

    public static C2851b a(Map map) {
        boolean z9;
        int i9;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i10;
        List list = (List) map.get("icy-br");
        boolean z10 = true;
        int i11 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z9 = true;
                } else {
                    try {
                        AbstractC1681B.j("IcyHeaders", "Invalid bitrate: " + str4);
                        z9 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC1681B.j("IcyHeaders", "Invalid bitrate header: " + str4);
                        i9 = i10;
                        z9 = false;
                    }
                }
                i9 = i10;
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        } else {
            z9 = false;
            i9 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z9 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z9 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z9 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z9 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i12 = Integer.parseInt(str5);
                if (i12 > 0) {
                    i11 = i12;
                } else {
                    try {
                        AbstractC1681B.j("IcyHeaders", "Invalid metadata interval: " + str5);
                        z10 = z9;
                    } catch (NumberFormatException unused3) {
                        i11 = i12;
                        AbstractC1681B.j("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z9 = z10;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z9) {
            return new C2851b(i9, str, str2, str3, zEquals, i11);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2851b.class != obj.getClass()) {
            return false;
        }
        C2851b c2851b = (C2851b) obj;
        return this.f51200a == c2851b.f51200a && k0.c(this.f51201c, c2851b.f51201c) && k0.c(this.f51202d, c2851b.f51202d) && k0.c(this.f51203e, c2851b.f51203e) && this.f51204f == c2851b.f51204f && this.f51205g == c2851b.f51205g;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    public int hashCode() {
        int i9 = (527 + this.f51200a) * 31;
        String str = this.f51201c;
        int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f51202d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f51203e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f51204f ? 1 : 0)) * 31) + this.f51205g;
    }

    @Override // q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        String str = this.f51202d;
        if (str != null) {
            bVar.k0(str);
        }
        String str2 = this.f51201c;
        if (str2 != null) {
            bVar.Z(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f51202d + "\", genre=\"" + this.f51201c + "\", bitrate=" + this.f51200a + ", metadataInterval=" + this.f51205g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f51200a);
        parcel.writeString(this.f51201c);
        parcel.writeString(this.f51202d);
        parcel.writeString(this.f51203e);
        k0.y1(parcel, this.f51204f);
        parcel.writeInt(this.f51205g);
    }
}
