package com.example.navigationdemo.ui.route

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationdemo.ui.screen.detail.layout.DetailLayout
import com.example.navigationdemo.ui.screen.main.layout.MainLayout

fun NavGraphBuilder.mainGraph(navController: NavController? = null) {
    navigation(
        route = "main_route",
        startDestination = BaseRoute.MainRoute.route
    ) {
        composable(route = BaseRoute.MainRoute.route) { MainLayout(navController) }
        composable(
            route = BaseRoute.DetailRoute.route,
            arguments = BaseRoute.DetailRoute.arguments
        ) {navBackStackEntry ->
            val name = navBackStackEntry.arguments?.getString("name")
            DetailLayout(
                navController = navController,
                name = name
            )
        }
    }
}