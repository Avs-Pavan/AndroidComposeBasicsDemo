package com.kevin.androidcomposebasicsdemo.bottomnavigation

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarDemo(nav: NavHostController) {
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
                composable(ScreenRoutes.Cart.route) { Cart() }
                composable(ScreenRoutes.Settings.route) { Settings() }
            }

        }


    }

}


@Preview
@Composable
fun Bar() {
    BottomAppBar(modifier = Modifier.fillMaxWidth()) {
        IconButton(onClick = { /*TODO*/ }, Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.Home, contentDescription = null)
        }
        IconButton(onClick = { /*TODO*/ }, Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
        }
        IconButton(onClick = { /*TODO*/ }, Modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.Settings, contentDescription = null)
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
                nav.navigate(ScreenRoutes.Cart.route)
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