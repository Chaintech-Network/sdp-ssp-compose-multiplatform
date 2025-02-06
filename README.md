# SDP-SSP-Compose-Multiplatform
[![Maven Central](https://img.shields.io/maven-central/v/network.chaintech/sdp-ssp-compose-multiplatform.svg)](https://central.sonatype.com/artifact/network.chaintech/sdp-ssp-compose-multiplatform)
[![Kotlin](https://img.shields.io/badge/kotlin-v2.1.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-v1.7.3-blue)](https://github.com/JetBrains/compose-multiplatform)

![badge-android](http://img.shields.io/badge/platform-android-3DDC84.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-FF375F.svg?style=flat)
![badge-desktop](http://img.shields.io/badge/platform-desktop-FF9500.svg?style=flat)
![badge-desktop](http://img.shields.io/badge/platform-wasm-42F59E.svg?style=flat)

A scalable size unit for Compose Multiplatform for iOS, Android, Desktop & Wasm

![git-banner](./assets/git-banner.png)

## Installation

Add the dependency to your `build.gradle.kts` file:

```
commonMain.dependencies {
    implementation("network.chaintech:sdp-ssp-compose-multiplatform:1.0.5")
}
```

## Usage

```kotlin
@Composable
fun App() = AppTheme {
    Box(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(0.82f),
            shape = RoundedCornerShape(16.sdp),
            colors = CardDefaults.cardColors(Color(0xFFFBF3E8)),
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF585DDB))
                        .padding(vertical = 16.sdp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        modifier = Modifier
                            .size(80.sdp),
                        painter = painterResource(Res.drawable.ic_user),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )

                    Text(
                        text = "Emily Dounger",
                        fontSize = 16.ssp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 12.sdp)
                    )
                }

                Text(
                    text = "Hi there \uD83D\uDC4B , We are Boards to share initital Goals and ideas.",
                    fontSize = 14.ssp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    lineHeight = 18.ssp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 30.sdp).padding(horizontal = 20.sdp)
                )

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF007AFF)),
                    modifier = Modifier.padding(top = 24.sdp, bottom = 20.sdp)
                        .padding(horizontal = 20.sdp).fillMaxWidth().height(40.sdp)
                ) {
                    Text(text = "Say Hello", fontSize = 16.ssp)
                }
            }
        }
    }
}
```

## Android
- Layout built using "dp & sp"
![Android-dp-banner](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/assets/143475887/7e17107e-e987-47d8-94bb-450d91e0b258)

- Layout built using "sdp & ssp"
![Android-sdp-banner](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/assets/143475887/a69a009e-911f-4b6b-ba7d-4e4790a76cb9)


## iOS
- Layout built using "dp & sp"
![iOS-dp-banner](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/assets/143475887/6a712216-1fe8-43f9-b510-278c41002c3e)

- Layout built using "sdp & ssp"
![iOS-sdp-banner](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/assets/143475887/4c823d31-4a78-42ff-b270-de58eea0e994)

## Desktop
- Layout bulit using "sdp & ssp"
![sdp_ssp_desktop_cmp](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/assets/143475887/21ba004f-7d24-4376-9120-2d580daf5fdb)


- For Demo [Checkout This Class](https://github.com/ChainTechNetwork/sdp-ssp-compose-multiplatform/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/sdpcomposemultiplatformdemo/App.kt)
- [Medium Article](https://medium.com/mobile-innovation-network/sdp-ssp-compose-multiplatform-99ad7969c146) for detailed explaination.
- Connect us on [LinkedIn](https://www.linkedin.com/showcase/mobile-innovation-network)

