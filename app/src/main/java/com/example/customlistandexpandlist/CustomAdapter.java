package com.example.customlistandexpandlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context context;
    List<String >listdataheader;
    HashMap<String,List<String>>listdatachild;

    public CustomAdapter(Context context, List<String> listdataheader, HashMap<String, List<String>> listdatachild) {
        this.context = context;
        this.listdataheader = listdataheader;
        this.listdatachild = listdatachild;
    }

    @Override
    public int getGroupCount() {
        return listdataheader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listdatachild.get(listdataheader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listdataheader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listdatachild.get(listdataheader.get(i)).get(i);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerText=(String) getGroup(i);
        if(view==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
         view=inflater.inflate(R.layout.expandable_group_layout,null);


        }
        TextView textView=view.findViewById(R.id.tv_expandable_group_layout);
        textView.setText(headerText);
        return  view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String childText=(String) getChild(i,i1);
        if(view==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
            view=inflater.inflate(R.layout.expandable_child_layout,null);


        }
        TextView textView=view.findViewById(R.id.tv_expandable_child_layout);
        textView.setText(childText);
        return  view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
