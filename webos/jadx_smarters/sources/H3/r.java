package H3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements C2540a.b {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2586a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2588d;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i9) {
            return new r[i9];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2589a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f2591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f2592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f2593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f2594g;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }

        public b(int i9, int i10, String str, String str2, String str3, String str4) {
            this.f2589a = i9;
            this.f2590c = i10;
            this.f2591d = str;
            this.f2592e = str2;
            this.f2593f = str3;
            this.f2594g = str4;
        }

        public b(Parcel parcel) {
            this.f2589a = parcel.readInt();
            this.f2590c = parcel.readInt();
            this.f2591d = parcel.readString();
            this.f2592e = parcel.readString();
            this.f2593f = parcel.readString();
            this.f2594g = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2589a == bVar.f2589a && this.f2590c == bVar.f2590c && TextUtils.equals(this.f2591d, bVar.f2591d) && TextUtils.equals(this.f2592e, bVar.f2592e) && TextUtils.equals(this.f2593f, bVar.f2593f) && TextUtils.equals(this.f2594g, bVar.f2594g);
        }

        public int hashCode() {
            int i9 = ((this.f2589a * 31) + this.f2590c) * 31;
            String str = this.f2591d;
            int iHashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f2592e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f2593f;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f2594g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f2589a);
            parcel.writeInt(this.f2590c);
            parcel.writeString(this.f2591d);
            parcel.writeString(this.f2592e);
            parcel.writeString(this.f2593f);
            parcel.writeString(this.f2594g);
        }
    }

    public r(Parcel parcel) {
        this.f2586a = parcel.readString();
        this.f2587c = parcel.readString();
        int i9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f2588d = Collections.unmodifiableList(arrayList);
    }

    public r(String str, String str2, List list) {
        this.f2586a = str;
        this.f2587c = str2;
        this.f2588d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return TextUtils.equals(this.f2586a, rVar.f2586a) && TextUtils.equals(this.f2587c, rVar.f2587c) && this.f2588d.equals(rVar.f2588d);
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
        String str = this.f2586a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2587c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f2588d.hashCode();
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f2586a != null) {
            str = " [" + this.f2586a + ", " + this.f2587c + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f2586a);
        parcel.writeString(this.f2587c);
        int size = this.f2588d.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) this.f2588d.get(i10), 0);
        }
    }
}
