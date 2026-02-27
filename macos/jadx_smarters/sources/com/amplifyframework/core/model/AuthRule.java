package com.amplifyframework.core.model;

import O.c;
import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.util.Empty;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AuthRule {
    private static final String DEFAULT_GROUPS_FIELD = "groups";
    private static final String DEFAULT_GROUP_CLAIM = "cognito:groups";
    private static final String DEFAULT_IDENTITY_CLAIM = "username";
    private static final String DEFAULT_OWNER_FIELD = "owner";
    private final AuthStrategy.Provider authProvider;
    private final AuthStrategy authStrategy;
    private final String groupClaim;
    private final List<String> groups;
    private final String groupsField;
    private final String identityClaim;
    private final List<ModelOperation> operations;
    private final String ownerField;

    public static final class Builder {
        private AuthStrategy.Provider authProvider;
        private AuthStrategy authStrategy;
        private String groupClaim;
        private List<String> groups;
        private String groupsField;
        private String identityClaim;
        private List<ModelOperation> operations = new ArrayList();
        private String ownerField;

        public Builder authProvider(AuthStrategy.Provider provider) {
            Objects.requireNonNull(provider);
            this.authProvider = provider;
            return this;
        }

        public Builder authStrategy(AuthStrategy authStrategy) {
            Objects.requireNonNull(authStrategy);
            this.authStrategy = authStrategy;
            return this;
        }

        public AuthRule build() {
            Objects.requireNonNull(this.authStrategy);
            return new AuthRule(this);
        }

        public Builder groupClaim(String str) {
            Objects.requireNonNull(str);
            this.groupClaim = str;
            return this;
        }

        public Builder groups(List<String> list) {
            Objects.requireNonNull(list);
            this.groups = list;
            return this;
        }

        public Builder groupsField(String str) {
            Objects.requireNonNull(str);
            this.groupsField = str;
            return this;
        }

        public Builder identityClaim(String str) {
            Objects.requireNonNull(str);
            this.identityClaim = str;
            return this;
        }

        public Builder operations(List<ModelOperation> list) {
            Objects.requireNonNull(list);
            this.operations = list;
            return this;
        }

        public Builder ownerField(String str) {
            Objects.requireNonNull(str);
            this.ownerField = str;
            return this;
        }
    }

    private AuthRule(Builder builder) {
        this.authStrategy = builder.authStrategy;
        this.authProvider = builder.authProvider;
        this.ownerField = builder.ownerField;
        this.identityClaim = builder.identityClaim;
        this.groupClaim = builder.groupClaim;
        this.groups = builder.groups;
        this.groupsField = builder.groupsField;
        this.operations = builder.operations;
    }

    public AuthRule(com.amplifyframework.core.model.annotations.AuthRule authRule) {
        this(builder().authStrategy(authRule.allow()).authProvider(Empty.check(authRule.provider()) ? authRule.allow().getDefaultAuthProvider() : AuthStrategy.Provider.from(authRule.provider())).ownerField(authRule.ownerField()).identityClaim(authRule.identityClaim()).groupClaim(authRule.groupClaim()).groups(Arrays.asList(authRule.groups())).groupsField(authRule.groupsField()).operations(Arrays.asList(authRule.operations())));
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthRule.class != obj.getClass()) {
            return false;
        }
        AuthRule authRule = (AuthRule) obj;
        return this.authStrategy == authRule.authStrategy && c.a(this.ownerField, authRule.ownerField) && c.a(this.identityClaim, authRule.identityClaim) && c.a(this.groupsField, authRule.groupsField) && c.a(this.groupClaim, authRule.groupClaim) && c.a(this.groups, authRule.groups) && c.a(this.operations, authRule.operations);
    }

    public AuthStrategy.Provider getAuthProvider() {
        return this.authProvider;
    }

    public AuthStrategy getAuthStrategy() {
        return this.authStrategy;
    }

    public String getGroupClaimOrDefault() {
        return Empty.check(this.groupClaim) ? DEFAULT_GROUP_CLAIM : this.groupClaim;
    }

    public List<String> getGroups() {
        return Immutable.of(this.groups);
    }

    public String getGroupsFieldOrDefault() {
        return Empty.check(this.groupsField) ? DEFAULT_GROUPS_FIELD : this.groupsField;
    }

    public String getIdentityClaimOrDefault() {
        return (Empty.check(this.identityClaim) || "cognito:username".equals(this.identityClaim)) ? "username" : this.identityClaim;
    }

    public List<ModelOperation> getOperationsOrDefault() {
        return Immutable.of(Empty.check(this.operations) ? Arrays.asList(ModelOperation.values()) : this.operations);
    }

    public String getOwnerFieldOrDefault() {
        return Empty.check(this.ownerField) ? DEFAULT_OWNER_FIELD : this.ownerField;
    }

    public int hashCode() {
        return c.b(this.authStrategy, this.ownerField, this.identityClaim, this.groupsField, this.groupClaim, this.groups, this.operations);
    }

    public String toString() {
        return "AuthRule{authStrategy=" + this.authStrategy + ", ownerField='" + this.ownerField + "', identityClaim='" + this.identityClaim + "', groupsField='" + this.groupsField + "', groupClaim='" + this.groupClaim + "', groups=" + this.groups + "', operations=" + this.operations + "'}";
    }
}
