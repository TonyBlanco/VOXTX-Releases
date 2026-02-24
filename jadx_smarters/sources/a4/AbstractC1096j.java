package a4;

import android.graphics.Color;
import com.amazonaws.services.s3.model.InstructionFileId;
import d4.k0;

/* JADX INFO: renamed from: a4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1096j {
    public static String a(String str) {
        return InstructionFileId.DOT + str + ",." + str + " *";
    }

    public static String b(int i9) {
        return k0.D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Double.valueOf(((double) Color.alpha(i9)) / 255.0d));
    }
}
