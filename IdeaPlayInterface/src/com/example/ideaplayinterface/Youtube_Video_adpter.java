package com.example.ideaplayinterface;

import java.util.List;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Youtube_Video_adpter extends BaseAdapter
{
	List<Youtube_Search_Methods> searched_list;
	Context cnt;
	LayoutInflater inflater=null;
	ImageView image_thumb;
	TextView text_title,text_by,text_video_uploaded_date,text_video_view_count,text_duration;
	ImageLoader loader;
	public Youtube_Video_adpter(Context activity,List<Youtube_Search_Methods> searched_list_Url) 
	{
		// TODO Auto-generated constructor stub
		searched_list=searched_list_Url;
		cnt=activity;
		inflater=LayoutInflater.from(activity);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return searched_list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return  position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView=null;
		if(convertView==null)
		{
			convertView=inflater.inflate(R.layout.youtube_video_adpter, null);
			image_thumb=(ImageView)convertView.findViewById(R.id.imageView1_video_thumb);
			text_title=(TextView)convertView.findViewById(R.id.textView1_videoTitle);
			text_by=(TextView)convertView.findViewById(R.id.textView_video_by);
			text_video_uploaded_date=(TextView)convertView.findViewById(R.id.textView_video_Uploaded);
			text_video_view_count=(TextView)convertView.findViewById(R.id.textView_video_Views);
			text_duration=(TextView)convertView.findViewById(R.id.imageView1_duration);
		}
		else
		{
			
		}
		int a=0;
		int b=1;
		int d=1;
		text_title.setText(searched_list.get(position).getTitle());
		text_by.setText(searched_list.get(position).getUploader());
		text_video_uploaded_date.setText(searched_list.get(position).getUploaded());
		text_video_view_count.setText(searched_list.get(position).getViewCount()+" views");
		
		String duration_values=searched_list.get(position).getDuration();
		try
		{
		float dur=Float.parseFloat(duration_values);
		float new_dur=(dur/60F);
		String new_duration=String.valueOf(new_dur);
		int PointStatus=new_duration.indexOf(".");
		String beforePoint=new_duration.substring(0, PointStatus);
		String AfterPoint=new_duration.substring(PointStatus+1, PointStatusZ);
		String finalString=new_duration.substring(new_duration.s, end)
		text_duration.setText(new_duration.replace(".", ":"));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		String video_thumbnails=searched_list.get(position).getThumbnails();
		loader=new ImageLoader(cnt);
		loader.DisplayImage(video_thumbnails, image_thumb);
		return convertView;
	}

}
