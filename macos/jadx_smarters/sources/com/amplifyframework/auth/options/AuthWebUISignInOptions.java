package com.amplifyframework.auth.options;

import O.c;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AuthWebUISignInOptions {
    private final List<String> scopes;
    private final Map<String, String> signInQueryParameters;
    private final Map<String, String> signOutQueryParameters;
    private final Map<String, String> tokenQueryParameters;

    public static abstract class Builder<T extends Builder<T>> {
        private List<String> scopes = new ArrayList();
        private Map<String, String> signInQueryParameters = new HashMap();
        private Map<String, String> signOutQueryParameters = new HashMap();
        private Map<String, String> tokenQueryParameters = new HashMap();

        public AuthWebUISignInOptions build() {
            return new AuthWebUISignInOptions(Immutable.of(this.scopes), Immutable.of(this.signInQueryParameters), Immutable.of(this.signOutQueryParameters), Immutable.of(this.tokenQueryParameters));
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public Map<String, String> getSignInQueryParameters() {
            return this.signInQueryParameters;
        }

        public Map<String, String> getSignOutQueryParameters() {
            return this.signOutQueryParameters;
        }

        public abstract T getThis();

        public Map<String, String> getTokenQueryParameters() {
            return this.tokenQueryParameters;
        }

        public T scopes(List<String> list) {
            Objects.requireNonNull(list);
            this.scopes.clear();
            this.scopes.addAll(list);
            return (T) getThis();
        }

        public T signInQueryParameters(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.signInQueryParameters.clear();
            this.signInQueryParameters.putAll(map);
            return (T) getThis();
        }

        public T signOutQueryParameters(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.signOutQueryParameters.clear();
            this.signOutQueryParameters.putAll(map);
            return (T) getThis();
        }

        public T tokenQueryParameters(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.tokenQueryParameters.clear();
            this.tokenQueryParameters.putAll(map);
            return (T) getThis();
        }
    }

    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthWebUISignInOptions(List<String> list, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.scopes = list;
        this.signInQueryParameters = map;
        this.signOutQueryParameters = map2;
        this.tokenQueryParameters = map3;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthWebUISignInOptions authWebUISignInOptions = (AuthWebUISignInOptions) obj;
        return c.a(getScopes(), authWebUISignInOptions.getScopes()) && c.a(getSignInQueryParameters(), authWebUISignInOptions.getSignInQueryParameters()) && c.a(getSignOutQueryParameters(), authWebUISignInOptions.getSignOutQueryParameters()) && c.a(getTokenQueryParameters(), authWebUISignInOptions.getTokenQueryParameters());
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public Map<String, String> getSignInQueryParameters() {
        return this.signInQueryParameters;
    }

    public Map<String, String> getSignOutQueryParameters() {
        return this.signOutQueryParameters;
    }

    public Map<String, String> getTokenQueryParameters() {
        return this.tokenQueryParameters;
    }

    public int hashCode() {
        return c.b(getScopes(), getSignInQueryParameters(), getSignOutQueryParameters(), getTokenQueryParameters());
    }

    public String toString() {
        return "AuthWebUISignInOptions{scopes=" + getScopes() + ", signInQueryParameters=" + getSignInQueryParameters() + ", signOutQueryParameters=" + getSignOutQueryParameters() + ", tokenQueryParameters=" + getTokenQueryParameters() + '}';
    }
}
