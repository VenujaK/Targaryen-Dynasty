//package com.venujak.myapplication;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
//
//    Context context;
//    ArrayList<Article> list;
//
//    public MyAdapter(Context context, ArrayAdapter<Article> list) {
//        this.context = context;
//        this.list = list;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
//        return new MyViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        Article article= list.get(position);
//        holder.Title.setText(article.getTitle());
//        holder.Credit.setText(article.getCredit());
//        holder.artImage.setImageURI(article.getImg());
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder{
//        TextView Title,Credit;
//        ImageView artImage;
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            Title=itemView.findViewById(R.id.artTitle);
//            Credit=itemView.findViewById(R.id.artCredit);
//            artImage=itemView.findViewById(R.id.artImg);
//        }
//    }
//}
