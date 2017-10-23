package design.nxn.login_template_01.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import design.nxn.login_template_01.LoginActivity;
import design.nxn.login_template_01.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getView().findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean ok = true;
                if (((AppCompatEditText) getView().findViewById(R.id.email_edittext)).getText().length() == 0) {
                    ((AppCompatEditText) getView().findViewById(R.id.email_edittext)).setError(getString(R.string.empty));
                    ok = false;
                }
                if (((AppCompatEditText) getView().findViewById(R.id.password_edittext)).getText().length() == 0) {
                    ((AppCompatEditText) getView().findViewById(R.id.password_edittext)).setError(getString(R.string.empty));
                    ok = false;
                }
                if (ok)
                    ((LoginActivity) getActivity()).logInButtonClicked();
            }
        });
    }
}
