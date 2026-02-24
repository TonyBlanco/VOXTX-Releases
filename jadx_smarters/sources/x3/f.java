package x3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2956b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51936a;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i9) {
            return new f[i9];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51938b;

        public b(int i9, long j9) {
            this.f51937a = i9;
            this.f51938b = j9;
        }

        public /* synthetic */ b(int i9, long j9, a aVar) {
            this(i9, j9);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f51937a);
            parcel.writeLong(this.f51938b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f51942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f51943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f51944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f51945g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f51946h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f51947i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f51948j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f51949k;

        public c(long j9, boolean z9, boolean z10, boolean z11, List list, long j10, boolean z12, long j11, int i9, int i10, int i11) {
            this.f51939a = j9;
            this.f51940b = z9;
            this.f51941c = z10;
            this.f51942d = z11;
            this.f51944f = Collections.unmodifiableList(list);
            this.f51943e = j10;
            this.f51945g = z12;
            this.f51946h = j11;
            this.f51947i = i9;
            this.f51948j = i10;
            this.f51949k = i11;
        }

        public c(Parcel parcel) {
            this.f51939a = parcel.readLong();
            this.f51940b = parcel.readByte() == 1;
            this.f51941c = parcel.readByte() == 1;
            this.f51942d = parcel.readByte() == 1;
            int i9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f51944f = Collections.unmodifiableList(arrayList);
            this.f51943e = parcel.readLong();
            this.f51945g = parcel.readByte() == 1;
            this.f51946h = parcel.readLong();
            this.f51947i = parcel.readInt();
            this.f51948j = parcel.readInt();
            this.f51949k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(M m9) {
            ArrayList arrayList;
            boolean z9;
            long j9;
            boolean z10;
            long j10;
            int i9;
            int i10;
            int iH;
            boolean z11;
            boolean z12;
            long J9;
            long J10 = m9.J();
            boolean z13 = (m9.H() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z13) {
                arrayList = arrayList2;
                z9 = false;
                j9 = -9223372036854775807L;
                z10 = false;
                j10 = -9223372036854775807L;
                i9 = 0;
                i10 = 0;
                iH = 0;
                z11 = false;
            } else {
                int iH2 = m9.H();
                boolean z14 = (iH2 & 128) != 0;
                boolean z15 = (iH2 & 64) != 0;
                boolean z16 = (iH2 & 32) != 0;
                long J11 = z15 ? m9.J() : -9223372036854775807L;
                if (!z15) {
                    int iH3 = m9.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i11 = 0; i11 < iH3; i11++) {
                        arrayList3.add(new b(m9.H(), m9.J(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long jH = m9.H();
                    boolean z17 = (128 & jH) != 0;
                    J9 = ((((jH & 1) << 32) | m9.J()) * 1000) / 90;
                    z12 = z17;
                } else {
                    z12 = false;
                    J9 = -9223372036854775807L;
                }
                int iN = m9.N();
                int iH4 = m9.H();
                z11 = z15;
                iH = m9.H();
                j10 = J9;
                arrayList = arrayList2;
                long j11 = J11;
                i9 = iN;
                i10 = iH4;
                j9 = j11;
                boolean z18 = z14;
                z10 = z12;
                z9 = z18;
            }
            return new c(J10, z13, z9, z11, arrayList, j9, z10, j10, i9, i10, iH);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f51939a);
            parcel.writeByte(this.f51940b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f51941c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f51942d ? (byte) 1 : (byte) 0);
            int size = this.f51944f.size();
            parcel.writeInt(size);
            for (int i9 = 0; i9 < size; i9++) {
                ((b) this.f51944f.get(i9)).d(parcel);
            }
            parcel.writeLong(this.f51943e);
            parcel.writeByte(this.f51945g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f51946h);
            parcel.writeInt(this.f51947i);
            parcel.writeInt(this.f51948j);
            parcel.writeInt(this.f51949k);
        }
    }

    public f(Parcel parcel) {
        int i9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f51936a = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public f(List list) {
        this.f51936a = Collections.unmodifiableList(list);
    }

    public static f a(M m9) {
        int iH = m9.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i9 = 0; i9 < iH; i9++) {
            arrayList.add(c.e(m9));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int size = this.f51936a.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((c) this.f51936a.get(i10)).f(parcel);
        }
    }
}
