package M0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import s.C2695a;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f4168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f4169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4175k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2695a(), new C2695a(), new C2695a());
    }

    public c(Parcel parcel, int i9, int i10, String str, C2695a c2695a, C2695a c2695a2, C2695a c2695a3) {
        super(c2695a, c2695a2, c2695a3);
        this.f4168d = new SparseIntArray();
        this.f4173i = -1;
        this.f4175k = -1;
        this.f4169e = parcel;
        this.f4170f = i9;
        this.f4171g = i10;
        this.f4174j = i9;
        this.f4172h = str;
    }

    @Override // M0.b
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f4169e.writeInt(-1);
        } else {
            this.f4169e.writeInt(bArr.length);
            this.f4169e.writeByteArray(bArr);
        }
    }

    @Override // M0.b
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4169e, 0);
    }

    @Override // M0.b
    public void E(int i9) {
        this.f4169e.writeInt(i9);
    }

    @Override // M0.b
    public void G(Parcelable parcelable) {
        this.f4169e.writeParcelable(parcelable, 0);
    }

    @Override // M0.b
    public void I(String str) {
        this.f4169e.writeString(str);
    }

    @Override // M0.b
    public void a() {
        int i9 = this.f4173i;
        if (i9 >= 0) {
            int i10 = this.f4168d.get(i9);
            int iDataPosition = this.f4169e.dataPosition();
            this.f4169e.setDataPosition(i10);
            this.f4169e.writeInt(iDataPosition - i10);
            this.f4169e.setDataPosition(iDataPosition);
        }
    }

    @Override // M0.b
    public b b() {
        Parcel parcel = this.f4169e;
        int iDataPosition = parcel.dataPosition();
        int i9 = this.f4174j;
        if (i9 == this.f4170f) {
            i9 = this.f4171g;
        }
        return new c(parcel, iDataPosition, i9, this.f4172h + "  ", this.f4165a, this.f4166b, this.f4167c);
    }

    @Override // M0.b
    public boolean g() {
        return this.f4169e.readInt() != 0;
    }

    @Override // M0.b
    public byte[] i() {
        int i9 = this.f4169e.readInt();
        if (i9 < 0) {
            return null;
        }
        byte[] bArr = new byte[i9];
        this.f4169e.readByteArray(bArr);
        return bArr;
    }

    @Override // M0.b
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4169e);
    }

    @Override // M0.b
    public boolean m(int i9) {
        while (this.f4174j < this.f4171g) {
            int i10 = this.f4175k;
            if (i10 == i9) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i9)) > 0) {
                return false;
            }
            this.f4169e.setDataPosition(this.f4174j);
            int i11 = this.f4169e.readInt();
            this.f4175k = this.f4169e.readInt();
            this.f4174j += i11;
        }
        return this.f4175k == i9;
    }

    @Override // M0.b
    public int o() {
        return this.f4169e.readInt();
    }

    @Override // M0.b
    public Parcelable q() {
        return this.f4169e.readParcelable(getClass().getClassLoader());
    }

    @Override // M0.b
    public String s() {
        return this.f4169e.readString();
    }

    @Override // M0.b
    public void w(int i9) {
        a();
        this.f4173i = i9;
        this.f4168d.put(i9, this.f4169e.dataPosition());
        E(0);
        E(i9);
    }

    @Override // M0.b
    public void y(boolean z9) {
        this.f4169e.writeInt(z9 ? 1 : 0);
    }
}
