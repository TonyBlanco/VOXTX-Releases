package E1;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    IDLE,
    ACTIVE,
    TERMINATED,
    CANCELED;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f1567a;

        public a(c cVar) {
            this.f1567a = cVar;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public String a(c... cVarArr) {
            StringBuilder sb = new StringBuilder("Expected: " + this.f1567a.name() + ", but found [");
            int length = cVarArr.length;
            String str = "";
            int i9 = 0;
            while (i9 < length) {
                c cVar = cVarArr[i9];
                sb.append(str);
                sb.append(cVar.name());
                i9++;
                str = ", ";
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
