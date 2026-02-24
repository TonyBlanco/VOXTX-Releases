package g1;

import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.play_billing.zzai;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1812f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f41206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzai f41207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f41208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41209g;

    /* JADX INFO: renamed from: g1.f$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f41212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f41213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f41214e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b.a f41215f;

        public /* synthetic */ a(AbstractC1831z abstractC1831z) {
            b.a aVarA = b.a();
            b.a.b(aVarA);
            this.f41215f = aVarA;
        }

        public C1812f a() {
            ArrayList arrayList = this.f41213d;
            boolean z9 = true;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f41212c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            AbstractC1805D abstractC1805D = null;
            if (!z10) {
                AbstractC1617D.a(this.f41212c.get(0));
                if (this.f41212c.size() <= 0) {
                    throw null;
                }
                AbstractC1617D.a(this.f41212c.get(0));
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
            if (this.f41213d.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (this.f41213d.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) this.f41213d.get(0);
                String strD = skuDetails.d();
                ArrayList arrayList2 = this.f41213d;
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i9);
                    if (!strD.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !strD.equals(skuDetails2.d())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strH = skuDetails.h();
                ArrayList arrayList3 = this.f41213d;
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i10);
                    if (!strD.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !strH.equals(skuDetails3.h())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            C1812f c1812f = new C1812f(abstractC1805D);
            if (!z10 || ((SkuDetails) this.f41213d.get(0)).h().isEmpty()) {
                if (z11) {
                    AbstractC1617D.a(this.f41212c.get(0));
                    throw null;
                }
                z9 = false;
            }
            c1812f.f41203a = z9;
            c1812f.f41204b = this.f41210a;
            c1812f.f41205c = this.f41211b;
            c1812f.f41206d = this.f41215f.a();
            ArrayList arrayList4 = this.f41213d;
            c1812f.f41208f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            c1812f.f41209g = this.f41214e;
            List list2 = this.f41212c;
            c1812f.f41207e = list2 != null ? zzai.zzj(list2) : zzai.zzk();
            return c1812f;
        }

        public a b(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f41213d = arrayList;
            return this;
        }
    }

    /* JADX INFO: renamed from: g1.f$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f41218c = 0;

        /* JADX INFO: renamed from: g1.f$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f41219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f41220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f41221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f41222d = 0;

            public /* synthetic */ a(AbstractC1802A abstractC1802A) {
            }

            public static /* synthetic */ a b(a aVar) {
                aVar.f41221c = true;
                return aVar;
            }

            public b a() {
                AbstractC1803B abstractC1803B = null;
                boolean z9 = (TextUtils.isEmpty(this.f41219a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.f41220b);
                if (z9 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f41221c && !z9 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                b bVar = new b(abstractC1803B);
                bVar.f41216a = this.f41219a;
                bVar.f41218c = this.f41222d;
                bVar.f41217b = this.f41220b;
                return bVar;
            }
        }

        public /* synthetic */ b(AbstractC1803B abstractC1803B) {
        }

        public static a a() {
            return new a(null);
        }

        public final int b() {
            return this.f41218c;
        }

        public final String c() {
            return this.f41216a;
        }

        public final String d() {
            return this.f41217b;
        }
    }

    public /* synthetic */ C1812f(AbstractC1805D abstractC1805D) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f41206d.b();
    }

    public final String c() {
        return this.f41204b;
    }

    public final String d() {
        return this.f41205c;
    }

    public final String e() {
        return this.f41206d.c();
    }

    public final String f() {
        return this.f41206d.d();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f41208f);
        return arrayList;
    }

    public final List h() {
        return this.f41207e;
    }

    public final boolean p() {
        return this.f41209g;
    }

    public final boolean q() {
        return (this.f41204b == null && this.f41205c == null && this.f41206d.d() == null && this.f41206d.b() == 0 && !this.f41203a && !this.f41209g) ? false : true;
    }
}
