package com.razan.miniproject2.BankBranchDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.razan.miniproject2.R
import java.lang.reflect.Modifier

@Composable
fun BranchDetailsPage(branch: Branch, onOpenLocationClicked: () -> Unit) {

    Column(

        modifier = Modifier.fillMaxSize()

            .padding(16.dp)

    ) {

        // Display branch image at the top

        Image(

            painter = painterResource(id = branch.imageUri ?: R.drawable.default_image),

            contentDescription = null,

            modifier = Modifier

                .fillMaxWidth()

                .height(200.dp),

            contentScale = ContentScale.Crop

        )



        // Display other branch information

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Name: ${branch.name}", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Text(text = "Type: ${branch.type.name}", fontSize = 16.sp)

        Text(text = "Address: ${branch.address}", fontSize = 16.sp)

        Text(text = "Phone: ${branch.phone}", fontSize = 16.sp)

        Text(text = "Hours: ${branch.hours}", fontSize = 16.sp)

        Text(text = "Location: ${branch.location}", fontSize = 16.sp)



        // Button to open branch location URL in a browser

        Spacer(modifier = Modifier.height(16.dp))

        Button(

            onClick = { onOpenLocationClicked() },

            modifier = Modifier

                .fillMaxWidth()

                .padding(8.dp)

        ) {

            Text(text = "Open Location in Browser")

        }

    }

}