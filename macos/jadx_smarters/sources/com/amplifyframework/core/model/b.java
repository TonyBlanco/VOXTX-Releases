package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static Set a(ModelProvider modelProvider) {
        return new HashSet();
    }

    public static Map b(ModelProvider modelProvider) {
        return new HashMap();
    }

    public static Set c(ModelProvider modelProvider) {
        HashSet hashSet = new HashSet();
        if (modelProvider.models() == null) {
            return hashSet;
        }
        Iterator<Class<? extends Model>> it = modelProvider.models().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getSimpleName());
        }
        return hashSet;
    }

    public static Map d(ModelProvider modelProvider) {
        HashMap map = new HashMap();
        if (modelProvider.models() == null) {
            return map;
        }
        for (Class<? extends Model> cls : modelProvider.models()) {
            try {
                map.put(cls.getSimpleName(), ModelSchema.fromModelClass(cls));
            } catch (AmplifyException e9) {
                e9.printStackTrace();
            }
        }
        return map;
    }
}
