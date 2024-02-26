package com.example.navigationdemo.ui.screen.main.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigationdemo.ui.route.BaseRoute
import com.example.navigationdemo.ui.theme.NavigationDemoTheme

@Preview
@Composable
private fun MainLayoutPreview() {
    NavigationDemoTheme {
        MainLayout()
    }
}

@Composable
fun MainLayout(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontSize = 24.sp,
            text = "Main Layout"
        )

        Button(onClick = {
            val name = "John Doe"
            navController?.navigate(
                BaseRoute.DetailRoute.route
                    .replace("{name}", name)
            )
        }) {
            Text(text = "Go to Detail")
        }
    }
}