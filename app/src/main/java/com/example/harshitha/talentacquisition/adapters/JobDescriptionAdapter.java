package com.example.harshitha.talentacquisition.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.harshitha.talentacquisition.AppliedItem;
import com.example.harshitha.talentacquisition.JDItem;
import com.example.harshitha.talentacquisition.R;

import java.util.ArrayList;

/**
 * Created by harshu on 9/30/2015.
 */
public class JobDescriptionAdapter extends BaseAdapter {


    Context ctx;
    ArrayList<JDItem> jditem;
    LayoutInflater inf;

    public JobDescriptionAdapter(Context context, ArrayList<JDItem> jditem)
    {
        this.ctx =context;
        this.jditem=jditem;
        this.inf= (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(R.layout.jobdescription, parent, false);
        }

        JDItem subJditem = jditem.get(position);

        TextView tv1 = (TextView)convertView.findViewById(R.id.jobrole);
        tv1.setText(subJditem.getJobrole());
        TextView tv2 = (TextView)convertView.findViewById(R.id.description);
        tv2.setText(subJditem.getDescription());
        TextView tv3 = (TextView)convertView.findViewById(R.id.descriptionvalue);
        tv3.setText(subJditem.getDescriptionvalue());
        TextView tv4 = (TextView)convertView.findViewById(R.id.location);
        tv4.setText(subJditem.getLocation());
        TextView tv5 = (TextView)convertView.findViewById(R.id.locationvalue);
        tv5.setText(subJditem.getLocationvalue());
        TextView tv6 = (TextView)convertView.findViewById(R.id.salary);
        tv6.setText(subJditem.getSalary());
        TextView tv7 = (TextView)convertView.findViewById(R.id.salaryvalue);
        tv7.setText(subJditem.getSalaryvalue());

        return convertView;
    }
}
