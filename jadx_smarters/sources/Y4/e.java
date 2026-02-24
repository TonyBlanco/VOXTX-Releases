package y4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        r.m(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return dVar;
    }

    public static d b(String str, Parcelable.Creator creator) {
        return a(C4.c.a(str), creator);
    }

    public static byte[] c(d dVar) {
        Parcel parcelObtain = Parcel.obtain();
        dVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static void d(d dVar, Intent intent, String str) {
        intent.putExtra(str, c(dVar));
    }

    public static String e(d dVar) {
        return C4.c.d(c(dVar));
    }
}
