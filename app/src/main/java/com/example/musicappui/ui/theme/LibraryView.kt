package com.example.musicappui.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicappui.Lib
import com.example.musicappui.libraries

@Composable
fun Library(){
    LazyColumn {
        items(libraries) {
            lib ->
            libView(lib)
        }
    }
}

@Composable
fun libView(lib: Lib){
    Column (modifier = Modifier.fillMaxSize().padding(16.dp)){
        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
            Row {
                Icon(
                    painter = painterResource(id = lib.icon),
                    contentDescription = lib.name,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = "My Music")

            }
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null)

        }
        Divider(color = Color.LightGray)

    }
}

@Preview(showBackground = true)
@Composable
fun libPreview(){
    Library()
}