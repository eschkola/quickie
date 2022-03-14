object Versions {

  const val quickie = "1.4.0"

  const val androidMinSdk = 21
  const val androidCompileSdk = 31
  const val androidTargetSdk = 31
  const val androidBuildTools = "31.0.0"

  const val androidGradle = "7.0.4"
  const val kotlin = "1.6.10"

  const val appcompat = "1.4.1"

  const val cameraX = "1.0.2"
  const val cameraView = "1.0.0-alpha32"

  const val barcodeScanning = "17.0.1"
  const val barcodeScanningGms = "17.0.0"

  const val materialDesign = "1.5.0"

  const val detekt = "1.19.0"
  const val gradleVersions = "0.41.0"
  const val dokka = "1.6.10"

  const val junit = "5.8.2"

  fun maturityLevel(version: String): Int {
    val levels = listOf("alpha", "beta", "m", "rc")
    levels.forEachIndexed { index, s ->
      if (version.matches(".*[.\\-]$s[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE))) return index
    }
    return levels.size
  }
}
