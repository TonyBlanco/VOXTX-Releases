package c4;

import com.amazonaws.services.s3.model.InstructionFileId;
import d4.AbstractC1684a;
import d4.k0;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends AbstractC1264j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f18305h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f18306i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f18307j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public u(String str, long j9, long j10, long j11, File file) {
        super(str, j9, j10, j11, file);
    }

    public static u j(File file, long j9, long j10, C1267m c1267m) {
        File file2;
        String strK;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileQ = q(file, c1267m);
            if (fileQ == null) {
                return null;
            }
            file2 = fileQ;
            name = fileQ.getName();
        }
        Matcher matcher = f18307j.matcher(name);
        if (!matcher.matches() || (strK = c1267m.k(Integer.parseInt((String) AbstractC1684a.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j9 == -1 ? file2.length() : j9;
        if (length == 0) {
            return null;
        }
        return new u(strK, Long.parseLong((String) AbstractC1684a.e(matcher.group(2))), length, j10 == -9223372036854775807L ? Long.parseLong((String) AbstractC1684a.e(matcher.group(3))) : j10, file2);
    }

    public static u l(File file, long j9, C1267m c1267m) {
        return j(file, j9, -9223372036854775807L, c1267m);
    }

    public static u n(String str, long j9, long j10) {
        return new u(str, j9, j10, -9223372036854775807L, null);
    }

    public static u o(String str, long j9) {
        return new u(str, j9, -1L, -9223372036854775807L, null);
    }

    public static File p(File file, int i9, long j9, long j10) {
        return new File(file, i9 + InstructionFileId.DOT + j9 + InstructionFileId.DOT + j10 + ".v3.exo");
    }

    public static File q(File file, C1267m c1267m) {
        String strW1;
        String name = file.getName();
        Matcher matcher = f18306i.matcher(name);
        if (matcher.matches()) {
            strW1 = k0.w1((String) AbstractC1684a.e(matcher.group(1)));
        } else {
            matcher = f18305h.matcher(name);
            strW1 = matcher.matches() ? (String) AbstractC1684a.e(matcher.group(1)) : null;
        }
        if (strW1 == null) {
            return null;
        }
        File fileP = p((File) AbstractC1684a.i(file.getParentFile()), c1267m.f(strW1), Long.parseLong((String) AbstractC1684a.e(matcher.group(2))), Long.parseLong((String) AbstractC1684a.e(matcher.group(3))));
        if (file.renameTo(fileP)) {
            return fileP;
        }
        return null;
    }

    public u i(File file, long j9) {
        AbstractC1684a.g(this.f18247e);
        return new u(this.f18244a, this.f18245c, this.f18246d, j9, file);
    }
}
