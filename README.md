TheButterflyHost help you app to take part in the fight against domestic violent.


## Installations
### 🔌 & ▶️

[Our plugin](https://pub.dev/packages/butterfly_host_sdk) is pretty straight forward and easy to install, all you need to do is add `butterfly_host_sdk` dependency .
To recognize your app in ButterflyHostSDK servers you need an application key, you can set it via code.

Required changes in your `pubspec.yaml` file:
```yaml
dependencies:
  flutter:
    sdk: flutter
...
  butterfly_host_sdk: 0.0.1
...
```

Becuse the SDK uses Jitpack.io:

* in your `flutter_app/Android/app/build.gradle` set your `minSdkVersion 21`
* in your `flutter_app/Android/build.gradle` add :
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
        google()
        jcenter()
    }
}
```



## Example

```
import 'package:butterfly_sdk/butterfly_host_sdk.dart';
  
  await ButterflyHostSDK.butterflySDK("YOUR_API_KEY");

```

## Comments

* This SDK using a method channel for better performances.
