/*
 * Copyright (C) 2018 The Smash Ks Open Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dependenices

/**
 * Collect all libs of the version number.
 */
object Versions {
    /**
     * Gradle android version.
     */
    object Android {
        const val buildTools = "27.0.3"
        const val minSdk = 21
        const val targetSdk = 27
        const val compileSdk = 27
    }

    /**
     * Related Android component lib version.
     */
    object AndroidComponent {
        const val support = "27.1.1"
        const val contraintLayout = "1.1.0"
    }

    /**
     * Related Kotlin lib version.
     */
    object Kotlin {
        const val kotlinLib = "1.2.41"
        const val kotlinCoroutine = "0.22.5"
    }

    /**
     * Related view component lib version.
     */
    object ViewComponent {
        const val adaptiveRecyclerView = "0.0.8"
    }

    /**
     * Related Kotlin extensions lib version.
     */
    object KotlinAndroidExt {
        const val aac = "1.1.1"
        const val anko = "0.10.5"
        const val ktx = "0.3"
        const val kinfer = "1.5.7"
        const val shaver = "0.2.2"
    }

    /**
     * Related dependency injection lib version.
     */
    object DI {
        const val kodein = "5.0.0"
    }

    /**
     * Related Firebase lib version.
     */
    object Firebase {
        const val core = "16.0.0"
        const val database = "16.0.1"
        const val auth = "16.0.1"
        const val messaging = "17.0.0"
    }

    /**
     * Related database lib version.
     */
    object Database {
        const val dbflow = "4.2.4"
        const val debug = "1.0.3"
    }

    /**
     * Related network lib version.
     */
    object Network {
        const val glide = "4.7.1"
        const val retrofit2 = "2.4.0"
        const val okhttp3 = "3.10.0"
    }

    /**
     * Related reactive lib version.
     */
    object RxDep {
        const val rxJava2 = "2.1.12"
        const val rxKotlin2 = "2.2.0"
        const val rxLifecycle2 = "2.2.1"
        const val rxPermission2 = "0.9.5@aar"
        const val rxBus = "2.0.0"
    }

    /**
     * Related parser lib version.
     */
    object Parser {
        const val gson = "2.8.2"
        const val jsoup = "1.10.3"
    }

    /**
     * Related mapping lib version.
     */
    object Mapping {
        const val modelmapper = "1.1.0"
    }

    /**
     * Related Android UI lib version.
     */
    object Ui {
        const val dialog = "0.1.1"
    }

    /**
     * Related Android unit test lib version.
     */
    object Test {
        const val jUnit = "4.12"
        const val espressoHelper = "0.1.3"
        const val kakao = "1.3.0"
        const val robolectric = "3.4.2"
        const val assertJ = "3.8.0"
        const val powerMockito = "1.7.4"
        const val mockitoKotlin = "1.5.0"
        const val mockitoAndroid = "2.9.0"
        const val androidSupportRunner = "1.0.1"
        const val androidSupportRules = "1.0.1"
    }
}
