package com.example.compose2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun HomeScreen(){
Scaffold() {
    Column(
        modifier = Modifier.padding(it)

    ) {
        SearchBar()
    }
}
}
@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun SearchBar(){

    Row(verticalAlignment = Alignment.CenterVertically) {
     TextField(value = "", onValueChange ={} ,
         placeholder = {
           Text(text = "Search...")  
         },
         trailingIcon = {
             Icon(imageVector = Icons.Filled.Search, contentDescription ="Search icon" )
         }
     )
        Icon(imageVector = Icons.Filled.Lock, contentDescription ="icon" )
    }

}