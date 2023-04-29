package com.example.amydebug

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onDetailsClick:(id : Long) -> Unit){
    Scaffold {
        LazyColumn(contentPadding = it){
            item {
                HomeAppBar()
            }
            items(Default_recipe){
                DetailsScreen(it, onClick = {
                    onDetailsClick(it.id)
                })
            }
        }
    }
}


@Composable
private fun HomeAppBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
    ) {
        Text("Recipes by Juma", style = MaterialTheme.typography.h6)
    }
}
