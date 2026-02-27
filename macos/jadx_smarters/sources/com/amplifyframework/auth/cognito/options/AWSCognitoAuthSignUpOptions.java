package com.amplifyframework.auth.cognito.options;

import O.c;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthSignUpOptions extends AuthSignUpOptions {
    private final Map<String, String> clientMetadata;
    private final Map<String, String> validationData;

    public static final class CognitoBuilder extends AuthSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> validationData = new HashMap();
        private Map<String, String> clientMetadata = new HashMap();

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public AWSCognitoAuthSignUpOptions build() {
            return new AWSCognitoAuthSignUpOptions(Immutable.of(super.getUserAttributes()), Immutable.of(this.validationData), Immutable.of(this.clientMetadata));
        }

        public CognitoBuilder clientMetadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.clientMetadata.clear();
            this.clientMetadata.putAll(map);
            return getThis();
        }

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder validationData(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.validationData.clear();
            this.validationData.putAll(map);
            return getThis();
        }
    }

    public AWSCognitoAuthSignUpOptions(List<AuthUserAttribute> list, Map<String, String> map, Map<String, String> map2) {
        super(list);
        this.validationData = map;
        this.clientMetadata = map2;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignUpOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = (AWSCognitoAuthSignUpOptions) obj;
        return c.a(getUserAttributes(), aWSCognitoAuthSignUpOptions.getUserAttributes()) && c.a(getValidationData(), aWSCognitoAuthSignUpOptions.getValidationData()) && c.a(getClientMetadata(), aWSCognitoAuthSignUpOptions.getClientMetadata());
    }

    public Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public Map<String, String> getValidationData() {
        return this.validationData;
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public int hashCode() {
        return c.b(getUserAttributes(), getValidationData(), getClientMetadata());
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public String toString() {
        return "AWSCognitoAuthSignUpOptions{userAttributes=" + getUserAttributes() + ", validationData=" + getValidationData() + ", clientMetadata=" + getClientMetadata() + '}';
    }
}
