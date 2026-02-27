package z3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: z3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3052w implements Parcelable {
    public static final Parcelable.Creator<C3052w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f52802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f52804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f52805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f52806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f52807h;

    /* JADX INFO: renamed from: z3.w$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3052w createFromParcel(Parcel parcel) {
            return new C3052w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3052w[] newArray(int i9) {
            return new C3052w[i9];
        }
    }

    /* JADX INFO: renamed from: z3.w$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f52809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f52811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f52812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f52813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f52814g;

        public b(String str, Uri uri) {
            this.f52808a = str;
            this.f52809b = uri;
        }

        public C3052w a() {
            String str = this.f52808a;
            Uri uri = this.f52809b;
            String str2 = this.f52810c;
            List listZ = this.f52811d;
            if (listZ == null) {
                listZ = AbstractC2743y.z();
            }
            return new C3052w(str, uri, str2, listZ, this.f52812e, this.f52813f, this.f52814g, null);
        }

        public b b(String str) {
            this.f52813f = str;
            return this;
        }

        public b c(byte[] bArr) {
            this.f52814g = bArr;
            return this;
        }

        public b d(byte[] bArr) {
            this.f52812e = bArr;
            return this;
        }

        public b e(String str) {
            this.f52810c = str;
            return this;
        }

        public b f(List list) {
            this.f52811d = list;
            return this;
        }
    }

    public C3052w(Parcel parcel) {
        this.f52801a = (String) k0.j(parcel.readString());
        this.f52802c = Uri.parse((String) k0.j(parcel.readString()));
        this.f52803d = parcel.readString();
        int i9 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add((C3028H) parcel.readParcelable(C3028H.class.getClassLoader()));
        }
        this.f52804e = Collections.unmodifiableList(arrayList);
        this.f52805f = parcel.createByteArray();
        this.f52806g = parcel.readString();
        this.f52807h = (byte[]) k0.j(parcel.createByteArray());
    }

    public C3052w(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iY0 = k0.y0(uri, str2);
        if (iY0 == 0 || iY0 == 2 || iY0 == 1) {
            AbstractC1684a.b(str3 == null, "customCacheKey must be null for type: " + iY0);
        }
        this.f52801a = str;
        this.f52802c = uri;
        this.f52803d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f52804e = Collections.unmodifiableList(arrayList);
        this.f52805f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f52806g = str3;
        this.f52807h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : k0.f39782f;
    }

    public /* synthetic */ C3052w(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public C3052w a(byte[] bArr) {
        return new C3052w(this.f52801a, this.f52802c, this.f52803d, this.f52804e, bArr, this.f52806g, this.f52807h);
    }

    public C3052w c(C3052w c3052w) {
        List listEmptyList;
        AbstractC1684a.a(this.f52801a.equals(c3052w.f52801a));
        if (this.f52804e.isEmpty() || c3052w.f52804e.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.f52804e);
            for (int i9 = 0; i9 < c3052w.f52804e.size(); i9++) {
                C3028H c3028h = (C3028H) c3052w.f52804e.get(i9);
                if (!listEmptyList.contains(c3028h)) {
                    listEmptyList.add(c3028h);
                }
            }
        }
        return new C3052w(this.f52801a, c3052w.f52802c, c3052w.f52803d, listEmptyList, c3052w.f52805f, c3052w.f52806g, c3052w.f52807h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3052w)) {
            return false;
        }
        C3052w c3052w = (C3052w) obj;
        return this.f52801a.equals(c3052w.f52801a) && this.f52802c.equals(c3052w.f52802c) && k0.c(this.f52803d, c3052w.f52803d) && this.f52804e.equals(c3052w.f52804e) && Arrays.equals(this.f52805f, c3052w.f52805f) && k0.c(this.f52806g, c3052w.f52806g) && Arrays.equals(this.f52807h, c3052w.f52807h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f52801a.hashCode() * 961) + this.f52802c.hashCode()) * 31;
        String str = this.f52803d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f52804e.hashCode()) * 31) + Arrays.hashCode(this.f52805f)) * 31;
        String str2 = this.f52806g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f52807h);
    }

    public String toString() {
        return this.f52803d + ":" + this.f52801a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f52801a);
        parcel.writeString(this.f52802c.toString());
        parcel.writeString(this.f52803d);
        parcel.writeInt(this.f52804e.size());
        for (int i10 = 0; i10 < this.f52804e.size(); i10++) {
            parcel.writeParcelable((Parcelable) this.f52804e.get(i10), 0);
        }
        parcel.writeByteArray(this.f52805f);
        parcel.writeString(this.f52806g);
        parcel.writeByteArray(this.f52807h);
    }
}
