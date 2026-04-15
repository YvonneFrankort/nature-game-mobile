package com.example.naturegame.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.naturegame.ui.map.MapScreen
import com.example.naturegame.camera.CameraScreen
import com.example.naturegame.ui.discover.DiscoverScreen
import com.example.naturegame.ui.profile.ProfileScreen
import com.example.naturegame.ui.stats.StatsScreen
import com.example.naturegame.viewmodel.CameraViewModel
import com.example.naturegame.viewmodel.StatsViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NatureGameNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Map.route,
        modifier = modifier
    ) {
        composable(Screen.Map.route) {
            MapScreen()
        }

        composable(Screen.Camera.route) {
            val cameraViewModel: CameraViewModel = hiltViewModel()
            CameraScreen(cameraViewModel)
        }

        composable(Screen.Discover.route) {
            DiscoverScreen()
        }

        composable(Screen.Stats.route) {
            val statsViewModel: StatsViewModel = viewModel()
            StatsScreen(statsViewModel)
        }

        composable(Screen.Profile.route) {
            ProfileScreen()
        }
    }
}
