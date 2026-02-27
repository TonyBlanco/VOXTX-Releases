package s3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.k0;
import java.util.Arrays;
import q3.AbstractC2541b;
import q3.C2540a;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2707a implements C2540a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49892a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f49896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0936z0 f49890h = new C0936z0.b().g0("application/id3").G();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0936z0 f49891i = new C0936z0.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<C2707a> CREATOR = new C0439a();

    /* JADX INFO: renamed from: s3.a$a, reason: collision with other inner class name */
    public class C0439a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2707a createFromParcel(Parcel parcel) {
            return new C2707a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2707a[] newArray(int i9) {
            return new C2707a[i9];
        }
    }

    public C2707a(Parcel parcel) {
        this.f49892a = (String) k0.j(parcel.readString());
        this.f49893c = (String) k0.j(parcel.readString());
        this.f49894d = parcel.readLong();
        this.f49895e = parcel.readLong();
        this.f49896f = (byte[]) k0.j(parcel.createByteArray());
    }

    public C2707a(String str, String str2, long j9, long j10, byte[] bArr) {
        this.f49892a = str;
        this.f49893c = str2;
        this.f49894d = j9;
        this.f49895e = j10;
        this.f49896f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2707a.class != obj.getClass()) {
            return false;
        }
        C2707a c2707a = (C2707a) obj;
        return this.f49894d == c2707a.f49894d && this.f49895e == c2707a.f49895e && k0.c(this.f49892a, c2707a.f49892a) && k0.c(this.f49893c, c2707a.f49893c) && Arrays.equals(this.f49896f, c2707a.f49896f);
    }

    @Override // q3.C2540a.b
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f49896f;
        }
        return null;
    }

    @Override // q3.C2540a.b
    public C0936z0 getWrappedMetadataFormat() {
        String str = this.f49892a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f49891i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f49890h;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f49897g == 0) {
            String str = this.f49892a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f49893c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j9 = this.f49894d;
            int i9 = (((iHashCode + iHashCode2) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f49895e;
            this.f49897g = ((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f49896f);
        }
        return this.f49897g;
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f49892a + ", id=" + this.f49895e + ", durationMs=" + this.f49894d + ", value=" + this.f49893c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f49892a);
        parcel.writeString(this.f49893c);
        parcel.writeLong(this.f49894d);
        parcel.writeLong(this.f49895e);
        parcel.writeByteArray(this.f49896f);
    }
}
