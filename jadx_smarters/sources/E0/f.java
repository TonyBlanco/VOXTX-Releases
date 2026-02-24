package E0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f1540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f1541d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f1545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f1547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f1548g;

        public a(String str, String str2, boolean z9, int i9, String str3, int i10) {
            this.f1542a = str;
            this.f1543b = str2;
            this.f1545d = z9;
            this.f1546e = i9;
            this.f1544c = a(str2);
            this.f1547f = str3;
            this.f1548g = i10;
        }

        public static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1546e != aVar.f1546e || !this.f1542a.equals(aVar.f1542a) || this.f1545d != aVar.f1545d) {
                return false;
            }
            if (this.f1548g == 1 && aVar.f1548g == 2 && (str3 = this.f1547f) != null && !str3.equals(aVar.f1547f)) {
                return false;
            }
            if (this.f1548g == 2 && aVar.f1548g == 1 && (str2 = aVar.f1547f) != null && !str2.equals(this.f1547f)) {
                return false;
            }
            int i9 = this.f1548g;
            return (i9 == 0 || i9 != aVar.f1548g || ((str = this.f1547f) == null ? aVar.f1547f == null : str.equals(aVar.f1547f))) && this.f1544c == aVar.f1544c;
        }

        public int hashCode() {
            return (((((this.f1542a.hashCode() * 31) + this.f1544c) * 31) + (this.f1545d ? 1231 : 1237)) * 31) + this.f1546e;
        }

        public String toString() {
            return "Column{name='" + this.f1542a + "', type='" + this.f1543b + "', affinity='" + this.f1544c + "', notNull=" + this.f1545d + ", primaryKeyPosition=" + this.f1546e + ", defaultValue='" + this.f1547f + "'}";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f1552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f1553e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f1549a = str;
            this.f1550b = str2;
            this.f1551c = str3;
            this.f1552d = Collections.unmodifiableList(list);
            this.f1553e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f1549a.equals(bVar.f1549a) && this.f1550b.equals(bVar.f1550b) && this.f1551c.equals(bVar.f1551c) && this.f1552d.equals(bVar.f1552d)) {
                return this.f1553e.equals(bVar.f1553e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f1549a.hashCode() * 31) + this.f1550b.hashCode()) * 31) + this.f1551c.hashCode()) * 31) + this.f1552d.hashCode()) * 31) + this.f1553e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f1549a + "', onDelete='" + this.f1550b + "', onUpdate='" + this.f1551c + "', columnNames=" + this.f1552d + ", referenceColumnNames=" + this.f1553e + '}';
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1554a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f1556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f1557e;

        public c(int i9, int i10, String str, String str2) {
            this.f1554a = i9;
            this.f1555c = i10;
            this.f1556d = str;
            this.f1557e = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i9 = this.f1554a - cVar.f1554a;
            return i9 == 0 ? this.f1555c - cVar.f1555c : i9;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f1560c;

        public d(String str, boolean z9, List list) {
            this.f1558a = str;
            this.f1559b = z9;
            this.f1560c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f1559b == dVar.f1559b && this.f1560c.equals(dVar.f1560c)) {
                return this.f1558a.startsWith("index_") ? dVar.f1558a.startsWith("index_") : this.f1558a.equals(dVar.f1558a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f1558a.startsWith("index_") ? -1184239155 : this.f1558a.hashCode()) * 31) + (this.f1559b ? 1 : 0)) * 31) + this.f1560c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f1558a + "', unique=" + this.f1559b + ", columns=" + this.f1560c + '}';
        }
    }

    public f(String str, Map map, Set set, Set set2) {
        this.f1538a = str;
        this.f1539b = Collections.unmodifiableMap(map);
        this.f1540c = Collections.unmodifiableSet(set);
        this.f1541d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(G0.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    public static Map b(G0.b bVar, String str) {
        Cursor cursorU = bVar.U("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorU.getColumnCount() > 0) {
                int columnIndex = cursorU.getColumnIndex("name");
                int columnIndex2 = cursorU.getColumnIndex("type");
                int columnIndex3 = cursorU.getColumnIndex("notnull");
                int columnIndex4 = cursorU.getColumnIndex("pk");
                int columnIndex5 = cursorU.getColumnIndex("dflt_value");
                while (cursorU.moveToNext()) {
                    String string = cursorU.getString(columnIndex);
                    map.put(string, new a(string, cursorU.getString(columnIndex2), cursorU.getInt(columnIndex3) != 0, cursorU.getInt(columnIndex4), cursorU.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorU.close();
        }
    }

    public static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Name.MARK);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < count; i9++) {
            cursor.moveToPosition(i9);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set d(G0.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorU = bVar.U("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorU.getColumnIndex(Name.MARK);
            int columnIndex2 = cursorU.getColumnIndex("seq");
            int columnIndex3 = cursorU.getColumnIndex("table");
            int columnIndex4 = cursorU.getColumnIndex("on_delete");
            int columnIndex5 = cursorU.getColumnIndex("on_update");
            List<c> listC = c(cursorU);
            int count = cursorU.getCount();
            for (int i9 = 0; i9 < count; i9++) {
                cursorU.moveToPosition(i9);
                if (cursorU.getInt(columnIndex2) == 0) {
                    int i10 = cursorU.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f1554a == i10) {
                            arrayList.add(cVar.f1556d);
                            arrayList2.add(cVar.f1557e);
                        }
                    }
                    hashSet.add(new b(cursorU.getString(columnIndex3), cursorU.getString(columnIndex4), cursorU.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            cursorU.close();
            return hashSet;
        } catch (Throwable th) {
            cursorU.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static d e(G0.b bVar, String str, boolean z9) {
        Cursor cursorU = bVar.U("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorU.getColumnIndex("seqno");
            int columnIndex2 = cursorU.getColumnIndex("cid");
            int columnIndex3 = cursorU.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorU.moveToNext()) {
                    if (cursorU.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorU.getInt(columnIndex)), cursorU.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z9, arrayList);
                cursorU.close();
                return dVar;
            }
            cursorU.close();
            return null;
        } catch (Throwable th) {
            cursorU.close();
            throw th;
        }
    }

    public static Set f(G0.b bVar, String str) {
        Cursor cursorU = bVar.U("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorU.getColumnIndex("name");
            int columnIndex2 = cursorU.getColumnIndex("origin");
            int columnIndex3 = cursorU.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorU.moveToNext()) {
                    if ("c".equals(cursorU.getString(columnIndex2))) {
                        String string = cursorU.getString(columnIndex);
                        boolean z9 = true;
                        if (cursorU.getInt(columnIndex3) != 1) {
                            z9 = false;
                        }
                        d dVarE = e(bVar, string, z9);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorU.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f1538a;
        if (str == null ? fVar.f1538a != null : !str.equals(fVar.f1538a)) {
            return false;
        }
        Map map = this.f1539b;
        if (map == null ? fVar.f1539b != null : !map.equals(fVar.f1539b)) {
            return false;
        }
        Set set2 = this.f1540c;
        if (set2 == null ? fVar.f1540c != null : !set2.equals(fVar.f1540c)) {
            return false;
        }
        Set set3 = this.f1541d;
        if (set3 == null || (set = fVar.f1541d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f1538a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f1539b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f1540c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f1538a + "', columns=" + this.f1539b + ", foreignKeys=" + this.f1540c + ", indices=" + this.f1541d + '}';
    }
}
