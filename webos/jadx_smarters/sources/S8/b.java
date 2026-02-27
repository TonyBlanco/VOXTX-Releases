package S8;

import v1.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements s {
    public static final b AWSDATETIME = new C0118b("AWSDATETIME", 0);
    public static final b ID = new b("ID", 1) { // from class: S8.b.c
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "ID";
        }
    };
    public static final b AWSDATE = new b("AWSDATE", 2) { // from class: S8.b.d
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSDate";
        }
    };
    public static final b AWSTIME = new b("AWSTIME", 3) { // from class: S8.b.e
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSTime";
        }
    };
    public static final b AWSTIMESTAMP = new b("AWSTIMESTAMP", 4) { // from class: S8.b.f
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return Long.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSTimestamp";
        }
    };
    public static final b AWSEMAIL = new b("AWSEMAIL", 5) { // from class: S8.b.g
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSEmail";
        }
    };
    public static final b AWSJSON = new b("AWSJSON", 6) { // from class: S8.b.h
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSJSON";
        }
    };
    public static final b AWSURL = new b("AWSURL", 7) { // from class: S8.b.i
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSURL";
        }
    };
    public static final b AWSPHONE = new b("AWSPHONE", 8) { // from class: S8.b.j
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSPhone";
        }
    };
    public static final b AWSIPADDRESS = new b("AWSIPADDRESS", 9) { // from class: S8.b.a
        {
            C0118b c0118b = null;
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSIPAddress";
        }
    };
    private static final /* synthetic */ b[] $VALUES = $values();

    /* JADX INFO: renamed from: S8.b$b, reason: collision with other inner class name */
    public enum C0118b extends b {
        public C0118b(String str, int i9) {
            super(str, i9, null);
        }

        @Override // S8.b, v1.s
        public Class javaType() {
            return String.class;
        }

        @Override // S8.b, v1.s
        public String typeName() {
            return "AWSDateTime";
        }
    }

    private static /* synthetic */ b[] $values() {
        return new b[]{AWSDATETIME, ID, AWSDATE, AWSTIME, AWSTIMESTAMP, AWSEMAIL, AWSJSON, AWSURL, AWSPHONE, AWSIPADDRESS};
    }

    private b(String str, int i9) {
    }

    public /* synthetic */ b(String str, int i9, C0118b c0118b) {
        this(str, i9);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // v1.s
    public abstract /* synthetic */ Class javaType();

    @Override // v1.s
    public abstract /* synthetic */ String typeName();
}
