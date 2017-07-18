package com.androidtutorialshub.loginregister.activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.androidtutorialshub.loginregister.R;
import com.androidtutorialshub.loginregister.adapters.UsersRecyclerAdapter;
import com.androidtutorialshub.loginregister.model.User;
import com.androidtutorialshub.loginregister.model.UserWeight;
import com.androidtutorialshub.loginregister.sql.DatabaseHelper;

/**
 * Created by Emily on 7/17/17.
 */

public class UsersLiftsActivity extends AppCompatActivity implements View.OnClickListener {
    private final AppCompatActivity activity = UsersLiftsActivity.this;

    private NestedScrollView nestedScrollView;
    private TextInputLayout textInputLayoutBench;
    private TextInputLayout textInputLayoutSquat;
    private TextInputLayout textInputLayoutDeadlift;
    private TextInputLayout textInputLayoutOverheadpress;

    private TextInputEditText textInputEditTextBench;
    private TextInputEditText textInputEditTextSquat;
    private TextInputEditText textInputEditTextDeadlift;
    private TextInputEditText textInputEditTextOverheadpress;

    private AppCompatButton appCompatButtonLogin;

    private DatabaseHelper databaseHelper;
    private User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        onCreate -- You must implement this callback, which fires when the system creates your
//        activity. Your implementation should initialize the essential components of your activity:
//        For example, your app should create views and bind data to lists here.
//        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_details);
        getSupportActionBar().hide();

        initViews();
    }

    /**
     * This method is to initialize views
     */
    private void initViews() {

        nestedScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        // R.id.textHere needs to match the activity xml file's android:id="@+id/textHere'
        textInputLayoutBench = (TextInputLayout) findViewById(R.id.textInputLayoutBench);
        textInputLayoutSquat = (TextInputLayout) findViewById(R.id.textInputLayoutSquat);

        textInputEditTextBench = (TextInputEditText) findViewById(R.id.textInputEditTextBench);
        textInputEditTextSquat = (TextInputEditText) findViewById(R.id.textInputEditTextSquat);

        textInputLayoutDeadlift = (TextInputLayout) findViewById(R.id.textInputLayoutDeadlift);
        textInputLayoutOverheadpress = (TextInputLayout) findViewById(R.id.textInputLayoutOverheadpress);

        textInputEditTextDeadlift = (TextInputEditText) findViewById(R.id.textInputEditTextDeadlift);
        textInputEditTextOverheadpress = (TextInputEditText) findViewById(R.id.textInputEditTextOverheadpress);

        // Changed the name from appCompatButtonLogin to appCompatButton
        appCompatButtonLogin = (AppCompatButton) findViewById(R.id.appCompatButtonLogin);


    }

    /**
     * This implemented method is to listen the click on view
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        System.out.println("I am a test inside UsersLiftsActivity!!!");
    }
}

