package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnKVOperation
import io.vertx.ext.consul.TxnKVVerb

fun TxnKVOperation(
  flags: Long? = null,
  index: Long? = null,
  key: String? = null,
  session: String? = null,
  type: TxnKVVerb? = null,
  value: String? = null): TxnKVOperation = io.vertx.ext.consul.TxnKVOperation().apply {

  if (flags != null) {
    this.setFlags(flags)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

