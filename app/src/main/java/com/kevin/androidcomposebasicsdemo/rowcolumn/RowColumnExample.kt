package com.kevin.androidcomposebasicsdemo.rowcolumn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


// Row is a layout composable that places its children in a horizontal sequence.
// Column is a layout composable that places its children in a vertical sequence.
// Row and Column are the most basic layout composable in Jetpack Compose.
// Example below shows how to use Column in a Row and vice versa.
@Composable
fun RowColumnExample() {
    Row {
        RowExample()
        ColumnExample()
    }

}


@Composable
fun ColumnRowExample() {
    Column {
        RowExample()
        ColumnExample()
    }

}


// Preview

@Preview
@Composable
fun RowColumnExamplePreview() {
    RowColumnExample()
}


// Preview
@Preview
@Composable
fun ColumnRowExamplePreview() {
    ColumnRowExample()
}