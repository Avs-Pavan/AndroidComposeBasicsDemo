package com.kevin.androidcomposebasicsdemo.lazycolumn

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


// LazyColumn is a vertically scrolling list that only composes and lays out the currently visible items.
// It is a good choice for displaying long lists of items, especially when you have many items that are expensive to create.
@Composable
fun ListDemo() {

    // Create a list of items
    val list = mutableListOf<String>()
    list.add("Item 1")
    list.add("Item 2")
    list.add("Item 3")
    list.add("Item 4")

    // LazyColumn is a vertically scrolling list that only composes and lays out the currently visible items.
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(list) {
            ItemView(text = it)
        }
    }

}

// ItemView is a composable that displays a text.
@Composable
fun ItemView(text: String) {
    Text(text = text)
}


// Preview
@Preview
@Composable
fun ListDemoPreview() {
    ListDemo()
}