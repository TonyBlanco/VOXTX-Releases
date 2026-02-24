package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f51326d;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i9) {
            return new l[i9];
        }
    }

    public l(Parcel parcel) {
        super("PRIV");
        this.f51325c = (String) k0.j(parcel.readString());
        this.f51326d = (byte[]) k0.j(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f51325c = str;
        this.f51326d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return k0.c(this.f51325c, lVar.f51325c) && Arrays.equals(this.f51326d, lVar.f51326d);
    }

    public int hashCode() {
        String str = this.f51325c;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f51326d);
    }

    @Override // v3.i
    public String toString() {
        return this.f51316a + ": owner=" + this.f51325c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51325c);
        parcel.writeByteArray(this.f51326d);
    }
}
