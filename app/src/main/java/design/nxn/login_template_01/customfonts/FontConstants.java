package design.nxn.login_template_01.customfonts;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Attila on 3/5/2017.
 */

public class FontConstants {

    public static final String FONT_BOLD = "fonts/MavenPro_Bold.ttf";
    public static final String FONT_NORMAL = "fonts/MavenPro_Regular.ttf";
    public static final String FONT_MEDIUM = "fonts/MavenPro_Medium.ttf";

    public static Typeface getfontNormal(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FontConstants.FONT_NORMAL);
    }

    public static Typeface getfontBold(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FontConstants.FONT_BOLD);
    }
}
