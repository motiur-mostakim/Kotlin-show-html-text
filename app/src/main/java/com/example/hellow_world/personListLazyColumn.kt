package com.example.hellow_world

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PersonsListData(modifier: Modifier = Modifier) {
    PersonListColumn(modifier = modifier, personList = personList)
}

@Composable
fun PersonListLazyColumn(modifier: Modifier = Modifier, personList: List<Person>) {
    LazyColumn(modifier = modifier) {
        items(items = personList) { person ->
            PersonItemCard(person = person)
        }
    }
}
@Composable
fun PersonListColumn(modifier: Modifier = Modifier, personList: List<Person>) {
    Column(modifier = modifier.fillMaxWidth().verticalScroll(rememberScrollState())) {
        for (person in personList){
            PersonItemCard(person = person)
        }
        }
}

@Composable
fun PersonItemCard(modifier: Modifier = Modifier, person: Person) {
    Column(modifier = modifier
        .fillMaxWidth()
        .padding(8.dp).clip(shape = RoundedCornerShape(4.dp))
        .background(color = Color(0xFFEAEEF4))) {
        Text(
            text = person.name,
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier.padding(4.dp)
        )
        Text(
            text = person.email,
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier.padding(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PersonsListDataPreview() {
    PersonsListData()
}