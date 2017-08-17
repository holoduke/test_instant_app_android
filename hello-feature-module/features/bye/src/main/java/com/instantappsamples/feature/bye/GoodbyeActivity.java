/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.instantappsamples.feature.bye;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.library_bye.ByeFragment;


/** Simple activity that says goodbye. */
public class GoodbyeActivity extends AppCompatActivity {

  public String TAG = "activity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Log.d(TAG,"change me and you will see that i will change");

    setContentView(R.layout.activity_goodbye);

    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();

    Bundle b = new Bundle();
    b.putString("test", "test123");

    Fragment f = new ByeFragment();
    f.setArguments(b);
    f.setRetainInstance(false);
    ft.add(R.id.fragment_target, f);
    ft.addToBackStack(null);
    ft.commit();
  }
}
