package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import w4.C2914b;
import w4.C2916d;
import w4.C2921i;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1404c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private C2914b zzB;
    private boolean zzC;
    private volatile k0 zzD;
    v0 zza;
    final Handler zzb;
    protected InterfaceC0255c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC1410i zzn;
    private final C2921i zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC1415n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private f0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C2916d[] zze = new C2916d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i9);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void onConnectionFailed(C2914b c2914b);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0255c {
        void c(C2914b c2914b);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$d */
    public class d implements InterfaceC0255c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC1404c.InterfaceC0255c
        public final void c(C2914b c2914b) {
            if (c2914b.L()) {
                AbstractC1404c abstractC1404c = AbstractC1404c.this;
                abstractC1404c.getRemoteService(null, abstractC1404c.getScopes());
            } else if (AbstractC1404c.this.zzx != null) {
                AbstractC1404c.this.zzx.onConnectionFailed(c2914b);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1404c(Context context, Looper looper, int i9, a aVar, b bVar, String str) {
        AbstractC1410i abstractC1410iA = AbstractC1410i.a(context);
        C2921i c2921iH = C2921i.h();
        r.m(aVar);
        r.m(bVar);
        this(context, looper, abstractC1410iA, c2921iH, i9, aVar, bVar, str);
    }

    public AbstractC1404c(Context context, Looper looper, AbstractC1410i abstractC1410i, C2921i c2921i, int i9, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        r.n(context, "Context must not be null");
        this.zzl = context;
        r.n(looper, "Looper must not be null");
        this.zzm = looper;
        r.n(abstractC1410i, "Supervisor must not be null");
        this.zzn = abstractC1410i;
        r.n(c2921i, "API availability must not be null");
        this.zzo = c2921i;
        this.zzb = new c0(this, looper);
        this.zzy = i9;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public static /* bridge */ /* synthetic */ void zzj(AbstractC1404c abstractC1404c, k0 k0Var) {
        abstractC1404c.zzD = k0Var;
        if (abstractC1404c.usesClientTelemetry()) {
            C1407f c1407f = k0Var.f26847i;
            C1419s.b().c(c1407f == null ? null : c1407f.M());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC1404c abstractC1404c, int i9) {
        int i10;
        int i11;
        synchronized (abstractC1404c.zzp) {
            i10 = abstractC1404c.zzv;
        }
        if (i10 == 3) {
            abstractC1404c.zzC = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        Handler handler = abstractC1404c.zzb;
        handler.sendMessage(handler.obtainMessage(i11, abstractC1404c.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC1404c abstractC1404c, int i9, int i10, IInterface iInterface) {
        synchronized (abstractC1404c.zzp) {
            try {
                if (abstractC1404c.zzv != i9) {
                    return false;
                }
                abstractC1404c.a(i10, iInterface);
                return true;
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC1404c abstractC1404c) {
        if (abstractC1404c.zzC || TextUtils.isEmpty(abstractC1404c.getServiceDescriptor()) || TextUtils.isEmpty(abstractC1404c.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC1404c.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(int i9, IInterface iInterface) {
        v0 v0Var;
        r.a((i9 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i9;
                this.zzs = iInterface;
                if (i9 == 1) {
                    f0 f0Var = this.zzu;
                    if (f0Var != null) {
                        AbstractC1410i abstractC1410i = this.zzn;
                        String strB = this.zza.b();
                        r.m(strB);
                        abstractC1410i.d(strB, this.zza.a(), 4225, f0Var, zze(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i9 == 2 || i9 == 3) {
                    f0 f0Var2 = this.zzu;
                    if (f0Var2 != null && (v0Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + v0Var.b() + " on " + v0Var.a());
                        AbstractC1410i abstractC1410i2 = this.zzn;
                        String strB2 = this.zza.b();
                        r.m(strB2);
                        abstractC1410i2.d(strB2, this.zza.a(), 4225, f0Var2, zze(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    f0 f0Var3 = new f0(this, this.zzd.get());
                    this.zzu = f0Var3;
                    v0 v0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new v0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new v0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = v0Var2;
                    if (v0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                    }
                    AbstractC1410i abstractC1410i3 = this.zzn;
                    String strB3 = this.zza.b();
                    r.m(strB3);
                    if (!abstractC1410i3.e(new o0(strB3, this.zza.a(), 4225, this.zza.c()), f0Var3, zze(), getBindServiceExecutor())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.zza.b() + " on " + this.zza.a());
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i9 == 4) {
                    r.m(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iJ = this.zzo.j(this.zzl, getMinApkVersion());
        if (iJ == 0) {
            connect(new d());
        } else {
            a(1, null);
            triggerNotAvailable(new d(), iJ, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0255c interfaceC0255c) {
        r.n(interfaceC0255c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0255c;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((d0) this.zzt.get(i9)).d();
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i9;
        IInterface iInterface;
        InterfaceC1415n interfaceC1415n;
        synchronized (this.zzp) {
            i9 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC1415n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(Constants.NULL_VERSION_ID);
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1415n == null) {
            printWriter.println(Constants.NULL_VERSION_ID);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1415n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j9 = this.zzh;
            printWriterAppend.println(j9 + " " + simpleDateFormat.format(new Date(j9)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.zzf;
            printWriter.append((CharSequence) (i10 != 1 ? i10 != 2 ? i10 != 3 ? String.valueOf(i10) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.zzg;
            printWriterAppend2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.c.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j11 = this.zzj;
            printWriterAppend3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C2916d[] getApiFeatures() {
        return zze;
    }

    public final C2916d[] getAvailableFeatures() {
        k0 k0Var = this.zzD;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f26845g;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        v0 v0Var;
        if (!isConnected() || (v0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return v0Var.a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C2921i.f51661a;
    }

    public void getRemoteService(InterfaceC1412k interfaceC1412k, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i9 = C2921i.f51661a;
        Scope[] scopeArr = C1408g.f26818t;
        Bundle bundle = new Bundle();
        int i10 = this.zzy;
        C2916d[] c2916dArr = C1408g.f26819u;
        C1408g c1408g = new C1408g(6, i10, i9, null, null, scopeArr, bundle, null, c2916dArr, c2916dArr, true, 0, false, str);
        c1408g.f26823i = this.zzl.getPackageName();
        c1408g.f26826l = getServiceRequestExtraArgs;
        if (set != null) {
            c1408g.f26825k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c1408g.f26827m = account;
            if (interfaceC1412k != null) {
                c1408g.f26824j = interfaceC1412k.asBinder();
            }
        } else if (requiresAccount()) {
            c1408g.f26827m = getAccount();
        }
        c1408g.f26828n = zze;
        c1408g.f26829o = getApiFeatures();
        if (usesClientTelemetry()) {
            c1408g.f26832r = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC1415n interfaceC1415n = this.zzr;
                    if (interfaceC1415n != null) {
                        interfaceC1415n.i0(new e0(this, this.zzd.get()), c1408g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            triggerConnectionSuspended(3);
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                r.n(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC1415n interfaceC1415n = this.zzr;
                if (interfaceC1415n == null) {
                    return null;
                }
                return interfaceC1415n.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C1407f getTelemetryConfiguration() {
        k0 k0Var = this.zzD;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f26847i;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z9;
        synchronized (this.zzp) {
            z9 = this.zzv == 4;
        }
        return z9;
    }

    public boolean isConnecting() {
        boolean z9;
        synchronized (this.zzp) {
            int i9 = this.zzv;
            z9 = true;
            if (i9 != 2 && i9 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C2914b c2914b) {
        this.zzi = c2914b.H();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i9) {
        this.zzf = i9;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i9, IBinder iBinder, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i10, -1, new g0(this, i9, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i9) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i9));
    }

    public void triggerNotAvailable(InterfaceC0255c interfaceC0255c, int i9, PendingIntent pendingIntent) {
        r.n(interfaceC0255c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0255c;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i9, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i9, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i10, -1, new h0(this, i9, null)));
    }
}
