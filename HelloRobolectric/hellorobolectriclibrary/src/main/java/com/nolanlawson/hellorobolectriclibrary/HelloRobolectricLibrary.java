package com.nolanlawson.hellorobolectriclibrary;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by nlawson on 12/18/14.
 */
public class HelloRobolectricLibrary {

  public static String saySomethingCool(Context context) {

    try {
      InputStream in = null;

      try {
        in = context.getResources().openRawResource(R.raw.file);
        return read(in);
      } finally {
        if (in != null) {
          in.close();
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  private static String read(InputStream in) throws IOException {

    BufferedReader buff = new BufferedReader(new InputStreamReader(in));

    String res = "";
    while (buff.ready()) {
      res += buff.readLine() + "\n";
    }

    return res;
  }
}
