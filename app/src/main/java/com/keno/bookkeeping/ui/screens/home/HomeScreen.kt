package com.keno.bookkeeping.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.keno.bookkeeping.ui.theme.BookkeepingTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("记账主页面")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    BookkeepingTheme {
        HomeScreen()
    }
}