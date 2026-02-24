package com.google.ads.interactivemedia.v3.impl.data;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import com.google.ads.interactivemedia.v3.internal.atf;
import com.google.ads.interactivemedia.v3.internal.bjk;
import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k {
    public static Application a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static boolean b(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String d(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (h(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (h(c9)) {
                        charArray[i9] = (char) (c9 ^ TokenParser.SP);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String e(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (g(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (g(c9)) {
                        charArray[i9] = (char) (c9 ^ TokenParser.SP);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static boolean f(CharSequence charSequence, CharSequence charSequence2) {
        int iJ;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = charSequence.charAt(i9);
            char cCharAt2 = charSequence2.charAt(i9);
            if (cCharAt != cCharAt2 && ((iJ = j(cCharAt)) >= 26 || iJ != j(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean h(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static final boolean i(bjk bjkVar) {
        atf atfVar = (atf) bjkVar.a().getAnnotation(atf.class);
        return atfVar != null && Arrays.asList(atfVar.b()).contains(bjkVar.b());
    }

    private static int j(char c9) {
        return (char) ((c9 | TokenParser.SP) - 97);
    }
}
