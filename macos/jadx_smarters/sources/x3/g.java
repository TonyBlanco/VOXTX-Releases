package x3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.M;
import d4.Z;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC2956b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51950a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51951c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i9) {
            return new g[i9];
        }
    }

    public g(long j9, long j10) {
        this.f51950a = j9;
        this.f51951c = j10;
    }

    public /* synthetic */ g(long j9, long j10, a aVar) {
        this(j9, j10);
    }

    public static g a(M m9, long j9, Z z9) {
        long jC = c(m9, j9);
        return new g(jC, z9.b(jC));
    }

    public static long c(M m9, long j9) {
        long jH = m9.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | m9.J()) + j9);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f51950a);
        parcel.writeLong(this.f51951c);
    }
}
