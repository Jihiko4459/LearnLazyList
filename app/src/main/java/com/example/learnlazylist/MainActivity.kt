package com.example.learnlazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.learnlazylist.ui.theme.LearnLazyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnLazyListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val fruitsList= listOf("Papaya", "Banana", "Watermelon", "Strawberry", "Apple", "Mango", "Kiwi", "Cherry", "Oranges",
                        "Muskmelon", "Peach", "Raspberries", "Pomegranate", "Grape", "Cranberry", "Dragon Fruit", "Guava", "Blueberries",
                        "Papaya", "Watermelon", "Banana", "Strawberry", "Apple", "Mango", "Kiwi", "Cherry", "Oranges")
                    DisplayList(fruitsList = fruitsList)
                }
            }
        }
    }
}

@Composable
fun DisplayList(fruitsList:List<String>){
//    Column {//если кол-во элементов больше размера экрана, то тогда лучше использовать lazy column или row
//        fruitsList.forEach {
//            Text(text = " $it", fontSize = 30.sp, color= Color.Red)
//        }
//    }


//    LazyColumn {
//       items(fruitsList){
//              Text(text = " $it", fontSize = 30.sp, color= Color.Red)
//       }
//    }

    LazyRow {
        items(fruitsList){
            Text(text = " $it", fontSize = 30.sp, color= Color.Red)
        }
    }

}
