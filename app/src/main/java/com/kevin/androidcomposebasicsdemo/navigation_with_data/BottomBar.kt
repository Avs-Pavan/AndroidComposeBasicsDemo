package com.kevin.androidcomposebasicsdemo.navigation_with_data

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarWithDataDemo(nav: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        Scaffold(
            bottomBar = { Bar2(nav = nav) }
        ) {
            NavHost(navController = nav, startDestination = ScreenRoutes.Home.route) {
                composable(ScreenRoutes.Home.route) { Home() }
                composable(ScreenRoutes.Cart.route + "?cartId={cartId}",
                    arguments = listOf(
                        navArgument("cartId") {
                            type = NavType.StringType
                        }
                    )
                ) { backStack ->
                    val cartId = backStack.arguments?.getString("cartId") ?: "-1"
                    Cart(cartId)
                }
                composable(ScreenRoutes.Settings.route) { Settings() }
            }

        }


    }

}


@Composable
fun Bar2(nav: NavHostController) {
    NavigationBar(modifier = Modifier.fillMaxWidth(), containerColor = Color.Cyan) {
        NavigationBarItem(
            label = { Text(text = ScreenRoutes.Home.route) },
            selected = false, onClick = {
                nav.navigate(ScreenRoutes.Home.route)
            }, icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            })
        NavigationBarItem(
            label = { Text(text = ScreenRoutes.Cart.route) },
            selected = false, onClick = {
                val cartId = 2
                nav.navigate(ScreenRoutes.Cart.route + "?cartId=$cartId")
            }, icon = {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = null)
            })

        NavigationBarItem(
            label = { Text(text = ScreenRoutes.Settings.route) },
            selected = false, onClick = {
                nav.navigate(ScreenRoutes.Settings.route)
            }, icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
            })
    }
}