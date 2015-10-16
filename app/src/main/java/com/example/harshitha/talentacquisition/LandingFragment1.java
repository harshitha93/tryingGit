package com.example.harshitha.talentacquisition;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import com.example.harshitha.talentacquisition.Async.AlljobsAsyncTask;
import com.example.harshitha.talentacquisition.adapters.AlljobsAdapter;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by harshu on 9/21/2015.
 */
public class LandingFragment1 extends Fragment {

    ArrayList<JobItem> jbitem;
    Context ctx;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        jbitem = new ArrayList<JobItem>();

        View x=inflater.inflate(R.layout.landing_fragment1, container, false);
        ctx=getActivity();
//        jbitem.add(new JobItem("Android developer","We are looking for an Android developer...","2 years XP","bangalore","3 hours ago",R.drawable.star));
//        jbitem.add(new JobItem("IOS developer","We are looking for an IOS developer...", "5 years XP","bangalore", "8 hours ago", R.drawable.star_border));
//        jbitem.add(new JobItem("Web developer","We are looking for an Web developer...","2 years XP","Chennai","19 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Java developer","We are looking for an Java developer...", "2 years XP","bangalore", "19 Sep", R.drawable.star_border));
//        jbitem.add(new JobItem("HR Manager","We are looking for an HR Manager...","3-4years XP","Pune","17 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Marketing Manager","We are looking for an Marketing Manager...","3-4years XP","Mumbai","16 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Java developer","We are looking for an Java developer...","3-4years XP","Pune","15 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Web developer","We are looking for an Web developer...","3-4years XP","Chennai","15 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Android developer","We are looking for an Android developer...","3-4years XP","Pune","14 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("HR Manager","We are looking for an HR Manager...","8-10years XP","Delhi","12 Sep",R.drawable.star_border));
//        jbitem.add(new JobItem("Marketing Manager","We are looking for an Marketing Manager...","11-12years XP","Ahmedabad","10 Sep",R.drawable.star_border));


        if(isInternetOn()==true) {
            new AlljobsAsyncTask((MainActivity) this.getActivity()).execute("http://172.31.98.119:8080/api/dbs");
        }

        else
        {
            Toast.makeText(ctx,"Not Connected",Toast.LENGTH_SHORT).show();
        }

        return x;


    }

    public final boolean isInternetOn() {

        // get Connectivity Manager object to check connection
        ConnectivityManager connec =
                (ConnectivityManager)getActivity().getSystemService(getActivity().getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if ( connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {

            // if connected with internet


            return true;

        } else if (
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {


            return false;
        }
        return false;
    }




        }




