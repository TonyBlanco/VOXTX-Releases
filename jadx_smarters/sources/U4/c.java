package U4;

import R4.i;
import R4.j;
import R4.k;
import R4.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import b5.AbstractC1229a;
import f5.u;
import i5.AbstractC1893c;
import i5.C1894d;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9788e;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0125a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9789a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f9790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f9791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Locale f9795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f9796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f9799l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Boolean f9800m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Integer f9801n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Integer f9802o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Integer f9803p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Integer f9804q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Integer f9805r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Integer f9806s;

        /* JADX INFO: renamed from: U4.c$a$a, reason: collision with other inner class name */
        public class C0125a implements Parcelable.Creator {
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

        public a() {
            this.f9792e = 255;
            this.f9793f = -2;
            this.f9794g = -2;
            this.f9800m = Boolean.TRUE;
        }

        public a(Parcel parcel) {
            this.f9792e = 255;
            this.f9793f = -2;
            this.f9794g = -2;
            this.f9800m = Boolean.TRUE;
            this.f9789a = parcel.readInt();
            this.f9790c = (Integer) parcel.readSerializable();
            this.f9791d = (Integer) parcel.readSerializable();
            this.f9792e = parcel.readInt();
            this.f9793f = parcel.readInt();
            this.f9794g = parcel.readInt();
            this.f9796i = parcel.readString();
            this.f9797j = parcel.readInt();
            this.f9799l = (Integer) parcel.readSerializable();
            this.f9801n = (Integer) parcel.readSerializable();
            this.f9802o = (Integer) parcel.readSerializable();
            this.f9803p = (Integer) parcel.readSerializable();
            this.f9804q = (Integer) parcel.readSerializable();
            this.f9805r = (Integer) parcel.readSerializable();
            this.f9806s = (Integer) parcel.readSerializable();
            this.f9800m = (Boolean) parcel.readSerializable();
            this.f9795h = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeInt(this.f9789a);
            parcel.writeSerializable(this.f9790c);
            parcel.writeSerializable(this.f9791d);
            parcel.writeInt(this.f9792e);
            parcel.writeInt(this.f9793f);
            parcel.writeInt(this.f9794g);
            CharSequence charSequence = this.f9796i;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f9797j);
            parcel.writeSerializable(this.f9799l);
            parcel.writeSerializable(this.f9801n);
            parcel.writeSerializable(this.f9802o);
            parcel.writeSerializable(this.f9803p);
            parcel.writeSerializable(this.f9804q);
            parcel.writeSerializable(this.f9805r);
            parcel.writeSerializable(this.f9806s);
            parcel.writeSerializable(this.f9800m);
            parcel.writeSerializable(this.f9795h);
        }
    }

    public c(Context context, int i9, int i10, int i11, a aVar) {
        Integer numValueOf;
        a aVar2 = new a();
        this.f9785b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i9 != 0) {
            aVar.f9789a = i9;
        }
        TypedArray typedArrayA = a(context, aVar.f9789a, i10, i11);
        Resources resources = context.getResources();
        this.f9786c = typedArrayA.getDimensionPixelSize(l.f8919G, resources.getDimensionPixelSize(R4.d.f8704C));
        this.f9788e = typedArrayA.getDimensionPixelSize(l.f8935I, resources.getDimensionPixelSize(R4.d.f8703B));
        this.f9787d = typedArrayA.getDimensionPixelSize(l.f8943J, resources.getDimensionPixelSize(R4.d.f8706E));
        aVar2.f9792e = aVar.f9792e == -2 ? 255 : aVar.f9792e;
        aVar2.f9796i = aVar.f9796i == null ? context.getString(j.f8835i) : aVar.f9796i;
        aVar2.f9797j = aVar.f9797j == 0 ? i.f8826a : aVar.f9797j;
        aVar2.f9798k = aVar.f9798k == 0 ? j.f8837k : aVar.f9798k;
        aVar2.f9800m = Boolean.valueOf(aVar.f9800m == null || aVar.f9800m.booleanValue());
        aVar2.f9794g = aVar.f9794g == -2 ? typedArrayA.getInt(l.f8967M, 4) : aVar.f9794g;
        aVar2.f9793f = aVar.f9793f != -2 ? aVar.f9793f : typedArrayA.hasValue(l.f8975N) ? typedArrayA.getInt(l.f8975N, 0) : -1;
        aVar2.f9790c = Integer.valueOf(aVar.f9790c == null ? t(context, typedArrayA, l.f8903E) : aVar.f9790c.intValue());
        if (aVar.f9791d != null) {
            numValueOf = aVar.f9791d;
        } else {
            numValueOf = Integer.valueOf(typedArrayA.hasValue(l.f8927H) ? t(context, typedArrayA, l.f8927H) : new C1894d(context, k.f8849c).i().getDefaultColor());
        }
        aVar2.f9791d = numValueOf;
        aVar2.f9799l = Integer.valueOf(aVar.f9799l == null ? typedArrayA.getInt(l.f8911F, 8388661) : aVar.f9799l.intValue());
        aVar2.f9801n = Integer.valueOf(aVar.f9801n == null ? typedArrayA.getDimensionPixelOffset(l.f8951K, 0) : aVar.f9801n.intValue());
        aVar2.f9802o = Integer.valueOf(aVar.f9801n == null ? typedArrayA.getDimensionPixelOffset(l.f8983O, 0) : aVar.f9802o.intValue());
        aVar2.f9803p = Integer.valueOf(aVar.f9803p == null ? typedArrayA.getDimensionPixelOffset(l.f8959L, aVar2.f9801n.intValue()) : aVar.f9803p.intValue());
        aVar2.f9804q = Integer.valueOf(aVar.f9804q == null ? typedArrayA.getDimensionPixelOffset(l.f8991P, aVar2.f9802o.intValue()) : aVar.f9804q.intValue());
        aVar2.f9805r = Integer.valueOf(aVar.f9805r == null ? 0 : aVar.f9805r.intValue());
        aVar2.f9806s = Integer.valueOf(aVar.f9806s != null ? aVar.f9806s.intValue() : 0);
        typedArrayA.recycle();
        aVar2.f9795h = aVar.f9795h == null ? Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault() : aVar.f9795h;
        this.f9784a = aVar;
    }

    public static int t(Context context, TypedArray typedArray, int i9) {
        return AbstractC1893c.a(context, typedArray, i9).getDefaultColor();
    }

    public final TypedArray a(Context context, int i9, int i10, int i11) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i9 != 0) {
            AttributeSet attributeSetA = AbstractC1229a.a(context, i9, "badge");
            styleAttribute = attributeSetA.getStyleAttribute();
            attributeSet = attributeSetA;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return u.h(context, attributeSet, l.f8895D, i10, styleAttribute == 0 ? i11 : styleAttribute, new int[0]);
    }

    public int b() {
        return this.f9785b.f9805r.intValue();
    }

    public int c() {
        return this.f9785b.f9806s.intValue();
    }

    public int d() {
        return this.f9785b.f9792e;
    }

    public int e() {
        return this.f9785b.f9790c.intValue();
    }

    public int f() {
        return this.f9785b.f9799l.intValue();
    }

    public int g() {
        return this.f9785b.f9791d.intValue();
    }

    public int h() {
        return this.f9785b.f9798k;
    }

    public CharSequence i() {
        return this.f9785b.f9796i;
    }

    public int j() {
        return this.f9785b.f9797j;
    }

    public int k() {
        return this.f9785b.f9803p.intValue();
    }

    public int l() {
        return this.f9785b.f9801n.intValue();
    }

    public int m() {
        return this.f9785b.f9794g;
    }

    public int n() {
        return this.f9785b.f9793f;
    }

    public Locale o() {
        return this.f9785b.f9795h;
    }

    public int p() {
        return this.f9785b.f9804q.intValue();
    }

    public int q() {
        return this.f9785b.f9802o.intValue();
    }

    public boolean r() {
        return this.f9785b.f9793f != -1;
    }

    public boolean s() {
        return this.f9785b.f9800m.booleanValue();
    }

    public void u(int i9) {
        this.f9784a.f9792e = i9;
        this.f9785b.f9792e = i9;
    }
}
