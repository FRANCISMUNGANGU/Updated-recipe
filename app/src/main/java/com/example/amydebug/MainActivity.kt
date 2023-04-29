package com.example.amydebug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.amydebug.ui.theme.AmyDEbugTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "home") {
                composable("home") {
                    HomeScreen(onDetailsClick = {
                            id -> navController.navigate("details/id=$id?name=hi")
                    })
                }
                composable("details/id={id}?name={name}",
                    arguments = listOf(
                        navArgument("id"){
                            type = NavType.LongType
                        },
                        navArgument("name"){
                            type = NavType.StringType
                            nullable = true
                        }),
                ){
                    //inside this composable , I can pick the shared details
                    val arguments = requireNotNull(it.arguments)
                    val id = arguments.getLong("id")
                    val name = arguments.getString("name")

                    RecipeCard(id, name,onNavigateUp = {
                        navController.popBackStack()
                    })
                }
            }
        }
    }
}

