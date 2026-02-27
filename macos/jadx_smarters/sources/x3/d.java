package x3;

import android.os.Parcel;
import android.os.Parcelable;
import d4.M;
import d4.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC2956b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51920a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f51927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f51928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f51929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f51930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f51931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f51932n;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i9) {
            return new d[i9];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f51935c;

        public b(int i9, long j9, long j10) {
            this.f51933a = i9;
            this.f51934b = j9;
            this.f51935c = j10;
        }

        public /* synthetic */ b(int i9, long j9, long j10, a aVar) {
            this(i9, j9, j10);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f51933a);
            parcel.writeLong(this.f51934b);
            parcel.writeLong(this.f51935c);
        }
    }

    public d(long j9, boolean z9, boolean z10, boolean z11, boolean z12, long j10, long j11, List list, boolean z13, long j12, int i9, int i10, int i11) {
        this.f51920a = j9;
        this.f51921c = z9;
        this.f51922d = z10;
        this.f51923e = z11;
        this.f51924f = z12;
        this.f51925g = j10;
        this.f51926h = j11;
        this.f51927i = Collections.unmodifiableList(list);
        this.f51928j = z13;
        this.f51929k = j12;
        this.f51930l = i9;
        this.f51931m = i10;
        this.f51932n = i11;
    }

    public d(Parcel parcel) {
        this.f51920a = parcel.readLong();
        this.f51921c = parcel.readByte() == 1;
        this.f51922d = parcel.readByte() == 1;
        this.f51923e = parcel.readByte() == 1;
        this.f51924f = parcel.readByte() == 1;
        this.f51925g = parcel.readLong();
        this.f51926h = parcel.readLong();
        int i9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f51927i = Collections.unmodifiableList(arrayList);
        this.f51928j = parcel.readByte() == 1;
        this.f51929k = parcel.readLong();
        this.f51930l = parcel.readInt();
        this.f51931m = parcel.readInt();
        this.f51932n = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d a(M m9, long j9, Z z9) {
        List list;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        long j11;
        int iN;
        int iH;
        int iH2;
        boolean z13;
        boolean z14;
        long J9;
        long J10 = m9.J();
        boolean z15 = (m9.H() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j10 = -9223372036854775807L;
            z12 = false;
            j11 = -9223372036854775807L;
            iN = 0;
            iH = 0;
            iH2 = 0;
            z13 = false;
        } else {
            int iH3 = m9.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jC = (!z17 || z19) ? -9223372036854775807L : g.c(m9, j9);
            if (!z17) {
                int iH4 = m9.H();
                ArrayList arrayList = new ArrayList(iH4);
                for (int i9 = 0; i9 < iH4; i9++) {
                    int iH5 = m9.H();
                    long jC2 = !z19 ? g.c(m9, j9) : -9223372036854775807L;
                    arrayList.add(new b(iH5, jC2, z9.b(jC2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jH = m9.H();
                boolean z20 = (128 & jH) != 0;
                J9 = ((((jH & 1) << 32) | m9.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                J9 = -9223372036854775807L;
            }
            iN = m9.N();
            z13 = z17;
            iH = m9.H();
            iH2 = m9.H();
            list = listEmptyList;
            long j12 = jC;
            z12 = z14;
            j11 = J9;
            z11 = z19;
            z10 = z16;
            j10 = j12;
        }
        return new d(J10, z15, z10, z13, z11, j10, z9.b(j10), list, z12, j11, iN, iH, iH2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f51920a);
        parcel.writeByte(this.f51921c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f51922d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f51923e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f51924f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f51925g);
        parcel.writeLong(this.f51926h);
        int size = this.f51927i.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f51927i.get(i10)).b(parcel);
        }
        parcel.writeByte(this.f51928j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f51929k);
        parcel.writeInt(this.f51930l);
        parcel.writeInt(this.f51931m);
        parcel.writeInt(this.f51932n);
    }
}
