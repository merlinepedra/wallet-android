package com.mycelium.wapi.wallet.colu


class ColuAccountContext(private var isArchived: Boolean) {
    /**
     * Is this account archived?
     */
    fun isArchived(): Boolean {
        return isArchived
    }

    /**
     * Mark this account as archived
     */
    fun setArchived(isArchived: Boolean) {
        if (this.isArchived != isArchived) {
            this.isArchived = isArchived
        }
    }
}