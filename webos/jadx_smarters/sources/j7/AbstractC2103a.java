package j7;

import d.AbstractC1617D;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import okio.Segment;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;

/* JADX INFO: renamed from: j7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2103a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServerSocket f43056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f43057d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f43058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f43059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f43060g;

    /* JADX INFO: renamed from: j7.a$a, reason: collision with other inner class name */
    public class RunnableC0357a implements Runnable {

        /* JADX INFO: renamed from: j7.a$a$a, reason: collision with other inner class name */
        public class RunnableC0358a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Socket f43062a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InputStream f43063c;

            public RunnableC0358a(Socket socket, InputStream inputStream) {
                this.f43062a = socket;
                this.f43063c = inputStream;
            }

            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream = null;
                try {
                    try {
                        outputStream = this.f43062a.getOutputStream();
                        g gVar = AbstractC2103a.this.new g(AbstractC2103a.this.f43060g.a(), this.f43063c, outputStream, this.f43062a.getInetAddress());
                        while (!this.f43062a.isClosed()) {
                            gVar.d();
                        }
                    } catch (Exception e9) {
                        if (!(e9 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e9.getMessage())) {
                            e9.printStackTrace();
                        }
                    }
                } finally {
                    AbstractC2103a.i(outputStream);
                    AbstractC2103a.i(this.f43063c);
                    AbstractC2103a.k(this.f43062a);
                    AbstractC2103a.this.q(this.f43062a);
                }
            }
        }

        public RunnableC0357a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Socket socketAccept = AbstractC2103a.this.f43056c.accept();
                    AbstractC2103a.this.h(socketAccept);
                    socketAccept.setSoTimeout(5000);
                    AbstractC2103a.this.f43059f.a(new RunnableC0358a(socketAccept, socketAccept.getInputStream()));
                } catch (IOException unused) {
                }
            } while (!AbstractC2103a.this.f43056c.isClosed());
        }
    }

    /* JADX INFO: renamed from: j7.a$b */
    public interface b {
        void a(Runnable runnable);
    }

    /* JADX INFO: renamed from: j7.a$c */
    public class c implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f43065a = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f43066c = new ArrayList();

        public c(Map map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] strArrSplit = str2.trim().split("=");
                    if (strArrSplit.length == 2) {
                        this.f43065a.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            }
        }

        public void a(j jVar) {
            Iterator it = this.f43066c.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f43065a.keySet().iterator();
        }
    }

    /* JADX INFO: renamed from: j7.a$d */
    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43068a;

        @Override // j7.AbstractC2103a.b
        public void a(Runnable runnable) {
            this.f43068a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f43068a + ")");
            thread.start();
        }
    }

    /* JADX INFO: renamed from: j7.a$e */
    public static class e implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43069a = System.getProperty("java.io.tmpdir");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f43070b = new ArrayList();

        @Override // j7.AbstractC2103a.l
        public void clear() {
            Iterator it = this.f43070b.iterator();
            while (it.hasNext()) {
                AbstractC1617D.a(it.next());
                try {
                    throw null;
                } catch (Exception unused) {
                }
            }
            this.f43070b.clear();
        }
    }

    /* JADX INFO: renamed from: j7.a$f */
    public class f implements m {
        public f() {
        }

        public /* synthetic */ f(AbstractC2103a abstractC2103a, RunnableC0357a runnableC0357a) {
            this();
        }

        @Override // j7.AbstractC2103a.m
        public l a() {
            return new e();
        }
    }

    /* JADX INFO: renamed from: j7.a$g */
    public class g implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f43072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputStream f43073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PushbackInputStream f43074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f43077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f43078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f43079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Map f43080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public c f43081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f43082k;

        public g(l lVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f43072a = lVar;
            this.f43074c = new PushbackInputStream(inputStream, Segment.SIZE);
            this.f43073b = outputStream;
            String string = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            HashMap map = new HashMap();
            this.f43080i = map;
            map.put("remote-addr", string);
            this.f43080i.put("http-client-ip", string);
        }

        @Override // j7.AbstractC2103a.h
        public final Map a() {
            return this.f43079h;
        }

        public final void b(BufferedReader bufferedReader, Map map, Map map2, Map map3) throws k {
            AbstractC2103a abstractC2103a;
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new k(j.b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new k(j.b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    c(strNextToken.substring(iIndexOf + 1), map2);
                    abstractC2103a = AbstractC2103a.this;
                    strNextToken = strNextToken.substring(0, iIndexOf);
                } else {
                    abstractC2103a = AbstractC2103a.this;
                }
                String strG = abstractC2103a.g(strNextToken);
                if (stringTokenizer.hasMoreTokens()) {
                    while (true) {
                        String line2 = bufferedReader.readLine();
                        if (line2 == null || line2.trim().length() <= 0) {
                            break;
                        }
                        int iIndexOf2 = line2.indexOf(58);
                        if (iIndexOf2 >= 0) {
                            map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                        }
                    }
                }
                map.put("uri", strG);
            } catch (IOException e9) {
                throw new k(j.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e9.getMessage(), e9);
            }
        }

        public final void c(String str, Map map) {
            if (str == null) {
                this.f43082k = "";
                return;
            }
            this.f43082k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf >= 0) {
                    map.put(AbstractC2103a.this.g(strNextToken.substring(0, iIndexOf)).trim(), AbstractC2103a.this.g(strNextToken.substring(iIndexOf + 1)));
                } else {
                    map.put(AbstractC2103a.this.g(strNextToken).trim(), "");
                }
            }
        }

        public void d() {
            OutputStream outputStream;
            byte[] bArr;
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[Segment.SIZE];
                                this.f43075d = 0;
                                this.f43076e = 0;
                            } catch (IOException e9) {
                                new j(j.b.INTERNAL_ERROR, HTTP.PLAIN_TEXT_TYPE, "SERVER INTERNAL ERROR: IOException: " + e9.getMessage()).c(this.f43073b);
                                outputStream = this.f43073b;
                                AbstractC2103a.i(outputStream);
                                this.f43072a.clear();
                            }
                        } catch (SocketException e10) {
                            throw e10;
                        }
                    } catch (k e11) {
                        new j(e11.a(), HTTP.PLAIN_TEXT_TYPE, e11.getMessage()).c(this.f43073b);
                        outputStream = this.f43073b;
                        AbstractC2103a.i(outputStream);
                        this.f43072a.clear();
                    }
                    try {
                        int i9 = this.f43074c.read(bArr, 0, Segment.SIZE);
                        if (i9 == -1) {
                            AbstractC2103a.i(this.f43074c);
                            AbstractC2103a.i(this.f43073b);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                        while (i9 > 0) {
                            int i10 = this.f43076e + i9;
                            this.f43076e = i10;
                            int iE = e(bArr, i10);
                            this.f43075d = iE;
                            if (iE > 0) {
                                break;
                            }
                            PushbackInputStream pushbackInputStream = this.f43074c;
                            int i11 = this.f43076e;
                            i9 = pushbackInputStream.read(bArr, i11, 8192 - i11);
                        }
                        int i12 = this.f43075d;
                        int i13 = this.f43076e;
                        if (i12 < i13) {
                            this.f43074c.unread(bArr, i12, i13 - i12);
                        }
                        this.f43079h = new HashMap();
                        if (this.f43080i == null) {
                            this.f43080i = new HashMap();
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f43076e)));
                        HashMap map = new HashMap();
                        b(bufferedReader, map, this.f43079h, this.f43080i);
                        i iVarLookup = i.lookup((String) map.get("method"));
                        this.f43078g = iVarLookup;
                        if (iVarLookup == null) {
                            throw new k(j.b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                        }
                        this.f43077f = (String) map.get("uri");
                        this.f43081j = AbstractC2103a.this.new c(this.f43080i);
                        j jVarL = AbstractC2103a.this.l(this);
                        if (jVarL == null) {
                            throw new k(j.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                        }
                        this.f43081j.a(jVarL);
                        jVarL.h(this.f43078g);
                        jVarL.c(this.f43073b);
                        this.f43072a.clear();
                    } catch (Exception unused) {
                        AbstractC2103a.i(this.f43074c);
                        AbstractC2103a.i(this.f43073b);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                } catch (SocketTimeoutException e12) {
                    throw e12;
                }
            } catch (Throwable th) {
                this.f43072a.clear();
                throw th;
            }
        }

        public final int e(byte[] bArr, int i9) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 3;
                if (i11 >= i9) {
                    return 0;
                }
                if (bArr[i10] == 13 && bArr[i10 + 1] == 10 && bArr[i10 + 2] == 13 && bArr[i11] == 10) {
                    return i10 + 4;
                }
                i10++;
            }
        }

        @Override // j7.AbstractC2103a.h
        public final Map getHeaders() {
            return this.f43080i;
        }

        @Override // j7.AbstractC2103a.h
        public final i getMethod() {
            return this.f43078g;
        }

        @Override // j7.AbstractC2103a.h
        public final String getUri() {
            return this.f43077f;
        }
    }

    /* JADX INFO: renamed from: j7.a$h */
    public interface h {
        Map a();

        Map getHeaders();

        i getMethod();

        String getUri();
    }

    /* JADX INFO: renamed from: j7.a$i */
    public enum i {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static i lookup(String str) {
            for (i iVar : values()) {
                if (iVar.toString().equalsIgnoreCase(str)) {
                    return iVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: j7.a$j */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC0359a f43084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InputStream f43086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f43087d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f43088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f43089f;

        /* JADX INFO: renamed from: j7.a$j$a, reason: collision with other inner class name */
        public interface InterfaceC0359a {
            String getDescription();
        }

        /* JADX INFO: renamed from: j7.a$j$b */
        public enum b implements InterfaceC0359a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(HttpStatus.SC_CREATED, "Created"),
            ACCEPTED(HttpStatus.SC_ACCEPTED, "Accepted"),
            NO_CONTENT(HttpStatus.SC_NO_CONTENT, "No Content"),
            PARTIAL_CONTENT(HttpStatus.SC_PARTIAL_CONTENT, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(HttpStatus.SC_NOT_MODIFIED, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(HttpStatus.SC_UNAUTHORIZED, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(HttpStatus.SC_METHOD_NOT_ALLOWED, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error");

            private final String description;
            private final int requestStatus;

            b(int i9, String str) {
                this.requestStatus = i9;
                this.description = str;
            }

            @Override // j7.AbstractC2103a.j.InterfaceC0359a
            public String getDescription() {
                return "" + this.requestStatus + " " + this.description;
            }

            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        public j(InterfaceC0359a interfaceC0359a, String str, InputStream inputStream) {
            this.f43084a = interfaceC0359a;
            this.f43085b = str;
            this.f43086c = inputStream;
        }

        public j(InterfaceC0359a interfaceC0359a, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.f43084a = interfaceC0359a;
            this.f43085b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e9) {
                    e9.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.f43086c = byteArrayInputStream;
        }

        public void a(String str, String str2) {
            this.f43087d.put(str, str2);
        }

        public final boolean b(Map map, String str) {
            Iterator it = map.keySet().iterator();
            boolean zEqualsIgnoreCase = false;
            while (it.hasNext()) {
                zEqualsIgnoreCase |= ((String) it.next()).equalsIgnoreCase(str);
            }
            return zEqualsIgnoreCase;
        }

        public void c(OutputStream outputStream) {
            String str = this.f43085b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            try {
                if (this.f43084a == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.1 " + this.f43084a.getDescription() + " \r\n");
                if (str != null) {
                    printWriter.print("Content-Type: " + str + "\r\n");
                }
                Map map = this.f43087d;
                if (map == null || map.get("Date") == null) {
                    printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                }
                Map map2 = this.f43087d;
                if (map2 != null) {
                    for (String str2 : map2.keySet()) {
                        printWriter.print(str2 + ": " + ((String) this.f43087d.get(str2)) + "\r\n");
                    }
                }
                f(printWriter, this.f43087d);
                if (this.f43088e == i.HEAD || !this.f43089f) {
                    InputStream inputStream = this.f43086c;
                    int iAvailable = inputStream != null ? inputStream.available() : 0;
                    g(printWriter, this.f43087d, iAvailable);
                    printWriter.print("\r\n");
                    printWriter.flush();
                    e(outputStream, iAvailable);
                } else {
                    d(outputStream, printWriter);
                }
                outputStream.flush();
                AbstractC2103a.i(this.f43086c);
            } catch (IOException unused) {
            }
        }

        public final void d(OutputStream outputStream, PrintWriter printWriter) throws IOException {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            byte[] bytes = "\r\n".getBytes();
            byte[] bArr = new byte[262144];
            while (true) {
                int i9 = this.f43086c.read(bArr);
                if (i9 <= 0) {
                    outputStream.write(String.format("0\r\n\r\n", new Object[0]).getBytes());
                    return;
                } else {
                    outputStream.write(String.format("%x\r\n", Integer.valueOf(i9)).getBytes());
                    outputStream.write(bArr, 0, i9);
                    outputStream.write(bytes);
                }
            }
        }

        public final void e(OutputStream outputStream, int i9) throws IOException {
            if (this.f43088e == i.HEAD || this.f43086c == null) {
                return;
            }
            byte[] bArr = new byte[262144];
            while (i9 > 0) {
                int i10 = this.f43086c.read(bArr, 0, i9 > 262144 ? 262144 : i9);
                if (i10 <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, i10);
                i9 -= i10;
            }
        }

        public void f(PrintWriter printWriter, Map map) {
            if (b(map, "connection")) {
                return;
            }
            printWriter.print("Connection: keep-alive\r\n");
        }

        public void g(PrintWriter printWriter, Map map, int i9) {
            if (b(map, "content-length")) {
                return;
            }
            printWriter.print("Content-Length: " + i9 + "\r\n");
        }

        public void h(i iVar) {
            this.f43088e = iVar;
        }
    }

    /* JADX INFO: renamed from: j7.a$k */
    public static final class k extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j.b f43090a;

        public k(j.b bVar, String str) {
            super(str);
            this.f43090a = bVar;
        }

        public k(j.b bVar, String str, Exception exc) {
            super(str, exc);
            this.f43090a = bVar;
        }

        public j.b a() {
            return this.f43090a;
        }
    }

    /* JADX INFO: renamed from: j7.a$l */
    public interface l {
        void clear();
    }

    /* JADX INFO: renamed from: j7.a$m */
    public interface m {
        l a();
    }

    public AbstractC2103a(String str, int i9) {
        this.f43054a = str;
        this.f43055b = i9;
        n(new f(this, null));
        m(new d());
    }

    public static final void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void j(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void k(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public synchronized void f() {
        Iterator it = this.f43057d.iterator();
        while (it.hasNext()) {
            k((Socket) it.next());
        }
    }

    public String g(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public synchronized void h(Socket socket) {
        this.f43057d.add(socket);
    }

    public abstract j l(h hVar);

    public void m(b bVar) {
        this.f43059f = bVar;
    }

    public void n(m mVar) {
        this.f43060g = mVar;
    }

    public void o() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        this.f43056c = serverSocket;
        serverSocket.bind(this.f43054a != null ? new InetSocketAddress(this.f43054a, this.f43055b) : new InetSocketAddress(this.f43055b));
        Thread thread = new Thread(new RunnableC0357a());
        this.f43058e = thread;
        thread.setDaemon(true);
        this.f43058e.setName("NanoHttpd Main Listener");
        this.f43058e.start();
    }

    public void p() {
        try {
            j(this.f43056c);
            f();
            Thread thread = this.f43058e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public synchronized void q(Socket socket) {
        this.f43057d.remove(socket);
    }
}
