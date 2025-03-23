package com.google.samples.apps.nowinandroid.ui.homeworks.homework14

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class MainScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<MainScreen>(semanticsProvider) {

        val doneButton = KNode(semanticsProvider) {
            hasText("Done")
        }
}