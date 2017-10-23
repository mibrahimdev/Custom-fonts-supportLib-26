package design.nxn.login_template_01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import design.nxn.login_template_01.Tools.CustomViewPager;
import design.nxn.login_template_01.Tools.ViewPagerAdapter;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity {

    private static final int LOGIN_FRAGMENT = 0;
    private static final int SIGNUP_FRAGMENT = 1;
    private static final int RESET_PASSWORD_FRAGMENT = 2;
    private Fragment newFragment;
    private CustomViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPagingEnabled(false);
        changeFragment(LOGIN_FRAGMENT);
    }

    private void changeFragment(int fragmentType) {

        switch (fragmentType) {
            case LOGIN_FRAGMENT:
                viewPager.setCurrentItem(LOGIN_FRAGMENT);
                break;
            case SIGNUP_FRAGMENT:
                viewPager.setCurrentItem(SIGNUP_FRAGMENT);
                break;
            case RESET_PASSWORD_FRAGMENT:
                viewPager.setCurrentItem(RESET_PASSWORD_FRAGMENT);
                break;
            default:
                viewPager.setCurrentItem(LOGIN_FRAGMENT);
                break;
        }


    }

    public void signUpClick(View view) {
        changeFragment(SIGNUP_FRAGMENT);
    }

    public void signInClick(View view) {
        changeFragment(LOGIN_FRAGMENT);
    }

    public void resetPasswordClick(View view) {
        changeFragment(RESET_PASSWORD_FRAGMENT);
    }

    public void backClick(View view){
        changeFragment(LOGIN_FRAGMENT);
    }

    @Override
    public void onBackPressed() {

        if (viewPager.getCurrentItem() == LOGIN_FRAGMENT)
            super.onBackPressed();
        else {
            changeFragment(LOGIN_FRAGMENT);
        }
    }

    public void logInButtonClicked() {
        Toast.makeText(this, R.string.login_button_click, Toast.LENGTH_SHORT).show();
    }

    public void signUpButtonClicked() {
        Toast.makeText(this, R.string.signup_button_click, Toast.LENGTH_SHORT).show();
    }

    public void resetPasswordButtonClicked() {
        Toast.makeText(this, R.string.reset_password_button_clicked, Toast.LENGTH_SHORT).show();
    }
}

