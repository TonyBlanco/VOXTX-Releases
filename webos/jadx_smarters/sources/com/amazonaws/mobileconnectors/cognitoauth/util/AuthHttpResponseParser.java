package com.amazonaws.mobileconnectors.cognitoauth.util;

import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthClientException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidGrantException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidParameterException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AuthHttpResponseParser {
    private AuthHttpResponseParser() {
    }

    public static final AuthUserSession parseHttpResponse(String str) {
        if (str == null || str.isEmpty()) {
            throw new AuthInvalidParameterException("Invalid (null) response from Amazon Cognito Auth endpoint");
        }
        AccessToken accessToken = new AccessToken(null);
        IdToken idToken = new IdToken(null);
        RefreshToken refreshToken = new RefreshToken(null);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error")) {
                String string = jSONObject.getString("error");
                if (ClientConstants.HTTP_RESPONSE_INVALID_GRANT.equals(string)) {
                    throw new AuthInvalidGrantException(string);
                }
                throw new AuthServiceException(string);
            }
            if (jSONObject.has(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN)) {
                accessToken = new AccessToken(jSONObject.getString(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN));
            }
            if (jSONObject.has(ClientConstants.HTTP_RESPONSE_ID_TOKEN)) {
                idToken = new IdToken(jSONObject.getString(ClientConstants.HTTP_RESPONSE_ID_TOKEN));
            }
            if (jSONObject.has("refresh_token")) {
                refreshToken = new RefreshToken(jSONObject.getString("refresh_token"));
            }
            return new AuthUserSession(idToken, accessToken, refreshToken);
        } catch (AuthInvalidGrantException e9) {
            throw e9;
        } catch (AuthServiceException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new AuthClientException(e11.getMessage(), e11);
        }
    }
}
