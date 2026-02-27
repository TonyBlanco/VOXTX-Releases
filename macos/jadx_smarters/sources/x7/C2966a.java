package x7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: x7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2966a implements Parcelable {
    public static final Parcelable.Creator<C2966a> CREATOR = new C0480a();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static C2966a f51986F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f51987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f51988B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f51989C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f51990D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f51991E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f51992a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f51994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f51995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f52000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f52002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f52003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f52004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f52005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f52006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f52007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f52008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f52009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f52010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f52011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f52012v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f52013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f52014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f52015y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f52016z;

    /* JADX INFO: renamed from: x7.a$a, reason: collision with other inner class name */
    public class C0480a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2966a createFromParcel(Parcel parcel) {
            return new C2966a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2966a[] newArray(int i9) {
            return new C2966a[i9];
        }
    }

    public C2966a() {
        this.f51992a = new HashSet();
        this.f51993c = false;
        this.f51995e = "12345";
        this.f51996f = true;
        this.f51998h = 0;
        this.f52001k = 0;
        this.f52002l = DefaultRenderer.BACKGROUND_COLOR;
        this.f52003m = "ijk";
        this.f52004n = true;
        this.f52005o = false;
        this.f52006p = true;
        this.f52007q = false;
        this.f52008r = 0;
        this.f52010t = 0;
        this.f52016z = false;
        this.f51987A = false;
        this.f51988B = false;
    }

    public C2966a(Parcel parcel) {
        this.f51992a = new HashSet();
        this.f51993c = false;
        this.f51995e = "12345";
        this.f51996f = true;
        this.f51998h = 0;
        this.f52001k = 0;
        this.f52002l = DefaultRenderer.BACKGROUND_COLOR;
        this.f52003m = "ijk";
        this.f52004n = true;
        this.f52005o = false;
        this.f52006p = true;
        this.f52007q = false;
        this.f52008r = 0;
        this.f52010t = 0;
        this.f52016z = false;
        this.f51987A = false;
        this.f51988B = false;
        this.f51995e = parcel.readString();
        this.f51994d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f51997g = parcel.readString();
        this.f51996f = parcel.readByte() != 0;
        this.f51998h = parcel.readInt();
        this.f51999i = parcel.readString();
        this.f52000j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f51992a = (HashSet) parcel.readSerializable();
        this.f51993c = parcel.readByte() != 0;
        this.f52001k = parcel.readInt();
        this.f52002l = parcel.readInt();
        this.f52003m = parcel.readString();
        this.f52004n = parcel.readByte() != 0;
        this.f52005o = parcel.readByte() != 0;
        this.f52006p = parcel.readByte() != 0;
        this.f52007q = parcel.readByte() != 0;
    }

    public static C2966a f() {
        if (f51986F == null) {
            f51986F = new C2966a();
        }
        return f51986F;
    }

    public C2966a A(String str) {
        this.f51991E = str;
        return this;
    }

    public C2966a C(int i9) {
        this.f51990D = i9;
        return this;
    }

    public C2966a G(int i9) {
        this.f52011u = i9;
        return this;
    }

    public C2966a H(String str) {
        this.f52012v = str;
        return this;
    }

    public C2966a I(long j9) {
        this.f52009s = j9;
        return this;
    }

    public String a() {
        return this.f52015y;
    }

    public ArrayList c() {
        return this.f52013w;
    }

    public int d() {
        return this.f52008r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f51989C;
    }

    public String g() {
        return this.f51991E;
    }

    public int h() {
        return this.f51990D;
    }

    public int k() {
        return this.f52011u;
    }

    public String m() {
        return this.f52012v;
    }

    public C2966a r(String str) {
        this.f52015y = str;
        return this;
    }

    public C2966a t(ArrayList arrayList) {
        this.f52013w = arrayList;
        return this;
    }

    public C2966a v(List list) {
        this.f52014x = list;
        return this;
    }

    public C2966a w(int i9) {
        this.f52008r = i9;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f51995e);
        parcel.writeParcelable(this.f51994d, i9);
        parcel.writeString(this.f51997g);
        parcel.writeByte(this.f51996f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f51998h);
        parcel.writeString(this.f51999i);
        parcel.writeParcelable(this.f52000j, i9);
        parcel.writeSerializable(this.f51992a);
        parcel.writeByte(this.f51993c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f52001k);
        parcel.writeInt(this.f52002l);
        parcel.writeString(this.f52003m);
        parcel.writeByte(this.f52004n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f52005o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f52006p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f52007q ? (byte) 1 : (byte) 0);
    }

    public C2966a x(String str) {
        this.f51989C = str;
        return this;
    }
}
