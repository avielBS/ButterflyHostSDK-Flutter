
import 'dart:async';

import 'package:flutter/services.dart';

class ButterflySdk {
  static const MethodChannel _channel =
      const MethodChannel('butterfly_sdk');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<bool> butterflySDK(String key) async {
    final bool result = await _channel.invokeMethod('butterflySDK',{"key":key});
    return result;
  }

}
