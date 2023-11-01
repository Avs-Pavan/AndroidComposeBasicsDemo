package com.kevin.androidcomposebasicsdemo.bottomnavigation

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
//        Text(text = "Home", modifier = Modifier.align(Alignment.Center))
        Column {
            PositionAnimationExample()
            ScalingAnimationExample()
            FadeAnimationExample()
            ShimmerCard()

        }

    }
}

@Composable
fun Cart() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
       ScalingAnimationExample()
    }
}

@Composable
fun Settings() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
       FadeAnimationExample()
    }
}