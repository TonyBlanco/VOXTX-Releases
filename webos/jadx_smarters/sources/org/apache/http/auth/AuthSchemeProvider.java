package org.apache.http.auth;

import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
public interface AuthSchemeProvider {
    AuthScheme create(HttpContext httpContext);
}
