package u3;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q3.C2540a;
import q3.C2544e;
import q3.h;
import r5.AbstractC2673b;
import r5.AbstractC2675d;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2850a extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f51197c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f51198a = AbstractC2675d.f49724c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f51199b = AbstractC2675d.f49723b.newDecoder();

    @Override // q3.h
    public C2540a b(C2544e c2544e, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new C2540a(new C2852c(bArr, null, null));
        }
        Matcher matcher = f51197c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = AbstractC2673b.e(strGroup);
                strE.hashCode();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C2540a(new C2852c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder;
        try {
            string = this.f51198a.decode(byteBuffer).toString();
            charsetDecoder = this.f51198a;
        } catch (CharacterCodingException unused) {
            this.f51198a.reset();
            byteBuffer.rewind();
            try {
                string = this.f51199b.decode(byteBuffer).toString();
                charsetDecoder = this.f51199b;
            } catch (CharacterCodingException unused2) {
                this.f51199b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f51199b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f51198a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return string;
    }
}
