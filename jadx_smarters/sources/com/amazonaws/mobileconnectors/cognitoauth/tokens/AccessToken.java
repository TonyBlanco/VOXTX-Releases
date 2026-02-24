package com.amazonaws.mobileconnectors.cognitoauth.tokens;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.JWTParser;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class AccessToken extends UserToken {
    private long SEC_IN_MILLSEC;

    public AccessToken(String str) {
        super(str);
        this.SEC_IN_MILLSEC = 1000L;
    }

    public Date getExpiration() throws Exception {
        String claim = JWTParser.getClaim(super.getToken(), "exp");
        if (claim == null) {
            return null;
        }
        return new Date(Long.parseLong(claim) * this.SEC_IN_MILLSEC);
    }

    public String getJWTToken() {
        return super.getToken();
    }

    public String getUsername() throws Exception {
        return JWTParser.getClaim(super.getToken(), CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
    }
}
