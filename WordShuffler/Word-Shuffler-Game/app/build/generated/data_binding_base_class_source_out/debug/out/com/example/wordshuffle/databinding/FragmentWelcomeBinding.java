// Generated by view binder compiler. Do not edit!
package com.example.wordshuffle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import com.example.wordshuffle.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWelcomeBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final ImageView changeTheme;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextInputLayout editPersonNameLayout;

  @NonNull
  public final TextInputLayout editPersonPasswordLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final MaterialButton materialButton;

  @NonNull
  public final TextInputEditText personName;

  @NonNull
  public final TextInputEditText personPassword;

  private FragmentWelcomeBinding(@NonNull MotionLayout rootView, @NonNull ImageView changeTheme,
      @NonNull TextView description, @NonNull TextInputLayout editPersonNameLayout,
      @NonNull TextInputLayout editPersonPasswordLayout, @NonNull ImageView imageView,
      @NonNull MaterialButton materialButton, @NonNull TextInputEditText personName,
      @NonNull TextInputEditText personPassword) {
    this.rootView = rootView;
    this.changeTheme = changeTheme;
    this.description = description;
    this.editPersonNameLayout = editPersonNameLayout;
    this.editPersonPasswordLayout = editPersonPasswordLayout;
    this.imageView = imageView;
    this.materialButton = materialButton;
    this.personName = personName;
    this.personPassword = personPassword;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_welcome, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWelcomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.change_theme;
      ImageView changeTheme = rootView.findViewById(id);
      if (changeTheme == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = rootView.findViewById(id);
      if (description == null) {
        break missingId;
      }

      id = R.id.editPersonNameLayout;
      TextInputLayout editPersonNameLayout = rootView.findViewById(id);
      if (editPersonNameLayout == null) {
        break missingId;
      }

      id = R.id.editPersonPasswordLayout;
      TextInputLayout editPersonPasswordLayout = rootView.findViewById(id);
      if (editPersonPasswordLayout == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.materialButton;
      MaterialButton materialButton = rootView.findViewById(id);
      if (materialButton == null) {
        break missingId;
      }

      id = R.id.person_name;
      TextInputEditText personName = rootView.findViewById(id);
      if (personName == null) {
        break missingId;
      }

      id = R.id.person_password;
      TextInputEditText personPassword = rootView.findViewById(id);
      if (personPassword == null) {
        break missingId;
      }

      return new FragmentWelcomeBinding((MotionLayout) rootView, changeTheme, description,
          editPersonNameLayout, editPersonPasswordLayout, imageView, materialButton, personName,
          personPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
