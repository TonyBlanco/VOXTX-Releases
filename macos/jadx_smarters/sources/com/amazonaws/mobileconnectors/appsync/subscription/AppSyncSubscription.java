package com.amazonaws.mobileconnectors.appsync.subscription;

import K1.a;
import android.util.Log;
import java.util.List;
import okio.BufferedSource;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncSubscription {
    t call;
    a parser;

    public static class Builder {
        t call;
        List<String> topics;

        public AppSyncSubscription build() {
            return new AppSyncSubscription(this);
        }

        public Builder call(t tVar) {
            this.call = tVar;
            return this;
        }

        public Builder topics(List<String> list) {
            this.topics = list;
            return this;
        }
    }

    private AppSyncSubscription(Builder builder) {
        t tVar = builder.call;
        this.call = tVar;
        this.parser = createMessageParser(tVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    private a createMessageParser(t tVar) {
        return new a(tVar, null, null, null);
    }

    public void parse(BufferedSource bufferedSource) throws Throwable {
        try {
            this.parser.f(bufferedSource);
        } catch (Exception e9) {
            Log.w("TAG", "Failed to parse subscription", e9);
        }
    }
}
