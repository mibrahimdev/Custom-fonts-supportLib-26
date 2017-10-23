package design.nxn.login_template_01.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import design.nxn.login_template_01.R;

/**
 * Created by one on 3/12/15.
 */
public class MyTextView extends android.support.v7.widget.AppCompatTextView {

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            if (!isInEditMode()) {
                Typeface tf = ResourcesCompat.getFont(getContext(), R.font.app_font);
                setTypeface(tf);
            }
        }
    }

}