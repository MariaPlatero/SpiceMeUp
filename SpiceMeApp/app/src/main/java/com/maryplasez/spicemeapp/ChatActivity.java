package com.maryplasez.spicemeapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.R.attr.id;

public class ChatActivity extends AppCompatActivity {

    String inMesssage = new String();
    EditText editText;
    String answerString = new String();

    ImageButton text;
    ImageButton spice;

    Context context;
    RelativeLayout typeLayout;
    FloatingActionButton fab;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        inMesssage = getIntent().getStringExtra("PUSH");
        setContentView(R.layout.activity_chat);

        typeLayout = (RelativeLayout) findViewById(R.id.typeLayout);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        final TextView input = (TextView) findViewById(R.id.inputText);
        input.setText(inMesssage);
        input.setVisibility(View.VISIBLE);

        text = (ImageButton) findViewById(R.id.normaltext);
        spice = (ImageButton) findViewById(R.id.Spice);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setVisibility(View.GONE);
                spice.setVisibility(View.GONE);
                typeLayout.setVisibility(View.VISIBLE);

                normalTexting();
            }
        });

        spice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setVisibility(View.GONE);
                spice.setVisibility(View.GONE);
//
//                fab.setVisibility(View.VISIBLE);
                Intent intent = new Intent(context, SpiceSelectionActivity.class);
                startActivity(intent);
            }
        });
        answer = (TextView) findViewById(R.id.textSpace);

        editText = (EditText) findViewById(R.id.editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (id == EditorInfo.IME_ACTION_DONE) {
                    //do something
                    hideKeyboard();
                    answerString = answerString.concat(String.valueOf(editText.getText())).concat("\n");
                    answer.setText(answerString);
                    answer.refreshDrawableState();
                    answer.setVisibility(View.VISIBLE);
                    editText.setText("");
                    return true;
                }
                return false;
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    private void normalTexting() {


        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        ImageButton bt = (ImageButton) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboard();
                answerString = answerString.concat(String.valueOf(editText.getText())).concat("\n");
                answer.setText(answerString);
                answer.refreshDrawableState();
                answer.setVisibility(View.VISIBLE);
                editText.setText("");
            }
        });
    }


    protected void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

}
