package com.keno.bookkeeping.ui.screens.charts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.keno.bookkeeping.ui.theme.BookkeepingTheme

@Composable
fun ChartScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("图表分析页")
    }
}

@Preview(showBackground = true)
@Composable
fun ChartScreenPreview() {
    BookkeepingTheme {
        ChartScreen()
    }
}