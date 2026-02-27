package P3;

import android.os.Bundle;
import android.os.Parcel;
import d4.AbstractC1684a;
import d4.AbstractC1687d;
import java.util.ArrayList;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public AbstractC2743y a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return AbstractC1687d.d(b.f7183K, (ArrayList) AbstractC1684a.e(bundle.getParcelableArrayList("c")));
    }
}
