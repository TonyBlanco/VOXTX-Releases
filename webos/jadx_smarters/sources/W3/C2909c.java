package w3;

import O2.C0936z0;
import O2.R0;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import q3.AbstractC2541b;
import q3.C2540a;
import r5.j;
import s5.AbstractC2736q;
import w3.C2909c;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2909c implements C2540a.b {
    public static final Parcelable.Creator<C2909c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f51605a;

    /* JADX INFO: renamed from: w3.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2909c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C2909c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2909c[] newArray(int i9) {
            return new C2909c[i9];
        }
    }

    /* JADX INFO: renamed from: w3.c$b */
    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f51607a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f51608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f51609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Comparator f51606e = new Comparator() { // from class: w3.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2909c.b.c((C2909c.b) obj, (C2909c.b) obj2);
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: w3.c$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }

        public b(long j9, long j10, int i9) {
            AbstractC1684a.a(j9 < j10);
            this.f51607a = j9;
            this.f51608c = j10;
            this.f51609d = i9;
        }

        public static /* synthetic */ int c(b bVar, b bVar2) {
            return AbstractC2736q.j().e(bVar.f51607a, bVar2.f51607a).e(bVar.f51608c, bVar2.f51608c).d(bVar.f51609d, bVar2.f51609d).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f51607a == bVar.f51607a && this.f51608c == bVar.f51608c && this.f51609d == bVar.f51609d;
        }

        public int hashCode() {
            return j.b(Long.valueOf(this.f51607a), Long.valueOf(this.f51608c), Integer.valueOf(this.f51609d));
        }

        public String toString() {
            return k0.D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f51607a), Long.valueOf(this.f51608c), Integer.valueOf(this.f51609d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeLong(this.f51607a);
            parcel.writeLong(this.f51608c);
            parcel.writeInt(this.f51609d);
        }
    }

    public C2909c(List list) {
        this.f51605a = list;
        AbstractC1684a.a(!a(list));
    }

    public static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j9 = ((b) list.get(0)).f51608c;
        for (int i9 = 1; i9 < list.size(); i9++) {
            if (((b) list.get(i9)).f51607a < j9) {
                return true;
            }
            j9 = ((b) list.get(i9)).f51608c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2909c.class != obj.getClass()) {
            return false;
        }
        return this.f51605a.equals(((C2909c) obj).f51605a);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return AbstractC2541b.a(this);
    }

    @Override // q3.C2540a.b
    public /* synthetic */ C0936z0 getWrappedMetadataFormat() {
        return AbstractC2541b.b(this);
    }

    public int hashCode() {
        return this.f51605a.hashCode();
    }

    @Override // q3.C2540a.b
    public /* synthetic */ void populateMediaMetadata(R0.b bVar) {
        AbstractC2541b.c(this, bVar);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f51605a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.f51605a);
    }
}
