package com.example.harshitha.talentacquisition.Async;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by harshu on 9/30/2015.
 */
public class SendEmailAsyncTask extends AsyncTask<String, Void, Boolean> {


      @Override
    protected Boolean doInBackground(String... params) {

        HttpClient client=new DefaultHttpClient();
        HttpPost post=new HttpPost("url");

        String email=params[1].toString();

        return null;
    }
}


