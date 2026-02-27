package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import com.google.android.gms.common.internal.Hide;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class arp extends arn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20579a;

    private arp(Object obj) {
        this.f20579a = obj;
    }

    public static aro c(Object obj) {
        return new arp(obj);
    }

    public static Object d(aro aroVar) {
        if (aroVar instanceof arp) {
            return ((arp) aroVar).f20579a;
        }
        IBinder iBinderAsBinder = aroVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i9 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i9++;
                field = field2;
            }
        }
        if (i9 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        if (((Field) com.google.android.gms.common.internal.r.m(field)).isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e9) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e9);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
