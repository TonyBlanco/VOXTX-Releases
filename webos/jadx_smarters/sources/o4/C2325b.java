package o4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.common.api.internal.AbstractC1388t;
import com.google.android.gms.common.api.internal.InterfaceC1383q;
import com.google.android.gms.internal.cast.zzae;
import com.google.android.gms.internal.cast.zzaf;
import com.google.android.gms.internal.cast.zzah;
import com.google.android.gms.internal.cast.zzay;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzbm;
import com.google.android.gms.internal.cast.zzcx;
import com.google.android.gms.internal.cast.zzf;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t4.C2775b;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: renamed from: o4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2325b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2775b f45821q = new C2775b("CastContext");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f45822r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C2325b f45823s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f45825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2346x f45826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f45827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2335l f45828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2332i f45829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2326c f45830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t4.H f45831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzae f45832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzbf f45833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzay f45834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f45835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zzbm f45836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzcx f45837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zzah f45838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2327d f45839p;

    public C2325b(Context context, C2326c c2326c, List list, zzbf zzbfVar, final t4.H h9) throws C2333j {
        this.f45824a = context;
        this.f45830g = c2326c;
        this.f45833j = zzbfVar;
        this.f45831h = h9;
        this.f45835l = list;
        zzay zzayVar = new zzay(context);
        this.f45834k = zzayVar;
        zzbm zzbmVarZzn = zzbfVar.zzn();
        this.f45836m = zzbmVarZzn;
        p();
        try {
            w0 w0VarZza = zzaf.zza(context, c2326c, zzbfVar, o());
            this.f45825b = w0VarZza;
            try {
                this.f45827d = new p0(w0VarZza.zzg());
                try {
                    C2346x c2346x = new C2346x(w0VarZza.zzh(), context);
                    this.f45826c = c2346x;
                    this.f45829f = new C2332i(c2346x);
                    this.f45828e = new C2335l(c2326c, c2346x, h9);
                    if (zzbmVarZzn != null) {
                        zzbmVarZzn.zzj(c2346x);
                    }
                    this.f45837n = new zzcx(context);
                    h9.h(new String[]{"com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ENABLE_WIFI_WARNING"}).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzab
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            zzac.zzb((Bundle) obj);
                        }
                    });
                    zzae zzaeVar = new zzae();
                    this.f45832i = zzaeVar;
                    try {
                        w0VarZza.b1(zzaeVar);
                        zzaeVar.zze(zzayVar.zza);
                        if (!c2326c.P().isEmpty()) {
                            f45821q.e("Setting Route Discovery for appIds: ".concat(String.valueOf(c2326c.P())), new Object[0]);
                            zzayVar.zza(c2326c.P());
                        }
                        h9.h(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new OnSuccessListener() { // from class: o4.a0
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                C2325b c2325b = this.f45820a;
                                zzf.zza(c2325b.f45824a, c2325b.f45831h, c2325b.f45826c, c2325b.f45836m, c2325b.f45832i).zzc((Bundle) obj);
                            }
                        });
                        final String[] strArr = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        h9.doRead(AbstractC1388t.a().b(new InterfaceC1383q() { // from class: t4.C
                            @Override // com.google.android.gms.common.api.internal.InterfaceC1383q
                            public final void accept(Object obj, Object obj2) throws RemoteException {
                                H h10 = h9;
                                String[] strArr2 = strArr;
                                ((C2785l) ((I) obj).getService()).E(new G(h10, (TaskCompletionSource) obj2), strArr2);
                            }
                        }).d(n4.C.f45270h).c(false).e(8427).a()).addOnSuccessListener(new OnSuccessListener() { // from class: o4.d0
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                this.f45867a.m((Bundle) obj);
                            }
                        });
                        try {
                            if (w0VarZza.zze() >= 224300000) {
                                AbstractC2324a.c(new e0(this));
                            }
                        } catch (RemoteException e9) {
                            f45821q.b(e9, "Unable to call %s on %s.", "clientGmsVersion", w0.class.getSimpleName());
                        }
                    } catch (RemoteException e10) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e10);
                    }
                } catch (RemoteException e11) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e11);
                }
            } catch (RemoteException e12) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e12);
            }
        } catch (RemoteException e13) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e13);
        }
    }

    public static C2325b d() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return f45823s;
    }

    public static C2325b e(Context context) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        if (f45823s == null) {
            synchronized (f45822r) {
                if (f45823s == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC2334k interfaceC2334kN = n(applicationContext);
                    C2326c castOptions = interfaceC2334kN.getCastOptions(applicationContext);
                    t4.H h9 = new t4.H(applicationContext);
                    try {
                        f45823s = new C2325b(applicationContext, castOptions, interfaceC2334kN.getAdditionalSessionProviders(applicationContext), new zzbf(applicationContext, C2812L.j(applicationContext), castOptions, h9), h9);
                    } catch (C2333j e9) {
                        throw new RuntimeException(e9);
                    }
                }
            }
        }
        return f45823s;
    }

    public static C2325b g(Context context) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        try {
            return e(context);
        } catch (RuntimeException e9) {
            f45821q.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e9);
            return null;
        }
    }

    public static InterfaceC2334k n(Context context) {
        try {
            Bundle bundle = E4.e.a(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f45821q.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (InterfaceC2334k) Class.forName(string).asSubclass(InterfaceC2334k.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException e9) {
            e = e9;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public C2326c a() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45830g;
    }

    public C2811K b() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        try {
            return C2811K.d(this.f45825b.zzf());
        } catch (RemoteException e9) {
            f45821q.b(e9, "Unable to call %s on %s.", "getMergedSelectorAsBundle", w0.class.getSimpleName());
            return null;
        }
    }

    public C2346x c() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45826c;
    }

    public boolean f(KeyEvent keyEvent) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return false;
    }

    public final p0 h() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45827d;
    }

    public final zzcx k() {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        return this.f45837n;
    }

    public final /* synthetic */ void m(Bundle bundle) {
        this.f45839p = new C2327d(bundle);
    }

    public final Map o() {
        HashMap map = new HashMap();
        zzah zzahVar = this.f45838o;
        if (zzahVar != null) {
            map.put(zzahVar.getCategory(), zzahVar.zza());
        }
        List<AbstractC2348z> list = this.f45835l;
        if (list != null) {
            for (AbstractC2348z abstractC2348z : list) {
                com.google.android.gms.common.internal.r.n(abstractC2348z, "Additional SessionProvider must not be null.");
                String strH = com.google.android.gms.common.internal.r.h(abstractC2348z.getCategory(), "Category for SessionProvider must not be null or empty string.");
                com.google.android.gms.common.internal.r.b(!map.containsKey(strH), String.format("SessionProvider for category %s already added", strH));
                map.put(strH, abstractC2348z.zza());
            }
        }
        return map;
    }

    public final void p() {
        this.f45838o = !TextUtils.isEmpty(this.f45830g.K()) ? new zzah(this.f45824a, this.f45830g, this.f45833j) : null;
    }
}
