package g1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzs;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1810d extends AbstractC1809c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f41175A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ExecutorService f41176B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f41177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f41179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile W f41180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f41181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f41182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile zzs f41183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ServiceConnectionC1830y f41184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f41191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f41197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f41198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1814h f41202z;

    public C1810d(String str, Context context, F f9, ExecutorService executorService) {
        this.f41177a = 0;
        this.f41179c = new Handler(Looper.getMainLooper());
        this.f41187k = 0;
        String strM = M();
        this.f41178b = strM;
        this.f41181e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strM);
        zzgtVarZzy.zzm(this.f41181e.getPackageName());
        this.f41182f = new H(this.f41181e, (zzgu) zzgtVarZzy.zzf());
        this.f41181e.getPackageName();
    }

    public C1810d(String str, C1814h c1814h, Context context, K k9, F f9, ExecutorService executorService) {
        this.f41177a = 0;
        this.f41179c = new Handler(Looper.getMainLooper());
        this.f41187k = 0;
        this.f41178b = M();
        this.f41181e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(M());
        zzgtVarZzy.zzm(this.f41181e.getPackageName());
        this.f41182f = new H(this.f41181e, (zzgu) zzgtVarZzy.zzf());
        zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f41180d = new W(this.f41181e, null, null, null, null, this.f41182f);
        this.f41202z = c1814h;
        this.f41181e.getPackageName();
    }

    public C1810d(String str, C1814h c1814h, Context context, InterfaceC1816j interfaceC1816j, InterfaceC1804C interfaceC1804C, F f9, ExecutorService executorService) {
        String strM = M();
        this.f41177a = 0;
        this.f41179c = new Handler(Looper.getMainLooper());
        this.f41187k = 0;
        this.f41178b = strM;
        i(context, interfaceC1816j, c1814h, null, strM, null);
    }

    public static /* bridge */ /* synthetic */ P G(C1810d c1810d, String str, int i9) {
        P p9;
        zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = zzb.zzc(c1810d.f41190n, c1810d.f41198v, c1810d.f41202z.a(), c1810d.f41202z.b(), c1810d.f41178b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = c1810d.f41190n ? c1810d.f41183g.zzj(true != c1810d.f41198v ? 9 : 19, c1810d.f41181e.getPackageName(), str, string, bundleZzc) : c1810d.f41183g.zzi(3, c1810d.f41181e.getPackageName(), str, string);
                Q qA = com.android.billingclient.api.c.a(bundleZzj, "BillingClient", "getPurchase()");
                com.android.billingclient.api.a aVarA = qA.a();
                if (aVarA != com.android.billingclient.api.b.f18463l) {
                    c1810d.O(AbstractC1806E.a(qA.b(), 9, aVarA));
                    return new P(aVarA, list);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z9 = false;
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.d())) {
                            zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z9 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e9) {
                        zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e9);
                        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18461j;
                        c1810d.O(AbstractC1806E.a(51, 9, aVar));
                        p9 = new P(aVar, null);
                    }
                }
                if (z9) {
                    c1810d.O(AbstractC1806E.a(26, 9, com.android.billingclient.api.b.f18461j));
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    p9 = new P(com.android.billingclient.api.b.f18463l, arrayList);
                    break;
                }
                list = null;
            } catch (Exception e10) {
                com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f18464m;
                c1810d.O(AbstractC1806E.a(52, 9, aVar2));
                zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e10);
                return new P(aVar2, null);
            }
        }
        return p9;
    }

    public static String M() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public final /* synthetic */ void A(InterfaceC1808b interfaceC1808b) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18465n;
        O(AbstractC1806E.a(24, 3, aVar));
        interfaceC1808b.a(aVar);
    }

    public final /* synthetic */ void B(com.android.billingclient.api.a aVar) {
        if (this.f41180d.d() != null) {
            this.f41180d.d().e(aVar, null);
        } else {
            zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void D(InterfaceC1815i interfaceC1815i) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18465n;
        O(AbstractC1806E.a(24, 9, aVar));
        interfaceC1815i.a(aVar, zzai.zzk());
    }

    public final /* synthetic */ void E(InterfaceC1818l interfaceC1818l) {
        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18465n;
        O(AbstractC1806E.a(24, 8, aVar));
        interfaceC1818l.c(aVar, null);
    }

    public final Handler J() {
        return Looper.myLooper() == null ? this.f41179c : new Handler(Looper.myLooper());
    }

    public final com.android.billingclient.api.a K(final com.android.billingclient.api.a aVar) {
        if (Thread.interrupted()) {
            return aVar;
        }
        this.f41179c.post(new Runnable() { // from class: g1.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f41156a.B(aVar);
            }
        });
        return aVar;
    }

    public final com.android.billingclient.api.a L() {
        return (this.f41177a == 0 || this.f41177a == 3) ? com.android.billingclient.api.b.f18464m : com.android.billingclient.api.b.f18461j;
    }

    public final Future N(Callable callable, long j9, final Runnable runnable, Handler handler) {
        if (this.f41176B == null) {
            this.f41176B = Executors.newFixedThreadPool(zzb.zza, new ThreadFactoryC1824s(this));
        }
        try {
            final Future futureSubmit = this.f41176B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: g1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j9 * 0.95d));
            return futureSubmit;
        } catch (Exception e9) {
            zzb.zzl("BillingClient", "Async task throws exception!", e9);
            return null;
        }
    }

    public final void O(zzga zzgaVar) {
        this.f41182f.d(zzgaVar, this.f41187k);
    }

    public final void P(zzge zzgeVar) {
        this.f41182f.a(zzgeVar, this.f41187k);
    }

    public final void Q(String str, final InterfaceC1815i interfaceC1815i) {
        com.android.billingclient.api.a aVarL;
        int i9;
        if (!c()) {
            aVarL = com.android.billingclient.api.b.f18464m;
            i9 = 2;
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzk("BillingClient", "Please provide a valid product type.");
            aVarL = com.android.billingclient.api.b.f18458g;
            i9 = 50;
        } else {
            if (N(new CallableC1825t(this, str, interfaceC1815i), 30000L, new Runnable() { // from class: g1.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41239a.D(interfaceC1815i);
                }
            }, J()) != null) {
                return;
            }
            aVarL = L();
            i9 = 25;
        }
        O(AbstractC1806E.a(i9, 9, aVarL));
        interfaceC1815i.a(aVarL, zzai.zzk());
    }

    public final boolean R() {
        return this.f41198v && this.f41202z.b();
    }

    public final /* synthetic */ Bundle T(int i9, String str, String str2, C1812f c1812f, Bundle bundle) {
        return this.f41183g.zzg(i9, this.f41181e.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle U(String str, String str2) {
        return this.f41183g.zzf(3, this.f41181e.getPackageName(), str, str2, null);
    }

    @Override // g1.AbstractC1809c
    public final void a(final C1807a c1807a, final InterfaceC1808b interfaceC1808b) {
        com.android.billingclient.api.a aVarL;
        int i9;
        if (!c()) {
            aVarL = com.android.billingclient.api.b.f18464m;
            i9 = 2;
        } else if (TextUtils.isEmpty(c1807a.a())) {
            zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            aVarL = com.android.billingclient.api.b.f18460i;
            i9 = 26;
        } else if (!this.f41190n) {
            aVarL = com.android.billingclient.api.b.f18453b;
            i9 = 27;
        } else {
            if (N(new Callable() { // from class: g1.a0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f41163a.a0(c1807a, interfaceC1808b);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: g1.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41166a.A(interfaceC1808b);
                }
            }, J()) != null) {
                return;
            }
            aVarL = L();
            i9 = 25;
        }
        O(AbstractC1806E.a(i9, 3, aVarL));
        interfaceC1808b.a(aVarL);
    }

    public final /* synthetic */ Object a0(C1807a c1807a, InterfaceC1808b interfaceC1808b) {
        com.android.billingclient.api.a aVarA;
        try {
            zzs zzsVar = this.f41183g;
            String packageName = this.f41181e.getPackageName();
            String strA = c1807a.a();
            String str = this.f41178b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleZzd = zzsVar.zzd(9, packageName, strA, bundle);
            aVarA = com.android.billingclient.api.b.a(zzb.zzb(bundleZzd, "BillingClient"), zzb.zzg(bundleZzd, "BillingClient"));
        } catch (Exception e9) {
            zzb.zzl("BillingClient", "Error acknowledge purchase!", e9);
            aVarA = com.android.billingclient.api.b.f18464m;
            O(AbstractC1806E.a(28, 3, aVarA));
        }
        interfaceC1808b.a(aVarA);
        return null;
    }

    @Override // g1.AbstractC1809c
    public final void b() {
        P(AbstractC1806E.c(12));
        try {
            try {
                if (this.f41180d != null) {
                    this.f41180d.f();
                }
                if (this.f41184h != null) {
                    this.f41184h.c();
                }
                if (this.f41184h != null && this.f41183g != null) {
                    zzb.zzj("BillingClient", "Unbinding from service.");
                    this.f41181e.unbindService(this.f41184h);
                    this.f41184h = null;
                }
                this.f41183g = null;
                ExecutorService executorService = this.f41176B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f41176B = null;
                }
            } catch (Exception e9) {
                zzb.zzl("BillingClient", "There was an exception while ending connection!", e9);
            }
            this.f41177a = 3;
        } catch (Throwable th) {
            this.f41177a = 3;
            throw th;
        }
    }

    public final /* synthetic */ Object b0(String str, List list, String str2, InterfaceC1818l interfaceC1818l) {
        String strZzg;
        int i9;
        Bundle bundleZzk;
        zzga zzgaVarA;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strZzg = "";
                i9 = 0;
                break;
            }
            int i11 = i10 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i10, i11 > size ? size : i11));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f41178b);
            try {
                if (this.f41191o) {
                    zzs zzsVar = this.f41183g;
                    String packageName = this.f41181e.getPackageName();
                    int i12 = this.f41187k;
                    boolean zA = this.f41202z.a();
                    boolean zR = R();
                    String str3 = this.f41178b;
                    Bundle bundle2 = new Bundle();
                    if (i12 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str3);
                    }
                    if (i12 >= 9 && zA) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zR) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleZzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    bundleZzk = this.f41183g.zzk(3, this.f41181e.getPackageName(), str, bundle);
                }
                strZzg = "Item is unavailable for purchase.";
                if (bundleZzk == null) {
                    zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                    zzgaVarA = AbstractC1806E.a(44, 8, com.android.billingclient.api.b.f18448C);
                    break;
                }
                if (bundleZzk.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                        zzgaVarA = AbstractC1806E.a(46, 8, com.android.billingclient.api.b.f18448C);
                        break;
                    }
                    for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i13));
                            zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (JSONException e9) {
                            zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e9);
                            strZzg = "Error trying to decode SkuDetails.";
                            O(AbstractC1806E.a(47, 8, com.android.billingclient.api.b.a(6, "Error trying to decode SkuDetails.")));
                            arrayList = null;
                            i9 = 6;
                            interfaceC1818l.c(com.android.billingclient.api.b.a(i9, strZzg), arrayList);
                            return null;
                        }
                    }
                    i10 = i11;
                } else {
                    int iZzb = zzb.zzb(bundleZzk, "BillingClient");
                    strZzg = zzb.zzg(bundleZzk, "BillingClient");
                    if (iZzb != 0) {
                        zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                        O(AbstractC1806E.a(23, 8, com.android.billingclient.api.b.a(iZzb, strZzg)));
                        i9 = iZzb;
                    } else {
                        zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        O(AbstractC1806E.a(45, 8, com.android.billingclient.api.b.a(6, strZzg)));
                    }
                }
            } catch (Exception e10) {
                zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e10);
                O(AbstractC1806E.a(43, 8, com.android.billingclient.api.b.f18464m));
                strZzg = "Service connection is disconnected.";
                i9 = -1;
                arrayList = null;
            }
        }
        O(zzgaVarA);
        arrayList = null;
        i9 = 4;
        interfaceC1818l.c(com.android.billingclient.api.b.a(i9, strZzg), arrayList);
        return null;
    }

    @Override // g1.AbstractC1809c
    public final boolean c() {
        return (this.f41177a != 2 || this.f41183g == null || this.f41184h == null) ? false : true;
    }

    @Override // g1.AbstractC1809c
    public final com.android.billingclient.api.a d(Activity activity, final C1812f c1812f) {
        String str;
        String str2;
        Future futureN;
        int i9;
        boolean z9;
        String str3;
        SkuDetails skuDetails;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z10;
        String str8;
        String str9;
        final C1810d c1810d = this;
        if (c1810d.f41180d == null || c1810d.f41180d.d() == null) {
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18451F;
            c1810d.O(AbstractC1806E.a(12, 2, aVar));
            return aVar;
        }
        if (!c()) {
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f18464m;
            c1810d.O(AbstractC1806E.a(2, 2, aVar2));
            c1810d.K(aVar2);
            return aVar2;
        }
        ArrayList<SkuDetails> arrayListG = c1812f.g();
        List listH = c1812f.h();
        SkuDetails skuDetails2 = (SkuDetails) zzan.zza(arrayListG, null);
        AbstractC1617D.a(zzan.zza(listH, null));
        skuDetails2.getClass();
        final String strC = skuDetails2.c();
        final String strD = skuDetails2.d();
        String str10 = "BillingClient";
        if (strD.equals("subs") && !c1810d.f41185i) {
            zzb.zzk("BillingClient", "Current client doesn't support subscriptions.");
            com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f18466o;
            c1810d.O(AbstractC1806E.a(9, 2, aVar3));
            c1810d.K(aVar3);
            return aVar3;
        }
        if (c1812f.q() && !c1810d.f41188l) {
            zzb.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            com.android.billingclient.api.a aVar4 = com.android.billingclient.api.b.f18459h;
            c1810d.O(AbstractC1806E.a(18, 2, aVar4));
            c1810d.K(aVar4);
            return aVar4;
        }
        if (arrayListG.size() > 1 && !c1810d.f41195s) {
            zzb.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            com.android.billingclient.api.a aVar5 = com.android.billingclient.api.b.f18471t;
            c1810d.O(AbstractC1806E.a(19, 2, aVar5));
            c1810d.K(aVar5);
            return aVar5;
        }
        if (!listH.isEmpty() && !c1810d.f41196t) {
            zzb.zzk("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            com.android.billingclient.api.a aVar6 = com.android.billingclient.api.b.f18473v;
            c1810d.O(AbstractC1806E.a(20, 2, aVar6));
            c1810d.K(aVar6);
            return aVar6;
        }
        if (c1810d.f41188l) {
            boolean z11 = c1810d.f41190n;
            boolean z12 = c1810d.f41198v;
            boolean zA = c1810d.f41202z.a();
            boolean zB = c1810d.f41202z.b();
            boolean z13 = c1810d.f41175A;
            String str11 = c1810d.f41178b;
            str = "BUY_INTENT";
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str11);
            if (c1812f.b() != 0) {
                bundle.putInt("prorationMode", c1812f.b());
            }
            if (!TextUtils.isEmpty(c1812f.c())) {
                bundle.putString("accountId", c1812f.c());
            }
            if (!TextUtils.isEmpty(c1812f.d())) {
                bundle.putString("obfuscatedProfileId", c1812f.d());
            }
            if (c1812f.p()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c1812f.e())) {
                bundle.putString("oldSkuPurchaseToken", c1812f.e());
            }
            String str12 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c1812f.f())) {
                bundle.putString("originalExternalTransactionId", c1812f.f());
                str12 = null;
            }
            if (!TextUtils.isEmpty(str12)) {
                bundle.putString("paymentsPurchaseParams", str12);
            }
            if (z11 && zA) {
                z9 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z9 = true;
            }
            if (z12 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z9);
            }
            if (z13) {
                bundle.putBoolean("enableAlternativeBilling", z9);
            }
            if (arrayListG.isEmpty()) {
                str3 = "proxyPackageVersion";
                skuDetails = skuDetails2;
                str4 = strC;
                str5 = strD;
                str6 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                if (listH.size() > 0) {
                    AbstractC1617D.a(listH.get(0));
                    throw null;
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<String> arrayList7 = new ArrayList<>();
                str5 = strD;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str4 = strC;
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                str3 = "proxyPackageVersion";
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                for (SkuDetails skuDetails3 : arrayListG) {
                    if (skuDetails3.j().isEmpty()) {
                        str9 = str10;
                    } else {
                        str9 = str10;
                        arrayList6.add(skuDetails3.j());
                    }
                    String strG = skuDetails3.g();
                    SkuDetails skuDetails4 = skuDetails2;
                    String strF = skuDetails3.f();
                    int iE = skuDetails3.e();
                    String strI = skuDetails3.i();
                    arrayList7.add(strG);
                    z14 |= !TextUtils.isEmpty(strG);
                    arrayList8.add(strF);
                    z15 |= !TextUtils.isEmpty(strF);
                    arrayList9.add(Integer.valueOf(iE));
                    z16 |= iE != 0;
                    z17 |= !TextUtils.isEmpty(strI);
                    arrayList10.add(strI);
                    str10 = str9;
                    skuDetails2 = skuDetails4;
                }
                skuDetails = skuDetails2;
                str6 = str10;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z14) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z15) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z16) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z17) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayListG.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListG.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListG.size() - 1);
                    for (int i10 = 1; i10 < arrayListG.size(); i10++) {
                        arrayList11.add(((SkuDetails) arrayListG.get(i10)).c());
                        arrayList12.add(((SkuDetails) arrayListG.get(i10)).d());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
            }
            c1810d = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c1810d.f41193q) {
                com.android.billingclient.api.a aVar7 = com.android.billingclient.api.b.f18472u;
                c1810d.O(AbstractC1806E.a(21, 2, aVar7));
                c1810d.K(aVar7);
                return aVar7;
            }
            if (skuDetails == null || TextUtils.isEmpty(skuDetails.h())) {
                str7 = null;
                z10 = false;
            } else {
                bundle.putString("skuPackageName", skuDetails.h());
                str7 = null;
                z10 = true;
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("accountName", str7);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str2 = str6;
                zzb.zzk(str2, "Activity's intent is null.");
            } else {
                str2 = str6;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str8 = str3;
                        try {
                            bundle.putString(str8, c1810d.f41181e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str8, "package not found");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str8 = str3;
                    }
                }
            }
            final int i11 = (!c1810d.f41196t || listH.isEmpty()) ? (c1810d.f41194r && z10) ? 15 : c1810d.f41190n ? 9 : 6 : 17;
            final String str13 = str4;
            final String str14 = str5;
            futureN = N(new Callable() { // from class: g1.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41241a.T(i11, str13, str14, c1812f, bundle);
                }
            }, 5000L, null, c1810d.f41179c);
            i9 = 78;
        } else {
            str = "BUY_INTENT";
            str2 = "BillingClient";
            futureN = N(new Callable() { // from class: g1.Z
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41158a.U(strC, strD);
                }
            }, 5000L, null, c1810d.f41179c);
            i9 = 80;
        }
        try {
            if (futureN == null) {
                com.android.billingclient.api.a aVar8 = com.android.billingclient.api.b.f18464m;
                c1810d.O(AbstractC1806E.a(25, 2, aVar8));
                c1810d.K(aVar8);
                return aVar8;
            }
            Bundle bundle2 = (Bundle) futureN.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zzb.zzb(bundle2, str2);
            String strZzg = zzb.zzg(bundle2, str2);
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str15 = str;
                intent2.putExtra(str15, (PendingIntent) bundle2.getParcelable(str15));
                activity.startActivity(intent2);
                return com.android.billingclient.api.b.f18463l;
            }
            zzb.zzk(str2, "Unable to buy item, Error response code: " + iZzb);
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.b.a(iZzb, strZzg);
            if (bundle2 != null) {
                i9 = 23;
            }
            c1810d.O(AbstractC1806E.a(i9, 2, aVarA));
            c1810d.K(aVarA);
            return aVarA;
        } catch (CancellationException e9) {
            e = e9;
            zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            com.android.billingclient.api.a aVar9 = com.android.billingclient.api.b.f18465n;
            c1810d.O(AbstractC1806E.a(4, 2, aVar9));
            c1810d.K(aVar9);
            return aVar9;
        } catch (TimeoutException e10) {
            e = e10;
            zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            com.android.billingclient.api.a aVar92 = com.android.billingclient.api.b.f18465n;
            c1810d.O(AbstractC1806E.a(4, 2, aVar92));
            c1810d.K(aVar92);
            return aVar92;
        } catch (Exception e11) {
            zzb.zzl(str2, "Exception while launching billing flow. Try to reconnect", e11);
            com.android.billingclient.api.a aVar10 = com.android.billingclient.api.b.f18464m;
            c1810d.O(AbstractC1806E.a(5, 2, aVar10));
            c1810d.K(aVar10);
            return aVar10;
        }
    }

    @Override // g1.AbstractC1809c
    public final void f(String str, InterfaceC1815i interfaceC1815i) {
        Q(str, interfaceC1815i);
    }

    @Override // g1.AbstractC1809c
    public final void g(C1817k c1817k, final InterfaceC1818l interfaceC1818l) {
        com.android.billingclient.api.a aVarL;
        int i9;
        if (c()) {
            final String strA = c1817k.a();
            final List listB = c1817k.b();
            if (TextUtils.isEmpty(strA)) {
                zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
                aVarL = com.android.billingclient.api.b.f18457f;
                i9 = 49;
            } else if (listB == null) {
                zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                aVarL = com.android.billingclient.api.b.f18456e;
                i9 = 48;
            } else {
                final String str = null;
                if (N(new Callable(strA, listB, str, interfaceC1818l) { // from class: g1.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f41234b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List f41235c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC1818l f41236d;

                    {
                        this.f41236d = interfaceC1818l;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.f41233a.b0(this.f41234b, this.f41235c, null, this.f41236d);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: g1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41237a.E(interfaceC1818l);
                    }
                }, J()) != null) {
                    return;
                }
                aVarL = L();
                i9 = 25;
            }
        } else {
            aVarL = com.android.billingclient.api.b.f18464m;
            i9 = 2;
        }
        O(AbstractC1806E.a(i9, 8, aVarL));
        interfaceC1818l.c(aVarL, null);
    }

    @Override // g1.AbstractC1809c
    public final void h(InterfaceC1811e interfaceC1811e) {
        if (c()) {
            zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            P(AbstractC1806E.c(6));
            interfaceC1811e.a(com.android.billingclient.api.b.f18463l);
            return;
        }
        int i9 = 1;
        if (this.f41177a == 1) {
            zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18455d;
            O(AbstractC1806E.a(37, 6, aVar));
            interfaceC1811e.a(aVar);
            return;
        }
        if (this.f41177a == 3) {
            zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f18464m;
            O(AbstractC1806E.a(38, 6, aVar2));
            interfaceC1811e.a(aVar2);
            return;
        }
        this.f41177a = 1;
        zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.f41184h = new ServiceConnectionC1830y(this, interfaceC1811e, null);
        Intent intent = new Intent("TryRoom");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f41181e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i9 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i9 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f41178b);
                    if (this.f41181e.bindService(intent2, this.f41184h, 1)) {
                        zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i9 = 39;
                    }
                }
            }
        }
        this.f41177a = 0;
        zzb.zzj("BillingClient", "Billing service unavailable on device.");
        com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f18454c;
        O(AbstractC1806E.a(i9, 6, aVar3));
        interfaceC1811e.a(aVar3);
    }

    public final void i(Context context, InterfaceC1816j interfaceC1816j, C1814h c1814h, InterfaceC1804C interfaceC1804C, String str, F f9) {
        this.f41181e = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.f41181e.getPackageName());
        if (f9 == null) {
            f9 = new H(this.f41181e, (zzgu) zzgtVarZzy.zzf());
        }
        this.f41182f = f9;
        if (interfaceC1816j == null) {
            zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f41180d = new W(this.f41181e, interfaceC1816j, null, interfaceC1804C, null, this.f41182f);
        this.f41202z = c1814h;
        this.f41175A = interfaceC1804C != null;
        this.f41181e.getPackageName();
    }
}
