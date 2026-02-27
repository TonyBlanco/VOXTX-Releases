package androidx.datastore.preferences.protobuf;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1122g f14699a;

        public a(AbstractC1122g abstractC1122g) {
            this.f14699a = abstractC1122g;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public byte a(int i9) {
            return this.f14699a.b(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int size() {
            return this.f14699a.size();
        }
    }

    public interface b {
        byte a(int i9);

        int size();
    }

    public static String a(AbstractC1122g abstractC1122g) {
        return b(new a(abstractC1122g));
    }

    public static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i9 = 0; i9 < bVar.size(); i9++) {
            int iA = bVar.a(i9);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(AbstractC1122g.g(str));
    }
}
