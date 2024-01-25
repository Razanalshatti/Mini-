package com.razan.miniproject2.mynav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.razan.miniproject2.screen.BranchList
import com.razan.miniproject2.Models.BranchModel

@Composable
fun NavScreen(branches: List<BranchModel>) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "branchList"
    ) {
        composable("branchList") {
            BranchList(
                branchListState = remember { mutableStateOf(branches) },
                onBranchClick = {
                    navController.navigate("BankBranchDetails")
                },
                onSortClick = {
                    //branches = branches.sortedBy { it.name }
                }
            )

        }

        composable("BankBranchDetails/{Id}") {
//                branchId ->
//            currentBranch = branches.find { it.id == branchId
//            BankBranchDetails(BranchModel = currentBranch!!, onBackClick = {
//                currentBranch = null
//
//            })

        }
    }

}