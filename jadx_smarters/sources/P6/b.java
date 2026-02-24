package P6;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {
    public b(D6.a aVar) {
        super(aVar);
    }

    @Override // P6.i
    public void h(StringBuilder sb, int i9) {
        sb.append(i9 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // P6.i
    public int i(int i9) {
        return i9 < 10000 ? i9 : i9 - Constants.MAXIMUM_UPLOAD_PARTS;
    }
}
