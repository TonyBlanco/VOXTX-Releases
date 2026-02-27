package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21621b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f21622c;

    public bkw(Map map, boolean z9, List list) {
        this.f21620a = map;
        this.f21622c = list;
    }

    public static String b(Class cls) {
        String name;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            name = cls.getName();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            name = cls.getName();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        return str.concat(name);
    }

    public final blk a(bof bofVar) {
        bku bkuVar;
        String strF;
        Type typeD = bofVar.d();
        Class clsC = bofVar.c();
        bjv bjvVar = (bjv) this.f21620a.get(typeD);
        if (bjvVar != null) {
            return new bkv(bjvVar, typeD, 1);
        }
        bjv bjvVar2 = (bjv) this.f21620a.get(clsC);
        if (bjvVar2 != null) {
            return new bkv(bjvVar2, typeD, 0);
        }
        bkt bktVar = null;
        bku bkuVar2 = EnumSet.class.isAssignableFrom(clsC) ? new bku(typeD, 4) : clsC == EnumMap.class ? new bku(typeD, 5) : null;
        if (bkuVar2 != null) {
            return bkuVar2;
        }
        int iD = blo.d(this.f21622c, clsC);
        if (Modifier.isAbstract(clsC.getModifiers())) {
            bkuVar = null;
        } else {
            try {
                Constructor declaredConstructor = clsC.getDeclaredConstructor(null);
                if (iD == 1 || (blo.c(declaredConstructor, null) && (iD != 4 || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    bkuVar = (iD != 1 || (strF = blo.f(declaredConstructor)) == null) ? new bku(declaredConstructor, 8) : new bku(strF, 7);
                } else {
                    bkuVar = new bku("Unable to invoke no-args constructor of " + String.valueOf(clsC) + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.", 6);
                }
            } catch (NoSuchMethodException unused) {
                bkuVar = null;
            }
        }
        if (bkuVar != null) {
            return bkuVar;
        }
        if (Collection.class.isAssignableFrom(clsC)) {
            if (SortedSet.class.isAssignableFrom(clsC)) {
                bktVar = new bkt(1);
            } else if (Set.class.isAssignableFrom(clsC)) {
                bktVar = new bkt(0);
            } else {
                bktVar = Queue.class.isAssignableFrom(clsC) ? new bkt(2) : new bkt(3);
            }
        } else if (Map.class.isAssignableFrom(clsC)) {
            bktVar = ConcurrentNavigableMap.class.isAssignableFrom(clsC) ? new bkt(4) : ConcurrentMap.class.isAssignableFrom(clsC) ? new bkt(5) : SortedMap.class.isAssignableFrom(clsC) ? new bkt(6) : (!(typeD instanceof ParameterizedType) || String.class.isAssignableFrom(bof.b(((ParameterizedType) typeD).getActualTypeArguments()[0]).c())) ? new bkt(8) : new bkt(7);
        }
        if (bktVar != null) {
            return bktVar;
        }
        String strB = b(clsC);
        if (strB != null) {
            return new bku(strB, 2);
        }
        if (iD == 1) {
            return new bku(clsC, 1);
        }
        return new bku("Unable to create instance of " + String.valueOf(clsC) + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.", 3);
    }

    public final String toString() {
        return this.f21620a.toString();
    }
}
