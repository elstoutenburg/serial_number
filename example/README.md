# serial_number_example

This package will retrieve the serial number of the device that the software is installed on to.

This plugin only works for Android currently. iOS release coming later.

## Getting Started

Sample usage:

```dart
import "package:serial_number/serial_number.dart";

String sn = await SerialNumber.serialNumber;

debugPrint(serial);

// only work on Android.
```

