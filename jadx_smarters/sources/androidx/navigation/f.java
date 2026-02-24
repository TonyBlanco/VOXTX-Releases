package androidx.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f16329a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f16331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f16332e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i9) {
            return new f[i9];
        }
    }

    public f(Parcel parcel) {
        this.f16329a = UUID.fromString(parcel.readString());
        this.f16330c = parcel.readInt();
        this.f16331d = parcel.readBundle(f.class.getClassLoader());
        this.f16332e = parcel.readBundle(f.class.getClassLoader());
    }

    public f(e eVar) {
        this.f16329a = eVar.f16324g;
        this.f16330c = eVar.b().i();
        this.f16331d = eVar.a();
        Bundle bundle = new Bundle();
        this.f16332e = bundle;
        eVar.g(bundle);
    }

    public Bundle a() {
        return this.f16331d;
    }

    public int c() {
        return this.f16330c;
    }

    public Bundle d() {
        return this.f16332e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UUID e() {
        return this.f16329a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f16329a.toString());
        parcel.writeInt(this.f16330c);
        parcel.writeBundle(this.f16331d);
        parcel.writeBundle(this.f16332e);
    }
}
