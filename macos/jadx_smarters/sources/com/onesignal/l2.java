package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.android.vending.billing.IInAppBillingService;
import com.onesignal.F1;
import com.onesignal.T1;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class l2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f38763i = -99;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f38764j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnection f38765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f38767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f38768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f38769e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38772h = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f38770f = new ArrayList();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                int i9 = IInAppBillingService.Stub.f18478a;
                Method methodQ = l2.q(IInAppBillingService.Stub.class);
                methodQ.setAccessible(true);
                l2.this.f38766b = methodQ.invoke(null, iBinder);
                l2.this.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            int unused = l2.f38763i = -99;
            l2.this.f38766b = null;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.this.f38772h = true;
            try {
                if (l2.this.f38767c == null) {
                    l2.this.f38767c = l2.r(l2.f38764j);
                    l2.this.f38767c.setAccessible(true);
                }
                Bundle bundle = (Bundle) l2.this.f38767c.invoke(l2.this.f38766b, 3, l2.this.f38769e.getPackageName(), "inapp", null);
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i9 = 0; i9 < stringArrayList2.size(); i9++) {
                        String str = stringArrayList2.get(i9);
                        String str2 = stringArrayList.get(i9);
                        String string = new JSONObject(str).getString("purchaseToken");
                        if (!l2.this.f38770f.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        l2.this.t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        l2.this.f38771g = false;
                        R1.j("GTPlayerPurchases", "ExistingPurchases", false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            l2.this.f38772h = false;
        }
    }

    public class c extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f38775a;

        public c(ArrayList arrayList) {
            this.f38775a = arrayList;
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            l2.this.f38770f.addAll(this.f38775a);
            R1.m("GTPlayerPurchases", "purchaseTokens", l2.this.f38770f.toString());
            R1.j("GTPlayerPurchases", "ExistingPurchases", true);
            l2.this.f38771g = false;
            l2.this.f38772h = false;
        }
    }

    public l2(Context context) {
        this.f38771g = true;
        this.f38769e = context;
        try {
            JSONArray jSONArray = new JSONArray(R1.f("GTPlayerPurchases", "purchaseTokens", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                this.f38770f.add(jSONArray.get(i9).toString());
            }
            boolean z9 = jSONArray.length() == 0;
            this.f38771g = z9;
            if (z9) {
                this.f38771g = R1.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        u();
    }

    public static boolean a(Context context) {
        if (f38763i == -99) {
            f38763i = context.checkCallingOrSelfPermission("TryRoom");
        }
        try {
            int i9 = f38763i;
            if (i9 == 0) {
                f38764j = IInAppBillingService.class;
            }
            return i9 == 0;
        } catch (Throwable unused) {
            f38763i = 0;
            return false;
        }
    }

    public static Method q(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    public static Method r(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    public static Method s(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    public final void b() {
        if (this.f38772h) {
            return;
        }
        new Thread(new b()).start();
    }

    public final void t(ArrayList arrayList, ArrayList arrayList2) {
        try {
            if (this.f38768d == null) {
                Method methodS = s(f38764j);
                this.f38768d = methodS;
                methodS.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f38768d.invoke(this.f38766b, 3, this.f38769e.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap map = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", bigDecimalDivide.toString());
                    map.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (map.containsKey(str)) {
                        jSONArray.put(map.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    F1.x1(jSONArray, this.f38771g, new c(arrayList2));
                }
            }
        } catch (Throwable th) {
            F1.b(F1.v.WARN, "Failed to track IAP purchases", th);
        }
    }

    public void u() {
        if (this.f38765a != null) {
            if (this.f38766b != null) {
                b();
            }
        } else {
            this.f38765a = new a();
            Intent intent = new Intent("TryRoom");
            intent.setPackage("com.android.vending");
            this.f38769e.bindService(intent, this.f38765a, 1);
        }
    }
}
