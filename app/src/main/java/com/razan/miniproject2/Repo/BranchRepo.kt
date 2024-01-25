package com.razan.miniproject2.Repo

import com.razan.miniproject2.Models.BranchModel
import com.razan.miniproject2.Models.BranchType

class BranchRepo {
    companion object{
        val branchList = listOf<BranchModel>(
            BranchModel(121,"132", type = BranchType.BRANCH,"ar","121","213","1232",123) ,
            BranchModel(121,"132", type = BranchType.BRANCH,"ar","121","213","1232",123)  ,
            BranchModel(121,"132", type = BranchType.KFHAUTO,"ar","121","213","1232",123),
            BranchModel(121,"132", type = BranchType.KFHGO,"ar","121","213","1232",123),
            BranchModel(121,"132", type = BranchType.FOREIGN,"ar","121","213","1232",123)
        )
    }

}