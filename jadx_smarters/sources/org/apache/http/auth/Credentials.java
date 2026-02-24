package org.apache.http.auth;

import java.security.Principal;

/* JADX INFO: loaded from: classes4.dex */
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}
