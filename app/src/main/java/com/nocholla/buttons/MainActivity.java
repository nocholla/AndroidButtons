package com.nocholla.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.webkit.WebView;
import com.nocholla.buttons.util.Constants;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    // Widgets
    private Button btnGoogle;
    private Button btnYahoo;
    private WebView webView;
    private ScrollView scrollView;
    private RadioButton radioButtonRed;
    private RadioButton radioButtonGreen;
    private RadioButton radioButtonBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Widgets
        scrollView = findViewById(R.id.scroll_view);
        radioButtonRed = findViewById(R.id.radio_red);
        radioButtonGreen = findViewById(R.id.radio_green);
        radioButtonBlue = findViewById(R.id.radio_blue);
        btnGoogle = findViewById(R.id.btn_google);
        btnYahoo = findViewById(R.id.btn_yahoo);
        webView = findViewById(R.id.web_view);

        // Radio Button Red
        radioButtonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.setBackgroundColor(Color.RED);
            }
        });

        // Radio Button Green
        radioButtonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.setBackgroundColor(Color.GREEN);
            }
        });

        // Radio Button Blue
        radioButtonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.setBackgroundColor(Color.BLUE);
            }
        });

        // Button Google
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(Constants.URL_GOOGLE);
            }
        });

        // Button Yahoo
        btnYahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(Constants.URL_YAHOO);
            }
        });

    }

//    public void onRadioButtonClicked(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        String radioButtonString = "";
//
//        switch(view.getId()) {
//            case R.id.radio_red:
//                if(checked)
//                    radioButtonString = "Red Selected";
//                break;
//            case R.id.radio_green:
//                if(checked)
//                    radioButtonString = "Green Selected";
//                break;
//            case R.id.radio_blue:
//                if(checked)
//                    radioButtonString = "Blue Selected";
//                break;
//        }
//
//        Toast.makeText(getApplicationContext(), radioButtonString, Toast.LENGTH_SHORT).show();
//    }

}
