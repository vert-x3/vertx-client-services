package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnResponse
import io.vertx.ext.consul.TxnError

fun TxnResponse(
  errors: Iterable<io.vertx.ext.consul.TxnError>? = null): TxnResponse = io.vertx.ext.consul.TxnResponse().apply {

  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
}

