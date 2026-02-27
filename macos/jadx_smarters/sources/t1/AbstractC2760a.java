package t1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2760a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f50608a;

    public AbstractC2760a(Context context) {
        this.f50608a = context;
    }

    public Context a() {
        return this.f50608a;
    }

    public final SharedPreferences b() {
        return PreferenceManager.getDefaultSharedPreferences(a());
    }

    public String c() {
        return a().getPackageName() + "_preferences";
    }

    public boolean d(String str, boolean z9) {
        SharedPreferences sharedPreferencesB = b();
        return sharedPreferencesB != null ? sharedPreferencesB.getBoolean(str, z9) : z9;
    }

    public String e(String str, String str2) {
        SharedPreferences sharedPreferencesB = b();
        return sharedPreferencesB != null ? sharedPreferencesB.getString(str, str2) : str2;
    }

    public boolean f(String str, Boolean bool) {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putBoolean(str, bool.booleanValue());
        editorEdit.commit();
        return true;
    }

    public boolean g(String str, String str2) {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
        return true;
    }
}
