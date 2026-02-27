package com.amplifyframework.auth.cognito.options;

import O.c;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthUpdateUserAttributesOptions extends AuthUpdateUserAttributesOptions {
    private final Map<String, String> metadata;

    public static final class CognitoBuilder extends AuthUpdateUserAttributesOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = new HashMap();

        @Override // com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions.Builder
        public AWSCognitoAuthUpdateUserAttributesOptions build() {
            return new AWSCognitoAuthUpdateUserAttributesOptions(Immutable.of(this.metadata));
        }

        @Override // com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder metadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata.clear();
            this.metadata.putAll(map);
            return getThis();
        }
    }

    public AWSCognitoAuthUpdateUserAttributesOptions(Map<String, String> map) {
        this.metadata = map;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthUpdateUserAttributesOptions.class != obj.getClass()) {
            return false;
        }
        return c.a(getMetadata(), ((AWSCognitoAuthUpdateUserAttributesOptions) obj).getMetadata());
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return c.b(getMetadata());
    }

    public String toString() {
        return "AWSCognitoAuthUpdateUserAttributesOptions{metadata=" + this.metadata + '}';
    }
}
