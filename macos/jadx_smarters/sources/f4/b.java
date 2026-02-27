package F4;

import F4.a;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a.AbstractBinderC0028a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2025a;

    public b(Object obj) {
        this.f2025a = obj;
    }

    public static Object E(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f2025a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
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
        r.m(field);
        if (field.isAccessible()) {
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

    public static a Z(Object obj) {
        return new b(obj);
    }
}
