import 'dart:async';

import 'package:flutter/services.dart';

class SerialNumber {
  static const MethodChannel _channel =
      const MethodChannel('serial_number');

  static Future<String> get macAddress async {
    final String version = await _channel.invokeMethod('getMacAddress');
    return version;
  }

  static Future<String> get serialNumber async {
    final String version = await _channel.invokeMethod('getSerialNumber');
    return version;
  }
}
