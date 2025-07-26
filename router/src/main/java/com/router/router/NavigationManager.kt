package com.router.router

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

class NavigationManager<K : NavKey> {

    private val _backStack = mutableStateListOf<K>()
    val backStack: SnapshotStateList<K> = _backStack

    fun push(screen: K) {
        _backStack.add(screen)
    }

    fun pop(): K? {
        return _backStack.removeLastOrNull()
    }

    fun replaceAll(screens: List<K>) {
        _backStack.clear()
        _backStack.addAll(screens)
    }

    fun clear() {
        _backStack.clear()
    }
}