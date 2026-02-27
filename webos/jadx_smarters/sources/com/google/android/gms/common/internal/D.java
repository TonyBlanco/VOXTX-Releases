package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import m4.AbstractC2228b;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import w4.AbstractC2924l;
import w4.AbstractC2927o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.i f26749a = new s.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f26750b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return E4.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i9) {
        return context.getResources().getString(i9 != 1 ? i9 != 2 ? i9 != 3 ? R.string.ok : AbstractC2228b.f44389a : AbstractC2228b.f44398j : AbstractC2228b.f44392d);
    }

    public static String c(Context context, int i9) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i9 == 1) {
            return resources.getString(AbstractC2228b.f44393e, strA);
        }
        if (i9 == 2) {
            return C4.i.d(context) ? resources.getString(AbstractC2228b.f44402n) : resources.getString(AbstractC2228b.f44399k, strA);
        }
        if (i9 == 3) {
            return resources.getString(AbstractC2228b.f44390b, strA);
        }
        if (i9 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i9 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i9 == 9) {
            return resources.getString(AbstractC2228b.f44397i, strA);
        }
        if (i9 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i9) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case LangUtils.HASH_SEED /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(AbstractC2228b.f44401m, strA);
            default:
                return resources.getString(AbstractC2927o.f51674a, strA);
        }
    }

    public static String d(Context context, int i9) {
        return (i9 == 6 || i9 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i9);
    }

    public static String e(Context context, int i9) {
        String strH = i9 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i9);
        return strH == null ? context.getResources().getString(AbstractC2228b.f44396h) : strH;
    }

    public static String f(Context context, int i9) {
        String str;
        Resources resources = context.getResources();
        switch (i9) {
            case 1:
                return resources.getString(AbstractC2228b.f44394f);
            case 2:
                return resources.getString(AbstractC2228b.f44400l);
            case 3:
                return resources.getString(AbstractC2228b.f44391c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case 19:
            default:
                str = "Unexpected error code " + i9;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case LangUtils.HASH_SEED /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(AbstractC2927o.f51674a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        s.i iVar = f26749a;
        synchronized (iVar) {
            try {
                Locale localeD = L.f.a(context.getResources().getConfiguration()).d(0);
                if (!localeD.equals(f26750b)) {
                    iVar.clear();
                    f26750b = localeD;
                }
                String str2 = (String) iVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesF = AbstractC2924l.f(context);
                if (resourcesF == null) {
                    return null;
                }
                int identifier = resourcesF.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesF.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    iVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
