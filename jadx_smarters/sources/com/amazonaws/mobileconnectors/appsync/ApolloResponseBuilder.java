package com.amazonaws.mobileconnectors.appsync;

import F1.h;
import K1.a;
import K1.d;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import u1.InterfaceC2843b;
import v1.InterfaceC2868f;
import v1.i;
import v1.s;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
class ApolloResponseBuilder {
    private static final String CONTENT_TYPE = "application/json";
    private static final MediaType MEDIA_TYPE = MediaType.parse(CONTENT_TYPE);
    private static final String TAG = "ApolloResponseBuilder";
    private final Map<s, InterfaceC2843b> customTypeAdapters;
    private final h mapResponseNormalizer;

    public ApolloResponseBuilder(Map<s, InterfaceC2843b> map, h hVar) {
        this.customTypeAdapters = map;
        this.mapResponseNormalizer = hVar;
    }

    public <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> i buildResponse(String str, t tVar) throws Throwable {
        ResponseBody responseBodyCreate = ResponseBody.create(str, MEDIA_TYPE);
        try {
            i iVarF = new a(tVar, tVar.responseFieldMapper(), new d(this.customTypeAdapters), this.mapResponseNormalizer).f(responseBodyCreate.source());
            if (iVarF.e()) {
                Log.w(TAG, "Errors detected in parsed subscription message");
            }
            return iVarF;
        } catch (IOException e9) {
            throw new RuntimeException("Error constructing JSON object", e9);
        }
    }
}
