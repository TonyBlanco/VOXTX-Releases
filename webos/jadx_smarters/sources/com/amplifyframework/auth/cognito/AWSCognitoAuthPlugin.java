package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.HostedUIOptions;
import com.amazonaws.mobile.client.SignInUIOptions;
import com.amazonaws.mobile.client.SignOutOptions;
import com.amazonaws.mobile.client.UserState;
import com.amazonaws.mobile.client.UserStateDetails;
import com.amazonaws.mobile.client.UserStateListener;
import com.amazonaws.mobile.client.results.Device;
import com.amazonaws.mobile.client.results.ForgotPasswordResult;
import com.amazonaws.mobile.client.results.ForgotPasswordState;
import com.amazonaws.mobile.client.results.ListDevicesResult;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.SignUpResult;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.client.results.UserCodeDeliveryDetails;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthNavigationException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoJWTParser;
import com.amazonaws.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthPlugin;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendSignUpCodeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResetPasswordOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignOutOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthWebUISignInOptions;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.auth.cognito.util.AuthProviderConverter;
import com.amplifyframework.auth.cognito.util.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.cognito.util.SignInStateConverter;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import com.amplifyframework.auth.result.step.AuthResetPasswordStep;
import com.amplifyframework.auth.result.step.AuthSignInStep;
import com.amplifyframework.auth.result.step.AuthSignUpStep;
import com.amplifyframework.auth.result.step.AuthUpdateAttributeStep;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.util.UserAgent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthPlugin extends AuthPlugin<AWSMobileClient> {
    private static final String AWS_COGNITO_AUTH_PLUGIN_KEY = "awsCognitoAuthPlugin";
    private static final String COGNITO_USER_ID_ATTRIBUTE = "sub";
    private static final String MOBILE_CLIENT_TOKEN_KEY = "token";
    private static final long SECONDS_BEFORE_TIMEOUT = 10;
    public static final int WEB_UI_SIGN_IN_ACTIVITY_CODE = 49281;
    private AWSMobileClient awsMobileClient;
    private AuthChannelEventName lastEvent;
    private String userId;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$1, reason: invalid class name */
    public class AnonymousClass1 implements Callback<UserStateDetails> {
        final /* synthetic */ AtomicReference val$asyncException;
        final /* synthetic */ CountDownLatch val$latch;

        public AnonymousClass1(CountDownLatch countDownLatch, AtomicReference atomicReference) {
            this.val$latch = countDownLatch;
            this.val$asyncException = atomicReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$null$0() {
            AuthChannelEventName authChannelEventName = AWSCognitoAuthPlugin.this.lastEvent;
            AuthChannelEventName authChannelEventName2 = AuthChannelEventName.SIGNED_IN;
            if (authChannelEventName != authChannelEventName2) {
                AWSCognitoAuthPlugin.this.lastEvent = authChannelEventName2;
                Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(authChannelEventName2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$null$1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResult$2(UserStateDetails userStateDetails) {
            AuthChannelEventName authChannelEventName;
            int i9 = AnonymousClass25.$SwitchMap$com$amazonaws$mobile$client$UserState[userStateDetails.getUserState().ordinal()];
            if (i9 == 1 || i9 == 2) {
                AWSCognitoAuthPlugin.this.userId = null;
                AuthChannelEventName authChannelEventName2 = AWSCognitoAuthPlugin.this.lastEvent;
                authChannelEventName = AuthChannelEventName.SIGNED_OUT;
                if (authChannelEventName2 == authChannelEventName) {
                    return;
                }
            } else {
                if (i9 == 3) {
                    AWSCognitoAuthPlugin.this.fetchAndSetUserId(new Action() { // from class: com.amplifyframework.auth.cognito.b
                        @Override // com.amplifyframework.core.Action
                        public final void call() {
                            this.f18390a.lambda$null$0();
                        }
                    });
                    return;
                }
                if (i9 != 4 && i9 != 5) {
                    AWSCognitoAuthPlugin.this.userId = null;
                    return;
                }
                AWSCognitoAuthPlugin.this.fetchAndSetUserId(new Action() { // from class: com.amplifyframework.auth.cognito.c
                    @Override // com.amplifyframework.core.Action
                    public final void call() {
                        AWSCognitoAuthPlugin.AnonymousClass1.lambda$null$1();
                    }
                });
                AuthChannelEventName authChannelEventName3 = AWSCognitoAuthPlugin.this.lastEvent;
                authChannelEventName = AuthChannelEventName.SESSION_EXPIRED;
                if (authChannelEventName3 == authChannelEventName) {
                    return;
                }
            }
            AWSCognitoAuthPlugin.this.lastEvent = authChannelEventName;
            Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(authChannelEventName));
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onError(Exception exc) {
            this.val$asyncException.set(exc);
            this.val$latch.countDown();
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onResult(UserStateDetails userStateDetails) {
            AWSCognitoAuthPlugin aWSCognitoAuthPlugin;
            AuthChannelEventName authChannelEventName;
            int i9 = AnonymousClass25.$SwitchMap$com$amazonaws$mobile$client$UserState[userStateDetails.getUserState().ordinal()];
            if (i9 == 1 || i9 == 2) {
                AWSCognitoAuthPlugin.this.lastEvent = AuthChannelEventName.SIGNED_OUT;
                AWSCognitoAuthPlugin.this.userId = null;
            } else {
                if (i9 == 3) {
                    aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
                    authChannelEventName = AuthChannelEventName.SIGNED_IN;
                } else if (i9 == 4 || i9 == 5) {
                    aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
                    authChannelEventName = AuthChannelEventName.SESSION_EXPIRED;
                } else {
                    AWSCognitoAuthPlugin.this.userId = null;
                    AWSCognitoAuthPlugin.this.lastEvent = null;
                }
                aWSCognitoAuthPlugin.lastEvent = authChannelEventName;
                AWSCognitoAuthPlugin aWSCognitoAuthPlugin2 = AWSCognitoAuthPlugin.this;
                aWSCognitoAuthPlugin2.userId = aWSCognitoAuthPlugin2.getUserIdFromToken(userStateDetails.getDetails().get("token"));
            }
            AWSCognitoAuthPlugin.this.awsMobileClient.addUserStateListener(new UserStateListener() { // from class: com.amplifyframework.auth.cognito.a
                @Override // com.amazonaws.mobile.client.UserStateListener
                public final void onUserStateChanged(UserStateDetails userStateDetails2) {
                    this.f18389a.lambda$onResult$2(userStateDetails2);
                }
            });
            this.val$latch.countDown();
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$23, reason: invalid class name */
    public class AnonymousClass23 implements Callback<UserStateDetails> {
        final /* synthetic */ Consumer val$onException;
        final /* synthetic */ Consumer val$onSuccess;

        public AnonymousClass23(Consumer consumer, Consumer consumer2) {
            this.val$onSuccess = consumer;
            this.val$onException = consumer2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResult$0(Consumer consumer, UserStateDetails userStateDetails) {
            consumer.accept(new AuthSignInResult(UserState.SIGNED_IN.equals(userStateDetails.getUserState()), new AuthNextSignInStep(AuthSignInStep.DONE, userStateDetails.getDetails(), null)));
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onError(Exception exc) {
            Consumer consumer;
            Throwable authException;
            if (exc instanceof AuthNavigationException) {
                consumer = this.val$onException;
                authException = new AuthException.UserCancelledException("The user cancelled the sign-in attempt, so it did not complete.", exc, "To recover: catch this error, and show the sign-in screen again.");
            } else {
                consumer = this.val$onException;
                authException = new AuthException("Sign-in with web UI failed", exc, "See attached exception for more details");
            }
            consumer.accept(authException);
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onResult(final UserStateDetails userStateDetails) {
            AWSCognitoAuthPlugin aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
            final Consumer consumer = this.val$onSuccess;
            aWSCognitoAuthPlugin.fetchAndSetUserId(new Action() { // from class: com.amplifyframework.auth.cognito.d
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    AWSCognitoAuthPlugin.AnonymousClass23.lambda$onResult$0(consumer, userStateDetails);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$25, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass25 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobile$client$UserState;

        static {
            int[] iArr = new int[UserState.values().length];
            $SwitchMap$com$amazonaws$mobile$client$UserState = iArr;
            try {
                iArr[UserState.GUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$UserState[UserState.SIGNED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$UserState[UserState.SIGNED_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$UserState[UserState.SIGNED_OUT_USER_POOLS_TOKENS_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazonaws$mobile$client$UserState[UserState.SIGNED_OUT_FEDERATED_TOKENS_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$5, reason: invalid class name */
    public class AnonymousClass5 implements Callback<SignInResult> {
        final /* synthetic */ Consumer val$onException;
        final /* synthetic */ Consumer val$onSuccess;

        public AnonymousClass5(Consumer consumer, Consumer consumer2) {
            this.val$onSuccess = consumer;
            this.val$onException = consumer2;
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onError(Exception exc) {
            this.val$onException.accept(CognitoAuthExceptionConverter.lookup(exc, "Sign in failed"));
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onResult(SignInResult signInResult) {
            try {
                final AuthSignInResult authSignInResultConvertSignInResult = AWSCognitoAuthPlugin.this.convertSignInResult(signInResult);
                AWSCognitoAuthPlugin aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
                final Consumer consumer = this.val$onSuccess;
                aWSCognitoAuthPlugin.fetchAndSetUserId(new Action() { // from class: com.amplifyframework.auth.cognito.e
                    @Override // com.amplifyframework.core.Action
                    public final void call() {
                        consumer.accept(authSignInResultConvertSignInResult);
                    }
                });
            } catch (AuthException e9) {
                this.val$onException.accept(e9);
            }
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$6, reason: invalid class name */
    public class AnonymousClass6 implements Callback<SignInResult> {
        final /* synthetic */ Consumer val$onException;
        final /* synthetic */ Consumer val$onSuccess;

        public AnonymousClass6(Consumer consumer, Consumer consumer2) {
            this.val$onSuccess = consumer;
            this.val$onException = consumer2;
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onError(Exception exc) {
            this.val$onException.accept(CognitoAuthExceptionConverter.lookup(exc, "Confirm sign in failed"));
        }

        @Override // com.amazonaws.mobile.client.Callback
        public void onResult(SignInResult signInResult) {
            try {
                final AuthSignInResult authSignInResultConvertSignInResult = AWSCognitoAuthPlugin.this.convertSignInResult(signInResult);
                AWSCognitoAuthPlugin aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
                final Consumer consumer = this.val$onSuccess;
                aWSCognitoAuthPlugin.fetchAndSetUserId(new Action() { // from class: com.amplifyframework.auth.cognito.f
                    @Override // com.amplifyframework.core.Action
                    public final void call() {
                        consumer.accept(authSignInResultConvertSignInResult);
                    }
                });
            } catch (AuthException e9) {
                this.val$onException.accept(e9);
            }
        }
    }

    public AWSCognitoAuthPlugin() {
        this.awsMobileClient = AWSMobileClient.getInstance();
    }

    public AWSCognitoAuthPlugin(AWSMobileClient aWSMobileClient, String str) {
        this.awsMobileClient = aWSMobileClient;
        this.userId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AuthCodeDeliveryDetails convertCodeDeliveryDetails(UserCodeDeliveryDetails userCodeDeliveryDetails) {
        if (userCodeDeliveryDetails != null) {
            return new AuthCodeDeliveryDetails(userCodeDeliveryDetails.getDestination(), AuthCodeDeliveryDetails.DeliveryMedium.fromString(userCodeDeliveryDetails.getDeliveryMedium()), userCodeDeliveryDetails.getAttributeName());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AuthSignInResult convertSignInResult(SignInResult signInResult) throws AuthException {
        return new AuthSignInResult(SignInState.DONE.equals(signInResult.getSignInState()), new AuthNextSignInStep(SignInStateConverter.getAuthSignInStep(signInResult.getSignInState()), signInResult.getParameters() == null ? Collections.emptyMap() : signInResult.getParameters(), convertCodeDeliveryDetails(signInResult.getCodeDetails())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AuthSignUpResult convertSignUpResult(SignUpResult signUpResult, String str) {
        Objects.requireNonNull(signUpResult);
        UserCodeDeliveryDetails userCodeDeliveryDetails = signUpResult.getUserCodeDeliveryDetails();
        return new AuthSignUpResult(true, new AuthNextSignUpStep(signUpResult.getConfirmationState() ? AuthSignUpStep.DONE : AuthSignUpStep.CONFIRM_SIGN_UP_STEP, Collections.emptyMap(), userCodeDeliveryDetails != null ? new AuthCodeDeliveryDetails(userCodeDeliveryDetails.getDestination(), AuthCodeDeliveryDetails.DeliveryMedium.fromString(userCodeDeliveryDetails.getDeliveryMedium()), userCodeDeliveryDetails.getAttributeName()) : null), signUpResult.getUserSub() != null ? new AuthUser(signUpResult.getUserSub(), str) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AuthSession expiredSession() {
        return new AWSCognitoAuthSession(true, AuthSessionResult.failure(new AuthException.SessionExpiredException()), AuthSessionResult.failure(new AuthException.SessionExpiredException()), AuthSessionResult.failure(new AuthException.SessionExpiredException()), AuthSessionResult.failure(new AuthException.SessionExpiredException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchAndSetUserId(final Action action) {
        this.awsMobileClient.getTokens(new Callback<Tokens>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.24
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                AWSCognitoAuthPlugin.this.userId = null;
                action.call();
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Tokens tokens) {
                AWSCognitoAuthPlugin aWSCognitoAuthPlugin = AWSCognitoAuthPlugin.this;
                aWSCognitoAuthPlugin.userId = aWSCognitoAuthPlugin.getUserIdFromToken(tokens.getAccessToken().getTokenString());
                action.call();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUserIdFromToken(String str) {
        try {
            return CognitoJWTParser.getPayload(str).getString(COGNITO_USER_ID_ATTRIBUTE);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void signInWithWebUIHelper(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        HostedUIOptions.Builder builder = HostedUIOptions.builder();
        SignInUIOptions.Builder builder2 = SignInUIOptions.builder();
        if (authWebUISignInOptions != null) {
            if (authWebUISignInOptions.getScopes() != null) {
                builder.scopes((String[]) authWebUISignInOptions.getScopes().toArray(new String[authWebUISignInOptions.getScopes().size()]));
            }
            if (!authWebUISignInOptions.getSignInQueryParameters().isEmpty()) {
                builder.signInQueryParameters(authWebUISignInOptions.getSignInQueryParameters());
            }
            if (!authWebUISignInOptions.getSignOutQueryParameters().isEmpty()) {
                builder.signOutQueryParameters(authWebUISignInOptions.getSignOutQueryParameters());
            }
            if (!authWebUISignInOptions.getTokenQueryParameters().isEmpty()) {
                builder.tokenQueryParameters(authWebUISignInOptions.getTokenQueryParameters());
            }
            if (authWebUISignInOptions instanceof AWSCognitoAuthWebUISignInOptions) {
                AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = (AWSCognitoAuthWebUISignInOptions) authWebUISignInOptions;
                builder.idpIdentifier(aWSCognitoAuthWebUISignInOptions.getIdpIdentifier()).federationProviderName(aWSCognitoAuthWebUISignInOptions.getFederationProviderName());
                builder2.browserPackage(aWSCognitoAuthWebUISignInOptions.getBrowserPackage());
            }
            if (authProvider != null) {
                builder.identityProvider(AuthProviderConverter.getIdentityProvider(authProvider));
            }
        }
        this.awsMobileClient.showSignIn(activity, builder2.hostedUIOptions(builder.build()).build(), new AnonymousClass23(consumer, consumer2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signOutLocally(AuthSignOutOptions authSignOutOptions, final Action action, final Consumer<AuthException> consumer) {
        SignOutOptions.Builder builderInvalidateTokens = SignOutOptions.builder().signOutGlobally(false).invalidateTokens(true);
        if (authSignOutOptions instanceof AWSCognitoAuthSignOutOptions) {
            builderInvalidateTokens.browserPackage(((AWSCognitoAuthSignOutOptions) authSignOutOptions).getBrowserPackage());
        }
        this.awsMobileClient.signOut(builderInvalidateTokens.build(), new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.22
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                Consumer consumer2;
                Throwable authException;
                if (exc != null && exc.getMessage() != null && exc.getMessage().contains("signed-out")) {
                    consumer.accept(new AuthException("Failed to sign out since Auth is already signed out", "No need to sign out - you already are!"));
                    return;
                }
                if (exc instanceof AuthNavigationException) {
                    consumer2 = consumer;
                    authException = new AuthException.UserCancelledException("The user cancelled the sign-out attempt.", exc, "To recover, catch this error, and retry sign-out.");
                } else {
                    consumer2 = consumer;
                    authException = new AuthException("Failed to sign out", exc, "See attached exception for more details");
                }
                consumer2.accept(authException);
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) throws AuthException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        LogFactory.setLevel(LogFactory.Level.OFF);
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            jSONObject2.put("UserAgentOverride", UserAgent.string());
            this.awsMobileClient.initialize(context, new AWSConfiguration(jSONObject2), new AnonymousClass1(countDownLatch, atomicReference));
            try {
                if (!countDownLatch.await(SECONDS_BEFORE_TIMEOUT, TimeUnit.SECONDS)) {
                    throw new AuthException("Failed to instantiate AWSMobileClient within 10 seconds", "Check network connectivity");
                }
                if (atomicReference.get() != null) {
                    throw new AuthException("Failed to instantiate AWSMobileClient", (Throwable) atomicReference.get(), "See attached exception for more details");
                }
            } catch (InterruptedException e9) {
                throw new AuthException("Failed to instantiate AWSMobileClient", e9, "See attached exception for more details");
            }
        } catch (JSONException e10) {
            throw new AuthException("Failed to set user agent string", e10, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String str, String str2, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, final Action action, final Consumer<AuthException> consumer) {
        HashMap map = new HashMap();
        if (authConfirmResetPasswordOptions instanceof AWSCognitoAuthConfirmResetPasswordOptions) {
            map.putAll(((AWSCognitoAuthConfirmResetPasswordOptions) authConfirmResetPasswordOptions).getMetadata());
        }
        this.awsMobileClient.confirmForgotPassword(str, str2, map, new Callback<ForgotPasswordResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.13
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Confirm reset password failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(ForgotPasswordResult forgotPasswordResult) {
                if (forgotPasswordResult.getState().equals(ForgotPasswordState.DONE)) {
                    action.call();
                    return;
                }
                consumer.accept(new AuthException("Received an unsupported response while confirming password recovery code: " + forgotPasswordResult.getState(), "This is almost certainly a bug. Please report it as an issue in our GitHub repo."));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String str, String str2, Action action, Consumer<AuthException> consumer) {
        confirmResetPassword(str, str2, AuthConfirmResetPasswordOptions.defaults(), action, consumer);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (authConfirmSignInOptions instanceof AWSCognitoAuthConfirmSignInOptions) {
            AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = (AWSCognitoAuthConfirmSignInOptions) authConfirmSignInOptions;
            map.putAll(aWSCognitoAuthConfirmSignInOptions.getMetadata());
            for (AuthUserAttribute authUserAttribute : aWSCognitoAuthConfirmSignInOptions.getUserAttributes()) {
                map2.put(authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue());
            }
        }
        this.awsMobileClient.confirmSignIn(str, map, map2, new AnonymousClass6(consumer, consumer2));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String str, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        confirmSignIn(str, AuthConfirmSignInOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(final String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, final Consumer<AuthSignUpResult> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authConfirmSignUpOptions instanceof AWSCognitoAuthConfirmSignUpOptions) {
            map.putAll(((AWSCognitoAuthConfirmSignUpOptions) authConfirmSignUpOptions).getClientMetadata());
        }
        this.awsMobileClient.confirmSignUp(str, str2, map, new Callback<SignUpResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.3
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Confirm sign up failed"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(SignUpResult signUpResult) {
                consumer.accept(AWSCognitoAuthPlugin.this.convertSignUpResult(signUpResult, str));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(String str, String str2, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        confirmSignUp(str, str2, AuthConfirmSignUpOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str, final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.confirmUpdateUserAttribute(authUserAttributeKey.getKeyString(), str, new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.19
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Confirming user attributes failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteUser(final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.deleteUser(new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.21
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Delete user failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r32) {
                Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(AuthChannelEventName.USER_DELETED));
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(final Consumer<AuthSession> consumer, final Consumer<AuthException> consumer2) {
        try {
            this.awsMobileClient.currentUserState(new Callback<UserStateDetails>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.7
                @Override // com.amazonaws.mobile.client.Callback
                public void onError(Exception exc) {
                    consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Fetching authorization session failed."));
                }

                @Override // com.amazonaws.mobile.client.Callback
                public void onResult(UserStateDetails userStateDetails) {
                    int i9 = AnonymousClass25.$SwitchMap$com$amazonaws$mobile$client$UserState[userStateDetails.getUserState().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        MobileClientSessionAdapter.fetchSignedOutSession(AWSCognitoAuthPlugin.this.awsMobileClient, consumer);
                    } else if (i9 != 4 && i9 != 5) {
                        MobileClientSessionAdapter.fetchSignedInSession(AWSCognitoAuthPlugin.this.awsMobileClient, consumer);
                    } else {
                        Amplify.Hub.publish(HubChannel.AUTH, HubEvent.create(AuthChannelEventName.SESSION_EXPIRED));
                        consumer.accept(AWSCognitoAuthPlugin.this.expiredSession());
                    }
                }
            });
        } catch (Throwable th) {
            consumer2.accept(new AuthException("An error occurred fetching authorization details for the current user", th, "See attached exception for more details"));
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchDevices(final Consumer<List<AuthDevice>> consumer, final Consumer<AuthException> consumer2) {
        this.awsMobileClient.getDeviceOperations().list(new Callback<ListDevicesResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.11
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Fetching devices failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(ListDevicesResult listDevicesResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<Device> it = listDevicesResult.getDevices().iterator();
                while (it.hasNext()) {
                    arrayList.add(AuthDevice.fromId(it.next().getDeviceKey()));
                }
                consumer.accept(arrayList);
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchUserAttributes(final Consumer<List<AuthUserAttribute>> consumer, final Consumer<AuthException> consumer2) {
        this.awsMobileClient.getUserAttributes(new Callback<Map<String, String>>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.15
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Fetching user attributes failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Map<String, String> map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new AuthUserAttribute(AuthUserAttributeKey.custom(entry.getKey()), entry.getValue()));
                }
                consumer.accept(arrayList);
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(AuthDevice authDevice, final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.getDeviceOperations().forget(authDevice.getDeviceId(), new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.10
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Forget device failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.getDeviceOperations().forget(new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.9
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Forget device failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public AuthUser getCurrentUser() {
        if (this.userId == null || this.awsMobileClient.getUsername() == null) {
            return null;
        }
        return new AuthUser(this.userId, this.awsMobileClient.getUsername());
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSMobileClient getEscapeHatch() {
        return this.awsMobileClient;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_COGNITO_AUTH_PLUGIN_KEY;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "1.37.10";
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void handleWebUISignInResponse(Intent intent) {
        this.awsMobileClient.handleAuthResponse(intent);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void rememberDevice(final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.getDeviceOperations().updateStatus(true, new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.8
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Remember device failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(final String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, final Consumer<AuthSignUpResult> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authResendSignUpCodeOptions instanceof AWSCognitoAuthResendSignUpCodeOptions) {
            map.putAll(((AWSCognitoAuthResendSignUpCodeOptions) authResendSignUpCodeOptions).getMetadata());
        }
        this.awsMobileClient.resendSignUp(str, map, new Callback<SignUpResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.4
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Resend confirmation code failed"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(SignUpResult signUpResult) {
                consumer.accept(AWSCognitoAuthPlugin.this.convertSignUpResult(signUpResult, str));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(String str, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        resendSignUpCode(str, AuthResendSignUpCodeOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, final Consumer<AuthCodeDeliveryDetails> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authResendUserAttributeConfirmationCodeOptions instanceof AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) {
            map.putAll(((AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) authResendUserAttributeConfirmationCodeOptions).getMetadata());
        }
        this.awsMobileClient.verifyUserAttribute(authUserAttributeKey.getKeyString(), map, new Callback<UserCodeDeliveryDetails>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.18
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(new AuthException("Failed to resend user attribute confirmation code", exc, "See attached exception for more details"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(UserCodeDeliveryDetails userCodeDeliveryDetails) {
                consumer.accept(AWSCognitoAuthPlugin.this.convertCodeDeliveryDetails(userCodeDeliveryDetails));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        resendUserAttributeConfirmationCode(authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, final Consumer<AuthResetPasswordResult> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authResetPasswordOptions instanceof AWSCognitoAuthResetPasswordOptions) {
            map.putAll(((AWSCognitoAuthResetPasswordOptions) authResetPasswordOptions).getMetadata());
        }
        this.awsMobileClient.forgotPassword(str, map, new Callback<ForgotPasswordResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.12
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Reset password failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(ForgotPasswordResult forgotPasswordResult) {
                Consumer consumer3;
                Object authException;
                if (forgotPasswordResult.getState().equals(ForgotPasswordState.CONFIRMATION_CODE)) {
                    consumer3 = consumer;
                    authException = new AuthResetPasswordResult(false, new AuthNextResetPasswordStep(AuthResetPasswordStep.CONFIRM_RESET_PASSWORD_WITH_CODE, Collections.emptyMap(), AWSCognitoAuthPlugin.this.convertCodeDeliveryDetails(forgotPasswordResult.getParameters())));
                } else {
                    consumer3 = consumer2;
                    authException = new AuthException("Received an unsupported response after triggering password recovery: " + forgotPasswordResult.getState(), "This is almost certainly a bug. Please report it as an issue in our GitHub repo.");
                }
                consumer3.accept(authException);
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String str, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2) {
        resetPassword(str, AuthResetPasswordOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, AuthSignInOptions authSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        AuthFlowType authFlowType;
        HashMap map = new HashMap();
        if (authSignInOptions instanceof AWSCognitoAuthSignInOptions) {
            AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = (AWSCognitoAuthSignInOptions) authSignInOptions;
            map.putAll(aWSCognitoAuthSignInOptions.getMetadata());
            authFlowType = aWSCognitoAuthSignInOptions.getAuthFlowType();
        } else {
            authFlowType = null;
        }
        this.awsMobileClient.signIn(str, str2, map, map, authFlowType != null ? com.amazonaws.services.cognitoidentityprovider.model.AuthFlowType.valueOf(authFlowType.name()) : null, new AnonymousClass5(consumer, consumer2));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        signIn(str, str2, AuthSignInOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        Objects.requireNonNull(authProvider);
        Objects.requireNonNull(activity);
        Objects.requireNonNull(authWebUISignInOptions);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        signInWithWebUIHelper(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        Objects.requireNonNull(authProvider);
        Objects.requireNonNull(activity);
        AuthWebUISignInOptions authWebUISignInOptionsBuild = AuthWebUISignInOptions.builder().build();
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        signInWithSocialWebUI(authProvider, activity, authWebUISignInOptionsBuild, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        Objects.requireNonNull(activity);
        Objects.requireNonNull(authWebUISignInOptions);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        signInWithWebUIHelper(null, activity, authWebUISignInOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        Objects.requireNonNull(activity);
        AuthWebUISignInOptions authWebUISignInOptionsBuild = AuthWebUISignInOptions.builder().build();
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer2);
        signInWithWebUI(activity, authWebUISignInOptionsBuild, consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(final AuthSignOutOptions authSignOutOptions, final Action action, final Consumer<AuthException> consumer) {
        if (authSignOutOptions.isGlobalSignOut()) {
            this.awsMobileClient.signOut(SignOutOptions.builder().signOutGlobally(true).build(), new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.20
                @Override // com.amazonaws.mobile.client.Callback
                public void onError(Exception exc) {
                    Consumer consumer2;
                    Throwable authException;
                    if (exc instanceof NotAuthorizedException) {
                        AWSCognitoAuthPlugin.this.signOutLocally(authSignOutOptions, action, consumer);
                        return;
                    }
                    if (exc instanceof AuthNavigationException) {
                        consumer2 = consumer;
                        authException = new AuthException.UserCancelledException("The user cancelled the sign-out attempt.", exc, "To recover, catch this error, and retry sign-out.");
                    } else {
                        consumer2 = consumer;
                        authException = new AuthException("Failed to sign out globally", exc, "See attached exception for more details");
                    }
                    consumer2.accept(authException);
                }

                @Override // com.amazonaws.mobile.client.Callback
                public void onResult(Void r12) {
                    action.call();
                }
            });
        } else {
            signOutLocally(authSignOutOptions, action, consumer);
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(Action action, Consumer<AuthException> consumer) {
        signOut(AuthSignOutOptions.builder().globalSignOut(false).build(), action, consumer);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signUp(final String str, String str2, AuthSignUpOptions authSignUpOptions, final Consumer<AuthSignUpResult> consumer, final Consumer<AuthException> consumer2) {
        Map<String, String> map;
        Map<String, String> clientMetadata;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        if (authSignUpOptions.getUserAttributes() != null) {
            for (AuthUserAttribute authUserAttribute : authSignUpOptions.getUserAttributes()) {
                map2.put(authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue());
            }
        }
        if (authSignUpOptions instanceof AWSCognitoAuthSignUpOptions) {
            AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = (AWSCognitoAuthSignUpOptions) authSignUpOptions;
            Map<String, String> validationData = aWSCognitoAuthSignUpOptions.getValidationData();
            clientMetadata = aWSCognitoAuthSignUpOptions.getClientMetadata();
            map = validationData;
        } else {
            map = map3;
            clientMetadata = map4;
        }
        this.awsMobileClient.signUp(str, str2, map2, map, clientMetadata, new Callback<SignUpResult>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.2
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(CognitoAuthExceptionConverter.lookup(exc, "Sign up failed"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(SignUpResult signUpResult) {
                consumer.accept(AWSCognitoAuthPlugin.this.convertSignUpResult(signUpResult, str));
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updatePassword(String str, String str2, final Action action, final Consumer<AuthException> consumer) {
        this.awsMobileClient.changePassword(str, str2, new Callback<Void>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.14
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer.accept(CognitoAuthExceptionConverter.lookup(exc, "Update password failed."));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(Void r12) {
                action.call();
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, final Consumer<AuthUpdateAttributeResult> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authUpdateUserAttributeOptions instanceof AWSCognitoAuthUpdateUserAttributeOptions) {
            map.putAll(((AWSCognitoAuthUpdateUserAttributeOptions) authUpdateUserAttributeOptions).getMetadata());
        }
        this.awsMobileClient.updateUserAttributes(Collections.singletonMap(authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue()), map, new Callback<List<UserCodeDeliveryDetails>>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.16
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(new AuthException("Failed to update user attributes", exc, "See attached exception for more details"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(List<UserCodeDeliveryDetails> list) {
                if (list.size() == 0) {
                    consumer.accept(new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.DONE, Collections.emptyMap(), null)));
                } else {
                    consumer.accept(new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.CONFIRM_ATTRIBUTE_WITH_CODE, Collections.emptyMap(), AWSCognitoAuthPlugin.this.convertCodeDeliveryDetails(list.get(0)))));
                }
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute authUserAttribute, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2) {
        updateUserAttribute(authUserAttribute, AuthUpdateUserAttributeOptions.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, final Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, final Consumer<AuthException> consumer2) {
        HashMap map = new HashMap();
        if (authUpdateUserAttributesOptions instanceof AWSCognitoAuthUpdateUserAttributesOptions) {
            map.putAll(((AWSCognitoAuthUpdateUserAttributesOptions) authUpdateUserAttributesOptions).getMetadata());
        }
        final HashMap map2 = new HashMap();
        for (AuthUserAttribute authUserAttribute : list) {
            map2.put(authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue());
        }
        this.awsMobileClient.updateUserAttributes(map2, map, new Callback<List<UserCodeDeliveryDetails>>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin.17
            @Override // com.amazonaws.mobile.client.Callback
            public void onError(Exception exc) {
                consumer2.accept(new AuthException("Failed to update user attributes", exc, "See attached exception for more details"));
            }

            @Override // com.amazonaws.mobile.client.Callback
            public void onResult(List<UserCodeDeliveryDetails> list2) {
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                for (UserCodeDeliveryDetails userCodeDeliveryDetails : list2) {
                    map3.put(userCodeDeliveryDetails.getAttributeName(), userCodeDeliveryDetails);
                }
                for (String str : map2.keySet()) {
                    if (map3.containsKey(str)) {
                        map4.put(AuthUserAttributeKey.custom(str), new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.CONFIRM_ATTRIBUTE_WITH_CODE, Collections.emptyMap(), AWSCognitoAuthPlugin.this.convertCodeDeliveryDetails((UserCodeDeliveryDetails) map3.get(str)))));
                    } else {
                        map4.put(AuthUserAttributeKey.custom(str), new AuthUpdateAttributeResult(true, new AuthNextUpdateAttributeStep(AuthUpdateAttributeStep.DONE, Collections.emptyMap(), null)));
                    }
                }
                consumer.accept(map4);
            }
        });
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> list, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, Consumer<AuthException> consumer2) {
        updateUserAttributes(list, AuthUpdateUserAttributesOptions.defaults(), consumer, consumer2);
    }
}
