// Generated by view binder compiler. Do not edit!
package com.example.mydairy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.mydairy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReportLabourChargeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText endDteEdit;

  @NonNull
  public final TextView endDteTxt;

  @NonNull
  public final ListView labourChargeRecycler;

  @NonNull
  public final View parititon;

  @NonNull
  public final Button searchBtn;

  @NonNull
  public final EditText startDteEdit;

  @NonNull
  public final TextView startDteTxt;

  private ReportLabourChargeBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText endDteEdit, @NonNull TextView endDteTxt,
      @NonNull ListView labourChargeRecycler, @NonNull View parititon, @NonNull Button searchBtn,
      @NonNull EditText startDteEdit, @NonNull TextView startDteTxt) {
    this.rootView = rootView;
    this.endDteEdit = endDteEdit;
    this.endDteTxt = endDteTxt;
    this.labourChargeRecycler = labourChargeRecycler;
    this.parititon = parititon;
    this.searchBtn = searchBtn;
    this.startDteEdit = startDteEdit;
    this.startDteTxt = startDteTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReportLabourChargeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReportLabourChargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.report_labour_charge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReportLabourChargeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.end_dte_edit;
      EditText endDteEdit = rootView.findViewById(id);
      if (endDteEdit == null) {
        break missingId;
      }

      id = R.id.end_dte_txt;
      TextView endDteTxt = rootView.findViewById(id);
      if (endDteTxt == null) {
        break missingId;
      }

      id = R.id.labour_charge_recycler;
      ListView labourChargeRecycler = rootView.findViewById(id);
      if (labourChargeRecycler == null) {
        break missingId;
      }

      id = R.id.parititon;
      View parititon = rootView.findViewById(id);
      if (parititon == null) {
        break missingId;
      }

      id = R.id.search_btn;
      Button searchBtn = rootView.findViewById(id);
      if (searchBtn == null) {
        break missingId;
      }

      id = R.id.start_dte_edit;
      EditText startDteEdit = rootView.findViewById(id);
      if (startDteEdit == null) {
        break missingId;
      }

      id = R.id.start_dte_txt;
      TextView startDteTxt = rootView.findViewById(id);
      if (startDteTxt == null) {
        break missingId;
      }

      return new ReportLabourChargeBinding((ConstraintLayout) rootView, endDteEdit, endDteTxt,
          labourChargeRecycler, parititon, searchBtn, startDteEdit, startDteTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
