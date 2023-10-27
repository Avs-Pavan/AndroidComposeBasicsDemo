package com.kevin.androidcomposebasicsdemo.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview





// Compose Box is a layout composable that allows you to stack composable on top of each other.
// And you can align them in different ways as shown in the example below.
@Composable
fun BoxDemo() {
    Box(modifier = Modifier.fillMaxSize().background(Color.Cyan)) {
        Text(text = "TS", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "TE", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "TC", modifier = Modifier.align(Alignment.TopCenter))

        Text(text = "CS", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "CE", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "C", modifier = Modifier.align(Alignment.Center))

        Text(text = "BS", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "BE", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "BC", modifier = Modifier.align(Alignment.BottomCenter))
    }
}


// Preview
@Preview
@Composable
fun BoxDemoPreview() {
    BoxDemo()
}