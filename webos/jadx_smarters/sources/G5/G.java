package G5;

import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public class G extends AbstractC2985a {
    public static final Parcelable.Creator<G> CREATOR = new d0();

    public static G H() {
        return new G();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        y4.c.b(parcel, y4.c.a(parcel));
    }
}
