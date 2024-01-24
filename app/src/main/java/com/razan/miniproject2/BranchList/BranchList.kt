package com.razan.miniproject2.BranchList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
class BranchList {
}
@Composable
fun BranchList(branchList: List<Branch>) {
    LazyColumn {
        items(branchList) { branch ->
            BranchCard(content = branch)
        }
    }
}
