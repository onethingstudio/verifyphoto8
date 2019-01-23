package com.verify.photo.module.album;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.verify.photo.R;
import com.verify.photo.bean.album.ALbumBean;
import com.verify.photo.utils.fresco.FrescoUtils;
import com.verify.photo.view.view.BaseItemTempalte;
import com.verify.photo.view.view.ViewHolder;

import java.util.List;

/**
 * Created by licong on 2018/9/30.
 */

public class Albumtemplate extends BaseItemTempalte {

    private View.OnClickListener clickListener;

    public Albumtemplate(View.OnClickListener listener) {
        this.clickListener = listener;
    }

    @Override
    public int getViewId() {
        return R.layout.album_viewpager_item;
    }

    @Override
    public void convert(ViewHolder holder, int position, List list) {
        SimpleDraweeView photo = holder.getView(R.id.album_viewpager_item_photo);
        ALbumBean aLbumBean = (ALbumBean) list.get(position);
        FrescoUtils.getInstance().showImage(photo, aLbumBean.getImage());
        TextView title = holder.getView(R.id.photo_title);
        title.setText(aLbumBean.getSpecName());
        LinearLayout delete = holder.getView(R.id.album_delete_layout);
        delete.setTag(position);
        if (clickListener != null) {
            delete.setOnClickListener(clickListener);
        }
    }
}
