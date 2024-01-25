package com.razan.miniproject2.BankBranchDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.razan.miniproject2.Models.BranchModel
import com.razan.miniproject2.Models.BranchType
import com.razan.miniproject2.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BranchDetailsPage(modifier: Modifier = Modifier) {
Card(modifier = Modifier
    .fillMaxWidth()
    .height(100.dp)) {

    Row {
        Box (modifier = Modifier){
            Image(modifier = Modifier.fillMaxWidth(),painter = painterResource(id = R.drawable.kfhauto), contentDescription = "KFHAUTO" , alignment = Alignment.Center, contentScale = ContentScale.FillHeight )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 8.dp)) {
            
            Text(text = "KFHAUTO")
            Text(text = )

        }
    }

}
}

@Preview (showBackground = true)
@Composable
fun BranchCardPreview(){
    BranchDetailsPage(
        BranchDetailsPage()
    )
}


