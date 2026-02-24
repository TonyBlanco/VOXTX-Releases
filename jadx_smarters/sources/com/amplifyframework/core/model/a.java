package com.amplifyframework.core.model;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static String a(Model model) {
        return model.getClass().getSimpleName();
    }

    public static String b(Model model) {
        try {
            return model.resolveIdentifier() instanceof ModelIdentifier ? ((ModelIdentifier) model.resolveIdentifier()).getIdentifier() : (String) model.resolveIdentifier();
        } catch (Exception e9) {
            throw new IllegalStateException("Invalid Primary Key, It should either be of type String or composite Primary Key." + e9);
        }
    }

    public static Serializable c(Model model) {
        try {
            Object objInvoke = model.getClass().getMethod("getId", null).invoke(model, null);
            Objects.requireNonNull(objInvoke);
            return (Serializable) objInvoke;
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Primary key field Id not found.", e9);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Primary key field Id not found.", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Primary key field Id not found.", e11);
        }
    }
}
