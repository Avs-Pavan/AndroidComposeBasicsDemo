package com.kevin.androidcomposebasicsdemo.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.androidcomposebasicsdemo.R


// Image is a composable that displays a drawable resource on the screen.
// It takes two parameters: painter and contentDescription.
// painter is the drawable resource that you want to display.
// contentDescription is a description of the image that is used for accessibility.
@Composable
fun ImageDemo() {

    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Some content",
        modifier = Modifier.background(color = Color.Cyan, shape = RoundedCornerShape(10))
    )
}

// Preview
@Preview
@Composable
fun ImageDemoPreview() {
    ImageDemo()
}