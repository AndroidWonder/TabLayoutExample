package com.tablelayout.javacodegeeks.tablayoutexample;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class SecondFragment extends Fragment {

    private View view;
    private Button button;
    private EditText text;
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);

        button = (Button) view.findViewById(R.id.Button01);
        text = (EditText) view.findViewById(R.id.EditText01);
        webView = (WebView) view.findViewById(R.id.web);

        //intercept URL loading and load in widget
        webView.setWebViewClient(new WebViewClient() {

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });

        //set listeners for web tab
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(text.getText().toString());

            }
        });

        text.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl(text.getText().toString());
                    return true;
                }
                return false;
            }
        });

        return view;
    }
}
