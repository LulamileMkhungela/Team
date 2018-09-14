package com.example.academy_intern.team;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    View view;
    Button loginButton;

    boolean success = false;

    EditText edtxtEmail;

    EditText edtxtPassword;
    Data data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.login, container, false);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        init();

        data = new Data();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = new Data();
                loginButton();
            }
        });
    }

    public void init()
    {
        loginButton = view.findViewById(R.id.btnLogin);

        edtxtEmail = view.findViewById(R.id.edtxtEmail);

        edtxtPassword = view.findViewById(R.id.edtxtPassword);
//
//        inputEmail = edtxtEmail.getText().toString();
//
//        inputPassword = edtxtPassword.getText().toString();

    }

    public void loginButton()
    {

        success = data.verifyLogin(edtxtEmail.getText().toString(), edtxtPassword.getText().toString());

        if (success)
        {
            Member member = data.loginMember(edtxtEmail.getText().toString(), edtxtPassword.getText().toString());
            Toast.makeText(getActivity(), member.getName() + " " +
                    member.getSurname() + ", you have successfully logged in!", Toast.LENGTH_LONG).show();
            getFragmentManager().beginTransaction().replace(R.id.main, new MemberInformation()).commit();

        }
        else
        {
            Toast.makeText(getActivity(), "You have failed to log in.\nPlease try again.", Toast.LENGTH_LONG).show();
        }

    }
}
