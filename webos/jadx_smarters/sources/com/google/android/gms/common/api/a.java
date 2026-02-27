package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.InterfaceC1361f;
import com.google.android.gms.common.api.internal.InterfaceC1377n;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.C1406e;
import com.google.android.gms.common.internal.InterfaceC1412k;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0252a f26448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f26449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26450c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0252a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return buildClient(context, looper, c1406e, obj, (InterfaceC1361f) bVar, (InterfaceC1377n) cVar);
        }

        public f buildClient(Context context, Looper looper, C1406e c1406e, Object obj, InterfaceC1361f interfaceC1361f, InterfaceC1377n interfaceC1377n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0253a f26451a = new C0253a(null);

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public static final class C0253a implements d {
            public /* synthetic */ C0253a(m mVar) {
            }
        }
    }

    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    public interface f extends b {
        void connect(AbstractC1404c.InterfaceC0255c interfaceC0255c);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        C2916d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC1412k interfaceC1412k, Set set);

        Set getScopesForConnectionlessNonSignIn();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC1404c.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0252a abstractC0252a, g gVar) {
        r.n(abstractC0252a, "Cannot construct an Api with a null ClientBuilder");
        r.n(gVar, "Cannot construct an Api with a null ClientKey");
        this.f26450c = str;
        this.f26448a = abstractC0252a;
        this.f26449b = gVar;
    }

    public final AbstractC0252a a() {
        return this.f26448a;
    }

    public final c b() {
        return this.f26449b;
    }

    public final e c() {
        return this.f26448a;
    }

    public final String d() {
        return this.f26450c;
    }
}
