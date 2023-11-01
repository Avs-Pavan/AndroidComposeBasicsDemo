package com.kevin.androidcomposebasicsdemo.bottomnavigation

sealed class ScreenRoutes(val route:String){
    object Home:ScreenRoutes("Home")
    object Cart:ScreenRoutes("Cart")
    object Settings:ScreenRoutes("Settings")
}
