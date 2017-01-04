package com.bgimage;

import javax.annotation.Nullable;
//import java.util.Map;
//import android.graphics.Color;
//import android.graphics.PorterDuff.Mode;
//import com.facebook.csslayout.CSSConstants;
//import com.facebook.drawee.backends.pipeline.Fresco;
//import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
//import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
//import com.facebook.react.bridge.ReadableArray;
//import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
//import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
//import com.facebook.react.uimanager.annotations.ReactPropGroup;

@ReactModule(name = BgImageManager.REACT_CLASS)
public class BgImageManager extends SimpleViewManager<BgImageView> {

  protected static final String REACT_CLASS = "RCTBgImage";
  private final @Nullable Object mCallerContext;

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  public BgImageManager(Object callerContext) {
      mCallerContext = callerContext;
  }

  public BgImageManager() {
    mCallerContext = null;
  }

  //@Override
  //  public ReactImageView createViewInstance(ThemedReactContext context) {
  //    return new ReactImageView(context, Fresco.newDraweeControllerBuilder(), mCallerContext);
  // }
  @Override
  public BgImageView createViewInstance(ThemedReactContext context) {
    return new BgImageView(context);
  }

  @ReactProp(name = "drawableId")
  public void setDrawableId(BgImageView view, @Nullable String drawableId) {
    view.setDrawableId(drawableId);
  }

}