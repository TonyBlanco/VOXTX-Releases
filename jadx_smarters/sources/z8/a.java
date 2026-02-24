package z8;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends c {
    @Override // z8.c
    public int b(int i9) {
        return d.e(e().nextInt(), i9);
    }

    @Override // z8.c
    public int c() {
        return e().nextInt();
    }

    public abstract Random e();
}
