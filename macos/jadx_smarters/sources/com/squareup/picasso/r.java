package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.squareup.picasso.j;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes4.dex */
public class r extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f39122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f39123b;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(j jVar, A a9) {
        this.f39122a = jVar;
        this.f39123b = a9;
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        String scheme = wVar.f39170d.getScheme();
        return HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme);
    }

    @Override // com.squareup.picasso.y
    public int e() {
        return 2;
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i9) throws a {
        j.a aVarA = this.f39122a.a(wVar.f39170d, wVar.f39169c);
        if (aVarA == null) {
            return null;
        }
        t.e eVar = aVarA.f39104c ? t.e.DISK : t.e.NETWORK;
        Bitmap bitmapA = aVarA.a();
        if (bitmapA != null) {
            return new y.a(bitmapA, eVar);
        }
        InputStream inputStreamC = aVarA.c();
        if (inputStreamC == null) {
            return null;
        }
        if (eVar == t.e.DISK && aVarA.b() == 0) {
            G.e(inputStreamC);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == t.e.NETWORK && aVarA.b() > 0) {
            this.f39123b.f(aVarA.b());
        }
        return new y.a(inputStreamC, eVar);
    }

    @Override // com.squareup.picasso.y
    public boolean h(boolean z9, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.y
    public boolean i() {
        return true;
    }
}
