package y4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static void A(Parcel parcel, int i9) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i9));
    }

    public static int B(Parcel parcel) {
        int iS = s(parcel);
        int iZ = z(parcel, iS);
        int iL = l(iS);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iS))), parcel);
        }
        int i9 = iZ + iDataPosition;
        if (i9 >= iDataPosition && i9 <= parcel.dataSize()) {
            return i9;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i9, parcel);
    }

    public static void C(Parcel parcel, int i9, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + i10 + " (0x" + Integer.toHexString(i10) + ")", parcel);
    }

    public static void D(Parcel parcel, int i9, int i10) {
        int iZ = z(parcel, i9);
        if (iZ == i10) {
            return;
        }
        throw new a("Expected size " + i10 + " got " + iZ + " (0x" + Integer.toHexString(iZ) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iZ);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return iArrCreateIntArray;
    }

    public static long[] d(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return jArrCreateLongArray;
    }

    public static Parcelable e(Parcel parcel, int i9, Parcelable.Creator creator) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iZ);
        return parcelable;
    }

    public static String f(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iZ);
        return string;
    }

    public static String[] g(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return strArrCreateStringArray;
    }

    public static ArrayList h(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iZ);
        return arrayListCreateStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i9, Parcelable.Creator creator) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i9, Parcelable.Creator creator) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i9) {
        if (parcel.dataPosition() == i9) {
            return;
        }
        throw new a("Overread allowed size end=" + i9, parcel);
    }

    public static int l(int i9) {
        return (char) i9;
    }

    public static boolean m(Parcel parcel, int i9) {
        D(parcel, i9, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        if (iZ == 0) {
            return null;
        }
        C(parcel, i9, iZ, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double o(Parcel parcel, int i9) {
        D(parcel, i9, 8);
        return parcel.readDouble();
    }

    public static Double p(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        if (iZ == 0) {
            return null;
        }
        C(parcel, i9, iZ, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float q(Parcel parcel, int i9) {
        D(parcel, i9, 4);
        return parcel.readFloat();
    }

    public static Float r(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        if (iZ == 0) {
            return null;
        }
        C(parcel, i9, iZ, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int s(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder t(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iZ);
        return strongBinder;
    }

    public static int u(Parcel parcel, int i9) {
        D(parcel, i9, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        if (iZ == 0) {
            return null;
        }
        C(parcel, i9, iZ, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i9) {
        D(parcel, i9, 8);
        return parcel.readLong();
    }

    public static Long x(Parcel parcel, int i9) {
        int iZ = z(parcel, i9);
        if (iZ == 0) {
            return null;
        }
        C(parcel, i9, iZ, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short y(Parcel parcel, int i9) {
        D(parcel, i9, 4);
        return (short) parcel.readInt();
    }

    public static int z(Parcel parcel, int i9) {
        return (i9 & (-65536)) != -65536 ? (char) (i9 >> 16) : parcel.readInt();
    }
}
