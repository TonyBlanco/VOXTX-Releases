package P3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d4.AbstractC1687d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public byte[] a(List list) {
        ArrayList<? extends Parcelable> arrayListI = AbstractC1687d.i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListI);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
