package y4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void A(Parcel parcel, int i9, int i10) {
        parcel.writeInt(i9 | (i10 << 16));
    }

    public static void B(Parcel parcel, Parcelable parcelable, int i9) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i9);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(Parcel parcel) {
        return y(parcel, 20293);
    }

    public static void b(Parcel parcel, int i9) {
        z(parcel, i9);
    }

    public static void c(Parcel parcel, int i9, boolean z9) {
        A(parcel, i9, 4);
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i9, Boolean bool, boolean z9) {
        if (bool != null) {
            A(parcel, i9, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z9) {
            A(parcel, i9, 0);
        }
    }

    public static void e(Parcel parcel, int i9, Bundle bundle, boolean z9) {
        if (bundle == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeBundle(bundle);
            z(parcel, iY);
        }
    }

    public static void f(Parcel parcel, int i9, byte[] bArr, boolean z9) {
        if (bArr == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeByteArray(bArr);
            z(parcel, iY);
        }
    }

    public static void g(Parcel parcel, int i9, double d9) {
        A(parcel, i9, 8);
        parcel.writeDouble(d9);
    }

    public static void h(Parcel parcel, int i9, Double d9, boolean z9) {
        if (d9 != null) {
            A(parcel, i9, 8);
            parcel.writeDouble(d9.doubleValue());
        } else if (z9) {
            A(parcel, i9, 0);
        }
    }

    public static void i(Parcel parcel, int i9, float f9) {
        A(parcel, i9, 4);
        parcel.writeFloat(f9);
    }

    public static void j(Parcel parcel, int i9, Float f9, boolean z9) {
        if (f9 != null) {
            A(parcel, i9, 4);
            parcel.writeFloat(f9.floatValue());
        } else if (z9) {
            A(parcel, i9, 0);
        }
    }

    public static void k(Parcel parcel, int i9, IBinder iBinder, boolean z9) {
        if (iBinder == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeStrongBinder(iBinder);
            z(parcel, iY);
        }
    }

    public static void l(Parcel parcel, int i9, int i10) {
        A(parcel, i9, 4);
        parcel.writeInt(i10);
    }

    public static void m(Parcel parcel, int i9, int[] iArr, boolean z9) {
        if (iArr == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeIntArray(iArr);
            z(parcel, iY);
        }
    }

    public static void n(Parcel parcel, int i9, Integer num, boolean z9) {
        if (num != null) {
            A(parcel, i9, 4);
            parcel.writeInt(num.intValue());
        } else if (z9) {
            A(parcel, i9, 0);
        }
    }

    public static void o(Parcel parcel, int i9, long j9) {
        A(parcel, i9, 8);
        parcel.writeLong(j9);
    }

    public static void p(Parcel parcel, int i9, long[] jArr, boolean z9) {
        if (jArr == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeLongArray(jArr);
            z(parcel, iY);
        }
    }

    public static void q(Parcel parcel, int i9, Long l9, boolean z9) {
        if (l9 != null) {
            A(parcel, i9, 8);
            parcel.writeLong(l9.longValue());
        } else if (z9) {
            A(parcel, i9, 0);
        }
    }

    public static void r(Parcel parcel, int i9, Parcelable parcelable, int i10, boolean z9) {
        if (parcelable == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcelable.writeToParcel(parcel, i10);
            z(parcel, iY);
        }
    }

    public static void s(Parcel parcel, int i9, short s9) {
        A(parcel, i9, 4);
        parcel.writeInt(s9);
    }

    public static void t(Parcel parcel, int i9, String str, boolean z9) {
        if (str == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeString(str);
            z(parcel, iY);
        }
    }

    public static void u(Parcel parcel, int i9, String[] strArr, boolean z9) {
        if (strArr == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeStringArray(strArr);
            z(parcel, iY);
        }
    }

    public static void v(Parcel parcel, int i9, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                A(parcel, i9, 0);
            }
        } else {
            int iY = y(parcel, i9);
            parcel.writeStringList(list);
            z(parcel, iY);
        }
    }

    public static void w(Parcel parcel, int i9, Parcelable[] parcelableArr, int i10, boolean z9) {
        if (parcelableArr == null) {
            if (z9) {
                A(parcel, i9, 0);
                return;
            }
            return;
        }
        int iY = y(parcel, i9);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                B(parcel, parcelable, i10);
            }
        }
        z(parcel, iY);
    }

    public static void x(Parcel parcel, int i9, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                A(parcel, i9, 0);
                return;
            }
            return;
        }
        int iY = y(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                B(parcel, parcelable, 0);
            }
        }
        z(parcel, iY);
    }

    public static int y(Parcel parcel, int i9) {
        parcel.writeInt(i9 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void z(Parcel parcel, int i9) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i9 - 4);
        parcel.writeInt(iDataPosition - i9);
        parcel.setDataPosition(iDataPosition);
    }
}
