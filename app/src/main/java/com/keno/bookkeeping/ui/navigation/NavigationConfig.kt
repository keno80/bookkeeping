package com.keno.bookkeeping.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PieChart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : Screen(
        route = "home",
        title = "记账",
        icon = Icons.Outlined.Home
    )

    data object Charts : Screen(
        route = "charts",
        title = "统计",
        icon = Icons.Outlined.PieChart
    )
}