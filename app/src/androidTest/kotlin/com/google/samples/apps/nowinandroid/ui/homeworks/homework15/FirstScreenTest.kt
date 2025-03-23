/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class FirstScreenTest : TestCase(Kaspresso.Builder.withComposeSupport()) {

    @get: Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    val mainScreen = FirstScreen(composeTestRule)
    val searchScreen = SearchScreen(composeTestRule)

    @Test
    fun firstScreenTest() {
        run {
            step("Check search button") {
                mainScreen {
                    searchIcon.assertIsDisplayed()
                    searchIcon.performClick()
                }
            }
            step("Check search text field") {
                searchScreen {
                    searchTextField.assertIsDisplayed()
                    searchTextField.performTextInput("search")
                }
            }
            step("Check search button in search screen") {
                searchScreen {
                    searchButton.assertIsDisplayed()
                }
            }
            step("Return to main screen") {
                searchScreen {
                    returnIcon.assertIsDisplayed()
                    returnIcon.performClick()
                }
            }
            step("Check title text") {
                mainScreen {
                    titleText.assertIsDisplayed()
                    titleText.assertTextEquals("Now in Android")
                }
            }
            step("Check settings button") {
                mainScreen {
                    settingsButton.assertIsDisplayed()
                }
            }
        }
    }
}