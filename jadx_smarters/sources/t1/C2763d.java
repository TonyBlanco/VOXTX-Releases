package t1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: renamed from: t1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2763d implements Parcelable {
    public static final Parcelable.Creator<C2763d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50624a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f50627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EnumC2765f f50628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f50629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f50630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50631i;

    /* JADX INFO: renamed from: t1.d$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2763d createFromParcel(Parcel parcel) {
            return new C2763d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2763d[] newArray(int i9) {
            return new C2763d[i9];
        }
    }

    public C2763d() {
    }

    public C2763d(Parcel parcel) {
        this.f50624a = parcel.readString();
        this.f50625c = parcel.readString();
        this.f50626d = parcel.readString();
        long j9 = parcel.readLong();
        this.f50627e = j9 == -1 ? null : new Date(j9);
        int i9 = parcel.readInt();
        this.f50628f = i9 != -1 ? EnumC2765f.values()[i9] : null;
        this.f50629g = parcel.readString();
        this.f50630h = parcel.readString();
        this.f50631i = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f50624a);
        parcel.writeString(this.f50625c);
        parcel.writeString(this.f50626d);
        Date date = this.f50627e;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        EnumC2765f enumC2765f = this.f50628f;
        parcel.writeInt(enumC2765f == null ? -1 : enumC2765f.ordinal());
        parcel.writeString(this.f50629g);
        parcel.writeString(this.f50630h);
        parcel.writeByte(this.f50631i ? (byte) 1 : (byte) 0);
    }
}
