package com.kevin.androidcomposebasicsdemo.rowcolumn

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kevin.androidcomposebasicsdemo.SimpleText



// Column is a layout composable that places its children in a vertical sequence.
@Composable
fun ColumnExample() {
    Column {
        SimpleText()
        SimpleText()
        SimpleText()
    }

}

// Preview
@Preview
@Composable
fun ColumnExamplePreview() {
    ColumnExample()
}