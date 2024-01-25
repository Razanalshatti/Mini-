package com.razan.miniproject2.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.razan.miniproject2.BranchCard.BranchCard
import com.razan.miniproject2.Models.BranchModel


@Composable
fun BranchList(
    branchListState: MutableState<List<BranchModel>>,
    onBranchClick: (Int) -> Unit,
    onSortClick: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            //  .background(CalendarContract.Colors.primary)
            .padding(8.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextButton(
                    onClick = { onSortClick() },
                ) {
                    Text("Sort by Name", color = Color.White)
                }
            }
        }
        items(branchListState.value) { branch ->
            BranchCard(
                branch = branch,
                onClick = { onBranchClick(branch.id) },
                onLocationClick = {
                    // Handle click on location (e.g., launch Google Maps intent)
                    // Implement the logic to launch Google Maps with the branch location
                    // You can use an Intent or a navigation library like Accompanist Navigation
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

