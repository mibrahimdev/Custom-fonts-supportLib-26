package design.nxn.login_template_01.Fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import design.nxn.login_template_01.LoginActivity;
import design.nxn.login_template_01.R;
import design.nxn.login_template_01.Tools.MyTimeUtils;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getView().findViewById(R.id.clickable_birthday_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthDayClick();
            }
        });
        getView().findViewById(R.id.signup_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean ok = true;
                if (((AppCompatEditText) getView().findViewById(R.id.username_edittext)).getText().length() == 0) {
                    ((AppCompatEditText) getView().findViewById(R.id.username_edittext)).setError(getString(R.string.empty));
                    ok = false;
                }
                if (((AppCompatEditText) getView().findViewById(R.id.password_edittext)).getText().length() == 0) {
                    ((AppCompatEditText) getView().findViewById(R.id.password_edittext)).setError(getString(R.string.empty));
                    ok = false;
                }
                if (((AppCompatEditText) getView().findViewById(R.id.email_edittext)).getText().length() == 0) {
                    ((AppCompatEditText) getView().findViewById(R.id.email_edittext)).setError(getString(R.string.empty));
                    ok = false;
                }
                if (ok)
                    ((LoginActivity) getActivity()).signUpButtonClicked();
            }
        });
    }

    public void birthDayClick() {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog dpd = new DatePickerDialog(getActivity(),
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        Calendar temp = Calendar.getInstance();
                        temp.set(Calendar.YEAR, year);
                        temp.set(Calendar.MONTH, monthOfYear);
                        temp.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                        ((TextView) getView().findViewById(R.id.birthday_edittext)).setText(MyTimeUtils.formatDate(temp.getTimeInMillis(), MyTimeUtils.BIRTHDAY_FORMAT));
                    }
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        dpd.show();
    }

}
