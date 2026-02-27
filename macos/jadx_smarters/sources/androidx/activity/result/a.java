package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0157a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13548a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f13549c;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    public class C0157a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i9) {
            return new a[i9];
        }
    }

    public a(int i9, Intent intent) {
        this.f13548a = i9;
        this.f13549c = intent;
    }

    public a(Parcel parcel) {
        this.f13548a = parcel.readInt();
        this.f13549c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String d(int i9) {
        return i9 != -1 ? i9 != 0 ? String.valueOf(i9) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f13549c;
    }

    public int c() {
        return this.f13548a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f13548a) + ", data=" + this.f13549c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f13548a);
        parcel.writeInt(this.f13549c == null ? 0 : 1);
        Intent intent = this.f13549c;
        if (intent != null) {
            intent.writeToParcel(parcel, i9);
        }
    }
}
