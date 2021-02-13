# TheButterflyHost iOS SDK


TheButterflyHost help you app to take part in the fight against domestic violent.


## Installationa
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

## Example

```
import 'package:butterfly_sdk/butterfly_host_sdk.dart';
  
  await ButterflyHostSDK.butterflySDK("YOUR_API_KEY");

```

## Comments

* This SDK using a method channel for better performances.
