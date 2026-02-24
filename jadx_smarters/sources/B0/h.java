package b0;

import Y.k;
import a0.AbstractC1076d;
import a0.f;
import a0.h;
import androidx.datastore.preferences.protobuf.AbstractC1137w;
import b0.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k8.q;
import kotlin.jvm.internal.l;
import l8.s;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f17435a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17436b = "preferences_pb";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17437a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f17437a = iArr;
        }
    }

    @Override // Y.k
    public Object c(InputStream inputStream, InterfaceC2372d interfaceC2372d) throws Y.a {
        a0.f fVarA = AbstractC1076d.f11439a.a(inputStream);
        C1194a c1194aB = e.b(new d.b[0]);
        Map mapK = fVarA.K();
        l.d(mapK, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapK.entrySet()) {
            String name = (String) entry.getKey();
            a0.h value = (a0.h) entry.getValue();
            h hVar = f17435a;
            l.d(name, "name");
            l.d(value, "value");
            hVar.d(name, value, c1194aB);
        }
        return c1194aB.d();
    }

    public final void d(String str, a0.h hVar, C1194a c1194a) throws Y.a {
        d.a aVarA;
        Object objValueOf;
        h.b bVarX = hVar.X();
        switch (bVarX == null ? -1 : a.f17437a[bVarX.ordinal()]) {
            case -1:
                throw new Y.a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new k8.h();
            case 1:
                aVarA = f.a(str);
                objValueOf = Boolean.valueOf(hVar.P());
                break;
            case 2:
                aVarA = f.c(str);
                objValueOf = Float.valueOf(hVar.S());
                break;
            case 3:
                aVarA = f.b(str);
                objValueOf = Double.valueOf(hVar.R());
                break;
            case 4:
                aVarA = f.d(str);
                objValueOf = Integer.valueOf(hVar.T());
                break;
            case 5:
                aVarA = f.e(str);
                objValueOf = Long.valueOf(hVar.U());
                break;
            case 6:
                aVarA = f.f(str);
                objValueOf = hVar.V();
                l.d(objValueOf, "value.string");
                break;
            case 7:
                aVarA = f.g(str);
                List listM = hVar.W().M();
                l.d(listM, "value.stringSet.stringsList");
                objValueOf = s.O(listM);
                break;
            case 8:
                throw new Y.a("Value not set.", null, 2, null);
        }
        c1194a.i(aVarA, objValueOf);
    }

    @Override // Y.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f17436b;
    }

    public final a0.h g(Object obj) {
        AbstractC1137w abstractC1137wL;
        String str;
        if (obj instanceof Boolean) {
            abstractC1137wL = a0.h.Y().u(((Boolean) obj).booleanValue()).l();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            abstractC1137wL = a0.h.Y().w(((Number) obj).floatValue()).l();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            abstractC1137wL = a0.h.Y().v(((Number) obj).doubleValue()).l();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            abstractC1137wL = a0.h.Y().x(((Number) obj).intValue()).l();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            abstractC1137wL = a0.h.Y().y(((Number) obj).longValue()).l();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            abstractC1137wL = a0.h.Y().z((String) obj).l();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(l.l("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            abstractC1137wL = a0.h.Y().A(a0.g.N().u((Set) obj)).l();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        l.d(abstractC1137wL, str);
        return (a0.h) abstractC1137wL;
    }

    @Override // Y.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object b(d dVar, OutputStream outputStream, InterfaceC2372d interfaceC2372d) {
        Map mapA = dVar.a();
        f.a aVarN = a0.f.N();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarN.u(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((a0.f) aVarN.l()).l(outputStream);
        return q.f43674a;
    }
}
