package com.mycelium.wapi.wallet.fio

import com.mycelium.wapi.wallet.Transaction
import com.mycelium.wapi.wallet.coins.CryptoCurrency
import com.mycelium.wapi.wallet.coins.Value
import java.math.BigInteger

class FioTransaction(val type: CryptoCurrency, val toAddress: String, val value: Value, val fee: BigInteger) : Transaction(type) {
    var txId: ByteArray? = null
    override fun getId() = txId

    override fun txBytes(): ByteArray = ByteArray(0)

    override fun getEstimatedTransactionSize(): Int = 0
}