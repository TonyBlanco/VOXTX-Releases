package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class NegotiateSchemeFactory implements AuthSchemeFactory {
    private final SpnegoTokenGenerator spengoGenerator;
    private final boolean stripPort;

    public NegotiateSchemeFactory() {
        this(null, false);
    }

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateSchemeFactory(SpnegoTokenGenerator spnegoTokenGenerator, boolean z9) {
        this.spengoGenerator = spnegoTokenGenerator;
        this.stripPort = z9;
    }

    public SpnegoTokenGenerator getSpengoGenerator() {
        return this.spengoGenerator;
    }

    public boolean isStripPort() {
        return this.stripPort;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new NegotiateScheme(this.spengoGenerator, this.stripPort);
    }
}
