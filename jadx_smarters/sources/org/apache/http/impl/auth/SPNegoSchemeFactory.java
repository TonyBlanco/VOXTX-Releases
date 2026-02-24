package org.apache.http.impl.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class SPNegoSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    private final boolean stripPort;
    private final boolean useCanonicalHostname;

    public SPNegoSchemeFactory() {
        this(true, true);
    }

    public SPNegoSchemeFactory(boolean z9) {
        this.stripPort = z9;
        this.useCanonicalHostname = true;
    }

    public SPNegoSchemeFactory(boolean z9, boolean z10) {
        this.stripPort = z9;
        this.useCanonicalHostname = z10;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new SPNegoScheme(this.stripPort, this.useCanonicalHostname);
    }

    public boolean isStripPort() {
        return this.stripPort;
    }

    public boolean isUseCanonicalHostname() {
        return this.useCanonicalHostname;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new SPNegoScheme(this.stripPort, this.useCanonicalHostname);
    }
}
