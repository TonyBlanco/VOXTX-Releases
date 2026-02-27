package com.amazonaws.mobile.client.internal.oauth2;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;

/* JADX INFO: loaded from: classes.dex */
class OAuth2Constants {
    public static final String GRANT_TYPE = "grant_type";
    public static final String SCOPES = "scopes";

    public enum GrantTypes {
        AUTHORIZATION_CODE(ClientConstants.TOKEN_GRANT_TYPE_AUTH_CODE),
        REFRESH_TOKEN("refresh_token");

        private final String value;

        GrantTypes(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public enum TokenRequestFields {
        ACCESS_TOKEN(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN),
        ID_TOKEN(ClientConstants.HTTP_RESPONSE_ID_TOKEN);

        private final String value;

        TokenRequestFields(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public enum TokenResponseFields {
        ACCESS_TOKEN(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN),
        ID_TOKEN(ClientConstants.HTTP_RESPONSE_ID_TOKEN),
        REFRESH_TOKEN("refresh_token"),
        TOKEN_TYPE("token_type"),
        EXPIRES_IN("expires_in"),
        SCOPES(OAuth2Constants.SCOPES),
        ERROR("error"),
        ERROR_DESCRIPTION(ClientConstants.DOMAIN_QUERY_PARAM_ERROR_DESCRIPTION),
        ERROR_URI("error_uri");

        private final String value;

        TokenResponseFields(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }
}
