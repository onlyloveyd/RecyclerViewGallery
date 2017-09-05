/**
 * Copyright 2017 yidong
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.onlyloveyd.recyclerviewgallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * 文 件 名: CardAdapter
 * 创 建 人: 易冬
 * 创建日期: 2017/9/5 09:42
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
public class CardAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private Context mContext;

    private List<Integer> mCardImageList = new ArrayList<Integer>() {
        {
            add(R.mipmap.one);
            add(R.mipmap.two);
            add(R.mipmap.three);
            add(R.mipmap.four);
            add(R.mipmap.five);
            add(R.mipmap.six);
            add(R.mipmap.seven);
            add(R.mipmap.eight);
        }
    };

    public CardAdapter(Context context) {
        mContext = context;
    }

    public void setCardImageList(List<Integer> cardImageList) {
        mCardImageList = cardImageList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_card, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Picasso.with(mContext).load(mCardImageList.get(position)).into(holder.ivCard);
    }

    @Override
    public int getItemCount() {
        return mCardImageList.size();
    }
}
