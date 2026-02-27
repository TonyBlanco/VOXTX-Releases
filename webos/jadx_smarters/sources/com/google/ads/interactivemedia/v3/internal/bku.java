package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
final class bku implements blk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f21615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21616b;

    public bku(Class cls, int i9) {
        this.f21616b = i9;
        this.f21615a = cls;
    }

    public bku(String str, int i9) {
        this.f21616b = i9;
        this.f21615a = str;
    }

    public bku(Constructor constructor, int i9) {
        this.f21616b = i9;
        this.f21615a = constructor;
    }

    public bku(Type type, int i9) {
        this.f21616b = i9;
        this.f21615a = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final Object a() {
        switch (this.f21616b) {
            case 0:
                throw new bjz((String) this.f21615a);
            case 1:
                try {
                    return blt.f21674c.a((Class) this.f21615a);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to create instance of " + String.valueOf(this.f21615a) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e9);
                }
            case 2:
                throw new bjz((String) this.f21615a);
            case 3:
                throw new bjz((String) this.f21615a);
            case 4:
                Object obj = this.f21615a;
                if (!(obj instanceof ParameterizedType)) {
                    throw new bjz("Invalid EnumSet type: ".concat(String.valueOf(obj.toString())));
                }
                Type type = ((ParameterizedType) obj).getActualTypeArguments()[0];
                if (type instanceof Class) {
                    return EnumSet.noneOf((Class) type);
                }
                throw new bjz("Invalid EnumSet type: ".concat(String.valueOf(this.f21615a.toString())));
            case 5:
                Object obj2 = this.f21615a;
                if (!(obj2 instanceof ParameterizedType)) {
                    throw new bjz("Invalid EnumMap type: ".concat(String.valueOf(obj2.toString())));
                }
                Type type2 = ((ParameterizedType) obj2).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new bjz("Invalid EnumMap type: ".concat(String.valueOf(this.f21615a.toString())));
            case 6:
                throw new bjz((String) this.f21615a);
            case 7:
                throw new bjz((String) this.f21615a);
            default:
                try {
                    return ((Constructor) this.f21615a).newInstance(null);
                } catch (IllegalAccessException e10) {
                    throw blo.e(e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Failed to invoke " + String.valueOf(this.f21615a) + " with no args", e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException("Failed to invoke " + String.valueOf(this.f21615a) + " with no args", e12.getTargetException());
                }
        }
    }
}
