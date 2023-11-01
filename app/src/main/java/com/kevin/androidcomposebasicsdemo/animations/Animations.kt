package com.kevin.androidcomposebasicsdemo.animations

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun PositionAnimationExample() {
    var animate by remember { mutableStateOf(false) }

    val screenWidth = 300.dp

    val offset by animateFloatAsState(
        targetValue = if (animate) 0f else screenWidth.value,
        animationSpec = tween(durationMillis = 500), label = ""
    )

    Box(
        modifier = Modifier
            .size(100.dp)
            .offset(x = offset.dp)
            .background(Color.Blue)
            .clickable { animate = !animate }
    )
}

@Composable
fun ScalingAnimationExample() {
    var animate by remember { mutableStateOf(false) }

    val originalSize: Dp = 100.dp
    val expandedSize: Dp = 200.dp

    val scale = animateFloatAsState(
        targetValue = if (animate) 1.5f else 1f,
        animationSpec = tween(durationMillis = 500), label = ""
    ).value

    Box(
        modifier = Modifier
            .size(originalSize)
            .scale(scale)
            .background(Color.Green)
            .clickable { animate = !animate }
    )
}

@Composable
fun FadeAnimationExample() {
    var animate by remember { mutableStateOf(false) }

    val opacity by animateFloatAsState(
        targetValue = if (animate) 0.1f else 1f,
        animationSpec = tween(durationMillis = 500), label = ""
    )

    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red.copy(alpha = opacity))
            .clickable { animate = !animate }
    )
}
