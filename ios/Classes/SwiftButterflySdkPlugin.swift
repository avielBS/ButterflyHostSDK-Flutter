import Flutter
import UIKit
import ButterflyHost

public class SwiftButterflySdkPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "butterfly_sdk", binaryMessenger: registrar.messenger())
    let instance = SwiftButterflySdkPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    if(call.method.elementsEqual("butterfly_sdk")){
        let arguments = call.arguments as? NSDictionary
        let key = arguments!["key"] as? String
        guard let window = UIApplication.shared.keyWindow, let vc = window.rootViewController else {
            return
        }
        ButterflyHostController.getInstance().onGrabReportRequeste(vc, andKey:key)
    }
  }
}
