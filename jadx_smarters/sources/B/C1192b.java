package b;

import B8.h;
import android.content.Context;
import android.content.Intent;
import b.AbstractC1191a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import k8.i;
import k8.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.AbstractC2204A;
import l8.AbstractC2205B;
import l8.s;

/* JADX INFO: renamed from: b.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1192b extends AbstractC1191a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17419a = new a(null);

    /* JADX INFO: renamed from: b.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] input) {
            l.e(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            l.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        l.e(context, "context");
        l.e(input, "input");
        return f17419a.a(input);
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1191a.C0206a b(Context context, String[] input) {
        l.e(context, "context");
        l.e(input, "input");
        if (input.length == 0) {
            return new AbstractC1191a.C0206a(AbstractC2205B.d());
        }
        for (String str : input) {
            if (E.b.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.c(AbstractC2204A.a(input.length), 16));
        for (String str2 : input) {
            i iVarA = m.a(str2, Boolean.TRUE);
            linkedHashMap.put(iVarA.c(), iVarA.d());
        }
        return new AbstractC1191a.C0206a(linkedHashMap);
    }

    @Override // b.AbstractC1191a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i9, Intent intent) {
        if (i9 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return AbstractC2205B.d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i10 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i10 == 0));
            }
            return AbstractC2205B.j(s.Q(l8.h.o(stringArrayExtra), arrayList));
        }
        return AbstractC2205B.d();
    }
}
