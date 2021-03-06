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

package smash.ks.com.domain.usecases.upload

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import io.reactivex.internal.operators.completable.CompletableCreate
import smash.ks.com.domain.parameters.KsParam
import smash.ks.com.domain.repositories.DataRepository
import smash.ks.com.domain.usecases.upload.UploadImageToFirebaseUsecase.Requests
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFailsWith

/**
 * @author Jieyi Wu
 * @since 2018/05/24
 */
class UploadImageToFirebaseUsecaseTest {
    private lateinit var usecase: UploadImageToFirebaseUsecase
    private lateinit var repository: DataRepository

    @BeforeTest
    fun setUp() {
        repository = mock {
            on { uploadImage(KsParam()) } doReturn CompletableCreate { it.onComplete() }
        }
        usecase = UploadImageToFirebaseUsecase(repository, mock(), mock())
    }

    @Test
    fun `create usecase without putting parameters`() {
        assertFailsWith<Exception> { usecase.fetchUseCase() }
    }

    @Test
    fun `run through a creating usecase`() {
        buildUsecase()

        // Assume [retrieveKsImage] was ran once time.
        verify(repository).uploadImage(KsParam())
    }

    @Test
    fun `run the case and completed`() {
        buildUsecase().test().assertComplete()
    }

    private fun buildUsecase() =
        usecase.apply { requestValues = Requests() }.fetchUseCase()
}