package B6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f692a = "g";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f693b = Pattern.compile(",");

    public static Map a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2964e.class);
        for (EnumC2964e enumC2964e : EnumC2964e.values()) {
            if (enumC2964e != EnumC2964e.CHARACTER_SET && enumC2964e != EnumC2964e.NEED_RESULT_POINT_CALLBACK && enumC2964e != EnumC2964e.POSSIBLE_FORMATS) {
                String strName = enumC2964e.name();
                if (extras.containsKey(strName)) {
                    if (enumC2964e.getValueType().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(strName);
                        if (!enumC2964e.getValueType().isInstance(obj)) {
                            Log.w(f692a, "Ignoring hint " + enumC2964e + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put(enumC2964e, obj);
                }
            }
        }
        Log.i(f692a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
