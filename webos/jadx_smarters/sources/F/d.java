package F;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f1755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f1756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1757c;

    public d(Shader shader, ColorStateList colorStateList, int i9) {
        this.f1755a = shader;
        this.f1756b = colorStateList;
        this.f1757c = i9;
    }

    public static d a(Resources resources, int i9, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i9);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static d b(int i9) {
        return new d(null, null, i9);
    }

    public static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i9, Resources.Theme theme) {
        try {
            return a(resources, i9, theme);
        } catch (Exception e9) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e9);
            return null;
        }
    }

    public int e() {
        return this.f1757c;
    }

    public Shader f() {
        return this.f1755a;
    }

    public boolean h() {
        return this.f1755a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f1755a == null && (colorStateList = this.f1756b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f1756b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1757c) {
                this.f1757c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i9) {
        this.f1757c = i9;
    }

    public boolean l() {
        return h() || this.f1757c != 0;
    }
}
