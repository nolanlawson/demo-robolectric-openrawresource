package com.nolanlawson.hellorobolectric.test;

import android.app.Activity;

import com.nolanlawson.hellorobolectricapp.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@Config(emulateSdk = 18, manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class BasicTest {

  @Test
  public void testSomething() throws Exception {
    Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
    assertTrue(activity != null);
  }
}
