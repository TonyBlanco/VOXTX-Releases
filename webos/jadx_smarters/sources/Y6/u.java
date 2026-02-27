package Y6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Collection f10730d = e("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Collection f10731e = e("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Collection f10732f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10733a = new HashMap(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f10734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f10735c;

    public static List e(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final void a(Intent intent) {
        Serializable serializable;
        for (Map.Entry entry : this.f10733a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                serializable = (Integer) value;
            } else if (value instanceof Long) {
                serializable = (Long) value;
            } else if (value instanceof Boolean) {
                serializable = (Boolean) value;
            } else if (value instanceof Double) {
                serializable = (Double) value;
            } else if (value instanceof Float) {
                serializable = (Float) value;
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
            intent.putExtra(str, serializable);
        }
    }

    public Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) c());
        intent.setAction("com.google.zxing.client.android.SCAN");
        if (this.f10734b != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f10734b) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
            }
            intent.putExtra("SCAN_FORMATS", sb.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        a(intent);
        return intent;
    }

    public Class c() {
        if (this.f10735c == null) {
            this.f10735c = d();
        }
        return this.f10735c;
    }

    public Class d() {
        return CaptureActivity.class;
    }

    public u f(Class cls) {
        this.f10735c = cls;
        return this;
    }
}
