package com.example.harshitha.talentacquisition.Async;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.harshitha.talentacquisition.JobDescription;
import com.example.harshitha.talentacquisition.JobItem;
import com.example.harshitha.talentacquisition.LandingFragment1;
import com.example.harshitha.talentacquisition.MainActivity;
import com.example.harshitha.talentacquisition.R;
import com.example.harshitha.talentacquisition.adapters.AlljobsAdapter;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by harshu on 9/29/2015.
 */
public class AlljobsAsyncTask extends AsyncTask<String, Void, Object> {
    MainActivity c;
    ArrayList<JobItem> jlist;
    JobItem jitem ;
    public AlljobsAsyncTask(MainActivity ctx){
        this.c=ctx;
    }

    @Override
    protected ArrayList<JobItem> doInBackground(String... params) {

        try {
            HttpClient client = new DefaultHttpClient();
            HttpGet get = new HttpGet(params[0]);
            HttpResponse response = client.execute(get);
            jlist=new ArrayList<JobItem>();


            int status = response.getStatusLine().getStatusCode();
            if (status == 200) {
                HttpEntity entity = response.getEntity();
                String data = EntityUtils.toString(entity);

                JSONArray jarray = new JSONArray(data);
                if (jarray.length() > 0) {
                    for (int i = 0; i < jarray.length(); i++) {
                        JSONObject obj = jarray.optJSONObject(i);
                         jitem = new JobItem();
                        jitem.setJobrole(obj.optString("designation"));
                        jitem.setJoblocation(obj.optString("location"));
                        jitem.setExperience(obj.optString("experience"));
                        jitem.setJobdescription(obj.optString("description"));
                        jlist.add(jitem);

                    }

                }
                if(jarray.length()==0)
                {
                    Toast.makeText(c,"Data not loaded",Toast.LENGTH_SHORT).show();
                }
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return jlist;
    }

    @Override
    protected void onPostExecute(Object result) {
        //super.onPostExecute(aBoolean);
        ListView lv = (ListView)c.findViewById(R.id.listjobitem);
        AlljobsAdapter adap = new AlljobsAdapter(c, jlist);
        lv.setAdapter(adap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(c, JobDescription.class);
                i.putExtra("role",jlist.get(position).getJobrole());
                i.putExtra("jd",jlist.get(position).getJobdescription());
                i.putExtra("location",jlist.get(position).getJoblocation());
                c.startActivity(i);
            }
        });
    }
}