package H5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: H5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0634z extends AbstractC2985a {
    public static final Parcelable.Creator<C0634z> CREATOR = new C0633y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f2719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f2720g;

    public C0634z(List list, List list2) {
        this.f2719f = list == null ? new ArrayList() : list;
        this.f2720g = list2 == null ? new ArrayList() : list2;
    }

    public static C0634z c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G5.B b9 = (G5.B) it.next();
            if (b9 instanceof G5.J) {
                arrayList.add((G5.J) b9);
            } else if (b9 instanceof G5.M) {
                arrayList2.add((G5.M) b9);
            }
        }
        return new C0634z(arrayList, arrayList2);
    }

    public final List H() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2719f.iterator();
        while (it.hasNext()) {
            arrayList.add((G5.J) it.next());
        }
        Iterator it2 = this.f2720g.iterator();
        while (it2.hasNext()) {
            arrayList.add((G5.M) it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, this.f2719f, false);
        y4.c.x(parcel, 2, this.f2720g, false);
        y4.c.b(parcel, iA);
    }
}
