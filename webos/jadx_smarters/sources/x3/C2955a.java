package x3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.M;
import d4.k0;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2955a extends AbstractC2956b {
    public static final Parcelable.Creator<C2955a> CREATOR = new C0479a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51914a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f51916d;

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    public class C0479a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2955a createFromParcel(Parcel parcel) {
            return new C2955a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2955a[] newArray(int i9) {
            return new C2955a[i9];
        }
    }

    public C2955a(long j9, byte[] bArr, long j10) {
        this.f51914a = j10;
        this.f51915c = j9;
        this.f51916d = bArr;
    }

    public C2955a(Parcel parcel) {
        this.f51914a = parcel.readLong();
        this.f51915c = parcel.readLong();
        this.f51916d = (byte[]) k0.j(parcel.createByteArray());
    }

    public /* synthetic */ C2955a(Parcel parcel, C0479a c0479a) {
        this(parcel);
    }

    public static C2955a a(M m9, int i9, long j9) {
        long J9 = m9.J();
        int i10 = i9 - 4;
        byte[] bArr = new byte[i10];
        m9.l(bArr, 0, i10);
        return new C2955a(J9, bArr, j9);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f51914a);
        parcel.writeLong(this.f51915c);
        parcel.writeByteArray(this.f51916d);
    }
}
