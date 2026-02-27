package com.amazonaws.mobileconnectors.cognitoauth.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazonaws.internal.keyvaluestore.AWSKeyValueStore;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.util.StringUtils;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LocalDataManager {
    static final String TAG = "LocalDataManager";

    public static void cacheSession(Context context, String str, String str2, AuthUserSession authUserSession, Set<String> set) {
        if (context == null || str == null || str.isEmpty() || str2 == null || authUserSession == null) {
            Log.e(TAG, "Application context, and application domain cannot be null");
            return;
        }
        Locale locale = Locale.US;
        String str3 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID);
        String str4 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS);
        String str5 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH);
        String str6 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_TYPE);
        String str7 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES);
        String str8 = String.format(locale, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER);
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).edit();
            editorEdit.putString(str6, ClientConstants.SESSION_TYPE_JWT);
            editorEdit.putString(str3, authUserSession.getIdToken().getJWTToken());
            editorEdit.putString(str4, authUserSession.getAccessToken().getJWTToken());
            editorEdit.putString(str5, authUserSession.getRefreshToken().getToken());
            if (set != null && set.size() > 0) {
                editorEdit.putStringSet(str7, set);
            }
            editorEdit.putString(str8, str2).apply();
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void cacheSession(AWSKeyValueStore aWSKeyValueStore, Context context, String str, String str2, AuthUserSession authUserSession, Set<String> set) {
        if (context == null || str == null || str.isEmpty() || str2 == null || authUserSession == null) {
            Log.e(TAG, "Application context, and application domain cannot be null");
            return;
        }
        Locale locale = Locale.US;
        String str3 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID);
        String str4 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS);
        String str5 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH);
        String str6 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_TYPE);
        String str7 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES);
        String str8 = String.format(locale, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER);
        try {
            aWSKeyValueStore.put(str6, ClientConstants.SESSION_TYPE_JWT);
            aWSKeyValueStore.put(str3, authUserSession.getIdToken().getJWTToken());
            aWSKeyValueStore.put(str4, authUserSession.getAccessToken().getJWTToken());
            aWSKeyValueStore.put(str5, authUserSession.getRefreshToken().getToken());
            if (set != null && set.size() > 0) {
                aWSKeyValueStore.put(str7, setToString(set));
            }
            aWSKeyValueStore.put(str8, str2);
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void cacheState(Context context, String str, String str2, Set<String> set) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).edit();
            editorEdit.putString(str + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, str2);
            editorEdit.putStringSet(str + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, set).apply();
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void cacheState(AWSKeyValueStore aWSKeyValueStore, Context context, String str, String str2, Set<String> set) {
        try {
            aWSKeyValueStore.put(str + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, str2);
            aWSKeyValueStore.put(str + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, setToString(set));
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void clearCache(Context context, String str, String str2) {
        if (str2 == null) {
            return;
        }
        Locale locale = Locale.US;
        String str3 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID);
        String str4 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS);
        String str5 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH);
        String str6 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_TYPE);
        String str7 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES);
        String str8 = String.format(locale, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER);
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).edit();
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.remove(str5);
            editorEdit.remove(str6);
            editorEdit.remove(str7);
            editorEdit.remove(str8).apply();
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void clearCache(AWSKeyValueStore aWSKeyValueStore, Context context, String str, String str2) {
        if (str2 == null) {
            return;
        }
        Locale locale = Locale.US;
        String str3 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID);
        String str4 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS);
        String str5 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH);
        String str6 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_TYPE);
        String str7 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES);
        String str8 = String.format(locale, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER);
        try {
            aWSKeyValueStore.remove(str3);
            aWSKeyValueStore.remove(str4);
            aWSKeyValueStore.remove(str5);
            aWSKeyValueStore.remove(str6);
            aWSKeyValueStore.remove(str7);
            aWSKeyValueStore.remove(str8);
        } catch (Exception e9) {
            Log.e(TAG, "Failed while writing to SharedPreferences", e9);
        }
    }

    public static void clearCacheAll(AWSKeyValueStore aWSKeyValueStore) {
        try {
            aWSKeyValueStore.clear();
        } catch (Exception e9) {
            Log.e(TAG, "Failed while clearing data from SharedPreferences", e9);
        }
    }

    public static String getCachedProofKey(Context context, String str) {
        try {
            return context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).getString(str + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, null);
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return null;
        }
    }

    public static String getCachedProofKey(AWSKeyValueStore aWSKeyValueStore, Context context, String str) {
        try {
            return aWSKeyValueStore.get(str + ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE);
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return null;
        }
    }

    public static Set<String> getCachedScopes(Context context, String str) {
        HashSet hashSet = new HashSet();
        try {
            return context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).getStringSet(str + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, hashSet);
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return hashSet;
        }
    }

    public static Set<String> getCachedScopes(AWSKeyValueStore aWSKeyValueStore, Context context, String str) {
        HashSet hashSet = new HashSet();
        try {
            return setFromString(aWSKeyValueStore.get(str + ClientConstants.DOMAIN_QUERY_PARAM_SCOPES));
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return hashSet;
        }
    }

    public static AuthUserSession getCachedSession(Context context, String str, String str2, Set<String> set) {
        AuthUserSession authUserSession = new AuthUserSession(null, null, null);
        if (str2 == null) {
            return authUserSession;
        }
        if (context == null || str == null || str.isEmpty()) {
            throw new InvalidParameterException("Application context, and application domain cannot be null");
        }
        Locale locale = Locale.US;
        String str3 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID);
        String str4 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS);
        String str5 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH);
        String str6 = String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0);
            return !sharedPreferences.getStringSet(str6, new HashSet()).equals(set) ? authUserSession : new AuthUserSession(new IdToken(sharedPreferences.getString(str3, null)), new AccessToken(sharedPreferences.getString(str4, null)), new RefreshToken(sharedPreferences.getString(str5, null)));
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return authUserSession;
        }
    }

    public static AuthUserSession getCachedSession(AWSKeyValueStore aWSKeyValueStore, Context context, String str, String str2, Set<String> set) {
        AuthUserSession authUserSession = new AuthUserSession(null, null, null);
        if (str2 == null) {
            return authUserSession;
        }
        if (context == null || str == null || str.isEmpty()) {
            throw new InvalidParameterException("Application context, and application domain cannot be null");
        }
        Locale locale = Locale.US;
        try {
            return !setFromString(aWSKeyValueStore.get(String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_KEY_SCOPES))).equals(set) ? authUserSession : new AuthUserSession(new IdToken(aWSKeyValueStore.get(String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ID))), new AccessToken(aWSKeyValueStore.get(String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_ACCESS))), new RefreshToken(aWSKeyValueStore.get(String.format(locale, "%s.%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, str2, ClientConstants.TOKEN_TYPE_REFRESH))));
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return authUserSession;
        }
    }

    public static String getLastAuthUser(Context context, String str) {
        if (context == null || str == null) {
            throw new InvalidParameterException("Application context, and application domain cannot be null");
        }
        try {
            return context.getSharedPreferences(ClientConstants.APP_LOCAL_CACHE, 0).getString(String.format(Locale.US, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER), null);
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return null;
        }
    }

    public static String getLastAuthUser(AWSKeyValueStore aWSKeyValueStore, Context context, String str) {
        if (context == null || str == null) {
            throw new InvalidParameterException("Application context, and application domain cannot be null");
        }
        try {
            return aWSKeyValueStore.get(String.format(Locale.US, "%s.%s.%s", ClientConstants.APP_LOCAL_CACHE_KEY_PREFIX, str, ClientConstants.APP_LAST_AUTH_USER));
        } catch (Exception e9) {
            Log.e(TAG, "Failed to read from SharedPreferences", e9);
            return null;
        }
    }

    public static Set<String> setFromString(String str) {
        HashSet hashSet = new HashSet();
        if (StringUtils.isBlank(str)) {
            return hashSet;
        }
        hashSet.addAll(Arrays.asList(str.split(",")));
        return hashSet;
    }

    public static String setToString(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            int i10 = i9 + 1;
            if (i9 < set.size() - 1) {
                sb.append(",");
            }
            i9 = i10;
        }
        return sb.toString();
    }
}
