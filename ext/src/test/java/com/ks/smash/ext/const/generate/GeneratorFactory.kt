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

package com.ks.smash.ext.const.generate

import java.util.Random
import java.util.UUID
import kotlin.math.absoluteValue

/**
 * Generate a random variable for each data types.
 */
object GeneratorFactory {
    val zero = 0
    val randomInt get() = Random().nextInt().absoluteValue
    val randomLong get() = Random().nextLong().absoluteValue
    val randomFloat get() = Random().nextFloat().absoluteValue
    val randomDouble get() = Random().nextDouble().absoluteValue
    val randomString get() = UUID.randomUUID().toString()
}
