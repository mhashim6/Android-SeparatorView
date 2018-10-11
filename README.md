
# SeparatorView

>A simple view that can be used as separator between any two views, with customize-able styles.

<img src="https://i.imgur.com/PEzgtEe.jpg" width="200">

<img src="https://i.imgur.com/39i9akJ.jpg" width="200">

<img src="https://i.imgur.com/mtG6TB8.jpg" width="200">

# Attributes:
| attribute    | value                   | documentation                                                      | default value |
|-------------------|-------------------------|--------------------------------------------------------------------|---------------|
| `app:lineStyle`   | [solid, dashed, dotted] | defines how the line should appear.                                | solid         |
| `app:lineColor`   | [color]                 | defines the color of the line.                                     | black         |
| `app:dashWidth`   | [dimension]             | defines the width of the dashes.                                   | 15px          |
| `app:dashGap`     | [dimension]             | defines the width of the gaps between the dashes.                  | 10px          |
| `app:orientation` | [horizontal,vertical]   | defines whether the line should appear vertically or horizontally. | horizontal    |
---
# Apps using this library:

 - [Put Back: The laid back reminder](https://play.google.com/store/apps/details?id=mhashim6.android.putback)

## Dependency:
[![](https://jitpack.io/v/mhashim6/SeparatorView.svg)](https://jitpack.io/#mhashim6/SeparatorView)

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency:
```groovy
dependencies {
    implementation 'com.github.mhashim6:SeparatorView:1.1'
}
```