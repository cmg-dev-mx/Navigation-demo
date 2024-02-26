package com.example.navigationdemo.ui.route

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class BaseRoute(
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList()
) {
    data object MainRoute: BaseRoute(route = "main")
    data object DetailRoute: BaseRoute(
        route = "detail/{name}",
        arguments = listOf(
            navArgument("name") { type = NavType.StringType }
        )
    )
}