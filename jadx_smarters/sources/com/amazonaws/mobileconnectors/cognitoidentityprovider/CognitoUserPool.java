package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.content.Context;
import android.os.Handler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.handlers.SignUpHandler;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoDeviceHelper;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoPinpointSharedContext;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoSecretHash;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AnalyticsMetadataType;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.SignUpResult;
import com.amazonaws.services.cognitoidentityprovider.model.UserContextDataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CognitoUserPool {
    private static final String DEFAULT_SHARED_PREFERENCES_NAME = "CognitoIdentityProviderCache";
    private static final int USER_POOL_ID_MAX_LENGTH = 55;
    private static final String USER_POOL_ID_PATTERN = "^[\\w-]+_[0-9a-zA-Z]+$";
    private static final Log logger = LogFactory.getLog((Class<?>) CognitoUserPool.class);
    private boolean advancedSecurityDataCollectionFlag;
    AWSKeyValueStore awsKeyValueStore;
    private AmazonCognitoIdentityProvider client;
    private final String clientId;
    private final String clientSecret;
    private final Context context;
    private boolean isPersistenceEnabled;
    private String pinpointEndpointId;
    private String secretHash;
    private final String userPoolId;

    public CognitoUserPool(Context context, AWSConfiguration aWSConfiguration) {
        this.advancedSecurityDataCollectionFlag = true;
        this.isPersistenceEnabled = true;
        try {
            initialize(context);
            JSONObject jSONObjectOptJsonObject = aWSConfiguration.optJsonObject("CognitoUserPool");
            this.context = context;
            this.userPoolId = jSONObjectOptJsonObject.getString("PoolId");
            this.clientId = jSONObjectOptJsonObject.getString("AppClientId");
            this.clientSecret = jSONObjectOptJsonObject.optString("AppClientSecret");
            this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, jSONObjectOptJsonObject.optString("PinpointAppId"));
            ClientConfiguration clientConfiguration = new ClientConfiguration();
            clientConfiguration.setUserAgent(aWSConfiguration.getUserAgent());
            clientConfiguration.setUserAgentOverride(aWSConfiguration.getUserAgentOverride());
            AmazonCognitoIdentityProviderClient amazonCognitoIdentityProviderClient = new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(), clientConfiguration);
            this.client = amazonCognitoIdentityProviderClient;
            amazonCognitoIdentityProviderClient.setRegion(Region.getRegion(Regions.fromName(jSONObjectOptJsonObject.getString("Region"))));
        } catch (Exception e9) {
            throw new IllegalArgumentException("Failed to read PoolId, AppClientId, AppClientSecret, or Region from AWSConfiguration please check your setup or awsconfiguration.json file", e9);
        }
    }

    @Deprecated
    public CognitoUserPool(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, new ClientConfiguration(), Regions.US_EAST_1);
    }

    @Deprecated
    public CognitoUserPool(Context context, String str, String str2, String str3, ClientConfiguration clientConfiguration) {
        this(context, str, str2, str3, clientConfiguration, Regions.US_EAST_1);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, ClientConfiguration clientConfiguration, Regions regions) {
        this(context, str, str2, str3, clientConfiguration, regions, (String) null);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, ClientConfiguration clientConfiguration, Regions regions, String str4) {
        this.advancedSecurityDataCollectionFlag = true;
        this.isPersistenceEnabled = true;
        initialize(context);
        this.context = context;
        if (str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Both UserPoolId and ClientId are required.");
        }
        if (str.length() > USER_POOL_ID_MAX_LENGTH || !Pattern.matches(USER_POOL_ID_PATTERN, str)) {
            throw new IllegalArgumentException("Invalid userPoolId format.");
        }
        this.userPoolId = str;
        this.clientId = str2;
        this.clientSecret = str3;
        AmazonCognitoIdentityProviderClient amazonCognitoIdentityProviderClient = new AmazonCognitoIdentityProviderClient(new AnonymousAWSCredentials(), clientConfiguration);
        this.client = amazonCognitoIdentityProviderClient;
        amazonCognitoIdentityProviderClient.setRegion(Region.getRegion(regions));
        this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, str4);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, Regions regions) {
        this(context, str, str2, str3, new ClientConfiguration(), regions);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, Regions regions, String str4) {
        this(context, str, str2, str3, new ClientConfiguration(), regions, str4);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, AmazonCognitoIdentityProvider amazonCognitoIdentityProvider) {
        this(context, str, str2, str3, amazonCognitoIdentityProvider, (String) null);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, AmazonCognitoIdentityProvider amazonCognitoIdentityProvider, String str4) {
        this(context, str, str2, str3, amazonCognitoIdentityProvider, str4, (String) null);
    }

    public CognitoUserPool(Context context, String str, String str2, String str3, AmazonCognitoIdentityProvider amazonCognitoIdentityProvider, String str4, String str5) {
        this.advancedSecurityDataCollectionFlag = true;
        this.isPersistenceEnabled = true;
        initialize(context);
        this.context = context;
        if (str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Both UserPoolId and ClientId are required.");
        }
        if (str.length() > USER_POOL_ID_MAX_LENGTH || !Pattern.matches(USER_POOL_ID_PATTERN, str)) {
            throw new IllegalArgumentException("Invalid userPoolId format.");
        }
        this.userPoolId = str;
        this.clientId = str2;
        this.clientSecret = str3;
        this.client = amazonCognitoIdentityProvider;
        this.pinpointEndpointId = CognitoPinpointSharedContext.getPinpointEndpoint(context, str4);
        if (str5 == null || str5.isEmpty()) {
            return;
        }
        this.client.setEndpoint(str5);
    }

    private void initialize(Context context) {
        this.awsKeyValueStore = new AWSKeyValueStore(context, "CognitoIdentityProviderCache", this.isPersistenceEnabled);
        CognitoDeviceHelper.setPersistenceEnabled(this.isPersistenceEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SignUpResult signUpInternal(String str, String str2, CognitoUserAttributes cognitoUserAttributes, Map<String, String> map, Map<String, String> map2) {
        ArrayList arrayList;
        if (map != null) {
            arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                AttributeType attributeType = new AttributeType();
                attributeType.setName(entry.getKey());
                attributeType.setValue(entry.getValue());
                arrayList.add(attributeType);
            }
        } else {
            arrayList = null;
        }
        this.secretHash = CognitoSecretHash.getSecretHash(str, this.clientId, this.clientSecret);
        SignUpRequest signUpRequestWithUserContextData = new SignUpRequest().withUsername(str).withPassword(str2).withClientId(this.clientId).withSecretHash(this.secretHash).withUserAttributes(cognitoUserAttributes.getAttributesList()).withValidationData(arrayList).withClientMetadata(map2).withUserContextData(getUserContextData(str));
        String pinpointEndpointId = getPinpointEndpointId();
        if (pinpointEndpointId != null) {
            AnalyticsMetadataType analyticsMetadataType = new AnalyticsMetadataType();
            analyticsMetadataType.setAnalyticsEndpointId(pinpointEndpointId);
            signUpRequestWithUserContextData.setAnalyticsMetadata(analyticsMetadataType);
        }
        return this.client.signUp(signUpRequestWithUserContextData);
    }

    public String getClientId() {
        return this.clientId;
    }

    public CognitoUser getCurrentUser() {
        String str = "CognitoIdentityProvider." + this.clientId + ".LastAuthUser";
        return this.awsKeyValueStore.contains(str) ? getUser(this.awsKeyValueStore.get(str)) : getUser();
    }

    public String getPinpointEndpointId() {
        return this.pinpointEndpointId;
    }

    public CognitoUser getUser() {
        return new CognitoUser(this, null, this.clientId, this.clientSecret, null, this.client, this.context);
    }

    public CognitoUser getUser(String str) {
        if (str != null && !str.isEmpty()) {
            String str2 = this.clientId;
            String str3 = this.clientSecret;
            return new CognitoUser(this, str, str2, str3, CognitoSecretHash.getSecretHash(str, str2, str3), this.client, this.context);
        }
        return getUser();
    }

    public UserContextDataType getUserContextData(String str) {
        if (!this.advancedSecurityDataCollectionFlag) {
            return null;
        }
        String encodedContextData = UserContextDataProvider.getInstance().getEncodedContextData(this.context, str, getUserPoolId(), this.clientId);
        UserContextDataType userContextDataType = new UserContextDataType();
        userContextDataType.setEncodedData(encodedContextData);
        return userContextDataType;
    }

    public String getUserPoolId() {
        return this.userPoolId;
    }

    public void setAdvancedSecurityDataCollectionFlag(boolean z9) {
        this.advancedSecurityDataCollectionFlag = z9;
    }

    public void setIdentityProvider(AmazonCognitoIdentityProvider amazonCognitoIdentityProvider) {
        this.client = amazonCognitoIdentityProvider;
    }

    public void setPersistenceEnabled(boolean z9) {
        this.isPersistenceEnabled = z9;
        this.awsKeyValueStore.setPersistenceEnabled(z9);
        CognitoDeviceHelper.setPersistenceEnabled(z9);
    }

    public void signUp(String str, String str2, CognitoUserAttributes cognitoUserAttributes, Map<String, String> map, SignUpHandler signUpHandler) {
        signUp(str, str2, cognitoUserAttributes, map, Collections.emptyMap(), signUpHandler);
    }

    public void signUp(String str, String str2, CognitoUserAttributes cognitoUserAttributes, Map<String, String> map, Map<String, String> map2, SignUpHandler signUpHandler) {
        try {
            signUpHandler.onSuccess(getUser(str), signUpInternal(str, str2, cognitoUserAttributes, map, map2));
        } catch (Exception e9) {
            signUpHandler.onFailure(e9);
        }
    }

    public void signUpInBackground(String str, String str2, CognitoUserAttributes cognitoUserAttributes, Map<String, String> map, SignUpHandler signUpHandler) {
        signUpInBackground(str, str2, cognitoUserAttributes, map, Collections.emptyMap(), signUpHandler);
    }

    public void signUpInBackground(final String str, final String str2, final CognitoUserAttributes cognitoUserAttributes, final Map<String, String> map, final Map<String, String> map2, final SignUpHandler signUpHandler) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool.1
            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                Handler handler = new Handler(CognitoUserPool.this.context.getMainLooper());
                try {
                    final SignUpResult signUpResultSignUpInternal = CognitoUserPool.this.signUpInternal(str, str2, cognitoUserAttributes, map, map2);
                    final CognitoUser user = CognitoUserPool.this.getUser(str);
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            signUpHandler.onSuccess(user, signUpResultSignUpInternal);
                        }
                    };
                } catch (Exception e9) {
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoUserPool.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            signUpHandler.onFailure(e9);
                        }
                    };
                }
                handler.post(runnable);
            }
        }).start();
    }
}
