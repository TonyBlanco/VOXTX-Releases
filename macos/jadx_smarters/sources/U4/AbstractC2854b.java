package u4;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import t4.C2775b;
import x4.C2957a;

/* JADX INFO: renamed from: u4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2854b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2775b f51209a = new C2775b("MetadataUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f51210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51211c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f51210b = strArr;
        f51211c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static Calendar a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f51209a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            f51209a.a("Invalid date format", new Object[0]);
            return null;
        }
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            str2 = "yyyyMMdd";
        } else {
            strD = strD + "T" + strE;
            str2 = strE.length() == 6 ? "yyyyMMdd'T'HHmmss" : f51211c;
        }
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat(str2).parse(strD));
            return calendar;
        } catch (ParseException e9) {
            f51209a.d(e9, "Error parsing string", new Object[0]);
            return null;
        }
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C2957a) it.next()).I());
        }
        return jSONArray;
    }

    public static void c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    list.add(new C2957a(jSONArray.getJSONObject(i9)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            f51209a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e9) {
            f51209a.d(e9, "Error extracting the date", new Object[0]);
            return null;
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            f51209a.a("string is empty or null", new Object[0]);
            return null;
        }
        int iIndexOf = str.indexOf(84);
        int i9 = iIndexOf + 1;
        if (iIndexOf != 8) {
            f51209a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String strSubstring = str.substring(i9);
            if (strSubstring.length() == 6) {
                return strSubstring;
            }
            char cCharAt = strSubstring.charAt(6);
            if (cCharAt != '+' && cCharAt != '-') {
                if (cCharAt == 'Z' && strSubstring.length() == f51210b[0].length() + 6) {
                    return String.valueOf(strSubstring.substring(0, strSubstring.length() - 1)).concat("+0000");
                }
                return null;
            }
            int length = strSubstring.length();
            String[] strArr = f51210b;
            if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                return strSubstring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
            }
            return null;
        } catch (IndexOutOfBoundsException e9) {
            f51209a.d(e9, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
