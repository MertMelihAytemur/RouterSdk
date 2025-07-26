package com.router.router

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay

@Composable
fun <K : NavKey> NavigationHost(
    backStack: List<K>,
    entryProvider: @Composable (K) -> Unit
) {
    NavDisplay(
        backStack = backStack,
        entryProvider = { key ->
            NavEntry(key) {
                entryProvider(key)
            }
        }
    )
}