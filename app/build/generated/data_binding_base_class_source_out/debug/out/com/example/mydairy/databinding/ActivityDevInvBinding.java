// Generated by view binder compiler. Do not edit!
package com.example.mydairy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.mydairy.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDevInvBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText cowPurchaseEditText;

  @NonNull
  public final TextView cowPurchaseTxt;

  @NonNull
  public final EditText cowSellingEditText;

  @NonNull
  public final TextView cowSellingTxt;

  @NonNull
  public final EditText expansionAmountEditText;

  @NonNull
  public final EditText expansionDetailsEditText;

  @NonNull
  public final TextView expansionTxt;

  @NonNull
  public final FloatingActionButton saveBtn;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDevInvBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText cowPurchaseEditText, @NonNull TextView cowPurchaseTxt,
      @NonNull EditText cowSellingEditText, @NonNull TextView cowSellingTxt,
      @NonNull EditText expansionAmountEditText, @NonNull EditText expansionDetailsEditText,
      @NonNull TextView expansionTxt, @NonNull FloatingActionButton saveBtn,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.cowPurchaseEditText = cowPurchaseEditText;
    this.cowPurchaseTxt = cowPurchaseTxt;
    this.cowSellingEditText = cowSellingEditText;
    this.cowSellingTxt = cowSellingTxt;
    this.expansionAmountEditText = expansionAmountEditText;
    this.expansionDetailsEditText = expansionDetailsEditText;
    this.expansionTxt = expansionTxt;
    this.saveBtn = saveBtn;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDevInvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDevInvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dev_inv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDevInvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cow_purchase_editText;
      EditText cowPurchaseEditText = rootView.findViewById(id);
      if (cowPurchaseEditText == null) {
        break missingId;
      }

      id = R.id.cow_purchase_txt;
      TextView cowPurchaseTxt = rootView.findViewById(id);
      if (cowPurchaseTxt == null) {
        break missingId;
      }

      id = R.id.cow_selling_editText;
      EditText cowSellingEditText = rootView.findViewById(id);
      if (cowSellingEditText == null) {
        break missingId;
      }

      id = R.id.cow_selling_txt;
      TextView cowSellingTxt = rootView.findViewById(id);
      if (cowSellingTxt == null) {
        break missingId;
      }

      id = R.id.expansion_amount_editText;
      EditText expansionAmountEditText = rootView.findViewById(id);
      if (expansionAmountEditText == null) {
        break missingId;
      }

      id = R.id.expansion_details_editText;
      EditText expansionDetailsEditText = rootView.findViewById(id);
      if (expansionDetailsEditText == null) {
        break missingId;
      }

      id = R.id.expansion_txt;
      TextView expansionTxt = rootView.findViewById(id);
      if (expansionTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      FloatingActionButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDevInvBinding((ConstraintLayout) rootView, cowPurchaseEditText,
          cowPurchaseTxt, cowSellingEditText, cowSellingTxt, expansionAmountEditText,
          expansionDetailsEditText, expansionTxt, saveBtn, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
