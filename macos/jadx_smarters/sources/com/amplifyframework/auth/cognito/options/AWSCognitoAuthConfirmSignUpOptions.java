package com.amplifyframework.auth.cognito.options;

import O.c;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
    private final Map<String, String> clientMetadata;

    public static final class CognitoBuilder extends AuthConfirmSignUpOptions.Builder<CognitoBuilder> {
        private final Map<String, String> clientMetadata = new HashMap();

        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public AWSCognitoAuthConfirmSignUpOptions build() {
            return new AWSCognitoAuthConfirmSignUpOptions(Immutable.of(this.clientMetadata));
        }

        public CognitoBuilder clientMetadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.clientMetadata.clear();
            this.clientMetadata.putAll(map);
            return getThis();
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }
    }

    public AWSCognitoAuthConfirmSignUpOptions(Map<String, String> map) {
        this.clientMetadata = map;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthConfirmSignUpOptions.class != obj.getClass()) {
            return false;
        }
        return c.a(getClientMetadata(), ((AWSCognitoAuthConfirmSignUpOptions) obj).getClientMetadata());
    }

    public Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public int hashCode() {
        return c.b(getClientMetadata());
    }

    public String toString() {
        return "AWSCognitoAuthConfirmSignUpOptions{metadata=" + this.clientMetadata + '}';
    }
}
