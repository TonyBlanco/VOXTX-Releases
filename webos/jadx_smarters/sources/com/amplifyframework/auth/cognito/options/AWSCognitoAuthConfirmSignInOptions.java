package com.amplifyframework.auth.cognito.options;

import O.c;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
    private final Map<String, String> metadata;
    private final List<AuthUserAttribute> userAttributes;

    public static final class CognitoBuilder extends AuthConfirmSignInOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = new HashMap();
        private List<AuthUserAttribute> userAttributes = new ArrayList();

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public AWSCognitoAuthConfirmSignInOptions build() {
            return new AWSCognitoAuthConfirmSignInOptions(Immutable.of(this.metadata), Immutable.of(this.userAttributes));
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder metadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata.clear();
            this.metadata.putAll(map);
            return getThis();
        }

        public CognitoBuilder userAttributes(List<AuthUserAttribute> list) {
            Objects.requireNonNull(list);
            this.userAttributes.clear();
            this.userAttributes.addAll(list);
            return getThis();
        }
    }

    public AWSCognitoAuthConfirmSignInOptions(Map<String, String> map, List<AuthUserAttribute> list) {
        this.metadata = map;
        this.userAttributes = list;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthConfirmSignInOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = (AWSCognitoAuthConfirmSignInOptions) obj;
        return c.a(getMetadata(), aWSCognitoAuthConfirmSignInOptions.getMetadata()) && c.a(getUserAttributes(), aWSCognitoAuthConfirmSignInOptions.getUserAttributes());
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public List<AuthUserAttribute> getUserAttributes() {
        return this.userAttributes;
    }

    public int hashCode() {
        return c.b(getMetadata(), getUserAttributes());
    }

    public String toString() {
        return "AWSCognitoAuthConfirmSignInOptions{userAttributes=" + getUserAttributes() + ", metadata=" + getMetadata() + '}';
    }
}
