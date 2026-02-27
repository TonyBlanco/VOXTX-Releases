package H5;

import G5.AbstractC0553u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p001firebaseauthapi.zzyk;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: H5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0617h extends G5.C {
    public static final Parcelable.Creator<C0617h> CREATOR = new C0618i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f2689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0620k f2690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final G5.f0 f2692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0611b f2693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f2694k;

    public C0617h(List list, C0620k c0620k, String str, G5.f0 f0Var, C0611b c0611b, List list2) {
        this.f2689f = (List) com.google.android.gms.common.internal.r.m(list);
        this.f2690g = (C0620k) com.google.android.gms.common.internal.r.m(c0620k);
        this.f2691h = com.google.android.gms.common.internal.r.g(str);
        this.f2692i = f0Var;
        this.f2693j = c0611b;
        this.f2694k = (List) com.google.android.gms.common.internal.r.m(list2);
    }

    public static C0617h I(zzyk zzykVar, FirebaseAuth firebaseAuth, AbstractC0553u abstractC0553u) {
        List<G5.B> listZzc = zzykVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (G5.B b9 : listZzc) {
            if (b9 instanceof G5.J) {
                arrayList.add((G5.J) b9);
            }
        }
        List<G5.B> listZzc2 = zzykVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (G5.B b10 : listZzc2) {
            if (b10 instanceof G5.M) {
                arrayList2.add((G5.M) b10);
            }
        }
        return new C0617h(arrayList, C0620k.c(zzykVar.zzc(), zzykVar.zzb()), firebaseAuth.b().o(), zzykVar.zza(), (C0611b) abstractC0553u, arrayList2);
    }

    @Override // G5.C
    public final G5.D H() {
        return this.f2690g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 1, this.f2689f, false);
        y4.c.r(parcel, 2, H(), i9, false);
        y4.c.t(parcel, 3, this.f2691h, false);
        y4.c.r(parcel, 4, this.f2692i, i9, false);
        y4.c.r(parcel, 5, this.f2693j, i9, false);
        y4.c.x(parcel, 6, this.f2694k, false);
        y4.c.b(parcel, iA);
    }
}
