package com.kevin.androidcomposebasicsdemo.navigation_with_data

sealed class ScreenRoutes(val route:String){
    object Home:ScreenRoutes("Home")
    object Cart:ScreenRoutes("Cart")
    object Settings:ScreenRoutes("Settings")
}
