package com.google.android.exoplayer2.metadata.flac;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.M;
import d4.k0;
import java.util.Arrays;
import q3.AbstractC2541b;
import q3.C2540a;
import r5.AbstractC2675d;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class PictureFrame implements C2540a.b {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i9) {
            return new PictureFrame[i9];
        }
    }

    public PictureFrame(int i9, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.pictureType = i9;
        this.mimeType = str;
        this.description = str2;
        this.width = i10;
        this.height = i11;
        this.depth = i12;
        this.colors = i13;
        this.pictureData = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        this.mimeType = (String) k0.j(parcel.readString());
        this.description = (String) k0.j(parcel.readString());
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = (byte[]) k0.j(parcel.createByteArray());
    }

    public static PictureFrame fromPictureBlock(M m9) {
        int iQ = m9.q();
        String strF = m9.F(m9.q(), AbstractC2675d.f49722a);
        String strE = m9.E(m9.q());
        int iQ2 = m9.q();
        int iQ3 = m9.q();
        int iQ4 = m9.q();
        int iQ5 = m9.q();
        int iQ6 = m9.q();
        byte[] bArr = new byte[iQ6];
        m9.l(bArr, 0, iQ6);
        return new PictureFrame(iQ, strF, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData);
    }

    @Override // q3.C2540a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* bridge */ /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.pictureType) * 31) + this.mimeType.hashCode()) * 31) + this.description.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31) + Arrays.hashCode(this.pictureData);
    }

    @Override // q3.C2540a.b
    public void populateMediaMetadata(R0.b bVar) {
        bVar.I(this.pictureData, this.pictureType);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }
}
