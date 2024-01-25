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
                     123, "AlJahra Branch", type = BranchType.BRANCH, "Capital of Jahra", "1803333", "8:00AM - 7:30PM", "AlJahra",
                    R.drawable.kfhjahra),
                BranchModel(345, "AlKhalediyah Branch", type = BranchType.BRANCH,
                    "Kuwait City Asimaa", "1803333", "8:00AM - 7:30PM", "Alkhalediyah", R.drawable.kfhkhalediyah ),
                BranchModel(678, "KFHAUTO", type = BranchType.KFHAUTO, "Shuwaikh", "1803333", "8:00AM - 7:30PM", "Shuwaikh", R.drawable.kfhauto),
                BranchModel(910, "Jabriyah CO-OP", type = BranchType.KFHGO, "Jabriyah", "1803333", "8:00AM - 7:30PM", "Hawaly", R.drawable.kfhjabriya),
                BranchModel(112, "Salmiyah AlWataniah", type = BranchType.FOREIGN, "Salmiyah", "1803333", "8:00AM - 7:30PM", "Salmiah", R.drawable.kfhsalmiyahwataniah)
            )
        }
    }

}
