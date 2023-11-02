package com.kevin.androidcomposebasicsdemo.navigation_with_data

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.kevin.androidcomposebasicsdemo.animations.FadeAnimationExample
import com.kevin.androidcomposebasicsdemo.animations.PositionAnimationExample
import com.kevin.androidcomposebasicsdemo.animations.ScalingAnimationExample
import com.kevin.androidcomposebasicsdemo.animations.ShimmerCard

@Composable
fun Home() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "Home", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun Cart(cartId: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(text = "Cart with id $cartId", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun Settings() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(text = "Settings", modifier = Modifier.align(Alignment.Center))
    }
}