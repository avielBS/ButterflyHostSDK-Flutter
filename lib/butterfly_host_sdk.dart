
import 'dart:async';

import 'package:flutter/services.dart';

class  ButterflyHostSDK{
  static const MethodChannel _channel =
      const MethodChannel('butterfly_sdk');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static void butterflyHost(String key) async {
     _channel.invokeMethod('butterflyHostSDK',{"key":key});
  }

}
