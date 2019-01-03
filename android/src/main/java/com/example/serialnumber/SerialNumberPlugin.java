package com.example.serialnumber;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** SerialNumberPlugin */
public class SerialNumberPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "serial_number");
    channel.setMethodCallHandler(new SerialNumberPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getSerialNumber")) {
      result.success(android.os.Build.SERIAL);
    } else {
      result.notImplemented();
    }
  }
}
