package com.amazonaws.mobileconnectors.appsync;

import A1.b;
import K1.d;
import M1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.cache.normalized.AppSyncStore;
import com.amazonaws.mobileconnectors.appsync.cache.normalized.sql.AppSyncSqlHelper;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.amazonaws.mobileconnectors.appsync.retry.RetryInterceptor;
import com.amazonaws.mobileconnectors.appsync.sigv4.APIKeyAuthProvider;
import com.amazonaws.mobileconnectors.appsync.sigv4.AWSLambdaAuthProvider;
import com.amazonaws.mobileconnectors.appsync.sigv4.AppSyncSigV4SignerInterceptor;
import com.amazonaws.mobileconnectors.appsync.sigv4.BasicAPIKeyAuthProvider;
import com.amazonaws.mobileconnectors.appsync.sigv4.CognitoUserPoolsAuthProvider;
import com.amazonaws.mobileconnectors.appsync.sigv4.OidcAuthProvider;
import com.amazonaws.mobileconnectors.appsync.subscription.RealSubscriptionManager;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import u1.C2842a;
import u1.InterfaceC2843b;
import u1.InterfaceC2844c;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.h;
import v1.k;
import v1.r;
import v1.s;
import v1.t;
import y1.C2982a;
import z1.AbstractC3004c;
import z1.AbstractC3008g;
import z1.C3003b;

/* JADX INFO: loaded from: classes.dex */
public class AWSAppSyncClient {
    static final String CLIENT_DATABAE_PREFIX_PATTERN = "^[_a-zA-Z0-9]+$";
    static final String DATABASE_NAME_DELIMITER = "_";
    static final String DEFAULT_DELTA_SYNC_SQL_STORE_NAME = "appsync_deltasync_db";
    static final String DEFAULT_MUTATION_SQL_STORE_NAME = "appsyncstore_mutation";
    static final String DEFAULT_QUERY_SQL_STORE_NAME = "appsyncstore";
    private Context applicationContext;
    String clientDatabasePrefix;
    String deltaSyncSqlStoreName;
    C2842a mApolloClient;
    private AppSyncOfflineMutationManager mAppSyncOfflineMutationManager;
    r mS3ObjectManager;
    AppSyncStore mSyncStore;
    String mutationSqlStoreName;
    private Map<InterfaceC2867e, MutationInformation> mutationsToRetryAfterConflictResolution;
    String querySqlStoreName;
    private final WebSocketConnectionManager webSocketConnectionManager;
    static Map<String, String> prefixMap = new ConcurrentHashMap();
    private static final String TAG = AWSAppSyncClient.class.getSimpleName();

    public class AWSAppSyncDeltaSyncWatcher implements a {
        boolean canceled = false;
        long id;

        public AWSAppSyncDeltaSyncWatcher(long j9) {
            this.id = j9;
        }

        public void cancel() {
            if (this.canceled) {
                return;
            }
            AWSAppSyncDeltaSync.cancel(Long.valueOf(this.id));
            this.canceled = true;
        }

        public boolean isCanceled() {
            return this.canceled;
        }
    }

    public enum AuthMode {
        API_KEY("API_KEY"),
        AWS_IAM("AWS_IAM"),
        AMAZON_COGNITO_USER_POOLS("AMAZON_COGNITO_USER_POOLS"),
        OPENID_CONNECT("OPENID_CONNECT"),
        AWS_LAMBDA("AWS_LAMBDA");

        private final String name;

        AuthMode(String str) {
            this.name = str;
        }

        public static AuthMode fromName(String str) {
            for (AuthMode authMode : values()) {
                if (str.equals(authMode.getName())) {
                    return authMode;
                }
            }
            throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
        }

        public String getName() {
            return this.name;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public static class Builder {
        final Map<s, InterfaceC2843b> customTypeAdapters;
        AWSLambdaAuthProvider mAWSLambdaAuthProvider;
        APIKeyAuthProvider mApiKey;
        AWSConfiguration mAwsConfiguration;
        C2982a mCacheHeaders;
        String mClientDatabasePrefix;
        CognitoUserPoolsAuthProvider mCognitoUserPoolsAuthProvider;
        ConflictResolverInterface mConflictResolver;
        Context mContext;
        AWSCredentialsProvider mCredentialsProvider;
        C1.a mDefaultResponseFetcher;
        Executor mDispatcher;
        long mMutationQueueExecutionTimeout;
        AbstractC3008g mNormalizedCacheFactory;
        OidcAuthProvider mOidcAuthProvider;
        OkHttpClient mOkHttpClient;
        PersistentMutationsCallback mPersistentMutationsCallback;
        Regions mRegion;
        AbstractC3004c mResolver;
        r mS3ObjectManager;
        String mServerUrl;
        boolean mSubscriptionsAutoReconnect;
        boolean mUseClientDatabasePrefix;

        private Builder() {
            this.mSubscriptionsAutoReconnect = true;
            this.mMutationQueueExecutionTimeout = 300000L;
            this.customTypeAdapters = new LinkedHashMap();
            this.mDefaultResponseFetcher = AppSyncResponseFetchers.CACHE_FIRST;
        }

        public <T> Builder addCustomTypeAdapter(s sVar, InterfaceC2843b interfaceC2843b) {
            this.customTypeAdapters.put(sVar, interfaceC2843b);
            return this;
        }

        public Builder apiKey(APIKeyAuthProvider aPIKeyAuthProvider) {
            this.mApiKey = aPIKeyAuthProvider;
            return this;
        }

        public Builder awsConfiguration(AWSConfiguration aWSConfiguration) {
            this.mAwsConfiguration = aWSConfiguration;
            return this;
        }

        public Builder awsLamdbaAuthProvider(AWSLambdaAuthProvider aWSLambdaAuthProvider) {
            this.mAWSLambdaAuthProvider = aWSLambdaAuthProvider;
            return this;
        }

        public AWSAppSyncClient build() {
            Object next;
            AuthMode authMode;
            String str;
            String str2;
            if (this.mContext == null) {
                throw new RuntimeException("A valid Android Context is required.");
            }
            HashMap map = new HashMap();
            APIKeyAuthProvider aPIKeyAuthProvider = this.mApiKey;
            AuthMode authMode2 = AuthMode.API_KEY;
            map.put(aPIKeyAuthProvider, authMode2);
            map.put(this.mCredentialsProvider, AuthMode.AWS_IAM);
            map.put(this.mCognitoUserPoolsAuthProvider, AuthMode.AMAZON_COGNITO_USER_POOLS);
            map.put(this.mOidcAuthProvider, AuthMode.OPENID_CONNECT);
            map.put(this.mAWSLambdaAuthProvider, AuthMode.AWS_LAMBDA);
            map.remove(null);
            if (map.size() > 1) {
                throw new RuntimeException("More than one AuthMode has been passed in to the builder. " + map.values().toString() + ". Please pass in exactly one AuthMode into the builder.");
            }
            Iterator it = map.keySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                authMode = (AuthMode) map.get(next);
            } else {
                next = null;
                authMode = null;
            }
            AWSConfiguration aWSConfiguration = this.mAwsConfiguration;
            if (aWSConfiguration != null) {
                try {
                    JSONObject jSONObjectOptJsonObject = aWSConfiguration.optJsonObject("AppSync");
                    if (jSONObjectOptJsonObject == null) {
                        throw new RuntimeException("AppSync configuration is missing from awsconfiguration.json");
                    }
                    String string = this.mServerUrl;
                    if (string == null) {
                        string = jSONObjectOptJsonObject.getString("ApiUrl");
                    }
                    this.mServerUrl = string;
                    Regions regionsFromName = this.mRegion;
                    if (regionsFromName == null) {
                        regionsFromName = Regions.fromName(jSONObjectOptJsonObject.getString("Region"));
                    }
                    this.mRegion = regionsFromName;
                    if (this.mUseClientDatabasePrefix && this.mClientDatabasePrefix == null) {
                        try {
                            this.mClientDatabasePrefix = jSONObjectOptJsonObject.getString("ClientDatabasePrefix");
                        } catch (Exception unused) {
                            Log.e(AWSAppSyncClient.TAG, "Error is reading the ClientDatabasePrefix from AppSync configuration in awsconfiguration.json.");
                            throw new RuntimeException("ClientDatabasePrefix is not present in AppSync configuration in awsconfiguration.json however .useClientDatabasePrefix(true) is passed in.");
                        }
                    }
                    AuthMode authModeFromName = AuthMode.fromName(jSONObjectOptJsonObject.getString("AuthMode"));
                    if (next == null && authModeFromName.equals(authMode2)) {
                        BasicAPIKeyAuthProvider basicAPIKeyAuthProvider = new BasicAPIKeyAuthProvider(jSONObjectOptJsonObject.getString("ApiKey"));
                        this.mApiKey = basicAPIKeyAuthProvider;
                        map.put(basicAPIKeyAuthProvider, authMode2);
                        authMode = authModeFromName;
                    }
                    if (!authModeFromName.equals(authMode)) {
                        throw new RuntimeException("Found conflicting AuthMode. Should be " + authModeFromName.toString() + " but you selected " + authMode.toString());
                    }
                } catch (Exception e9) {
                    throw new RuntimeException("Please check the AppSync configuration in awsconfiguration.json.", e9);
                }
            }
            if (map.size() == 0) {
                throw new RuntimeException("No valid AuthMode object is passed in to the builder.");
            }
            if (this.mUseClientDatabasePrefix && ((str2 = this.mClientDatabasePrefix) == null || StringUtils.isBlank(str2))) {
                throw new RuntimeException("Please pass in a valid ClientDatabasePrefix when useClientDatabasePrefix is true.");
            }
            if (!this.mUseClientDatabasePrefix && (str = this.mClientDatabasePrefix) != null && !StringUtils.isBlank(str)) {
                Log.w(AWSAppSyncClient.TAG, "A ClientDatabasePrefix is passed in however useClientDatabasePrefix is false.");
                this.mClientDatabasePrefix = null;
            }
            if (this.mUseClientDatabasePrefix) {
                if (this.mClientDatabasePrefix != null && !Pattern.compile(AWSAppSyncClient.CLIENT_DATABAE_PREFIX_PATTERN).matcher(this.mClientDatabasePrefix).matches()) {
                    throw new RuntimeException("ClientDatabasePrefix validation failed. Please pass in characters that matches the pattern: ^[_a-zA-Z0-9]+$");
                }
                String str3 = AWSAppSyncClient.prefixMap.get(this.mClientDatabasePrefix);
                if (str3 != null) {
                    if (!str3.equals(this.mServerUrl + AWSAppSyncClient.DATABASE_NAME_DELIMITER + authMode)) {
                        throw new RuntimeException("ClientDatabasePrefix validation failed. The ClientDatabasePrefix " + this.mClientDatabasePrefix + " is already used by an other AWSAppSyncClient object with API Server Url: " + this.mServerUrl + " with authMode: " + authMode);
                    }
                } else {
                    AWSAppSyncClient.prefixMap.put(this.mClientDatabasePrefix, this.mServerUrl + AWSAppSyncClient.DATABASE_NAME_DELIMITER + authMode);
                }
            }
            if (this.mResolver == null) {
                this.mResolver = new AbstractC3004c() { // from class: com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient.Builder.1
                    private C3003b formatCacheKey(String str4) {
                        return (str4 == null || str4.isEmpty()) ? C3003b.f52622b : C3003b.a(str4);
                    }

                    @Override // z1.AbstractC3004c
                    public C3003b fromFieldArguments(k kVar, InterfaceC2868f.b bVar) {
                        return formatCacheKey((String) kVar.j(Name.MARK, bVar));
                    }

                    @Override // z1.AbstractC3004c
                    public C3003b fromFieldRecordSet(k kVar, Map<String, Object> map2) {
                        return formatCacheKey((String) map2.get(Name.MARK));
                    }
                };
            }
            return new AWSAppSyncClient(this);
        }

        public Builder clientDatabasePrefix(String str) {
            this.mClientDatabasePrefix = str;
            return this;
        }

        public Builder cognitoUserPoolsAuthProvider(CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider) {
            this.mCognitoUserPoolsAuthProvider = cognitoUserPoolsAuthProvider;
            return this;
        }

        public Builder conflictResolver(ConflictResolverInterface conflictResolverInterface) {
            this.mConflictResolver = conflictResolverInterface;
            return this;
        }

        public Builder context(Context context) {
            this.mContext = context;
            return this;
        }

        public Builder credentialsProvider(AWSCredentialsProvider aWSCredentialsProvider) {
            this.mCredentialsProvider = aWSCredentialsProvider;
            return this;
        }

        public Builder defaultCacheHeaders(C2982a c2982a) {
            this.mCacheHeaders = c2982a;
            return this;
        }

        public Builder defaultResponseFetcher(C1.a aVar) {
            this.mDefaultResponseFetcher = aVar;
            return this;
        }

        public Builder dispatcher(Executor executor) {
            this.mDispatcher = executor;
            return this;
        }

        public Builder mutationQueueExecutionTimeout(long j9) {
            this.mMutationQueueExecutionTimeout = j9;
            return this;
        }

        public Builder normalizedCache(AbstractC3008g abstractC3008g) {
            this.mNormalizedCacheFactory = abstractC3008g;
            return this;
        }

        public Builder oidcAuthProvider(OidcAuthProvider oidcAuthProvider) {
            this.mOidcAuthProvider = oidcAuthProvider;
            return this;
        }

        public Builder okHttpClient(OkHttpClient okHttpClient) {
            this.mOkHttpClient = okHttpClient;
            return this;
        }

        public Builder persistentMutationsCallback(PersistentMutationsCallback persistentMutationsCallback) {
            this.mPersistentMutationsCallback = persistentMutationsCallback;
            return this;
        }

        public Builder region(Regions regions) {
            this.mRegion = regions;
            return this;
        }

        public Builder resolver(AbstractC3004c abstractC3004c) {
            this.mResolver = abstractC3004c;
            return this;
        }

        public Builder s3ObjectManager(r rVar) {
            this.mS3ObjectManager = rVar;
            return this;
        }

        public Builder serverUrl(String str) {
            this.mServerUrl = str;
            return this;
        }

        public Builder subscriptionsAutoReconnect(boolean z9) {
            this.mSubscriptionsAutoReconnect = z9;
            return this;
        }

        public Builder useClientDatabasePrefix(boolean z9) {
            this.mUseClientDatabasePrefix = z9;
            return this;
        }
    }

    private AWSAppSyncClient(Builder builder) {
        AppSyncSigV4SignerInterceptor appSyncSigV4SignerInterceptor;
        this.mAppSyncOfflineMutationManager = null;
        this.querySqlStoreName = DEFAULT_QUERY_SQL_STORE_NAME;
        this.mutationSqlStoreName = DEFAULT_MUTATION_SQL_STORE_NAME;
        this.deltaSyncSqlStoreName = DEFAULT_DELTA_SYNC_SQL_STORE_NAME;
        this.applicationContext = builder.mContext.getApplicationContext();
        String str = builder.mClientDatabasePrefix;
        if (str != null) {
            this.clientDatabasePrefix = str;
            this.querySqlStoreName = this.clientDatabasePrefix + DATABASE_NAME_DELIMITER + DEFAULT_QUERY_SQL_STORE_NAME;
            this.mutationSqlStoreName = this.clientDatabasePrefix + DATABASE_NAME_DELIMITER + DEFAULT_MUTATION_SQL_STORE_NAME;
            this.deltaSyncSqlStoreName = this.clientDatabasePrefix + DATABASE_NAME_DELIMITER + DEFAULT_DELTA_SYNC_SQL_STORE_NAME;
        }
        if (builder.mCredentialsProvider != null) {
            appSyncSigV4SignerInterceptor = new AppSyncSigV4SignerInterceptor(builder.mCredentialsProvider, builder.mRegion.getName());
        } else if (builder.mCognitoUserPoolsAuthProvider != null) {
            appSyncSigV4SignerInterceptor = new AppSyncSigV4SignerInterceptor(builder.mCognitoUserPoolsAuthProvider, builder.mRegion.getName());
        } else if (builder.mOidcAuthProvider != null) {
            appSyncSigV4SignerInterceptor = new AppSyncSigV4SignerInterceptor(builder.mOidcAuthProvider);
        } else if (builder.mAWSLambdaAuthProvider != null) {
            appSyncSigV4SignerInterceptor = new AppSyncSigV4SignerInterceptor(builder.mAWSLambdaAuthProvider);
        } else {
            if (builder.mApiKey == null) {
                throw new RuntimeException("Client requires credentials. Please use #apiKey() #credentialsProvider() or #cognitoUserPoolsAuthProvider() to set the credentials.");
            }
            appSyncSigV4SignerInterceptor = new AppSyncSigV4SignerInterceptor(builder.mApiKey, builder.mRegion.getName(), getClientSubscriptionUUID(builder.mApiKey.getAPIKey()));
        }
        OkHttpClient okHttpClient = builder.mOkHttpClient;
        OkHttpClient okHttpClientBuild = (okHttpClient == null ? new OkHttpClient.Builder() : okHttpClient.newBuilder()).addInterceptor(new RetryInterceptor()).addInterceptor(appSyncSigV4SignerInterceptor).build();
        if (builder.mNormalizedCacheFactory == null) {
            builder.mNormalizedCacheFactory = new b(AppSyncSqlHelper.create(this.applicationContext, this.querySqlStoreName));
        }
        AppSyncMutationSqlCacheOperations appSyncMutationSqlCacheOperations = new AppSyncMutationSqlCacheOperations(new AppSyncMutationsSqlHelper(builder.mContext, this.mutationSqlStoreName));
        this.mutationsToRetryAfterConflictResolution = new HashMap();
        AppSyncOptimisticUpdateInterceptor appSyncOptimisticUpdateInterceptor = new AppSyncOptimisticUpdateInterceptor();
        this.mAppSyncOfflineMutationManager = new AppSyncOfflineMutationManager(builder.mContext, builder.customTypeAdapters, appSyncMutationSqlCacheOperations, new AppSyncCustomNetworkInvoker(HttpUrl.parse(builder.mServerUrl), okHttpClientBuild, new d(builder.customTypeAdapters), builder.mPersistentMutationsCallback, builder.mS3ObjectManager));
        C2842a.b bVarJ = C2842a.b().k(builder.mServerUrl).i(builder.mNormalizedCacheFactory, builder.mResolver).a(appSyncOptimisticUpdateInterceptor).a(new AppSyncOfflineMutationInterceptor(this.mAppSyncOfflineMutationManager, false, builder.mContext, this.mutationsToRetryAfterConflictResolution, this, builder.mConflictResolver, builder.mMutationQueueExecutionTimeout)).a(new AppSyncComplexObjectsInterceptor(builder.mS3ObjectManager)).j(okHttpClientBuild);
        for (s sVar : builder.customTypeAdapters.keySet()) {
            bVarJ.b(sVar, builder.customTypeAdapters.get(sVar));
        }
        Executor executor = builder.mDispatcher;
        if (executor != null) {
            bVarJ.h(executor);
        }
        C2982a c2982a = builder.mCacheHeaders;
        if (c2982a != null) {
            bVarJ.e(c2982a);
        }
        C1.a aVar = builder.mDefaultResponseFetcher;
        if (aVar != null) {
            bVarJ.g(aVar);
        }
        RealSubscriptionManager realSubscriptionManager = new RealSubscriptionManager(builder.mContext.getApplicationContext(), builder.mSubscriptionsAutoReconnect);
        bVarJ.l(realSubscriptionManager);
        C2842a c2842aC = bVarJ.c();
        this.mApolloClient = c2842aC;
        realSubscriptionManager.setApolloClient(c2842aC);
        this.mSyncStore = new AppSyncStore(this.mApolloClient.a());
        appSyncOptimisticUpdateInterceptor.setStore(this.mApolloClient.a());
        realSubscriptionManager.setStore(this.mApolloClient.a());
        realSubscriptionManager.setScalarTypeAdapters(new d(builder.customTypeAdapters));
        this.mS3ObjectManager = builder.mS3ObjectManager;
        this.webSocketConnectionManager = new WebSocketConnectionManager(this.applicationContext, builder.mServerUrl, new SubscriptionAuthorizer(builder), new ApolloResponseBuilder(builder.customTypeAdapters, this.mApolloClient.a().j()), builder.mSubscriptionsAutoReconnect);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void clearDeltaSyncStore() {
        Log.d(TAG, "Clearing the delta sync store.");
        new AWSAppSyncDeltaSyncDBOperations(new AWSAppSyncDeltaSyncSqlHelper(this.applicationContext, this.deltaSyncSqlStoreName)).clearDeltaSyncStore();
    }

    private String getClientSubscriptionUUID(String str) {
        String string = null;
        try {
            SharedPreferences sharedPreferences = this.applicationContext.getSharedPreferences("com.amazonaws.mobileconnectors.appsync", 0);
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.reset();
            String hex = BinaryUtils.toHex(messageDigest.digest(str.getBytes()));
            String string2 = sharedPreferences.getString(hex, null);
            if (string2 != null) {
                return string2;
            }
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(hex, string);
            return string;
        } catch (NoSuchAlgorithmException e9) {
            String str2 = TAG;
            Log.e(str2, "Error getting Subscription UUID " + e9.getLocalizedMessage());
            Log.e(str2, "Proceeding without Subscription UUID");
            return string;
        }
    }

    public void clearCaches() throws ClearCacheException {
        clearCaches(ClearCacheOptions.builder().clearQueries().clearMutations().clearSubscriptions().build());
    }

    public void clearCaches(ClearCacheOptions clearCacheOptions) throws ClearCacheException {
        ClearCacheException clearCacheException = new ClearCacheException("Error in clearing the cache(s).");
        try {
            if (clearCacheOptions.isQueries()) {
                Log.d(TAG, "Clearing the query cache.");
                this.mSyncStore.clearAll().c();
            }
        } catch (Exception e9) {
            clearCacheException.addException(e9);
        }
        try {
            if (clearCacheOptions.isMutations()) {
                Log.d(TAG, "Clearing the mutations queue.");
                clearMutationQueue();
            }
        } catch (Exception e10) {
            clearCacheException.addException(e10);
        }
        try {
            if (clearCacheOptions.isSubscriptions()) {
                Log.d(TAG, "Clearing the delta sync subscriptions metadata cache.");
                clearDeltaSyncStore();
            }
        } catch (Exception e11) {
            clearCacheException.addException(e11);
        }
        if (clearCacheException.getExceptions() != null) {
            throw clearCacheException;
        }
    }

    @Deprecated
    public void clearMutationQueue() {
        this.mAppSyncOfflineMutationManager.clearMutationQueue();
    }

    public r getS3ObjectManager() {
        return this.mS3ObjectManager;
    }

    public AppSyncStore getStore() {
        return this.mSyncStore;
    }

    public boolean isMutationQueueEmpty() {
        AppSyncOfflineMutationManager appSyncOfflineMutationManager = this.mAppSyncOfflineMutationManager;
        if (appSyncOfflineMutationManager != null) {
            return appSyncOfflineMutationManager.mutationQueueEmpty();
        }
        return true;
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e) {
        return mutate(interfaceC2867e, false);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e, D d9) {
        return mutate(interfaceC2867e, d9, false);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e, D d9, boolean z9) {
        if (z9) {
            this.mutationsToRetryAfterConflictResolution.put(interfaceC2867e, null);
        }
        return this.mApolloClient.mutate(interfaceC2867e, d9);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e, boolean z9) {
        if (z9) {
            this.mutationsToRetryAfterConflictResolution.put(interfaceC2867e, null);
        }
        return this.mApolloClient.mutate(interfaceC2867e);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncQueryCall<T> query(h hVar) {
        return this.mApolloClient.query(hVar);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncSubscriptionCall<T> subscribe(t tVar) {
        return new AppSyncWebSocketSubscriptionCall(tVar, this.webSocketConnectionManager);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> a sync(h hVar, InterfaceC2844c.a aVar, long j9) {
        return sync(hVar, aVar, null, null, null, null, j9);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> a sync(h hVar, InterfaceC2844c.a aVar, h hVar2, InterfaceC2844c.a aVar2, long j9) {
        return sync(hVar, aVar, null, null, hVar2, aVar2, j9);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> a sync(h hVar, InterfaceC2844c.a aVar, t tVar, AppSyncSubscriptionCall.Callback callback) {
        return sync(hVar, aVar, tVar, callback, null, null, 0L);
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> a sync(h hVar, InterfaceC2844c.a aVar, t tVar, AppSyncSubscriptionCall.Callback callback, h hVar2, InterfaceC2844c.a aVar2, long j9) {
        AWSAppSyncDeltaSync aWSAppSyncDeltaSync = new AWSAppSyncDeltaSync(hVar, this, this.applicationContext);
        aWSAppSyncDeltaSync.setBaseQueryCallback(aVar);
        aWSAppSyncDeltaSync.setSubscription(tVar);
        aWSAppSyncDeltaSync.setSubscriptionCallback(callback);
        if (hVar2 == null || aVar2 == null) {
            Log.d(TAG, "One of the following is null - Delta Query or Delta Query callback. Will switch to using the base query & callback");
            aWSAppSyncDeltaSync.setDeltaQuery(hVar);
            aWSAppSyncDeltaSync.setDeltaQueryCallback(aVar);
        } else {
            aWSAppSyncDeltaSync.setDeltaQuery(hVar2);
            aWSAppSyncDeltaSync.setDeltaQueryCallback(aVar2);
        }
        aWSAppSyncDeltaSync.setBaseRefreshIntervalInSeconds(j9);
        return new AWSAppSyncDeltaSyncWatcher(aWSAppSyncDeltaSync.execute(false).longValue());
    }
}
