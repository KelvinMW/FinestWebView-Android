package com.thefinestartist.finestwebview.sample;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void onClick(View view) {
    if (view.getId() == R.id.ELMSecondary) {
      new FinestWebView(this).titleDefault("ELM SECONDARY SCHOOL")
      .showUrl(false)
      .statusBarColorRes(R.color.bluePrimaryDark)
      .toolbarColorRes(R.color.bluePrimary)
      .titleColorRes(R.color.finestWhite)
      .urlColorRes(R.color.bluePrimaryLight)
      .iconDefaultColorRes(R.color.finestWhite)
      .progressBarColorRes(R.color.finestWhite)
      .stringResCopiedToClipboard(R.string.copied_to_clipboard)
      .stringResCopiedToClipboard(R.string.copied_to_clipboard)
      .stringResCopiedToClipboard(R.string.copied_to_clipboard)
      .showSwipeRefreshLayout(true)
      .swipeRefreshColorRes(R.color.bluePrimaryDark)
      .menuSelector(R.drawable.selector_light_theme)
      .menuTextGravity(Gravity.CENTER)
      .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
      .dividerHeight(0)
      .gradientDivider(false)
      .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
      .show("https://secondary.elmischools.com");
      ////                    .toolbarScrollFlags(0)
      //                    .webViewJavaScriptEnabled(true)
      //                    .webViewUseWideViewPort(false)
      ////                    .show("http://andrewliu.in/2016/01/30/聊聊Redis的订阅发布/");
      //                    .show("http://www.youtube.com");
    } else if (view.getId() == R.id.ELMscienceSecondary) {
      //            Intent intent = new Intent(this, WebViewActivity.class);
      //            startActivity(intent);
      new FinestWebView(this)
          .theme(R.style.ELMscienceSecondary)
          .titleDefault("ELM SCIENCE SECONDARY SCHOOL")
          .showUrl(false)
          .statusBarColorRes(R.color.bluePrimaryDark)
          .toolbarColorRes(R.color.bluePrimary)
          .titleColorRes(R.color.finestWhite)
          .urlColorRes(R.color.bluePrimaryLight)
          .iconDefaultColorRes(R.color.finestWhite)
          .progressBarColorRes(R.color.finestWhite)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .showSwipeRefreshLayout(true)
          .swipeRefreshColorRes(R.color.bluePrimaryDark)
          .menuSelector(R.drawable.selector_light_theme)
          .menuTextGravity(Gravity.CENTER)
          .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
          .dividerHeight(0)
          .gradientDivider(false)
          .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
          .show("https://science-secondary.elmischools.com");
    } else if (view.getId() == R.id.ELMupper) {
      new FinestWebView(this)
          .theme(R.style.FinestWebViewTheme)
          .titleDefault("ELM UPPER PRIMARY SCHOOL")
          .showUrl(false)
          .statusBarColorRes(R.color.bluePrimaryDark)
          .toolbarColorRes(R.color.bluePrimary)
          .titleColorRes(R.color.finestWhite)
          .urlColorRes(R.color.bluePrimaryLight)
          .iconDefaultColorRes(R.color.finestWhite)
          .progressBarColorRes(R.color.finestWhite)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .showSwipeRefreshLayout(true)
          .swipeRefreshColorRes(R.color.bluePrimaryDark)
          .menuSelector(R.drawable.selector_light_theme)
          .menuTextGravity(Gravity.CENTER)
          .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
          .dividerHeight(0)
          .gradientDivider(false)
          .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
          .show("https://upper-p.elmischools.com");
    } else if (view.getId() == R.id.ELMlower) {
      new FinestWebView(this)
          .theme(R.style.FinestWebViewTheme)
          .titleDefault("ELM LOWER PRIMARY SCHOOL")
          .showUrl(false)
          .statusBarColorRes(R.color.bluePrimaryDark)
          .toolbarColorRes(R.color.bluePrimary)
          .titleColorRes(R.color.finestWhite)
          .urlColorRes(R.color.bluePrimaryLight)
          .iconDefaultColorRes(R.color.finestWhite)
          .progressBarColorRes(R.color.finestWhite)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .stringResCopiedToClipboard(R.string.copied_to_clipboard)
          .showSwipeRefreshLayout(true)
          .swipeRefreshColorRes(R.color.bluePrimaryDark)
          .menuSelector(R.drawable.selector_light_theme)
          .menuTextGravity(Gravity.CENTER)
          .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
          .dividerHeight(0)
          .gradientDivider(false)
          .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
          .show("https://lower-p.elmischools.com");
        } else if (view.getId() == R.id.ELMkg) {
          new FinestWebView(this)
              .theme(R.style.FinestWebViewTheme)
              .titleDefault("ELM KINDERGARTEN SCHOOL")
              .showUrl(false)
              .statusBarColorRes(R.color.bluePrimaryDark)
              .toolbarColorRes(R.color.bluePrimary)
              .titleColorRes(R.color.finestWhite)
              .urlColorRes(R.color.bluePrimaryLight)
              .iconDefaultColorRes(R.color.finestWhite)
              .progressBarColorRes(R.color.finestWhite)
              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
              .stringResCopiedToClipboard(R.string.copied_to_clipboard)
              .showSwipeRefreshLayout(true)
              .swipeRefreshColorRes(R.color.bluePrimaryDark)
              .menuSelector(R.drawable.selector_light_theme)
              .menuTextGravity(Gravity.CENTER)
              .menuTextPaddingRightRes(R.dimen.defaultMenuTextPaddingLeft)
              .dividerHeight(0)
              .gradientDivider(false)
              .setCustomAnimations(R.anim.slide_up, R.anim.hold, R.anim.hold, R.anim.slide_down)
              .show("https://kg.elmischools.com");
    }
  }
}
