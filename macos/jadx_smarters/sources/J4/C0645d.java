package J4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: J4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0645d extends AbstractC2985a {
    public static final Parcelable.Creator<C0645d> CREATOR = new X();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator f3284j = new W();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f3287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3288i;

    public C0645d(List list, String str, List list2, String str2) {
        com.google.android.gms.common.internal.r.n(list, "transitions can't be null");
        com.google.android.gms.common.internal.r.b(list.size() > 0, "transitions can't be empty.");
        com.google.android.gms.common.internal.r.m(list);
        TreeSet treeSet = new TreeSet(f3284j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0644c c0644c = (C0644c) it.next();
            com.google.android.gms.common.internal.r.b(treeSet.add(c0644c), String.format("Found duplicated transition: %s.", c0644c));
        }
        this.f3285f = Collections.unmodifiableList(list);
        this.f3286g = str;
        this.f3287h = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f3288i = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0645d c0645d = (C0645d) obj;
            if (AbstractC1418q.b(this.f3285f, c0645d.f3285f) && AbstractC1418q.b(this.f3286g, c0645d.f3286g) && AbstractC1418q.b(this.f3288i, c0645d.f3288i) && AbstractC1418q.b(this.f3287h, c0645d.f3287h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f3285f.hashCode() * 31;
        String str = this.f3286g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f3287h;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f3288i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f3285f);
        String str = this.f3286g;
        String strValueOf2 = String.valueOf(this.f3287h);
        String str2 = this.f3288i;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(strValueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(strValueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        com.google.android.gms.common.internal.r.m(parcel);
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, this.f3285f, false);
        y4.c.t(parcel, 2, this.f3286g, false);
        y4.c.x(parcel, 3, this.f3287h, false);
        y4.c.t(parcel, 4, this.f3288i, false);
        y4.c.b(parcel, iA);
    }
}
