package d3;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: d3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1678o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1678o f39601a = new InterfaceC1678o() { // from class: d3.m
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return AbstractC1677n.b();
        }
    };

    InterfaceC1672i[] a(Uri uri, Map map);

    InterfaceC1672i[] b();
}
