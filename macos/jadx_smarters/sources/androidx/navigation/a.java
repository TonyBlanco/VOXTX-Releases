package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f16305b;

    /* JADX INFO: renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static class C0187a extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Intent f16306k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f16307l;

        public C0187a(s sVar) {
            super(sVar);
        }

        public final ComponentName A() {
            Intent intent = this.f16306k;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String B() {
            return this.f16307l;
        }

        public final Intent D() {
            return this.f16306k;
        }

        public final C0187a E(String str) {
            if (this.f16306k == null) {
                this.f16306k = new Intent();
            }
            this.f16306k.setAction(str);
            return this;
        }

        public final C0187a F(ComponentName componentName) {
            if (this.f16306k == null) {
                this.f16306k = new Intent();
            }
            this.f16306k.setComponent(componentName);
            return this;
        }

        public final C0187a H(Uri uri) {
            if (this.f16306k == null) {
                this.f16306k = new Intent();
            }
            this.f16306k.setData(uri);
            return this;
        }

        public final C0187a I(String str) {
            this.f16307l = str;
            return this;
        }

        public final C0187a J(String str) {
            if (this.f16306k == null) {
                this.f16306k = new Intent();
            }
            this.f16306k.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.k
        public void p(Context context, AttributeSet attributeSet) {
            super.p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, v.f16457a);
            String string = typedArrayObtainAttributes.getString(v.f16462f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            J(string);
            String string2 = typedArrayObtainAttributes.getString(v.f16458b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                F(new ComponentName(context, string2));
            }
            E(typedArrayObtainAttributes.getString(v.f16459c));
            String string3 = typedArrayObtainAttributes.getString(v.f16460d);
            if (string3 != null) {
                H(Uri.parse(string3));
            }
            I(typedArrayObtainAttributes.getString(v.f16461e));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.k
        public String toString() {
            String strZ;
            ComponentName componentNameA = A();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameA == null) {
                strZ = z();
                if (strZ != null) {
                    sb.append(" action=");
                }
                return sb.toString();
            }
            sb.append(" class=");
            strZ = componentNameA.getClassName();
            sb.append(strZ);
            return sb.toString();
        }

        @Override // androidx.navigation.k
        public boolean y() {
            return false;
        }

        public final String z() {
            Intent intent = this.f16306k;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }
    }

    public a(Context context) {
        this.f16304a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f16305b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.s
    public boolean e() {
        Activity activity = this.f16305b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0187a a() {
        return new C0187a(this);
    }

    public final Context g() {
        return this.f16304a;
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k b(C0187a c0187a, Bundle bundle, p pVar, s.a aVar) {
        Intent intent;
        int intExtra;
        if (c0187a.D() == null) {
            throw new IllegalStateException("Destination " + c0187a.i() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(c0187a.D());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strB = c0187a.B();
            if (!TextUtils.isEmpty(strB)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strB);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strB);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(bundle.get(strGroup).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (!(this.f16304a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (pVar != null && pVar.g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f16305b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0187a.i());
        Resources resources = g().getResources();
        if (pVar != null) {
            int iC = pVar.c();
            int iD = pVar.d();
            if ((iC <= 0 || !resources.getResourceTypeName(iC).equals("animator")) && (iD <= 0 || !resources.getResourceTypeName(iD).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + "when launching " + c0187a);
            }
        }
        this.f16304a.startActivity(intent2);
        if (pVar == null || this.f16305b == null) {
            return null;
        }
        int iA = pVar.a();
        int iB = pVar.b();
        if ((iA <= 0 || !resources.getResourceTypeName(iA).equals("animator")) && (iB <= 0 || !resources.getResourceTypeName(iB).equals("animator"))) {
            if (iA < 0 && iB < 0) {
                return null;
            }
            this.f16305b.overridePendingTransition(Math.max(iA, 0), Math.max(iB, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + c0187a);
        return null;
    }
}
