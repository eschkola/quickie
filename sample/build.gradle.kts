plugins {
  id(Plugins.Android.application)
  id(Plugins.Kotlin.android)
}

android {
  compileSdk = Versions.androidCompileSdk
  buildToolsVersion = Versions.androidBuildTools
  defaultConfig {
    applicationId = "io.github.g00fy2.quickiesample"
    minSdk = Versions.androidMinSdk
    targetSdk = Versions.androidTargetSdk
    versionCode = 1
    versionName = "1.0"
  }
  buildTypes {
    getByName("release") {
      isShrinkResources = true
      isMinifyEnabled = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  splits {
    abi {
      isEnable = true
      reset()
      include("x86", "armeabi-v7a", "arm64-v8a", "x86_64")
      isUniversalApk = true
    }
  }
  flavorDimensions += "mlkit"
  productFlavors {
    create("bundled").dimension = "mlkit"
    create("unbundled").dimension = "mlkit"
  }
  buildFeatures {
    viewBinding = true
  }
  sourceSets.getByName("main").java.srcDirs("src/main/kotlin")
}

dependencies {
  implementation(project(":quickie"))

  implementation(Deps.UI.materialDesign)
}