package com.razan.miniproject2.Repo


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.razan.miniproject2.Models.BranchModel
import com.razan.miniproject2.Models.BranchType
import com.razan.miniproject2.R


class BranchRepo {
    companion object {
        fun getBranchListDummyData(): List<BranchModel> {
            return listOf(
                BranchModel(
                    123, "AlJahra Branch", type = BranchType.BRANCH, "K", "121", "213", "1232",
                    R.drawable.kfhjahra),
                BranchModel(345, "132", type = BranchType.BRANCH,
                    "ar", "121", "213", "1232", R.drawable.kfhkhalediyah ),
                BranchModel(678, "132", type = BranchType.KFHAUTO, "ar", "121", "213", "1232", R.drawable.kfhauto),
                BranchModel(910, "132", type = BranchType.KFHGO, "ar", "121", "213", "1232", R.drawable.kfhjabriya),
                BranchModel(112, "132", type = BranchType.FOREIGN, "ar", "121", "213", "1232", R.drawable.kfhsalmiyahwataniah)
            )
        }
    }

}