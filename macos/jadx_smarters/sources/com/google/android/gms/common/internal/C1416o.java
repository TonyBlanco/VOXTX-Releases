package com.google.android.gms.common.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1416o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1411j f26848b = new C1411j("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1416o f26849c = new C1416o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f26850a = new ConcurrentHashMap();

    public static C1416o a() {
        return f26849c;
    }

    public String b(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        r.h(str, "Please provide a valid libraryName");
        if (this.f26850a.containsKey(str)) {
            return (String) this.f26850a.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = C1416o.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (IOException e9) {
                e = e9;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty(ClientCookie.VERSION_ATTR, null);
                f26848b.d("LibraryVersion", str + " version is " + property);
            } else {
                f26848b.e("LibraryVersion", "Failed to get app version for libraryName: " + str);
            }
        } catch (IOException e10) {
            e = e10;
            str2 = property;
            inputStream = resourceAsStream;
            f26848b.c("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
            String str3 = str2;
            resourceAsStream = inputStream;
            property = str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream = resourceAsStream;
            if (inputStream != null) {
                C4.k.a(inputStream);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            C4.k.a(resourceAsStream);
        }
        if (property == null) {
            f26848b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            property = "UNKNOWN";
        }
        this.f26850a.put(str, property);
        return property;
    }
}
