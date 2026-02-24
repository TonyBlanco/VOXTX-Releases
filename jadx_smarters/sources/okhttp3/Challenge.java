package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import l8.AbstractC2205B;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Challenge {

    @NotNull
    private final Map<String, String> authParams;

    @NotNull
    private final String scheme;

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(@NotNull String scheme, @NotNull String realm) {
        l.e(scheme, "scheme");
        l.e(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        l.d(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }

    public Challenge(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String lowerCase;
        l.e(scheme, "scheme");
        l.e(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                l.d(US, "US");
                lowerCase = key.toLowerCase(US);
                l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m48deprecated_authParams() {
        return this.authParams;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m49deprecated_charset() {
        return charset();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m50deprecated_realm() {
        return realm();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m51deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @NotNull
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                l.d(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        l.d(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (l.a(challenge.scheme, this.scheme) && l.a(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        l.e(charset, "charset");
        Map mapN = AbstractC2205B.n(this.authParams);
        String strName = charset.name();
        l.d(strName, "charset.name()");
        mapN.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mapN);
    }
}
