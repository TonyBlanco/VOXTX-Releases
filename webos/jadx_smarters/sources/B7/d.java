package B7;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.SAXParserFactory;
import m7.AbstractC2237a;
import org.achartengine.ChartFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes4.dex */
public class d extends DefaultHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveStreamDBHandler f751i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SimpleDateFormat f754l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f744a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f745c = "XMLHelper";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f746d = Boolean.FALSE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f747e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public XMLTVProgrammePojo f748f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f752j = "0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f753k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f755m = new ArrayList();

    public void a(Context context) {
        this.f750h = context;
        this.f751i = new LiveStreamDBHandler(context);
        try {
            AbstractC2237a.f44449I0 = true;
            this.f749g = context.getSharedPreferences("loginPrefs", 0);
            this.f754l = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            ArrayList<EPGSourcesModel> activeEPGSource = this.f751i.getActiveEPGSource();
            if (activeEPGSource != null && activeEPGSource.size() > 0) {
                this.f744a = activeEPGSource.get(0).getEpgurl();
                this.f752j = String.valueOf(activeEPGSource.get(0).getIdAuto());
            }
            String str = this.f744a;
            if (str == null || str.isEmpty() || this.f744a.equalsIgnoreCase("")) {
                return;
            }
            if (!this.f744a.contains(".gz")) {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                xMLReader.setContentHandler(this);
                InputStream inputStreamOpenStream = new URL(this.f744a).openStream();
                InputSource inputSource = new InputSource(inputStreamOpenStream);
                inputSource.setEncoding("UTF-8");
                xMLReader.parse(inputSource);
                inputStreamOpenStream.close();
                return;
            }
            File file = new File(context.getFilesDir() + "/epgZip.xml");
            File file2 = new File(String.valueOf(file));
            if (file2.exists()) {
                file2.delete();
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new InputSource(new GZIPInputStream(new URL(this.f744a).openConnection().getInputStream())).getByteStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[2097152];
                while (true) {
                    int i9 = bufferedInputStream.read(bArr);
                    if (i9 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        XMLReader xMLReader2 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        xMLReader2.setContentHandler(this);
                        InputSource inputSource2 = new InputSource(new FileInputStream(file.getPath()));
                        inputSource2.setEncoding("UTF-8");
                        xMLReader2.parse(inputSource2);
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i9);
                }
            } catch (Exception e9) {
                Log.e("honey", "Exception: " + e9.getMessage());
            }
        } catch (Exception e10) {
            Log.e(this.f745c, "Exception: " + e10.getMessage());
        }
    }

    public ArrayList b() {
        return this.f755m;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i9, int i10) {
        if (this.f746d.booleanValue()) {
            try {
                this.f747e += new String(cArr, i9, i10);
            } catch (Exception unused) {
                this.f747e = "";
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        this.f746d = Boolean.FALSE;
        XMLTVProgrammePojo xMLTVProgrammePojo = this.f748f;
        if (xMLTVProgrammePojo != null) {
            xMLTVProgrammePojo.setSourceRef(this.f752j);
        }
        if (str2.equalsIgnoreCase(ChartFactory.TITLE)) {
            XMLTVProgrammePojo xMLTVProgrammePojo2 = this.f748f;
            if (xMLTVProgrammePojo2 != null) {
                xMLTVProgrammePojo2.setTitle(this.f747e);
                return;
            }
            return;
        }
        if (str2.equalsIgnoreCase("desc")) {
            XMLTVProgrammePojo xMLTVProgrammePojo3 = this.f748f;
            if (xMLTVProgrammePojo3 != null) {
                xMLTVProgrammePojo3.setDesc(this.f747e);
                return;
            }
            return;
        }
        if (str2.equalsIgnoreCase("programme")) {
            this.f755m.add(this.f748f);
            int i9 = this.f753k + 1;
            this.f753k = i9;
            if (i9 > 10000) {
                this.f753k = 0;
                LiveStreamDBHandler liveStreamDBHandler = this.f751i;
                if (liveStreamDBHandler != null && liveStreamDBHandler.addEPGTesting2(this.f755m)) {
                    this.f755m.clear();
                }
            }
            this.f748f = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startElement(java.lang.String r9, java.lang.String r10, java.lang.String r11, org.xml.sax.Attributes r12) throws B7.b {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.d.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}
