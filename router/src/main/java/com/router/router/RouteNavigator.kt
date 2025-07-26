package com.router.router

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

class RouterNavigator<K : NavKey>(
    private val navigationManager: NavigationManager<K>
) {
    val backStack: List<K> get() = navigationManager.backStack

    fun navigateTo(key: K) {
        navigationManager.push(key)
    }

    fun goBack(): K? {
        return navigationManager.pop()
    }

    fun replaceStack(vararg keys: K) {
        navigationManager.replaceAll(keys.toList())
    }

    fun clearStack() {
        navigationManager.clear()
    }
}

@Composable
fun <K : NavKey> rememberRouterNavigator(): RouterNavigator<K> {
    val manager = remember { NavigationManager<K>() }
    return remember { RouterNavigator(manager) }
}