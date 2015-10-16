package com.example.harshitha.talentacquisition.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harshitha.talentacquisition.AppliedItem;
import com.example.harshitha.talentacquisition.R;

import java.util.ArrayList;

/**
 * Created by harshu on 9/21/2015.
 */
public class AppliedjobsAdapter extends BaseAdapter {


    Context ctx;
    ArrayList<AppliedItem> appliedItem;
    LayoutInflater inf;


    public AppliedjobsAdapter(Context context, ArrayList<AppliedItem> apitem)
    {
        this.ctx =context;
        this.appliedItem=apitem;
        this.inf= (LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView== null){
            convertView=inf.inflate(R.layout.activity_listview1,parent,false);
        }

        AppliedItem subAppItem = appliedItem.get(position);

        TextView tv1 = (TextView)convertView.findViewById(R.id.tv1);
        tv1.setText(subAppItem.getJobrole());
        TextView tv2 = (TextView)convertView.findViewById(R.id.tv2);
        tv2.setText(subAppItem.getJobdescription());
        TextView tv3=(TextView)convertView.findViewById(R.id.tv3);
        tv3.setText(subAppItem.getExperience());
        TextView tv4 = (TextView)convertView.findViewById(R.id.tv4);
        tv4.setText(subAppItem.getJoblocation());
        TextView tv5=(TextView)convertView.findViewById(R.id.tv5);
        tv5.setText(subAppItem.getTime());
        ImageView imv=(ImageView)convertView.findViewById(R.id.imv1);
        imv.setVisibility(View.VISIBLE);
        if(position==0)
        {
            imv.setBackgroundResource(R.drawable.star);
        }
        else
        {
            imv.setBackgroundResource(R.drawable.star_border);
        }

        ImageView imv2=(ImageView)convertView.findViewById(R.id.imv2);
        imv2.setVisibility(View.VISIBLE);
        if (position==0)
        {
            imv2.setBackgroundColor(Color.parseColor("#FBC02D"));
        }
        if(position==1)
        {
            imv2.setBackgroundColor(Color.parseColor("#F44336"));
        }

        if(position==2)
        {
            imv2.setBackgroundColor(Color.parseColor("#F44336"));
        }

        if(position==3)
        {
            imv2.setBackgroundColor(Color.parseColor("#8BC34A"));
        }
        if(position==4)
        {
            imv2.setBackgroundColor(Color.parseColor("#8BC34A"));
        }
        if(position==5)
        {
            imv2.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if(position==6)
        {
            imv2.setBackgroundColor(Color.parseColor("#8BC34A"));
        }

        ImageView imv3=(ImageView)convertView.findViewById(R.id.imv3);
        imv3.setVisibility(View.VISIBLE);

//        if(position==0)
//        {
//            imv3.setBackgroundColor(Color.rgb(27,33,228));
//
//        }
//
//        if (position==1)
//        {
//            imv3.setBackgroundColor(Color.rgb(119,121,191));
//        }
//
//        if(position==2)
//        {
//         imv3.setBackgroundColor(Color.rgb(76,168,131));
//        }

       // ImageView imv1=(ImageView)convertView.findViewById(R.id.imv3);
        //imv1.setVisibility(View.VISIBLE);
        //if(position==0)
        //{

        //}


        return convertView;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return appliedItem.get(position);
    }

    @Override
    public int getCount() {
        return appliedItem.size();
    }


}


