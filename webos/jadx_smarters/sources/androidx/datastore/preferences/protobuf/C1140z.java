package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1140z extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f14773a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C1140z {
        public a(String str) {
            super(str);
        }
    }

    public C1140z(String str) {
        super(str);
        this.f14773a = null;
    }

    public static C1140z a() {
        return new C1140z("Protocol message end-group tag did not match expected tag.");
    }

    public static C1140z b() {
        return new C1140z("Protocol message contained an invalid tag (zero).");
    }

    public static C1140z c() {
        return new C1140z("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C1140z e() {
        return new C1140z("CodedInputStream encountered a malformed varint.");
    }

    public static C1140z f() {
        return new C1140z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1140z g() {
        return new C1140z("Failed to parse the message.");
    }

    public static C1140z h() {
        return new C1140z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C1140z j() {
        return new C1140z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C1140z k() {
        return new C1140z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C1140z i(O o9) {
        this.f14773a = o9;
        return this;
    }
}
