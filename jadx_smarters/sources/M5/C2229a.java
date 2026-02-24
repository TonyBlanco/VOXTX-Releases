package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s.i;

/* JADX INFO: renamed from: m5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2229a extends V.a {
    public static final Parcelable.Creator<C2229a> CREATOR = new C0382a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f44404d;

    /* JADX INFO: renamed from: m5.a$a, reason: collision with other inner class name */
    public class C0382a implements Parcelable.ClassLoaderCreator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2229a createFromParcel(Parcel parcel) {
            return new C2229a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2229a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C2229a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C2229a[] newArray(int i9) {
            return new C2229a[i9];
        }
    }

    public C2229a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i9 = parcel.readInt();
        String[] strArr = new String[i9];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i9];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f44404d = new i(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            this.f44404d.put(strArr[i10], bundleArr[i10]);
        }
    }

    public /* synthetic */ C2229a(Parcel parcel, ClassLoader classLoader, C0382a c0382a) {
        this(parcel, classLoader);
    }

    public C2229a(Parcelable parcelable) {
        super(parcelable);
        this.f44404d = new i();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f44404d + "}";
    }

    @Override // V.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        int size = this.f44404d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) this.f44404d.j(i10);
            bundleArr[i10] = (Bundle) this.f44404d.o(i10);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
