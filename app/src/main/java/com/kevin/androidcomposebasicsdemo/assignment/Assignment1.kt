package com.kevin.androidcomposebasicsdemo.assignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevin.androidcomposebasicsdemo.image.ImageDemo



// Lazy Column with items
@Composable
fun ItemList() {

    val list = mutableListOf<Person>()
    list.add(Person("Kevin", "Wang", "123 Main St"))
    list.add(Person("John", "Doe", "456 Main St"))
    list.add(Person("Jane", "Doe", "789 Main St"))
    list.add(Person("John", "Smith", "123 Main St"))
    list.add(Person("Jane", "Smith", "456 Main St"))
    list.add(Person("John", "Doe", "789 Main St"))
    list.add(Person("Jane", "Doe", "123 Main St"))

    LazyColumn {
        items(list) {
            ItemRow(person = it)
        }
    }

}

// Row with Image and Texts

@Composable
fun ItemRow(person: Person) {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.LightGray, shape = RoundedCornerShape(10))
    ) {
        ImageDemo()
        Column {
            Row(
                Modifier
                    .padding(all = 5.dp)
            ) {
                // Text with background color, font style and font weight

                Text(
                    text = person.firstName,
                    Modifier
                        .padding(all = 10.dp)
                        .weight(1f)
                        .background(Color.Blue),
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = person.lastName,
                    Modifier
                        .padding(all = 10.dp)
                        .weight(1f)
                        .background(Color.Green),
                )

            }
            Text(
                text = person.address, Modifier
                    .padding(all = 10.dp),
                fontWeight = FontWeight.Bold
            )
        }

    }


}


@Preview
@Composable
fun ItemListPreview() {
    ItemList()
}

data class Person(
    val firstName: String,
    val lastName: String,
    val address: String
)