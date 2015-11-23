package com.example.myapplication;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/16 0016.
 */
public class StaggeredRecyclerViewAdapter extends RecyclerViewAdapter{
    private List<Integer> mHeights;
    public StaggeredRecyclerViewAdapter(Context context, List<String> datas){
        super(context,datas);
        mHeights = new ArrayList<Integer>();
        for(int i = 0 ; i < mListData.size() ; i++){
            mHeights.add((int) (100+Math.random()*300));
            Log.i("TAG",mHeights.get(i)+"");
        }
    }

    //绑定ViewHolder
    @Override
    public void onBindViewHolder(StaggeredRecyclerViewAdapter.ViewHolder holder, int position) {
        LayoutParams lp = holder.itemView.getLayoutParams();
        lp.height = mHeights.get(position);
        holder.itemView.setLayoutParams(lp);

        holder.mTextView.setText(mListData.get(position));
        setOnListtener(holder);
    }
}

