package com.bgimage;

import javax.annotation.Nullable;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;


@ReactModule(name = BgImageManager.REACT_CLASS)
public class BgImageManager extends ViewGroupManager<BgImageView> {

  protected static final String REACT_CLASS = "RNTBgImage";
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

  @Override
  public BgImageView createViewInstance(ThemedReactContext context) {
    return new BgImageView(context);
  }

  @ReactProp(name = "drawable")
  public void setDrawable(BgImageView view, @Nullable String id) {
    view.setDrawable(id);
  }

}