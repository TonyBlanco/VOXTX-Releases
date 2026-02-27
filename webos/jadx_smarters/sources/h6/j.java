package h6;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i9) {
            this.code = i9;
        }

        public int getCode() {
            return this.code;
        }
    }

    a b(String str);
}
