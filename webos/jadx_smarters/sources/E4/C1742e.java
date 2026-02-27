package e4;

import com.amazonaws.services.s3.model.InstructionFileId;
import d4.M;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1742e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40244c;

    public C1742e(int i9, int i10, String str) {
        this.f40242a = i9;
        this.f40243b = i10;
        this.f40244c = str;
    }

    public static C1742e a(M m9) {
        String str;
        m9.V(2);
        int iH = m9.H();
        int i9 = iH >> 1;
        int iH2 = ((m9.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i9 == 4 || i9 == 5 || i9 == 7) {
            str = "dvhe";
        } else if (i9 == 8) {
            str = "hev1";
        } else {
            if (i9 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i9);
        sb.append(iH2 >= 10 ? InstructionFileId.DOT : ".0");
        sb.append(iH2);
        return new C1742e(i9, iH2, sb.toString());
    }
}
