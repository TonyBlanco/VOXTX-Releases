package com.amazonaws.mobileconnectors.appsync;

/* JADX INFO: loaded from: classes.dex */
public class ClearCacheOptions {
    private boolean mutations;
    private boolean queries;
    private boolean subscriptions;

    public static class Builder {
        private boolean queries = false;
        private boolean mutations = false;
        private boolean subscriptions = false;

        public ClearCacheOptions build() {
            return new ClearCacheOptions(this.queries, this.mutations, this.subscriptions);
        }

        public Builder clearMutations() {
            this.mutations = true;
            return this;
        }

        public Builder clearQueries() {
            this.queries = true;
            return this;
        }

        public Builder clearSubscriptions() {
            this.subscriptions = true;
            return this;
        }
    }

    private ClearCacheOptions(boolean z9, boolean z10, boolean z11) {
        this.queries = z9;
        this.mutations = z10;
        this.subscriptions = z11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isMutations() {
        return this.mutations;
    }

    public boolean isQueries() {
        return this.queries;
    }

    public boolean isSubscriptions() {
        return this.subscriptions;
    }
}
