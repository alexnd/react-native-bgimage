package com.bgimage;

import android.view.View;
import android.content.Context;
//import android.util.AttributeSet;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Shader;
//import android.graphics.Matrix;

public class BgImageView extends View {

  private Context _context; // = view.getContext();
  private int resourceID;
  private Resources resources;

  //public BgImageView(Context context, AttributeSet attrs) {
  //  super(context, attrs);
  //}

  public BgImageView(Context context) {
    super(context);
    init(context);
  }

  private void init(Context context) { //, AttributeSet attrs, int defStyleAttr
    resources = context.getResources();
    _context = context;
  }

// setter: resolve img by string id from drawable folder
  public void setDrawableId(String id) {
    //TODO: check if string is empty
	resourceID = resources.getIdentifier(id, "drawable", _context.getPackageName());
	// invalidate this view in rendering pipeline
    //if (resourceID > 0) {
      //Repeating background image
      Bitmap backgroundImage = BitmapFactory.decodeResource(resources, resourceID);
      BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, backgroundImage);
      bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
      setBackground(bitmapDrawable);
    //}
  }

// render
//  protected void onDraw(Canvas canvas) {
//    super.onDraw(canvas);
//    mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//    canvas.drawBitmap(bitmapDrawable, 0, 0, null);
//  }

}