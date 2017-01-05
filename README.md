# react-native-bgimage

## Background images for react native

Renders your android res/drawable* images in tiling mode (repeated background) in most optimized way.
**Currently supports only Android**

### Installation

- put your images in drawables directory: **android/app/src/main/res/drawable-[m|h|x|xx|xxx]dpi**
- run: **npm install --save https://github.com/alexnd/react-native-bgimage.git**
- run: **react-native link** (or link it manually)

### To manual link

- add to **android/settings.gradle** :
```
include ':react-native-bgimage'
project(':react-native-bgimage').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-bgimage/android')
```

- add to **android/app/build.gradle** in section **dependencies { ... }** :
```
compile project(':react-native-bgimage')
```
- add **new BgImagePackage()** call in method **getPackages()** of **android/app/src/main/java/.../MainApplication.java** :
```
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new BgImagePackage(), // <-- add here
          // other modules...
      );
    }
```

### React Native usage (JS)
```
import BgImage from 'react-native-bgimage';

render() {
	return <BgImage drawableId="testbg" style={{height:64}}>
	    <Text style={{textAlign: 'center'}}>Hello!</Text>
	</BgImage>
}
```

where *testbg* resides in *android/app/src/main/res/drawable-hdpi/testbg.png*