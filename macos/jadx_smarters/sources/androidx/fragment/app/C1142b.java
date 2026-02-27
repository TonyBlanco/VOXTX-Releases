package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.AbstractC1180j;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142b implements Parcelable {
    public static final Parcelable.Creator<C1142b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f14946a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f14948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f14949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f14954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f14956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f14957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f14958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14959o;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1142b createFromParcel(Parcel parcel) {
            return new C1142b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1142b[] newArray(int i9) {
            return new C1142b[i9];
        }
    }

    public C1142b(Parcel parcel) {
        this.f14946a = parcel.createIntArray();
        this.f14947c = parcel.createStringArrayList();
        this.f14948d = parcel.createIntArray();
        this.f14949e = parcel.createIntArray();
        this.f14950f = parcel.readInt();
        this.f14951g = parcel.readString();
        this.f14952h = parcel.readInt();
        this.f14953i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f14954j = (CharSequence) creator.createFromParcel(parcel);
        this.f14955k = parcel.readInt();
        this.f14956l = (CharSequence) creator.createFromParcel(parcel);
        this.f14957m = parcel.createStringArrayList();
        this.f14958n = parcel.createStringArrayList();
        this.f14959o = parcel.readInt() != 0;
    }

    public C1142b(C1141a c1141a) {
        int size = c1141a.f15162c.size();
        this.f14946a = new int[size * 5];
        if (!c1141a.f15168i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f14947c = new ArrayList(size);
        this.f14948d = new int[size];
        this.f14949e = new int[size];
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = (w.a) c1141a.f15162c.get(i10);
            int i11 = i9 + 1;
            this.f14946a[i9] = aVar.f15179a;
            ArrayList arrayList = this.f14947c;
            Fragment fragment = aVar.f15180b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f14946a;
            iArr[i11] = aVar.f15181c;
            iArr[i9 + 2] = aVar.f15182d;
            int i12 = i9 + 4;
            iArr[i9 + 3] = aVar.f15183e;
            i9 += 5;
            iArr[i12] = aVar.f15184f;
            this.f14948d[i10] = aVar.f15185g.ordinal();
            this.f14949e[i10] = aVar.f15186h.ordinal();
        }
        this.f14950f = c1141a.f15167h;
        this.f14951g = c1141a.f15170k;
        this.f14952h = c1141a.f14945v;
        this.f14953i = c1141a.f15171l;
        this.f14954j = c1141a.f15172m;
        this.f14955k = c1141a.f15173n;
        this.f14956l = c1141a.f15174o;
        this.f14957m = c1141a.f15175p;
        this.f14958n = c1141a.f15176q;
        this.f14959o = c1141a.f15177r;
    }

    public C1141a a(m mVar) {
        C1141a c1141a = new C1141a(mVar);
        int i9 = 0;
        int i10 = 0;
        while (i9 < this.f14946a.length) {
            w.a aVar = new w.a();
            int i11 = i9 + 1;
            aVar.f15179a = this.f14946a[i9];
            if (m.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1141a + " op #" + i10 + " base fragment #" + this.f14946a[i11]);
            }
            String str = (String) this.f14947c.get(i10);
            aVar.f15180b = str != null ? mVar.f0(str) : null;
            aVar.f15185g = AbstractC1180j.c.values()[this.f14948d[i10]];
            aVar.f15186h = AbstractC1180j.c.values()[this.f14949e[i10]];
            int[] iArr = this.f14946a;
            int i12 = iArr[i11];
            aVar.f15181c = i12;
            int i13 = iArr[i9 + 2];
            aVar.f15182d = i13;
            int i14 = i9 + 4;
            int i15 = iArr[i9 + 3];
            aVar.f15183e = i15;
            i9 += 5;
            int i16 = iArr[i14];
            aVar.f15184f = i16;
            c1141a.f15163d = i12;
            c1141a.f15164e = i13;
            c1141a.f15165f = i15;
            c1141a.f15166g = i16;
            c1141a.f(aVar);
            i10++;
        }
        c1141a.f15167h = this.f14950f;
        c1141a.f15170k = this.f14951g;
        c1141a.f14945v = this.f14952h;
        c1141a.f15168i = true;
        c1141a.f15171l = this.f14953i;
        c1141a.f15172m = this.f14954j;
        c1141a.f15173n = this.f14955k;
        c1141a.f15174o = this.f14956l;
        c1141a.f15175p = this.f14957m;
        c1141a.f15176q = this.f14958n;
        c1141a.f15177r = this.f14959o;
        c1141a.x(1);
        return c1141a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeIntArray(this.f14946a);
        parcel.writeStringList(this.f14947c);
        parcel.writeIntArray(this.f14948d);
        parcel.writeIntArray(this.f14949e);
        parcel.writeInt(this.f14950f);
        parcel.writeString(this.f14951g);
        parcel.writeInt(this.f14952h);
        parcel.writeInt(this.f14953i);
        TextUtils.writeToParcel(this.f14954j, parcel, 0);
        parcel.writeInt(this.f14955k);
        TextUtils.writeToParcel(this.f14956l, parcel, 0);
        parcel.writeStringList(this.f14957m);
        parcel.writeStringList(this.f14958n);
        parcel.writeInt(this.f14959o ? 1 : 0);
    }
}
