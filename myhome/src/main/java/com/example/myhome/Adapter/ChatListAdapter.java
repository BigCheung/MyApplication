package com.example.myhome.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhome.ChatEntity;
import com.example.myhome.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2016/10/10.
 */

public class ChatListAdapter extends RecyclerView.Adapter {


    private List<ChatEntity> mChats;

    private LayoutInflater mLayoutInflater;


    public ChatListAdapter(Context context){
        this.mLayoutInflater=LayoutInflater.from(context);
        mChats=new ArrayList<>();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ChatListHodler(mLayoutInflater.inflate(R.layout.chat_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ChatListHodler chatHolder=(ChatListHodler)holder;
        ChatEntity chatEntity=mChats.get(position);

//        if (null==chatEntity)return;
        onBindChatHodler(chatEntity,chatHolder);
    }

    public void onBindChatHodler(ChatEntity chatEntity,ChatListHodler chatListHodler){
        chatListHodler.friendPortrait.setImageResource(R.mipmap.ic_launcher);
        chatListHodler.nameTitle.setText("张三");
        chatListHodler.recentTime.setText("2016-10-11");
        chatListHodler.excerptContent.setText("hello world");
    }

    @Override
    public int getItemCount() {
        return mChats.size();
    }

    public class ChatListHodler extends RecyclerView.ViewHolder{

        public ImageView friendPortrait;
        public TextView nameTitle;
        public TextView recentTime;
        public TextView excerptContent;

        public ChatListHodler(View itemView) {
            super(itemView);
            friendPortrait= (ImageView) itemView.findViewById(R.id.friendPortrait_imageView_chatItem);
            nameTitle= (TextView) itemView.findViewById(R.id.nameTitle_textView_chatItem);
            recentTime= (TextView) itemView.findViewById(R.id.recentTime_textView_chatItem);
            excerptContent= (TextView) itemView.findViewById(R.id.excerptContent_textView_chatItem);
        }
    }
}
