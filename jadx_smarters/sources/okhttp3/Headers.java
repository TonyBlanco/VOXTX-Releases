package okhttp3;

import B8.h;
import E8.n;
import E8.o;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import k8.i;
import k8.m;
import kotlin.jvm.internal.AbstractC2155b;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.k;
import l8.p;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Headers implements Iterable<i>, x8.a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            l.e(line, "line");
            int iQ = o.Q(line, ':', 0, false, 6, null);
            if (!(iQ != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iQ);
            l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (strSubstring == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string = o.D0(strSubstring).toString();
            String strSubstring2 = line.substring(iQ + 1);
            l.d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            l.e(name, "name");
            l.e(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            l.e(name, "name");
            l.e(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            l.e(headers, "headers");
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                addLenient$okhttp(headers.name(i9), headers.value(i9));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            l.e(line, "line");
            int iQ = o.Q(line, ':', 1, false, 4, null);
            if (iQ != -1) {
                String strSubstring = line.substring(0, iQ);
                l.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iQ + 1);
                l.d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else {
                if (line.charAt(0) == ':') {
                    line = line.substring(1);
                    l.d(line, "(this as java.lang.String).substring(startIndex)");
                }
                addLenient$okhttp("", line);
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(o.D0(value).toString());
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @Nullable
        public final String get(@NotNull String name) {
            l.e(name, "name");
            B8.a aVarL = h.l(h.j(this.namesAndValues.size() - 2, 0), 2);
            int iD = aVarL.d();
            int iF = aVarL.f();
            int iG = aVarL.g();
            if (iG >= 0) {
                if (iD > iF) {
                    return null;
                }
            } else if (iD < iF) {
                return null;
            }
            while (!n.o(name, this.namesAndValues.get(iD), true)) {
                if (iD == iF) {
                    return null;
                }
                iD += iG;
            }
            return this.namesAndValues.get(iD + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            l.e(name, "name");
            int i9 = 0;
            while (i9 < this.namesAndValues.size()) {
                if (n.o(name, this.namesAndValues.get(i9), true)) {
                    this.namesAndValues.remove(i9);
                    this.namesAndValues.remove(i9);
                    i9 -= 2;
                }
                i9 += 2;
            }
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            l.e(name, "name");
            l.e(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            l.e(name, "name");
            l.e(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i9), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i9), str2));
                    sb.append(Util.isSensitiveHeader(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            B8.a aVarL = h.l(h.j(strArr.length - 2, 0), 2);
            int iD = aVarL.d();
            int iF = aVarL.f();
            int iG = aVarL.g();
            if (iG >= 0) {
                if (iD > iF) {
                    return null;
                }
            } else if (iD < iF) {
                return null;
            }
            while (!n.o(str, strArr[iD], true)) {
                if (iD == iF) {
                    return null;
                }
                iD += iG;
            }
            return strArr[iD + 1];
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m75deprecated_of(@NotNull Map<String, String> headers) {
            l.e(headers, "headers");
            return of(headers);
        }

        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m76deprecated_of(@NotNull String... namesAndValues) {
            l.e(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @NotNull
        public final Headers of(@NotNull Map<String, String> toHeaders) {
            l.e(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i9 = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = o.D0(key).toString();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string2 = o.D0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i9] = string;
                strArr[i9 + 1] = string2;
                i9 += 2;
            }
            return new Headers(strArr, null);
        }

        @NotNull
        public final Headers of(@NotNull String... namesAndValues) throws CloneNotSupportedException {
            l.e(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                String str = strArr[i9];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i9] = o.D0(str).toString();
            }
            B8.a aVarL = h.l(l8.h.q(strArr), 2);
            int iD = aVarL.d();
            int iF = aVarL.f();
            int iG = aVarL.g();
            if (iG < 0 ? iD >= iF : iD <= iF) {
                while (true) {
                    String str2 = strArr[iD];
                    String str3 = strArr[iD + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (iD == iF) {
                        break;
                    }
                    iD += iG;
                }
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, g gVar) {
        this(strArr);
    }

    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return Companion.of(map);
    }

    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return Companion.of(strArr);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m74deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i9 = 0; i9 < length2; i9++) {
            length += (long) this.namesAndValues[i9].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String name) {
        l.e(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        l.e(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        l.e(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<i> iterator() {
        int size = size();
        i[] iVarArr = new i[size];
        for (int i9 = 0; i9 < size; i9++) {
            iVarArr[i9] = m.a(name(i9), value(i9));
        }
        return AbstractC2155b.a(iVarArr);
    }

    @NotNull
    public final String name(int i9) {
        return this.namesAndValues[i9 * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(n.p(E.f43679a));
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            treeSet.add(name(i9));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        l.d(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        p.r(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(n.p(E.f43679a));
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = name(i9);
            Locale locale = Locale.US;
            l.d(locale, "Locale.US");
            if (strName == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i9));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = name(i9);
            String strValue = value(i9);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String value(int i9) {
        return this.namesAndValues[(i9 * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        l.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if (n.o(name, name(i9), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i9));
            }
        }
        if (arrayList == null) {
            return k.f();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        l.d(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }
}
