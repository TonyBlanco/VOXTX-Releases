package v3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;

/* JADX INFO: renamed from: v3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2875b extends i {
    public static final Parcelable.Creator<C2875b> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f51292c;

    /* JADX INFO: renamed from: v3.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2875b createFromParcel(Parcel parcel) {
            return new C2875b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2875b[] newArray(int i9) {
            return new C2875b[i9];
        }
    }

    public C2875b(Parcel parcel) {
        super((String) k0.j(parcel.readString()));
        this.f51292c = (byte[]) k0.j(parcel.createByteArray());
    }

    public C2875b(String str, byte[] bArr) {
        super(str);
        this.f51292c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2875b.class != obj.getClass()) {
            return false;
        }
        C2875b c2875b = (C2875b) obj;
        return this.f51316a.equals(c2875b.f51316a) && Arrays.equals(this.f51292c, c2875b.f51292c);
    }

    public int hashCode() {
        return ((527 + this.f51316a.hashCode()) * 31) + Arrays.hashCode(this.f51292c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51316a);
        parcel.writeByteArray(this.f51292c);
    }
}
