plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.hokaido.dogs_7_myrealization"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hokaido.dogs_7_myrealization"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

//    implementation ("io.reactivex.rxjava3:rxandroid:3.0.2")
//    implementation ("io.reactivex.rxjava3:rxjava:3.1.8")
//    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation(libs.rxandroid)
    implementation(libs.rxjava)
    implementation(libs.glide)

    //implementation ("com.squareup.retrofit2:retrofit:(insert latest version)")
    //implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    //implementation("com.squareup.retrofit2:adapter-rxjava3:2.11.0")
    implementation(libs.retrofit)
    implementation(libs.gson)
    implementation(libs.adapterRxjava3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}