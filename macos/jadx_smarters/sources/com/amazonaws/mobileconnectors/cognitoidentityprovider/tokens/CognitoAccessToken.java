package com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoInternalErrorException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoJWTParser;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CognitoAccessToken extends CognitoUserToken {
    private static final int SECS = 1000;

    public CognitoAccessToken(String str) {
        super(str);
    }

    public Date getExpiration() {
        try {
            String claim = CognitoJWTParser.getClaim(super.getToken(), "exp");
            if (claim == null) {
                return null;
            }
            return new Date(Long.parseLong(claim) * 1000);
        } catch (Exception e9) {
            throw new CognitoInternalErrorException(e9.getMessage());
        }
    }

    public String getJWTToken() {
        return super.getToken();
    }

    public String getUsername() throws Exception {
        return CognitoJWTParser.getClaim(super.getToken(), CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME);
    }
}
