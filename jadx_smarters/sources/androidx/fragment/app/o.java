package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f15108a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1142b[] f15110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f15113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f15114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f15115i;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i9) {
            return new o[i9];
        }
    }

    public o() {
        this.f15112f = null;
        this.f15113g = new ArrayList();
        this.f15114h = new ArrayList();
    }

    public o(Parcel parcel) {
        this.f15112f = null;
        this.f15113g = new ArrayList();
        this.f15114h = new ArrayList();
        this.f15108a = parcel.createTypedArrayList(s.CREATOR);
        this.f15109c = parcel.createStringArrayList();
        this.f15110d = (C1142b[]) parcel.createTypedArray(C1142b.CREATOR);
        this.f15111e = parcel.readInt();
        this.f15112f = parcel.readString();
        this.f15113g = parcel.createStringArrayList();
        this.f15114h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f15115i = parcel.createTypedArrayList(m.C0173m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeTypedList(this.f15108a);
        parcel.writeStringList(this.f15109c);
        parcel.writeTypedArray(this.f15110d, i9);
        parcel.writeInt(this.f15111e);
        parcel.writeString(this.f15112f);
        parcel.writeStringList(this.f15113g);
        parcel.writeTypedList(this.f15114h);
        parcel.writeTypedList(this.f15115i);
    }
}
