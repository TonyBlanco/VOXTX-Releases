package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f51302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f51303g;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i9) {
            return new d[i9];
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f51299c = (String) k0.j(parcel.readString());
        this.f51300d = parcel.readByte() != 0;
        this.f51301e = parcel.readByte() != 0;
        this.f51302f = (String[]) k0.j(parcel.createStringArray());
        int i9 = parcel.readInt();
        this.f51303g = new i[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f51303g[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f51299c = str;
        this.f51300d = z9;
        this.f51301e = z10;
        this.f51302f = strArr;
        this.f51303g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f51300d == dVar.f51300d && this.f51301e == dVar.f51301e && k0.c(this.f51299c, dVar.f51299c) && Arrays.equals(this.f51302f, dVar.f51302f) && Arrays.equals(this.f51303g, dVar.f51303g);
    }

    public int hashCode() {
        int i9 = (((527 + (this.f51300d ? 1 : 0)) * 31) + (this.f51301e ? 1 : 0)) * 31;
        String str = this.f51299c;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51299c);
        parcel.writeByte(this.f51300d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f51301e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f51302f);
        parcel.writeInt(this.f51303g.length);
        for (i iVar : this.f51303g) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
