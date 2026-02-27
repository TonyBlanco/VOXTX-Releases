package t1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: renamed from: t1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2762c extends AbstractC2760a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Date f50612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Date f50613k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IInAppBillingService f50614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f50616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2761b f50617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2761b f50618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0455c f50619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f50620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ServiceConnection f50621i;

    /* JADX INFO: renamed from: t1.c$a */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2762c.this.f50614b = IInAppBillingService.Stub.asInterface(iBinder);
            new b(C2762c.this, null).execute(new Void[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C2762c.this.f50614b = null;
        }
    }

    /* JADX INFO: renamed from: t1.c$b */
    public class b extends AsyncTask {
        public b() {
        }

        public /* synthetic */ b(C2762c c2762c, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (C2762c.this.o()) {
                return Boolean.FALSE;
            }
            C2762c.this.q();
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                C2762c.this.t();
                if (C2762c.this.f50619g != null) {
                    C2762c.this.f50619g.a();
                }
            }
            if (C2762c.this.f50619g != null) {
                C2762c.this.f50619g.c();
            }
        }
    }

    /* JADX INFO: renamed from: t1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0455c {
        void a();

        void b(int i9, Throwable th);

        void c();
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2012, 11, 5);
        f50612j = calendar.getTime();
        calendar.set(2015, 6, 21);
        f50613k = calendar.getTime();
    }

    public C2762c(Context context, String str, String str2, InterfaceC0455c interfaceC0455c) {
        this(context, str, str2, interfaceC0455c, true);
    }

    public C2762c(Context context, String str, String str2, InterfaceC0455c interfaceC0455c, boolean z9) {
        super(context.getApplicationContext());
        this.f50621i = new a();
        this.f50616d = str;
        this.f50619g = interfaceC0455c;
        this.f50615c = a().getPackageName();
        this.f50617e = new C2761b(a(), ".products.cache.v2_6");
        this.f50618f = new C2761b(a(), ".subscriptions.cache.v2_6");
        this.f50620h = str2;
        if (z9) {
            l();
        }
    }

    public static Intent m() {
        Intent intent = new Intent("TryRoom");
        intent.setPackage("com.android.vending");
        return intent;
    }

    public final void l() {
        try {
            a().bindService(m(), this.f50621i, 1);
        } catch (Exception e9) {
            Log.e("iabv3", "error in bindPlayServices", e9);
            s(113, e9);
        }
    }

    public boolean n() {
        return this.f50614b != null;
    }

    public final boolean o() {
        return d(c() + ".products.restored.v2_6", false);
    }

    public boolean p(String str) {
        return this.f50617e.m(str);
    }

    public boolean q() {
        return r("inapp", this.f50617e) && r("subs", this.f50618f);
    }

    public final boolean r(String str, C2761b c2761b) {
        if (!n()) {
            return false;
        }
        try {
            Bundle purchases = this.f50614b.getPurchases(3, this.f50615c, str, null);
            if (purchases.getInt("RESPONSE_CODE") == 0) {
                c2761b.h();
                ArrayList<String> stringArrayList = purchases.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = purchases.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    return true;
                }
                int i9 = 0;
                while (i9 < stringArrayList.size()) {
                    String str2 = stringArrayList.get(i9);
                    if (!TextUtils.isEmpty(str2)) {
                        c2761b.o(new JSONObject(str2).getString("productId"), str2, (stringArrayList2 == null || stringArrayList2.size() <= i9) ? null : stringArrayList2.get(i9));
                    }
                    i9++;
                }
                return true;
            }
        } catch (Exception e9) {
            s(100, e9);
            Log.e("iabv3", "Error in loadPurchasesByType", e9);
        }
        return false;
    }

    public final void s(int i9, Throwable th) {
        InterfaceC0455c interfaceC0455c = this.f50619g;
        if (interfaceC0455c != null) {
            interfaceC0455c.b(i9, th);
        }
    }

    public final void t() {
        f(c() + ".products.restored.v2_6", Boolean.TRUE);
    }
}
