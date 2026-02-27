package f6;

/* JADX INFO: renamed from: f6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public @interface InterfaceC1780d {

    /* JADX INFO: renamed from: f6.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
