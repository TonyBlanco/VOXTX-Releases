package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15129a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f15137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f15138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f15141n;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i9) {
            return new s[i9];
        }
    }

    public s(Parcel parcel) {
        this.f15129a = parcel.readString();
        this.f15130c = parcel.readString();
        this.f15131d = parcel.readInt() != 0;
        this.f15132e = parcel.readInt();
        this.f15133f = parcel.readInt();
        this.f15134g = parcel.readString();
        this.f15135h = parcel.readInt() != 0;
        this.f15136i = parcel.readInt() != 0;
        this.f15137j = parcel.readInt() != 0;
        this.f15138k = parcel.readBundle();
        this.f15139l = parcel.readInt() != 0;
        this.f15141n = parcel.readBundle();
        this.f15140m = parcel.readInt();
    }

    public s(Fragment fragment) {
        this.f15129a = fragment.getClass().getName();
        this.f15130c = fragment.mWho;
        this.f15131d = fragment.mFromLayout;
        this.f15132e = fragment.mFragmentId;
        this.f15133f = fragment.mContainerId;
        this.f15134g = fragment.mTag;
        this.f15135h = fragment.mRetainInstance;
        this.f15136i = fragment.mRemoving;
        this.f15137j = fragment.mDetached;
        this.f15138k = fragment.mArguments;
        this.f15139l = fragment.mHidden;
        this.f15140m = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f15129a);
        sb.append(" (");
        sb.append(this.f15130c);
        sb.append(")}:");
        if (this.f15131d) {
            sb.append(" fromLayout");
        }
        if (this.f15133f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f15133f));
        }
        String str = this.f15134g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f15134g);
        }
        if (this.f15135h) {
            sb.append(" retainInstance");
        }
        if (this.f15136i) {
            sb.append(" removing");
        }
        if (this.f15137j) {
            sb.append(" detached");
        }
        if (this.f15139l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f15129a);
        parcel.writeString(this.f15130c);
        parcel.writeInt(this.f15131d ? 1 : 0);
        parcel.writeInt(this.f15132e);
        parcel.writeInt(this.f15133f);
        parcel.writeString(this.f15134g);
        parcel.writeInt(this.f15135h ? 1 : 0);
        parcel.writeInt(this.f15136i ? 1 : 0);
        parcel.writeInt(this.f15137j ? 1 : 0);
        parcel.writeBundle(this.f15138k);
        parcel.writeInt(this.f15139l ? 1 : 0);
        parcel.writeBundle(this.f15141n);
        parcel.writeInt(this.f15140m);
    }
}
