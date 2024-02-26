package com.example.navigationdemo.ui.screen.detail.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigationdemo.ui.theme.NavigationDemoTheme

@Preview
@Composable
private fun DetailLayoutPreview() {
    NavigationDemoTheme {
        DetailLayout()
    }
}

@Composable
fun DetailLayout(
    navController: NavController? = null,
    name: String? = null
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(16.dp)
    ) {
        Text(
            fontSize = 24.sp,
            text = "Detail Layout"
        )

        name?.let {
            Text(
                fontSize = 18.sp,
                text = "Name: $it"
            )
        } ?: run {
            Text(
                fontSize = 18.sp,
                text = "Name: Not Found"
            )
        }

        Button(onClick = {
            navController?.popBackStack()
        }) {
            Text(text = "Go Back")
        }
    }
}