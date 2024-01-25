package com.razan.miniproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.razan.miniproject2.Models.BankBranchColors
import com.razan.miniproject2.Repo.BranchRepo
import com.razan.miniproject2.mynav.NavScreen
import com.razan.miniproject2.ui.theme.MiniProject2Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiniProject2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val branches by remember { mutableStateOf(BranchRepo.getBranchListDummyData()) }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(BankBranchColors.primary)
                    ) {
                        // Upper part with top bar and KPH image
                        TopBarWithImage()
                        Spacer(modifier = Modifier.height(8.dp))

                        // Lower part with card lists
                       NavScreen(branches = branches)
                    }
                }
            }
        }
    }

    @Composable
    fun TopBarWithImage() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(170.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.daraya),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(), contentScale = ContentScale.Crop
            )


        }
    }
}

