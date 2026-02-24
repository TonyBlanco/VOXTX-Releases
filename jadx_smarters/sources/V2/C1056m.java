package V2;

import O2.AbstractC0904o;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: V2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1056m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1056m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f10006a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10009e;

    /* JADX INFO: renamed from: V2.m$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1056m createFromParcel(Parcel parcel) {
            return new C1056m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1056m[] newArray(int i9) {
            return new C1056m[i9];
        }
    }

    /* JADX INFO: renamed from: V2.m$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10010a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f10011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f10014f;

        /* JADX INFO: renamed from: V2.m$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }

        public b(Parcel parcel) {
            this.f10011c = new UUID(parcel.readLong(), parcel.readLong());
            this.f10012d = parcel.readString();
            this.f10013e = (String) k0.j(parcel.readString());
            this.f10014f = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f10011c = (UUID) AbstractC1684a.e(uuid);
            this.f10012d = str;
            this.f10013e = (String) AbstractC1684a.e(str2);
            this.f10014f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return d() && !bVar.d() && e(bVar.f10011c);
        }

        public b c(byte[] bArr) {
            return new b(this.f10011c, this.f10012d, this.f10013e, bArr);
        }

        public boolean d() {
            return this.f10014f != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return AbstractC0904o.f6137a.equals(this.f10011c) || uuid.equals(this.f10011c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return k0.c(this.f10012d, bVar.f10012d) && k0.c(this.f10013e, bVar.f10013e) && k0.c(this.f10011c, bVar.f10011c) && Arrays.equals(this.f10014f, bVar.f10014f);
        }

        public int hashCode() {
            if (this.f10010a == 0) {
                int iHashCode = this.f10011c.hashCode() * 31;
                String str = this.f10012d;
                this.f10010a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10013e.hashCode()) * 31) + Arrays.hashCode(this.f10014f);
            }
            return this.f10010a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeLong(this.f10011c.getMostSignificantBits());
            parcel.writeLong(this.f10011c.getLeastSignificantBits());
            parcel.writeString(this.f10012d);
            parcel.writeString(this.f10013e);
            parcel.writeByteArray(this.f10014f);
        }
    }

    public C1056m(Parcel parcel) {
        this.f10008d = parcel.readString();
        b[] bVarArr = (b[]) k0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f10006a = bVarArr;
        this.f10009e = bVarArr.length;
    }

    public C1056m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C1056m(String str, boolean z9, b... bVarArr) {
        this.f10008d = str;
        bVarArr = z9 ? (b[]) bVarArr.clone() : bVarArr;
        this.f10006a = bVarArr;
        this.f10009e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C1056m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C1056m(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public C1056m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public static boolean c(ArrayList arrayList, int i9, UUID uuid) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (((b) arrayList.get(i10)).f10011c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C1056m e(C1056m c1056m, C1056m c1056m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c1056m != null) {
            str = c1056m.f10008d;
            for (b bVar : c1056m.f10006a) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c1056m2 != null) {
            if (str == null) {
                str = c1056m2.f10008d;
            }
            int size = arrayList.size();
            for (b bVar2 : c1056m2.f10006a) {
                if (bVar2.d() && !c(arrayList, size, bVar2.f10011c)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1056m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC0904o.f6137a;
        return uuid.equals(bVar.f10011c) ? uuid.equals(bVar2.f10011c) ? 0 : 1 : bVar.f10011c.compareTo(bVar2.f10011c);
    }

    public C1056m d(String str) {
        return k0.c(this.f10008d, str) ? this : new C1056m(str, false, this.f10006a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1056m.class != obj.getClass()) {
            return false;
        }
        C1056m c1056m = (C1056m) obj;
        return k0.c(this.f10008d, c1056m.f10008d) && Arrays.equals(this.f10006a, c1056m.f10006a);
    }

    public b f(int i9) {
        return this.f10006a[i9];
    }

    public C1056m g(C1056m c1056m) {
        String str;
        String str2 = this.f10008d;
        AbstractC1684a.g(str2 == null || (str = c1056m.f10008d) == null || TextUtils.equals(str2, str));
        String str3 = this.f10008d;
        if (str3 == null) {
            str3 = c1056m.f10008d;
        }
        return new C1056m(str3, (b[]) k0.T0(this.f10006a, c1056m.f10006a));
    }

    public int hashCode() {
        if (this.f10007c == 0) {
            String str = this.f10008d;
            this.f10007c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10006a);
        }
        return this.f10007c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f10008d);
        parcel.writeTypedArray(this.f10006a, 0);
    }
}
