package com.kevin.androidcomposebasicsdemo.rowcolumn

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.androidcomposebasicsdemo.SimpleText


// Row is a composable that places its children in a horizontal sequence.
@Composable
fun RowExample() {
    Row {
        SimpleText()
        SimpleText()
        SimpleText()
    }

}

// Preview
@Preview
@Composable
fun RowExamplePreview() {
    RowExample()
}