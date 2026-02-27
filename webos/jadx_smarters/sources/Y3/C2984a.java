package y3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.C2767a;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2984a extends C2767a {
    public static final Parcelable.Creator<C2984a> CREATOR = new C0485a();

    /* JADX INFO: renamed from: y3.a$a, reason: collision with other inner class name */
    public class C0485a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2984a createFromParcel(Parcel parcel) {
            return new C2984a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2984a[] newArray(int i9) {
            return new C2984a[i9];
        }
    }

    public C2984a(Parcel parcel) {
        super(parcel);
    }

    public C2984a(String str, String str2) {
        super(str, str2);
    }
}
