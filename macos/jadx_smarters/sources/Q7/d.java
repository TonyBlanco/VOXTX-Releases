package Q7;

import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class d implements b {
    @Override // Q7.b
    public String getLanguage() {
        String language;
        language = Locale.getDefault().getLanguage();
        language.hashCode();
        switch (language) {
            case "in":
                return Name.MARK;
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "zh":
                return language + "-" + Locale.getDefault().getCountry();
            default:
                return language;
        }
    }
}
