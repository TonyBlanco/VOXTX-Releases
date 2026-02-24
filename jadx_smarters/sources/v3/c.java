package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f51296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i[] f51298h;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i9) {
            return new c[i9];
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f51293c = (String) k0.j(parcel.readString());
        this.f51294d = parcel.readInt();
        this.f51295e = parcel.readInt();
        this.f51296f = parcel.readLong();
        this.f51297g = parcel.readLong();
        int i9 = parcel.readInt();
        this.f51298h = new i[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f51298h[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String str, int i9, int i10, long j9, long j10, i[] iVarArr) {
        super("CHAP");
        this.f51293c = str;
        this.f51294d = i9;
        this.f51295e = i10;
        this.f51296f = j9;
        this.f51297g = j10;
        this.f51298h = iVarArr;
    }

    @Override // v3.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f51294d == cVar.f51294d && this.f51295e == cVar.f51295e && this.f51296f == cVar.f51296f && this.f51297g == cVar.f51297g && k0.c(this.f51293c, cVar.f51293c) && Arrays.equals(this.f51298h, cVar.f51298h);
    }

    public int hashCode() {
        int i9 = (((((((527 + this.f51294d) * 31) + this.f51295e) * 31) + ((int) this.f51296f)) * 31) + ((int) this.f51297g)) * 31;
        String str = this.f51293c;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51293c);
        parcel.writeInt(this.f51294d);
        parcel.writeInt(this.f51295e);
        parcel.writeLong(this.f51296f);
        parcel.writeLong(this.f51297g);
        parcel.writeInt(this.f51298h.length);
        for (i iVar : this.f51298h) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
