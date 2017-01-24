package com.bgimage;

import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Shader;
import android.view.ViewGroup;

public class BgImageView extends ViewGroup {

  private Context context;
  private Resources resources;
  int resourceID = 0;

  public BgImageView(Context context) {
    super(context);
    init(context);
  }

  private void init(Context _context) {
    context = _context;
    resources = context.getResources();
  }

  @Override
  protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
  }

  // setter: resolve img by string id from drawable folder than set background
  public void setDrawable(String id) {
    if(id != null && !id.isEmpty()) {
      int rID = resources.getIdentifier(id, "drawable", context.getPackageName());
      if (rID > 0 && resourceID != rID) {
        resourceID = rID;
        //set repeating background image
        Bitmap backgroundImage = BitmapFactory.decodeResource(resources, resourceID);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, backgroundImage);
        bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        setBackground(bitmapDrawable);
      }
    }
  }

}