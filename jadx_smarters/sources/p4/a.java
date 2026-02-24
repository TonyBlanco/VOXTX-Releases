package P4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.InterfaceC1412k;
import com.google.android.gms.common.internal.N;
import com.google.android.gms.common.internal.r;
import l4.C2191a;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AbstractC1409h implements O4.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7274g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1406e f7276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f7277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f7278f;

    public a(Context context, Looper looper, boolean z9, C1406e c1406e, Bundle bundle, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 44, c1406e, bVar, cVar);
        this.f7275c = true;
        this.f7276d = c1406e;
        this.f7277e = bundle;
        this.f7278f = c1406e.h();
    }

    public static Bundle g(C1406e c1406e) {
        c1406e.g();
        Integer numH = c1406e.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1406e.b());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // O4.e
    public final void b() {
        try {
            ((g) getService()).A(((Integer) r.m(this.f7278f)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // O4.e
    public final void c() {
        connect(new AbstractC1404c.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // O4.e
    public final void d(f fVar) {
        r.n(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.f7276d.c();
            ((g) getService()).Z(new j(1, new N(accountC, ((Integer) r.m(this.f7278f)).intValue(), AbstractC1404c.DEFAULT_ACCOUNT.equals(accountC.name) ? C2191a.a(getContext()).b() : null)), fVar);
        } catch (RemoteException e9) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.M0(new l(1, new C2914b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e9);
            }
        }
    }

    @Override // O4.e
    public final void e(InterfaceC1412k interfaceC1412k, boolean z9) {
        try {
            ((g) getService()).E(interfaceC1412k, ((Integer) r.m(this.f7278f)).intValue(), z9);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f7276d.e())) {
            this.f7277e.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f7276d.e());
        }
        return this.f7277e;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.f7275c;
    }
}
