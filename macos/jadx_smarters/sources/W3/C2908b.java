package w3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import q3.AbstractC2541b;
import q3.C2540a;
import w5.h;

/* JADX INFO: renamed from: w3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2908b implements C2540a.b {
    public static final Parcelable.Creator<C2908b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51600a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f51603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f51604f;

    /* JADX INFO: renamed from: w3.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2908b createFromParcel(Parcel parcel) {
            return new C2908b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2908b[] newArray(int i9) {
            return new C2908b[i9];
        }
    }

    public C2908b(long j9, long j10, long j11, long j12, long j13) {
        this.f51600a = j9;
        this.f51601c = j10;
        this.f51602d = j11;
        this.f51603e = j12;
        this.f51604f = j13;
    }

    public C2908b(Parcel parcel) {
        this.f51600a = parcel.readLong();
        this.f51601c = parcel.readLong();
        this.f51602d = parcel.readLong();
        this.f51603e = parcel.readLong();
        this.f51604f = parcel.readLong();
    }

    public /* synthetic */ C2908b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2908b.class != obj.getClass()) {
            return false;
        }
        C2908b c2908b = (C2908b) obj;
        return this.f51600a == c2908b.f51600a && this.f51601c == c2908b.f51601c && this.f51602d == c2908b.f51602d && this.f51603e == c2908b.f51603e && this.f51604f == c2908b.f51604f;
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
        return ((((((((527 + h.b(this.f51600a)) * 31) + h.b(this.f51601c)) * 31) + h.b(this.f51602d)) * 31) + h.b(this.f51603e)) * 31) + h.b(this.f51604f);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f51600a + ", photoSize=" + this.f51601c + ", photoPresentationTimestampUs=" + this.f51602d + ", videoStartPosition=" + this.f51603e + ", videoSize=" + this.f51604f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f51600a);
        parcel.writeLong(this.f51601c);
        parcel.writeLong(this.f51602d);
        parcel.writeLong(this.f51603e);
        parcel.writeLong(this.f51604f);
    }
}
