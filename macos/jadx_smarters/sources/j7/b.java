package j7;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.util.Mimetypes;
import d.AbstractC1617D;
import j7.AbstractC2103a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC2103a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f43091j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f43092k = new C0360b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Map f43093l = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f43094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f43095i;

    public class a extends ArrayList {
        public a() {
            add("index.html");
            add("index.htm");
        }
    }

    /* JADX INFO: renamed from: j7.b$b, reason: collision with other inner class name */
    public class C0360b extends HashMap {
        public C0360b() {
            put("css", "text/css");
            put("htm", Mimetypes.MIMETYPE_HTML);
            put("html", Mimetypes.MIMETYPE_HTML);
            put("xml", "text/xml");
            put("java", "text/x-java-source, text/java");
            put("md", HTTP.PLAIN_TEXT_TYPE);
            put("txt", HTTP.PLAIN_TEXT_TYPE);
            put("asc", HTTP.PLAIN_TEXT_TYPE);
            put("gif", "image/gif");
            put("jpg", "image/jpeg");
            put("jpeg", "image/jpeg");
            put("png", "image/png");
            put("mp3", "audio/mpeg");
            put("m3u", "audio/mpeg-url");
            put("mp4", "video/mp4");
            put("ogv", "video/ogg");
            put("flv", "video/x-flv");
            put("mov", "video/quicktime");
            put(ServiceAbbreviations.SimpleWorkflow, "application/x-shockwave-flash");
            put("js", "application/javascript");
            put("pdf", "application/pdf");
            put("doc", "application/msword");
            put("ogg", "application/x-ogg");
            put("zip", "application/octet-stream");
            put("exe", "application/octet-stream");
            put(Name.LABEL, "application/octet-stream");
        }
    }

    public class c extends FileInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f43096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, long j9) {
            super(file);
            this.f43096a = j9;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return (int) this.f43096a;
        }
    }

    public class d implements FilenameFilter {
        public d() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isFile();
        }
    }

    public class e implements FilenameFilter {
        public e() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isDirectory();
        }
    }

    public b(String str, int i9, File file, boolean z9) {
        super(str, i9);
        this.f43095i = z9;
        ArrayList arrayList = new ArrayList();
        this.f43094h = arrayList;
        arrayList.add(file);
        B();
    }

    public final List A() {
        return this.f43094h;
    }

    public void B() {
    }

    public String C(String str, File file) {
        String str2;
        String strSubstring;
        int iLastIndexOf;
        String str3 = "Directory " + str;
        StringBuilder sb = new StringBuilder("<html><head><title>" + str3 + "</title><style><!--\nspan.dirname { font-weight: bold; }\nspan.filesize { font-size: 75%; }\n// -->\n</style></head><body><h1>" + str3 + "</h1>");
        String strSubstring2 = (str.length() <= 1 || (iLastIndexOf = (strSubstring = str.substring(0, str.length() - 1)).lastIndexOf(47)) < 0 || iLastIndexOf >= strSubstring.length()) ? null : str.substring(0, iLastIndexOf + 1);
        List<String> listAsList = Arrays.asList(file.list(new d()));
        Collections.sort(listAsList);
        List listAsList2 = Arrays.asList(file.list(new e()));
        Collections.sort(listAsList2);
        if (strSubstring2 != null || listAsList2.size() + listAsList.size() > 0) {
            sb.append("<ul>");
            if (strSubstring2 != null || listAsList2.size() > 0) {
                sb.append("<section class=\"directories\">");
                if (strSubstring2 != null) {
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(strSubstring2);
                    sb.append("\"><span class=\"dirname\">..</span></a></b></li>");
                }
                Iterator it = listAsList2.iterator();
                while (it.hasNext()) {
                    String str4 = ((String) it.next()) + "/";
                    sb.append("<li><a rel=\"directory\" href=\"");
                    sb.append(u(str + str4));
                    sb.append("\"><span class=\"dirname\">");
                    sb.append(str4);
                    sb.append("</span></a></b></li>");
                }
                sb.append("</section>");
            }
            if (listAsList.size() > 0) {
                sb.append("<section class=\"files\">");
                for (String str5 : listAsList) {
                    sb.append("<li><a href=\"");
                    sb.append(u(str + str5));
                    sb.append("\"><span class=\"filename\">");
                    sb.append(str5);
                    sb.append("</span></a>");
                    long length = new File(file, str5).length();
                    sb.append("&nbsp;<span class=\"filesize\">(");
                    if (length < 1024) {
                        sb.append(length);
                        str2 = " bytes";
                    } else if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        sb.append(length / 1024);
                        sb.append(InstructionFileId.DOT);
                        sb.append(((length % 1024) / 10) % 100);
                        str2 = " KB";
                    } else {
                        sb.append(length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                        sb.append(InstructionFileId.DOT);
                        sb.append(((length % PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 10) % 100);
                        str2 = " MB";
                    }
                    sb.append(str2);
                    sb.append(")</span></li>");
                }
                sb.append("</section>");
            }
            sb.append("</ul>");
        }
        sb.append("</body></html>");
        return sb.toString();
    }

    public final AbstractC2103a.j D(Map map, AbstractC2103a.h hVar, String str) {
        String strReplace = str.trim().replace(File.separatorChar, '/');
        boolean zR = false;
        if (strReplace.indexOf(63) >= 0) {
            strReplace = strReplace.substring(0, strReplace.indexOf(63));
        }
        if (strReplace.startsWith("src/main") || strReplace.endsWith("src/main") || strReplace.contains("../")) {
            return w("Won't serve ../ for security reasons.");
        }
        List listA = A();
        File file = null;
        for (int i9 = 0; !zR && i9 < listA.size(); i9++) {
            file = (File) listA.get(i9);
            zR = r(strReplace, file);
        }
        if (!zR) {
            return z();
        }
        File file2 = new File(file, strReplace);
        if (!file2.isDirectory() || strReplace.endsWith("/")) {
            if (!file2.isDirectory()) {
                String strY = y(strReplace);
                AbstractC1617D.a(f43093l.get(strY));
                AbstractC2103a.j jVarE = E(strReplace, map, file2, strY);
                return jVarE != null ? jVarE : z();
            }
            String strV = v(file2);
            if (strV == null) {
                return file2.canRead() ? t(AbstractC2103a.j.b.OK, Mimetypes.MIMETYPE_HTML, C(strReplace, file2)) : w("No directory listing.");
            }
            return D(map, hVar, strReplace + strV);
        }
        String str2 = strReplace + "/";
        AbstractC2103a.j jVarT = t(AbstractC2103a.j.b.REDIRECT, Mimetypes.MIMETYPE_HTML, "<html><body>Redirected: <a href=\"" + str2 + "\">" + str2 + "</a></body></html>");
        jVarT.a("Location", str2);
        return jVarT;
    }

    public AbstractC2103a.j E(String str, Map map, File file, String str2) {
        long j9;
        AbstractC2103a.j jVarS;
        int iIndexOf;
        try {
            String hexString = Integer.toHexString((file.getAbsolutePath() + file.lastModified() + "" + file.length()).hashCode());
            String strSubstring = (String) map.get("range");
            long j10 = 0;
            long j11 = -1;
            if (strSubstring == null || !strSubstring.startsWith("bytes=") || (iIndexOf = (strSubstring = strSubstring.substring(6)).indexOf(45)) <= 0) {
                j9 = 0;
            } else {
                try {
                    j9 = Long.parseLong(strSubstring.substring(0, iIndexOf));
                    try {
                        j11 = Long.parseLong(strSubstring.substring(iIndexOf + 1));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    j9 = 0;
                }
            }
            long length = file.length();
            String str3 = "ETag";
            if (strSubstring == null || j9 < 0) {
                if (hexString.equals(map.get("if-none-match"))) {
                    return t(AbstractC2103a.j.b.NOT_MODIFIED, str2, "");
                }
                AbstractC2103a.j jVarS2 = s(AbstractC2103a.j.b.OK, str2, new FileInputStream(file));
                jVarS2.a("Content-Length", "" + length);
                jVarS2.a("ETag", hexString);
                return jVarS2;
            }
            if (j9 >= length) {
                jVarS = t(AbstractC2103a.j.b.RANGE_NOT_SATISFIABLE, HTTP.PLAIN_TEXT_TYPE, "");
                jVarS.a("Content-Range", "bytes 0-0/" + length);
            } else {
                if (j11 < 0) {
                    j11 = length - 1;
                }
                long j12 = (j11 - j9) + 1;
                if (j12 >= 0) {
                    j10 = j12;
                }
                c cVar = new c(file, j10);
                cVar.skip(j9);
                jVarS = s(AbstractC2103a.j.b.PARTIAL_CONTENT, str2, cVar);
                jVarS.a("Content-Length", "" + j10);
                jVarS.a("Content-Range", "bytes " + j9 + "-" + j11 + "/" + length);
                str3 = "ETag";
            }
            jVarS.a(str3, hexString);
            return jVarS;
        } catch (IOException unused3) {
            return w("Reading file failed.");
        }
    }

    @Override // j7.AbstractC2103a
    public AbstractC2103a.j l(AbstractC2103a.h hVar) {
        Map headers = hVar.getHeaders();
        Map mapA = hVar.a();
        String uri = hVar.getUri();
        if (!this.f43095i) {
            System.out.println(hVar.getMethod() + " '" + uri + "' ");
            for (String str : headers.keySet()) {
                System.out.println("  HDR: '" + str + "' = '" + ((String) headers.get(str)) + "'");
            }
            for (String str2 : mapA.keySet()) {
                System.out.println("  PRM: '" + str2 + "' = '" + ((String) mapA.get(str2)) + "'");
            }
        }
        for (File file : A()) {
            if (!file.isDirectory()) {
                return x("given path is not a directory (" + file + ").");
            }
        }
        return D(Collections.unmodifiableMap(headers), hVar, uri);
    }

    public final boolean r(String str, File file) {
        boolean zExists = new File(file, str).exists();
        if (!zExists) {
            AbstractC1617D.a(f43093l.get(y(str)));
        }
        return zExists;
    }

    public final AbstractC2103a.j s(AbstractC2103a.j.b bVar, String str, InputStream inputStream) {
        AbstractC2103a.j jVar = new AbstractC2103a.j(bVar, str, inputStream);
        jVar.a(HttpHeaders.ACCEPT_RANGES, "bytes");
        return jVar;
    }

    public final AbstractC2103a.j t(AbstractC2103a.j.b bVar, String str, String str2) {
        AbstractC2103a.j jVar = new AbstractC2103a.j(bVar, str, str2);
        jVar.a(HttpHeaders.ACCEPT_RANGES, "bytes");
        return jVar;
    }

    public final String u(String str) {
        StringBuilder sb;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "/ ", true);
        String string = "";
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("/")) {
                sb = new StringBuilder();
                sb.append(string);
                sb.append("/");
            } else if (strNextToken.equals(" ")) {
                sb = new StringBuilder();
                sb.append(string);
                sb.append("%20");
            } else {
                try {
                    string = string + URLEncoder.encode(strNextToken, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
            }
            string = sb.toString();
        }
        return string;
    }

    public final String v(File file) {
        for (String str : f43091j) {
            if (new File(file, str).exists()) {
                return str;
            }
        }
        return null;
    }

    public AbstractC2103a.j w(String str) {
        return t(AbstractC2103a.j.b.FORBIDDEN, HTTP.PLAIN_TEXT_TYPE, "FORBIDDEN: " + str);
    }

    public AbstractC2103a.j x(String str) {
        return t(AbstractC2103a.j.b.INTERNAL_ERROR, HTTP.PLAIN_TEXT_TYPE, "INTERNAL ERRROR: " + str);
    }

    public final String y(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String str2 = iLastIndexOf >= 0 ? (String) f43092k.get(str.substring(iLastIndexOf + 1).toLowerCase()) : null;
        return str2 == null ? "application/octet-stream" : str2;
    }

    public AbstractC2103a.j z() {
        return t(AbstractC2103a.j.b.NOT_FOUND, HTTP.PLAIN_TEXT_TYPE, "Error 404, file not found.");
    }
}
