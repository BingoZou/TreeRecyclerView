package com.baozi.demo.item.sortList;

import com.baozi.demo.R;
import com.baozi.treerecyclerview.base.ViewHolder;
import com.baozi.treerecyclerview.item.TreeItem;

/**
 * Created by baozi on 2017/8/19.
 */

public class SortChildItem extends TreeItem<String> {
    @Override
    public int getLayoutId() {
        return R.layout.item_sort_child;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder) {
        viewHolder.setText(R.id.tv_content, data);
    }
}
