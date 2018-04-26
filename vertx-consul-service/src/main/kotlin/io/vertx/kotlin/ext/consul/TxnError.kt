package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnError

fun TxnError(
  opIndex: Int? = null,
  what: String? = null): TxnError = io.vertx.ext.consul.TxnError().apply {

  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

