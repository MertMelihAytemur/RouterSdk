# Router SDK 🚦
Jetpack Compose için Navigation 3 tabanlı, modüler ve type-safe bir navigation çözümüdür.

[![](https://jitpack.io/v/mertmelihaytemur/RouterSdk.svg)](https://jitpack.io/#mertmelihaytemur/RouterSdk)

---

## ✨ Özellikler

- ✅ Jetpack Navigation 3 tabanlıdır
- ✅ Type-safe ekran tanımı (`NavKey`)
- ✅ Tam kontrol sağlanan back stack yönetimi (`NavigationManager`)
- ✅ Yüksek düzey yönlendirme arayüzü (`RouterNavigator`)
- ✅ UI bağımsız `NavigationHost`
- ✅ JitPack üzerinden kolay kurulum
- ✅ Her projede bağımsız olarak kullanılabilir

---

## 🚀 Kurulum

### 1. JitPack repository ekle

**`settings.gradle.kts`**
```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
