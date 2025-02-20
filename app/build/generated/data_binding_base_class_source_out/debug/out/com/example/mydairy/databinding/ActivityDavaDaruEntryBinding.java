// Generated by view binder compiler. Do not edit!
package com.example.mydairy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class ActivityDavaDaruEntryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText doseExternal;

  @NonNull
  public final EditText doseFromDairy;

  @NonNull
  public final EditText medicalVisitDairy;

  @NonNull
  public final EditText medicalVisitExternal;

  @NonNull
  public final EditText medicineExternal;

  @NonNull
  public final FloatingActionButton saveBtn;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDavaDaruEntryBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText doseExternal, @NonNull EditText doseFromDairy,
      @NonNull EditText medicalVisitDairy, @NonNull EditText medicalVisitExternal,
      @NonNull EditText medicineExternal, @NonNull FloatingActionButton saveBtn,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.doseExternal = doseExternal;
    this.doseFromDairy = doseFromDairy;
    this.medicalVisitDairy = medicalVisitDairy;
    this.medicalVisitExternal = medicalVisitExternal;
    this.medicineExternal = medicineExternal;
    this.saveBtn = saveBtn;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDavaDaruEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDavaDaruEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dava_daru_entry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDavaDaruEntryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dose_external;
      EditText doseExternal = rootView.findViewById(id);
      if (doseExternal == null) {
        break missingId;
      }

      id = R.id.dose_from_dairy;
      EditText doseFromDairy = rootView.findViewById(id);
      if (doseFromDairy == null) {
        break missingId;
      }

      id = R.id.medical_visit_dairy;
      EditText medicalVisitDairy = rootView.findViewById(id);
      if (medicalVisitDairy == null) {
        break missingId;
      }

      id = R.id.medical_visit_external;
      EditText medicalVisitExternal = rootView.findViewById(id);
      if (medicalVisitExternal == null) {
        break missingId;
      }

      id = R.id.medicine_external;
      EditText medicineExternal = rootView.findViewById(id);
      if (medicineExternal == null) {
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

      return new ActivityDavaDaruEntryBinding((ConstraintLayout) rootView, doseExternal,
          doseFromDairy, medicalVisitDairy, medicalVisitExternal, medicineExternal, saveBtn,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
