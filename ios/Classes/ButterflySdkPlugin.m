#import "ButterflySdkPlugin.h"
#if __has_include(<butterfly_sdk/butterfly_sdk-Swift.h>)
#import <butterfly_sdk/butterfly_sdk-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "butterfly_sdk-Swift.h"
#endif

@implementation ButterflySdkPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftButterflySdkPlugin registerWithRegistrar:registrar];
}
@end
