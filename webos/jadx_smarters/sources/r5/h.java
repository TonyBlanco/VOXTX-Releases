package R5;

import Q5.B;
import Q5.C;
import Q5.C1040a;
import android.util.Base64;
import android.util.JsonReader;
import c6.InterfaceC1275a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1275a f9313a = new e6.d().i(C1040a.f8044a).j(true).h();

    public interface a {
        Object a(JsonReader jsonReader);
    }

    public static B.d A(JsonReader jsonReader) throws IOException {
        B.d.a aVarA = B.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarA.b(l(jsonReader, new a() { // from class: R5.d
                    @Override // R5.h.a
                    public final Object a(JsonReader jsonReader2) {
                        return h.z(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.AbstractC0108e B(JsonReader jsonReader) throws IOException {
        B.e.AbstractC0108e.a aVarA = B.e.AbstractC0108e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B C(JsonReader jsonReader) throws IOException {
        B.b bVarB = B.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.h(A(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.j(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(k(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.i(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.k(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    public static B.e D(JsonReader jsonReader) throws IOException {
        B.e.b bVarA = B.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(o(jsonReader));
                    break;
                case "events":
                    bVarA.g(l(jsonReader, new a() { // from class: R5.c
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.p(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(B(jsonReader));
                    break;
                case "app":
                    bVarA.b(j(jsonReader));
                    break;
                case "user":
                    bVarA.n(E(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static B.e.f E(JsonReader jsonReader) throws IOException {
        B.e.f.a aVarA = B.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.a j(JsonReader jsonReader) throws IOException {
        B.e.a.AbstractC0095a abstractC0095aA = B.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0095aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0095aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0095aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0095aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0095aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0095aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0095aA.a();
    }

    public static B.a k(JsonReader jsonReader) throws IOException {
        B.a.b bVarA = B.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(l(jsonReader, new a() { // from class: R5.a
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.m(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static C l(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return C.a(arrayList);
    }

    public static B.a.AbstractC0093a m(JsonReader jsonReader) throws IOException {
        B.a.AbstractC0093a.AbstractC0094a abstractC0094aA = B.a.AbstractC0093a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC0094aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0094aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0094aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0094aA.a();
    }

    public static B.c n(JsonReader jsonReader) throws IOException {
        B.c.a aVarA = B.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.c o(JsonReader jsonReader) throws IOException {
        B.e.c.a aVarA = B.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.d p(JsonReader jsonReader) throws IOException {
        B.e.d.b bVarA = B.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarA.c(s(jsonReader));
                    break;
                case "app":
                    bVarA.b(q(jsonReader));
                    break;
                case "log":
                    bVarA.d(w(jsonReader));
                    break;
                case "type":
                    bVarA.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static B.e.d.a q(JsonReader jsonReader) throws IOException {
        B.e.d.a.AbstractC0096a abstractC0096aA = B.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "background":
                    abstractC0096aA.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0096aA.d(t(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0096aA.e(l(jsonReader, new a() { // from class: R5.b
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.n(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0096aA.c(l(jsonReader, new a() { // from class: R5.b
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.n(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0096aA.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0096aA.a();
    }

    public static B.e.d.a.b.AbstractC0097a r(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.AbstractC0097a.AbstractC0098a abstractC0098aA = B.e.d.a.b.AbstractC0097a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC0098aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0098aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0098aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0098aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0098aA.a();
    }

    public static B.e.d.c s(JsonReader jsonReader) throws IOException {
        B.e.d.c.a aVarA = B.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.d.a.b t(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.AbstractC0099b abstractC0099bA = B.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0099bA.b(k(jsonReader));
                    break;
                case "threads":
                    abstractC0099bA.f(l(jsonReader, new a() { // from class: R5.e
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.y(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0099bA.e(x(jsonReader));
                    break;
                case "binaries":
                    abstractC0099bA.c(l(jsonReader, new a() { // from class: R5.f
                        @Override // R5.h.a
                        public final Object a(JsonReader jsonReader2) {
                            return h.r(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0099bA.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0099bA.a();
    }

    public static B.e.d.a.b.c u(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.c.AbstractC0100a abstractC0100aA = B.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0100aA.c(l(jsonReader, new g()));
                    break;
                case "reason":
                    abstractC0100aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0100aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0100aA.b(u(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0100aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0100aA.a();
    }

    public static B.e.d.a.b.AbstractC0103e.AbstractC0105b v(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.AbstractC0103e.AbstractC0105b.AbstractC0106a abstractC0106aA = B.e.d.a.b.AbstractC0103e.AbstractC0105b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0106aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0106aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0106aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0106aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0106aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0106aA.a();
    }

    public static B.e.d.AbstractC0107d w(JsonReader jsonReader) throws IOException {
        B.e.d.AbstractC0107d.a aVarA = B.e.d.AbstractC0107d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static B.e.d.a.b.AbstractC0101d x(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.AbstractC0101d.AbstractC0102a abstractC0102aA = B.e.d.a.b.AbstractC0101d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0102aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0102aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0102aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0102aA.a();
    }

    public static B.e.d.a.b.AbstractC0103e y(JsonReader jsonReader) throws IOException {
        B.e.d.a.b.AbstractC0103e.AbstractC0104a abstractC0104aA = B.e.d.a.b.AbstractC0103e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0104aA.b(l(jsonReader, new g()));
                    break;
                case "name":
                    abstractC0104aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0104aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0104aA.a();
    }

    public static B.d.b z(JsonReader jsonReader) throws IOException {
        B.d.b.a aVarA = B.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public B F(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B bC = C(jsonReader);
                jsonReader.close();
                return bC;
            } finally {
            }
        } catch (IllegalStateException e9) {
            throw new IOException(e9);
        }
    }

    public String G(B b9) {
        return f9313a.encode(b9);
    }

    public B.e.d h(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B.e.d dVarP = p(jsonReader);
                jsonReader.close();
                return dVarP;
            } finally {
            }
        } catch (IllegalStateException e9) {
            throw new IOException(e9);
        }
    }

    public String i(B.e.d dVar) {
        return f9313a.encode(dVar);
    }
}
