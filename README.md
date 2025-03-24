# SDP-SSP-Compose-Multiplatform
[![Maven Central](https://img.shields.io/maven-central/v/network.chaintech/sdp-ssp-compose-multiplatform.svg)](https://central.sonatype.com/artifact/network.chaintech/sdp-ssp-compose-multiplatform)
[![Kotlin](https://img.shields.io/badge/kotlin-v2.1.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-v1.7.3-blue)](https://github.com/JetBrains/compose-multiplatform)

![badge-android](http://img.shields.io/badge/platform-android-3DDC84.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-FF375F.svg?style=flat)
![badge-desktop](http://img.shields.io/badge/platform-desktop-FF9500.svg?style=flat)
![badge-desktop](http://img.shields.io/badge/platform-wasm-42F59E.svg?style=flat)

**SDP-SSP-Compose-Multiplatform** is a scalable size unit library designed specifically for Compose Multiplatform projects. It enables consistent UI scaling across iOS, Android, Desktop, and WebAssembly (Wasm), ensuring a seamless user experience on different screen sizes and resolutions.

This library eliminates the traditional reliance on fixed dp (density-independent pixels) and sp (scale-independent pixels) by introducing sdp (scalable dp) and ssp (scalable sp) units. These units dynamically adjust based on screen density, making layouts more adaptive and ensuring better usability across platforms.

![git-banner](./assets/git-banner.png)

## 🚀 Key Features

**Compose Multiplatform Support:** Works across Android, iOS, Desktop, and WebAssembly (Wasm).

**Adaptive UI Scaling:** Uses sdp and ssp to automatically adjust sizes based on screen density.

**Easy to Integrate:** Simple API that seamlessly integrates with existing Jetpack Compose projects.

**Consistent Layouts:** Ensures UI consistency across multiple screen sizes and platforms.

**No Additional Setup Required:** Works out-of-the-box without complex configurations.

## 📦 Installation

Add the dependency to your `build.gradle.kts` file:

```
commonMain.dependencies {
    implementation("network.chaintech:sdp-ssp-compose-multiplatform:1.0.6")
}
```
## ⚙️ Customizing the Scaling Ratio
By default, the library uses a scaling ratio of 300 for .sdp and .ssp values. You can change this to fit your design needs using:
```kotlin
SDPConfig.setScalingRatio(250.0) // Set a custom ratio

```

## 🎨 Usage
Use **sdp** and **ssp** for adaptive and scalable UI components:
```kotlin
val padding = 16.sdp
val fontSize = 14.ssp

Box(modifier = Modifier.padding(padding)) {
    Text(text = "Hello, World!", fontSize = fontSize)
}
```
This ensures a consistent and adaptive layout across all supported platforms.

## 📱 Platform-Specific Comparisons

### Android
- Layout built using **dp & sp**
![Android-dp-banner](./assets/android-dp.png)

- Layout built using **sdp & ssp**
![Android-sdp-banner](./assets/android-sdp.png)

### iOS
- Layout built using **dp & sp**
![iOS-dp-banner](./assets/ios-dp.png)

- Layout built using **sdp & ssp**
![iOS-sdp-banner](./assets/ios-sdp.png)

### Desktop
- Layout bulit using **sdp & ssp**
![sdp_ssp_desktop_cmp](./assets/desktop-sdp.png)

### WasmJs
- Layout bulit using **sdp & ssp**
  ![sdp_ssp_wasm_cmp](./assets/wasm-sdp.png)

## 📚 Additional Resources
[Demo Implementation](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/sdpcomposemultiplatformdemo/App.kt) - Check out the demo class to see the library in action.

[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/mobile-innovation-network/sdp-ssp-compose-multiplatform-99ad7969c146)

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/showcase/mobile-innovation-network)

## 🌟 If you find this library useful, consider starring ⭐ the repository to show your support!

