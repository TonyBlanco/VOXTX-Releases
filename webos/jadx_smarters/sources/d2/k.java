package D2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1344c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f1346b = null;

        public a(Context context) {
            this.f1345a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public d b(String str) {
            String str2;
            String str3;
            String str4 = (String) c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e9) {
                e = e9;
                str2 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e10) {
                e = e10;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InstantiationException e11) {
                e = e11;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InvocationTargetException e13) {
                e = e13;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            }
        }

        public final Map c() {
            if (this.f1346b == null) {
                this.f1346b = a(this.f1345a);
            }
            return this.f1346b;
        }
    }

    public k(a aVar, i iVar) {
        this.f1344c = new HashMap();
        this.f1342a = aVar;
        this.f1343b = iVar;
    }

    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // D2.e
    public synchronized m get(String str) {
        if (this.f1344c.containsKey(str)) {
            return (m) this.f1344c.get(str);
        }
        d dVarB = this.f1342a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f1343b.a(str));
        this.f1344c.put(str, mVarCreate);
        return mVarCreate;
    }
}
