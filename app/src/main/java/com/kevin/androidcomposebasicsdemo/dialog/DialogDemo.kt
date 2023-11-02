package com.kevin.androidcomposebasicsdemo.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog


@Preview
@Composable
fun DialogDemo() {
    var isShowingDialog by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)

    ) {
        Button(onClick = { isShowingDialog = true }, modifier = Modifier.align(Alignment.Center)) {
            Text(text = "Show dialog")
        }
    }

    if (isShowingDialog) {
        Dialog(onDismissRequest = { isShowingDialog = false }) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp)
                    .background(Color.Yellow)
            ) {

                Text(text = "Dialog shown")

            }
        }
    }
}